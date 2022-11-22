(ns practice.codewars_catas1)

(defn score [res]
  (let [x (int (first res))
        y (int (last res))]
    (cond (> x y) 3
          (== x y) 1
          :else 0)))

(defn points [games]
  (apply + (map score games)))
;(points ["1:1" "2:2" "3:3" "4:4" "2:2" "3:3" "4:4" "3:3" "4:4" "4:4"])

(defn sum [a]
  (apply + a)
  )
;(sum [])

(defn better_than_average [class_points your_points]
  (> your_points (/ (apply + class_points) (count class_points)))
  )
;(better_than_average [5 6] 3)

(defn maps [xs]
  (map #(* 2 %1) xs)
  )
;(maps [1 2 3 4 5])

(defn century
  [year]
  (if (zero? (mod year 100))
    (quot year 100)
    (+ 1 (quot year 100))))
;(century 1600)

(defn find-average
  [numbers]
  (if (empty? numbers)
    0
    (long (/ (reduce + numbers) (count numbers))))
  )
;(find-average [1 2 3 3 4])

(defn lowercase_count [strng]
  (count (re-seq #"[a-z]" strng))
  )
;(lowercase_count "abcD")

(defn slope [v]
  (let [[a1 b1 a2 b2] v]
    (if (zero? (- a2 a1))
      "undefined"
      (str (/ (- b2 b1) (- a2 a1)))))
  )
;(slope [19,3,20,3])

(defn reverse-string [s]
  (->> s reverse (apply str))
  )
;(reverse-string "abc")

(defn hotpo [num]
  (cond
    (= 1 num) 0
  (even? num) (inc (hotpo (/ num 2)))
  :else (inc (hotpo (inc (* num 3)))))
  )
;(hotpo 6)

(defn next-item
  [xs item]
  (second (drop-while (partial not= item) xs))
  )
;(next-item (range 1 25) 12)
