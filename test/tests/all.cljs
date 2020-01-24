(ns tests.all
  (:require [cljsjs.web3]
            [cljs.test :refer [deftest is testing run-tests use-fixtures]]
            [eip55.core :refer [address->checksum]]))

(deftest to-checksum-test
  (let [addresses ["0xfb6916095ca1df60bb79ce92ce3ea74c37c5d359"]]
    (is (= ["0xfB6916095ca1df60bB79Ce92cE3Ea74c37c5d359"] (map address->checksum addresses)))))
