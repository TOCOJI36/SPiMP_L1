(ns untitled3.core)

(defn super_foo2 [list n]
  (let [ size (count list) ]
    (loop [i 0
           map {}
           bf list
           white_list ()
            temp_value(peek list)
           temp_count nil]
      (if (< i size) (recur (inc i)
                            (assoc map temp_value (if (= temp_count nil) 1 (inc temp_count)) )
                            (pop bf) (if (= temp_count nil) white_list 
                                       (if (< (- n 1) temp_count) (conj white_list temp_value) white_list))
                            (peek bf)
                            (get map (peek bf)))
                     (set white_list)))))

(defn -main [] (println "gogog"))

