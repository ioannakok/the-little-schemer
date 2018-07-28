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


(deftest multiply-test
  (testing "Multiplication"
    (are [a b expected]
      (= (multiply a b) expected)
      5 3 15
      13 4 52
      12 3 36)))


(deftest list+-test
  (testing "It builds a new list with by adding the respective
  elements of the two lists"
    (are [list1 list2 expected]
      (= (list+ list1 list2) expected)
      '(3 6 9 11 4) '(8 5 2 0 7) '(11 11 11 11 11)
      '(2 3) '(4 6) '(6 9)
      '(3 7) '(4 6) '(7 13)
      '(3 7) '(4 6 8 1) '(7 13 8 1)
      '(3 7 8 1) '(4 6) '(7 13 8 1))))


(deftest greater-than-test
  (testing "Checks if the first argument is greater than the second"
    (are [a b expected]
      (= (greater-than a b) expected)
      5 5 false
      6 5 true
      6 7 false)))


(deftest less-than-test
  (testing "Checks if the first argument is less than the second"
    (are [a b expected]
      (= (less-than a b) expected)
      2 3 true
      3 3 false
      4 3 false)))


(deftest equal-test
  (testing "Checks if two numbers are equal"
    (are [a b expected]
      (= (equal? a b) expected)
      3 3 true
      4 3 false
      3 4 false)))