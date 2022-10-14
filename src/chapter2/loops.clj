(ns chapter2.loops)

(defn loop-first
  []
  (println "\nLoopFor")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (+ x 2)))
    ))

(defn loop-second
  []
  (println "\nLoopForSimple")
  (dotimes [x 10]
    (println x)))

(defn loop-third
  [count]
  (println "\nLoopWhile")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x + 2)
      )))

(defn loop-fourth
  [seq]
  (println "\nLoopSeq")
  (doseq [x seq]
    (println (inc x)))
  )

(loop-first)
(loop-second)
(loop-third 5)
(loop-fourth [1.0 2 3])