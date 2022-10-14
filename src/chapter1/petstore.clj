(ns chapter1.petstore
  (:gen-class))

(defn petToHumanAge
  "age of a pet in human years"
  [toAge]
  (def petStore {'dog 7, 'cat 5, 'fish 10})
  (get petStore toAge))

(defn countPetAge
  "age of a pet"
  [petName petType petAge]
  (def ratio (petToHumanAge petType))
  (println petName "is" (* (petToHumanAge petType) petAge) "years old in human years"))

(countPetAge "Fido" 'dog 4)
(countPetAge "Puss" 'cat 2)
(countPetAge "Bubble" 'fish 10)
