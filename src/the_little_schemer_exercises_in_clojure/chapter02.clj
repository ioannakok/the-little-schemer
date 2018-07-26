(in-ns 'the-little-schemer-exercises-in-clojure.core)

;; 2. Do It, Do It Again, and Again, and Again...
(defn lat? [l]
  (if (empty? l)
    true
    (if (atom? (first l))
      (lat? (rest l))
      false
      )))

(defn member? [a lat]
  (if (empty? lat)
    false
    (or (= (first lat) a)
        (recur a (rest lat)))))