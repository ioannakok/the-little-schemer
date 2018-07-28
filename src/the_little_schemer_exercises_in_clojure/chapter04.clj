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


(defn less-than [a b]
  (cond
    (zero? b) false
    (zero? a) true
    :else (recur (dec a) (dec b))))


(defn equal? [a b]
  (cond
    (greater-than a b) false
    (less-than a b) false
    :else true))


(defn power [a b]
  (cond
    (zero? b) 1
    :else (multiply a (power a (dec b)))))


(defn division [a b]
  (cond
    (less-than a b) 0
    :else (inc (division (- a b) b))))


(defn length [lat]
  (cond
    (empty? lat) 0
    :else (inc (length (rest lat)))))


(defn pick [n lat]
  (cond
    (zero? (dec n)) (first lat)
    :else (pick (dec n) (rest lat))))


(defn rempick [n lat]
  (cond
    (zero? (dec n)) (rest lat)
    :else (cons (first lat)
                (rempick (dec n) (rest lat)))))


(defn no-nums [lat]
  (cond
    (empty? lat) '()
    :else (cond
            (number? (first lat)) (no-nums (rest lat))
            :else (cons (first lat)
                        (no-nums (rest lat))))))

(defn all-nums [lat]
  (cond
    (empty? lat) '()
    :else (cond
            (number? (first lat))
              (cons (first lat) (all-nums (rest lat)))
            :else (all-nums (rest lat)))))


(defn occur [a lat]
  (loop [a a
         lat lat
         acc 0]
    (if (empty? lat)
      acc
      (if (= a (first lat))
        (recur a (rest lat) (inc acc))
        (recur a (rest lat) acc)))))


(defn one? [n]
  (= n 1))

(defn rempick-new [n lat]
  (cond
    (one? n) (rest lat)
    :else (cons (first lat)
                (rempick (dec n) (rest lat)))))




