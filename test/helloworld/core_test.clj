(ns helloworld.core-test
  (:require [clojure.test :refer :all]
            [helloworld.core :refer :all]))

(deftest myadd-test
  (testing "Addition"
    (is (= 2 (my-add 1 1)))))
