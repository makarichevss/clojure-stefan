(ns chapter2.atoms)

(defn atom-first
  []
  (def amount (atom 100))
  (println @amount)

  (swap! amount + 2)
  (println @amount)

  (reset! amount 110)
  (println @amount)

  (compare-and-set! amount 110 120)
  (println @amount)
  )


(atom-first)