(in-ns 'the-little-schemer-exercises-in-clojure.core)

;; 3. Cons the Magnificent
(defn rember [a lat]
  (cond
    (empty? lat) lat
    (= (first lat) a) (rest lat)
    :else (cons (first lat) (rember a (rest lat)))))


(defn firsts [l]
  (cond
    (empty? l) l
    :else (cons (first (first l)) (firsts (rest l)))))


(defn insertR [new old lat]
  (cond
    (empty? lat) '()
    (= (first lat) old) (cons old (cons new (rest lat)))
    :else (cons (first lat) (insertR new old (rest lat)))))


(defn insertL [new old lat]
  (cond
    (empty? lat) '()
    (= (first lat) old) (cons new lat)
    :else (cons (first lat) (insertL new old (rest lat)))))




