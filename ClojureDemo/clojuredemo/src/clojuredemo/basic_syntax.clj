(ns clojuredemo.basic_syntax)

;; Clojure is a code as data lang, it uses prefix expressions enclosed in paren

(println "Hello World!!")
(println "Text to print" "Some more text to print")
(println "Text to print" "Some more text to print" 8888)
(println "Text to print" "Some more text to print" 8888 "Saw appended some number as well?")

(println "2 + 3 = " + 2 3)                                                     ;; 5
(* 2 3)                                                     ;; 6

(* (+ 1 1 ) 3)                                              ;; 6


;; define a variable
(def x 42)

;; define a function. Args should be wrapped with []
(defn foo [x]

  (* x 2)
  )

;; define a function with doc
 (defn foo "My great fun " [x] (* 2 x))

