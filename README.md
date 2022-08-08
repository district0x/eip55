# district0x/eip55

[![CircleCI](https://circleci.com/gh/district0x/eip55.svg?style=svg)](https://circleci.com/gh/district0x/eip55)

This ClojureScript library provides an implementation of EIP-55 [EIP-55](https://github.com/ethereum/EIPs/blob/master/EIPS/eip-55.md).

## Installation
Latest released version of this library: <br>
[![Clojars Project](https://img.shields.io/clojars/v/io.github.district0x/eip55.svg?include_prereleases)](https://clojars.org/io.github.district0x/eip55)

## API Overview

There is only one function `address->checksum`, which converts an arbitrary case address to EIP-55 checksumed address.

## Development

1. Run test suite:
- Browser
    - `npx shadow-cljs watch test-browser`
    - open https://d0x-vm:6502
    - tests refresh automatically on code change
- CI (Headless Chrome, Karma)
    - `npx shadow-cljs compile test-ci`
    - ``CHROME_BIN=`which chromium-browser` npx karma start karma.conf.js --single-run``

2. Build
- on merging pull request to master on GitHub, CI builds & publishes new version automatically
- update version in `build.clj`
- to build: `clj -T:build jar`
- to release: `clj -T:build deploy` (needs `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` env vars to be set)
