(in-ns 'the-little-schemer-exercises-in-clojure.core-test)

(deftest add-test
  (testing "Addition"
    (is (= (add 46 12) 58))))