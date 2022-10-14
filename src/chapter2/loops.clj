(ns chapter2.loops)

(defn condIf
  []
  (println "\ncondIf:")
  (if (= 5 5)
    (println "equal")
    (println "not equal")
    ))

(defn conIfDo
  []
  (println "\ncondIf:")
  (if (= 5 5)
    (do (println "Equals first")
        (println "Print second")
        (println (type atom)))
    (do (println "Not equals first")
        (println "Print second"))))

(defn condNestedId
  []
  (println "\ncondNestedIf:")
  (if (or (= 5 5) (= 2 2))
    (println "equal")
    (println "not equal")
    ))

(defn condCase
  [pet]
  (println "\ncondNestedIf:")
  (case pet
    "cat" (println "cat")
    "dog" (println "dog")
    ))

(defn condCond
  [amount]
  (println "\ncondCond:")
  (cond
    (<= amount 2) (println "few")
    (<= amount 10) (println "several")
    (<= amount 100) (println "many")
    :else (println "a lot")))

(condIf)
(conIfDo)
(condNestedId)
(condCase "cat")
(condCond 17)