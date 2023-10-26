(defn consecutive_duplicates [coll n]
  (let [grouped (partition-by identity coll)
        filtered (filter #(<= (count %) n) grouped)]
    (apply concat filtered)))

;; Пример использования функции
(def input-sequence [1 2 1 1 1 2 2 1 1 1 3 3 5 5 5 4 4 5 4 4])
(def n 2)

(println (consecutive_duplicates input-sequence n))