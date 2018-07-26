(in-ns 'the-little-schemer-exercises-in-clojure.core-test)


(deftest rember-test
  (testing "Rember removes an element from a list"
    (is (= (rember 'bacon '(bacon lettuce and tomato))
           '(lettuce and tomato)))
    (is (= (rember 'and '(bacon lettuce and tomato))
           '(bacon lettuce tomato)))
    (is (= (rember 'hi '(hi)) '()))
    (is (= (rember 'hi '()) '()))))
