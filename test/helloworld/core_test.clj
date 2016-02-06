(ns helloworld.core-test
  (:require [clojure.test :refer :all]
            [helloworld.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0))))

(deftest myadd-test
  (testing "Addition"
    (is 2 (my-add 1 1))))
