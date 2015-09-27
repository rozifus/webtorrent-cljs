(ns webtorrent-cljs.core-test
  (:require
   [cljs.test :refer-macros [deftest testing is]]
   [webtorrent-cljs.core :as c]))


(deftest base
  (testing "base"
    (is (= 1 1))
    (is (= 1 "A"))
    (is (= "ABCDE" (c/upper "abcde")))))
