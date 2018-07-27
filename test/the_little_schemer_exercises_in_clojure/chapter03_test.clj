(in-ns 'the-little-schemer-exercises-in-clojure.core-test)


(deftest rember-test
  (testing "Rember removes the first occurrence of an element from a list"
    (are [a lat expected]
      (= (rember a lat) expected)
      'mint '(lamb chops and mint jelly) '(lamb chops and jelly)
      'mint '(lamb chops and mint flavored mint jelly) '(lamb chops and flavored mint jelly)
      'toast '(bacon lettuce and tomato) '(bacon lettuce and tomato)
      'cup '(coffee cup tea cup and hick cup) '(coffee tea cup and hick cup)
      'x' '() '())))


(deftest firsts-test
  (testing "Firsts builds a list with all the first
  elements of each internal list in the lat"
    (are [l expected]
      (= (firsts l) expected)
      '((apple peach pumpkin)
         (plum pear cherry)
         (grape raisin pea)
         (bean carrot eggplant)) '(apple plum grape bean)
      '((a b) (c d) (e f)) '(a c e)
      '() '()
      '(((five plums) four)
         (eleven green oranges)
         ((no) more)) '((five plums) eleven (no)))))


(deftest insertR-test
  (testing "Inserts the new element on the right of the first occurrence
  of the old element in the list"
    (are [new old lat expected]
      (= (insertR new old lat) expected)
      'x 'y '() '()
      'topping 'fudge '(ice cream with fudge for dessert) '(ice cream with fudge topping for dessert)
      'jalapeno 'and '(tacos tamales and salsa) '(tacos tamales and jalapeno salsa)
      'e 'd '(a b c d f g d h) '(a b c d e f g d h))))


(deftest insertL-test
  (testing "Inserts the new element on the left of the first occurrence
  of the old element in the list"
    (are [new old lat expected]
      (= (insertL new old lat) expected)
      'x 'y '() '()
      'topping 'fudge '(ice cream with fudge for dessert) '(ice cream with topping fudge for dessert)
      'jalapeno 'and '(tacos tamales and salsa) '(tacos tamales jalapeno and salsa)
      'e 'd '(a b c d f g d h) '(a b c e d f g d h))))

(deftest subst-test
  (testing "Replaces old with new in a list"
    (is (= (subst 'topping 'fudge '(ice cream with fudge for dessert))
           '(ice cream with topping for dessert)))))


(deftest subst2-test
  (testing "Replaces either the first occurrence of o1 or
  the first occurrence of o2 by new"
    (is (= (subst2 'vanilla 'chocolate 'banana
                   '(banana ice cream with chocolate topping)))
        '(vanilla ice cream with chocolate topping))))


(deftest multirember-test
  (testing "All occurrences of a are removed from lat"
    (is (= (multirember 'cup '(coffee cup tea cup and hick cup))
           '(coffee tea and hick)))))