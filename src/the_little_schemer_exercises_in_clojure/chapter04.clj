(in-ns 'the-little-schemer-exercises-in-clojure.core)

;; 4. Numbers
(defn add [a b]
  (if (zero? a)
    b
    (recur (dec a) (inc b))))


(defn sub [a b]
  (if (zero? b)
    a
    (recur (dec a) (dec b))))


(defn add-list [list]
  (loop [list list
         acc 0]
    (if (empty? list)
      acc
      (recur (rest list) (+ (first list) acc)))))




