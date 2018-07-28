(in-ns 'the-little-schemer-exercises-in-clojure.core-test)

(deftest add-test
  (testing "Addition"
    (is (= (add 46 12) 58))))

(deftest sub-test
  (testing "Subtraction"
    (are [a b expected]
      (= (sub a b) expected)
      14 3 11
      17 9 8
      18 25 -7)))