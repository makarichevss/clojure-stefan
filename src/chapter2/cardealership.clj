(ns chapter2.cardealership)

(defn is-code-valid
  [code]
  (defstruct coupon :Name :Discount)
  (def valid-coupon (struct coupon "20pct" 0.8))
  (if (= (:Name valid-coupon) code)
    true
    false)
  )

(defn get-car-prices
  [budget code]
  (def cars {"bmw" 60.000, "ferrari" 100.000, "fiat" 20.000})
  (if (is-code-valid code)
    (do
      (println "The code is valid")
      (def discount (:Discount valid-coupon))
      (doseq [car cars]
        (def car-type (first car))
        (def price (last car))
        (def price-discount (* price discount))
        (if (<= price-discount budget)
          (println "The" car-type "costs" price-discount))))
    (do
      (println "The code is invalid")
      (doseq [car cars]
        (def car-type (first car))
        (def price (last car))
        (if (<= price budget)
          (println "The" car-type "costs" price)
          )
        ))))

(get-car-prices 50.000 "20pct")