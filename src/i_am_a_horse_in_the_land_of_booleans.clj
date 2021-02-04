(ns i-am-a-horse-in-the-land-of-booleans
    (:refer-clojure :exclude [boolean]))

(defn boolean [x]
      (cond
        (= x nil) false
        (= x false) false
        :else true
        ))

(defn abs [x]
      (if (> x 0) x (* x -1)))

(defn divides? [divisor n]
      (= 0 (mod n divisor)))

(defn fizzbuzz [n]
      (cond
        (= 0 (mod n 15)) "gotcha!"
        (= 0 (mod n 5)) "buzz"
        (= 0 (mod n 3)) "fizz"
        :else "")
      )


(defn teen? [age]
      (and (>= age 13) (<= age 19)))

(defn not-teen? [age]
      (not (teen? age)))

(defn generic-doublificate [n]
      (
        cond
        (and (coll? n) (empty? n)) nil
        (or (list? n) (vector? n)) (* 2 (count n))
        (number? n) (+ n n)
        :else true
        ))

(defn leap-year? [year] (cond
                          (= 0 (mod year 100)) (= 0 (mod year 400))
                          :else (= (mod year 4) 0))
      )

; '_______'
