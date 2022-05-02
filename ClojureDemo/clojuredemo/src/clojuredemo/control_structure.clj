(ns clojuredemo.control_structure)


;; IF
;user=> (if true 1 -1)
;1
;user=> (if false 1 -1)
;-1
;user=> (if (even? 2) "even" "odd")
;"even"
;user=> (if (even? 3) "even" "odd")
;"odd"
;user=> (defn my-abs [x] )
;#'user/my-abs
;user=> (defn my-abs [x]
;         (if (> x 0)
;           x
;           (-x)))
;Syntax error compiling at (REPL:4:7).
;Unable to resolve symbol: -x in this context
;user=>
;user=> (defn my-abs [x]
;         (if (> x 0)
;           x
;           (-x)))
;Syntax error compiling at (REPL:4:6).
;Unable to resolve symbol: -x in this context
;user=> (defn my-abs [x]
;         (if (> x 0)
;           x
;           (- x)))
;#'user/my-abs
;user=> my-abs(10)
;
;user=> (my-abs 10)
;10
;user=> (my-abs -10)
;10

;; -----------------------------------------------------------------------------
;; WHEN


;user=> (when true 1)
;1
;user=> (when false 1)
;nil
;user=> (when-not false 1)
;1
;user=> (when-not true 1)
;nil
;user=> (when-not false -1)
;-1
;user=> (when-not false
;         (println "False")
;         -1)
;False
;-1
;user=> (defn save-div [x y]
;         (when-not (= y 0)
;           (/ x y)))
;#'user/save-div
;user=> (safe-div 11 2)
;user=> (safe-div 11 2)
;user=>
;user=>
;user=> (save-div 11 2)
;11/2
;user=> (save-div 12 2)
;6
;user=>

;; -----------------------------------------------------------------------------
;;; CASE


;user=> (defn greet [lang]
;         (case lang
;           "hindi" "Namaste"
;           "French" "Bonjur"
;           "Spanish" "Hola"
;           "Hello"))
;#'user/greet
;user=> (greet "hindi")
;"Namaste"
;user=> (greet "French")
;"Bonjur"
;user=>

;; -----------------------------------------------------------------------------

;; COND

;user=>
;user=> (cond)
;nil
;user=> (cond tue 1)
;Syntax error compiling at (REPL:1:1).
;Unable to resolve symbol: tue in this context
;user=> (cond true 1)
;1
;user=> (cond false 1 true 2)
;2
;user=> (cond false 2 false 3)
;nil
;user=> (defn grade [percentage]
;         (cond
;           ( > percentage 70) : A
;           Syntax error reading source at (REPL:37:26).
;           Invalid token: :
;           Syntax error compiling at (REPL:0:0).
;           Unable to resolve symbol: A in this context
;           user=>
;           deepshikha@Deeps-MacBook-Air:~/Desktop/Vikash/clojure|⇒  clj
;           Clojure 1.11.1
;           user=> (defn grade [percentage]
;                    (cond
;                      (> percentage 70) :A
;                      (> percentage 60) :B
;                      (> percentage 50) :C
;                      (> percentage 40) :D
;                      true :F))
;           #'user/grade
;           user=> (grade 80)
;           :A
;           user=> (grade 70)
;           :B
;           user=> (grade 62)
;           :B
;           user=> (grade 52)
;           :C
;           user=> (grade 42)
;           :D
;           user=> (grade 0)
;           :F
;           user=>
