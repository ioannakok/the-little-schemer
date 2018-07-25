(in-ns 'the-little-schemer-exercises-in-clojure.core-test)

(deftest atom-test
  (testing "Are these atoms?"
    (is (atom? 'atom))
    (is (atom? 'turkey))
    (is (atom? '1492))
    (is (atom? 'u))
    (is (atom? '*abc$))
    (is (not (atom? ())))))


