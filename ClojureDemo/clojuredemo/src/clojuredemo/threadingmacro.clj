(ns clojuredemo.threadingmacro)

;; This one is thread first macro, that means the value with -> will be used as first operand always. The below expression
;; is equivalent of
;; 5
;; inc(5) = 6
;; (6 * 2) = 12
;; dec(12) = 11
(->  5
     inc
     (* 2)
     dec)
;; 11

;; ->> this is called thread last macro in which operand after ->> is used as second operand in expression (wherever needed)
;; Explanations

;; dec(5) = 4
;; (/ 8 4) = 2
;; inc(2) = 3

(->> 5
     dec
     (/ 8)
     inc)

;; 3

(->> (range 10)
     (filter odd?)
     (map inc)
     (reduce +))
;; 30

;; nesting thread last and thread first macro

;; 10/2 -> 5 since we have used ->> in the next statement now this 5 will be used as second operand
;; (/25 5) - 5
(-> 10 (/ 2)
    (->> (/ 25)))
; 5

;; assign last value to a variable
(as-> 10 v
      (/ v 2)
      (/ 25 v))
