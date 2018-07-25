(in-ns 'the-little-schemer-exercises-in-clojure.core-test)

(deftest lat-test
  (testing "Are these lat?"
    (is (lat? '(Jack Sprat could eat no chicken fat)))
    (is (not (lat? '((Jack) Sprat could eat no chicken fat))))
    (is (not (lat? '(Jack (Sprat could) eat no chicken fat))))
    (is (lat? '()))
    (is (lat? '(bacon and eggs)))
    (is (lat? '(1 2 3)))
    (is (lat? '(b)))
    ))







