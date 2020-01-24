(ns eip55.core
  (:require [clojure.string :as string]
            [cljs-web3.core :as web3-core]))

(defn address->checksum
  "Converts an arbitrary case address to EIP-55 checksumed address
  https://github.com/ethereum/EIPs/blob/master/EIPS/eip-55.md"
  [address]
  (let [address (-> address string/lower-case (string/replace #"0x" ""))
        hash (-> (web3-core/sha3 address {:digest "hex"}) (string/replace #"0x" ""))]
    (reduce-kv (fn [result index elem]
                 (if (>= (js/parseInt (nth hash index) 16) 8)
                   (str result (string/upper-case elem))
                   (str result elem)))
               "0x"
               (-> address (string/split #"") (#(drop 1 %)) vec))))
