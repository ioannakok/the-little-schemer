(in-ns 'the-little-schemer-exercises-in-clojure.core)

(defn add [a b]
  (if (zero? a)
    b
    (recur (dec a) (inc b))))


(defn sub [a b]
  (if (zero? b)
    a
    (recur (dec a) (dec b))))
