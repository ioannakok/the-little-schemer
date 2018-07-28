(in-ns 'the-little-schemer-exercises-in-clojure.core)

(defn add [a b]
  (if (zero? a)
    b
    (recur (dec a) (inc b))))
