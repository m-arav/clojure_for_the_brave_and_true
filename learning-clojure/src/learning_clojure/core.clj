(ns learning-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  ;; Trying out some expressions and compund expressions
  (println 5)
  (println (+ 1 2))
  ;; Intrestingly this prints out the the actual fraction
  (println (/ 4 9))

  ;; Using float type causes desired answer
  (println (/ 4.0 9))

  ;; Coerce to float also works
  (float (/ 4 9))
  )
