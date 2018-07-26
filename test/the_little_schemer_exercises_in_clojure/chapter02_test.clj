(in-ns 'the-little-schemer-exercises-in-clojure.core-test)

(deftest lat-test
  (testing "Are these lat?"
    (is (lat? '(Jack Sprat could eat no chicken fat)))
    (is (not (lat? '((Jack) Sprat could eat no chicken fat))))
    (is (not (lat? '(Jack (Sprat could) eat no chicken fat))))
    (is (lat? '()))
    (is (lat? '(bacon and eggs)))
    (is (lat? '(1 2 3)))
    (is (lat? '(b)))))

(deftest member-test
  (testing "Is this atom member of the lat?"
    (is (member? 'tea '(coffee tea milk)))
    (is (not (member? 'poached '(fried eggs and scrambled eggs))))
    (is (member? 'meat '(mashed potatoes and meat gravy)))
    (is (not (member? 'meat '())))))









