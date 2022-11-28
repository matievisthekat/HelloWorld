(defn fizzbuzz []
  (loop [i 1]
    (if (<= i 100)
      (do 
        (if (and (= (rem i 3) 0) (= (rem i 5) 0))
          (println "FizzBuzz")
          (if (= (rem i 3) 0)
            (println "Fizz")
            (if (= (rem i 5) 0)
              (println "Buzz")
              (println i))))
        (recur (inc i)))
      nil)))


(fizzbuzz)
