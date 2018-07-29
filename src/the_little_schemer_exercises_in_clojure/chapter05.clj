(in-ns 'the-little-schemer-exercises-in-clojure.core)

(defn rember* [a l]
  (cond
    (empty? l) '()
    (atom? (first l))
      (cond
        (= (first l) a) (rember* a (rest l))
        :else (cons (first l) (rember* a (rest l))))
    :else (cons (rember* a (first l)) (rember* a (rest l)))))
