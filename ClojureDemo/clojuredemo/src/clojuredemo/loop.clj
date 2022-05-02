(ns clojuredemo.loop)

;user=> (for [i [1 2 3]]
;         (inc i))
;(2 3 4)
;user=> (range 3)
;(0 1 2)
;user=> (range 1 4)
;(1 2 3)
;user=> (for [i (range 1 4)]
;         (inc i))
;(2 3 4)
;user=> (for [i [1 2 3]
;             j [3 2 1]]
;         [i j])
;([1 3] [1 2] [1 1] [2 3] [2 2] [2 1] [3 3] [3 2] [3 1])
;user=> (for [i (range 10)]
;         (let [a (* i i)]
;           (/ a 2))
;
;------------------------------

;;  LET using for

;user=> (for [i (range 10)]
;         (let [a (* i i)]
;           (/ a 2)))
;(0 1/2 2 9/2 8 25/2 18 49/2 32 81/2)
;user=>

;------------------------------ DOSEQ and DOTImes do not return any value or collection post execution

;user=> (doseq [i (range 10)]
;         (println "i is " i))
;i is  0
;i is  1
;i is  2
;i is  3
;i is  4
;i is  5
;i is  6
;i is  7
;i is  8
;i is  9
;nil
;user=> (dotimes [i 10]
;         (println "i is " i))
;i is  0
;i is  1
;i is  2
;i is  3
;i is  4
;i is  5
;i is  6
;i is  7
;i is  8
;i is  9
;nil
;user=>