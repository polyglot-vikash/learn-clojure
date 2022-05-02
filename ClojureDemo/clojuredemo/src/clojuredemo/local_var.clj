;; Let is used to declare a local var and def is used to declare a global var

; Please note that variable will not be accessible outside of let block

;user=> (let [a 5]
;         a)
;5
;user=> (let [a 5]
;         (inc a))
;6
;user=> (let [a 5
;             b 10]
;         (println "a = " a)
;         (println "b = " b)
;         (+ a b))
;a =  5
;b =  10
;15
;user=> (let [a 5
;             b 10
;             sum (+ a b)]
;         (println "a = " a)
;         (println "b = " b)
;         (println "sum /2 = " (/ sum 2)))
;a =  5
;b =  10
;sum /2 =  15/2
;nil
;user=> (let [a 5
;             _ (println a)
;             b 10
;             s (+ a b)
;             ])
;5
;nil
;user=>


;user=> (def x 5) declaring global var x
;#'user/x
;user=> x
;5
;user=> (+ 5 x)
;10
;user=> (let [x 2] now x is local var
;         x) and this will return local value instead of global values
;2
;user=