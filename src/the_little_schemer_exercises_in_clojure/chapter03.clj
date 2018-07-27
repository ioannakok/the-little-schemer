(in-ns 'the-little-schemer-exercises-in-clojure.core)

;; 3. Cons the Magnificent
(defn rember [a lat]
  (cond
    (empty? lat) lat
    (= (first lat) a)
      (rest lat)
    :else
      (cons (first lat)
            (rember a (rest lat)))))


(defn firsts [l]
  (cond
    (empty? l) l
    :else
      (cons (first (first l))
            (firsts (rest l)))))


(defn insertR [new old lat]
  (cond
    (empty? lat) '()
    (= (first lat) old)
      (cons old (cons new (rest lat)))
    :else
      (cons (first lat)
            (insertR new old (rest lat)))))


(defn insertL [new old lat]
  (cond
    (empty? lat) '()
    (= (first lat) old)
      (cons new lat)
    :else
      (cons (first lat)
            (insertL new old (rest lat)))))


(defn subst [new old lat]
  (cond
    (empty? lat) '()
    (= (first lat) old)
      (cons new (rest lat))
    :else
      (cons (first lat)
            (subst new old (rest lat)))))


(defn subst2 [new o1 o2 lat]
  (cond
    (empty? lat) '()
    (or (= (first lat) o1)
        (= (first lat) o2))
          (cons new (rest lat))
    :else
      (cons (first lat)
            (subst2 new o1 o2 (rest lat)))))


(defn multirember [a l]
  (cond
    (empty? l) '()
    (= (first l) a)
      (multirember a (rest l))
    :else
      (cons (first l)
            (multirember a (rest l)))))


(defn multiinsertR [new old lat]
  (cond
    (empty? lat) '()
    (= (first lat) old)
      (cons (first lat)
            (cons new (multiinsertR new old (rest lat))))
    :else (cons (first lat)
                (multiinsertR new old (rest lat)))))


(defn multiinsertL [new old lat]
  (cond
    (empty? lat) '()
    (= (first lat) old)
      (cons new (cons old
                      (multiinsertL new old (rest lat))))
    :else (cons (first lat)
                (multiinsertL new old (rest lat)))))


