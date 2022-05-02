(ns clojuredemo.exception_handling)

;; Exception handling in clojure is similar to java

(try
  (throw (Exception. "Test Exception"))
  (catch Exception e
    (println "Handled exception " e)))

((try
   (/ 1 0)
   (catch Exception e
     (println "Handled exception " e))))

;; Just print the text and do not show entire stack trace
(try
  (/ 1 0)
  (catch Exception _ (println "Handled Exception!")
                     ))

; Arithmetic exception


(try
  (/ 1 0)
  (catch ArithmeticException e
    (println "Handled Arithmetic exception " e)))



(try
  (/ 1 0)
  (catch ArithmeticException e
    (println "Handled Arithmetic exception " e)
    :infinity)
  )

; finally
(try
  (/ 1 0)
  (catch ArithmeticException e
    (println "Handled Arithmetic exception " e)
    :infinity)
  (finally (println "You know that I'm there in the most of the languages right?"))
  )