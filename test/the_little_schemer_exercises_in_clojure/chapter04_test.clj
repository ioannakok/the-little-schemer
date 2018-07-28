(in-ns 'the-little-schemer-exercises-in-clojure.core-test)

;; 4. Numbers

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


(deftest add-list-test
  (testing "It builds a number by totalling all the numbers in a list"
    (are [list expected]
      (= (add-list list) expected)
      '() 0
      '(3 5 2 8) 18
      '(15 6 7 12 3) 43)))