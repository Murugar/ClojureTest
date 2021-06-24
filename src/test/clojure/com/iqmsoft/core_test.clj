(ns com.iqmsoft.core-test
  (:require [clojure.test :as test]
            [com.iqmsoft.core :as core]))

(test/deftest bartest
  (test/is (= "bar" (core/foo))))
