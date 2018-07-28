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


(defn multiply [a b]
  (if (zero? a)
    0
    (add b (multiply (dec a) b))))


(defn list+ [list1 list2]
  (cond
    (empty? list1) list2
    (empty? list2) list1
    :else (cons (add (first list1) (first list2))
                (list+ (rest list1) (rest list2)))))


(defn greater-than [a b]
  (cond
    (zero? a) false
    (zero? b) true
    :else (recur (dec a) (dec b))))
