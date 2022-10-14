(ns tutorial.functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is Sergey")
  (println "Loving Clojure so far"))

#(println "Hello" %)

(def increment (fn [x] (+ x 1)))

(defn increment_set
  []
  (map increment [1 2 3]))

(defn data_types []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (def d 0xFBFC)
  (def e nil)
  (def f true)
  (def g "Hello")
  (def h 'thanks)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println f)
  (println g)
  (println h)
  )

(data_types)