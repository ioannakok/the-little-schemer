(in-ns 'the-little-schemer-exercises-in-clojure.core-test)

(deftest rember*-test
  (testing "Removes a from a list that may contain lists"
    (are [a l expected]
      (= rember* a l) expected)
    'sauce '(((tomato sauce)) ((bean) sauce) (and ((flying)) sauce))
    '(((tomato)) ((bean)) (and ((flying))))
    'cup '((coffee) cup ((tea) cup) (and (hick)) cup)
    '((coffee) ((tea)) (and (hick)))))



