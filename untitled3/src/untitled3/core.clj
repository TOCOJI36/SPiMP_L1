(ns untitled3.core)

(def ls1 (list 1 2 3 2 3 2 5 6 ))
(def ls2 (list 1 2 3 4 5 6 2 7 8 9 0 2 77 3 6 6 2 6 ))
(def ls3 (list 1 7 8 5 0 84 74 95 3 0 4 4 5 1 74 8 2 0 5 8 1 9 999 777 0 84 7 0 1))


(defn super_foo [list n]
  (let [
        size (count list)

        ]
    (loop [i 0
           m {}
           bf list
           white_list ()]
      (do
        (println "---------------------------------[ i->"i"]-----------------------------")
        (println " m ->" m "| bf ->" bf)
        (if (= (peek bf) nil)
          (println " THE END ")
          (println " this is  -> " (peek bf)))
        (if (< i size)
          (do


            (cond
              (= (get m (keyword (str (peek bf)))) nil)
              (do (println "old_count nil")
                  (recur
                    (inc i)
                    (assoc m (keyword (str (peek bf)))
                             1
                             )
                    (pop bf)
                    white_list
                    ))
              (< (- n 1) (get m (keyword (str (peek bf)))))
              (do (println "count > n" (inc (get m (keyword (str (peek bf))))) )
                  (recur
                    (inc i)
                    (assoc m (keyword (str (peek bf)))
                             (inc (get m (keyword (str (peek bf)))))
                             )
                    (pop bf)
                    (conj white_list (peek bf))
                    ))
              :else
              (do (println "-> else <-" (inc (get m (keyword (str (peek bf))))) )
                  (recur
                    (inc i)
                    (assoc m (keyword (str (peek bf)))
                             (inc (get m (keyword (str (peek bf)))))
                             )
                    (pop bf)
                    white_list
                    ))
              )

            )
          (do
            (println "n->" n)

            (set white_list))
          ))
      )
    )
  )




(defn -main [] (println "gogog"))

