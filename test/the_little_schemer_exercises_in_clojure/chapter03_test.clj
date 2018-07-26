(in-ns 'the-little-schemer-exercises-in-clojure.core-test)


(deftest rember-test
  (testing "Rember removes an element from a list"
    (is (= (rember 'bacon '(bacon lettuce and tomato))
           '(lettuce and tomato)))
    (is (= (rember 'and '(bacon lettuce and tomato))
           '(bacon lettuce tomato)))
    (is (= (rember 'hi '(hi)) '()))
    (is (= (rember 'hi '()) '()))))


(deftest firsts-test
  (testing "Firsts builds a list with all the first
  elements of each internal list"
    (is (= (firsts '((apple peach pumpkin)
                      (plum pear cherry)
                      (grape raisin pea)
                      (bean carrot eggplant)))
           '(apple plum grape bean)))
    (is (= (firsts '((a b) (c d) (e f))) '(a c e)))
    (is (= (firsts '()) '()))
    (is (= (firsts '(((five plums) four)
                       (eleven green oranges)
                       ((no) more)))
           '((five plums) eleven (no))))))
