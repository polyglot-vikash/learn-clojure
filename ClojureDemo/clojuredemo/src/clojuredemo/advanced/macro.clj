; macro is a shortcut (like function) and is expanded at run time

;; & is rest argument, can be any number. vargarg
(defmacro my-when [cond-expression & body]
  `(if ~cond-expression
     ( do ~@body)))

; ` will prevent evaluation instantly similar to ' ( 1 2 3).
; ( ~cond


; (> 5 3) - conditional expression
; (println "Yes") (println "!") 10 - & body

(my-when (> 5 3)
         (println "Yes")
         (println "!")
         10)

;; output
;; Yes
;; !
;; 10
(macroexpand '(my-when (> 5 3)
                       (println "Yes")
                       (println "!")
                       10))

;; (if (> 5 3) (do (println "Yes") (println "!") 10))

;; subsitution guide

'(1 2 3)
;(1 2 3)
'( 1 2 3 ( 4 5))
;(1 2 3 (4 5))

`( 1 2 3 ( 4 5))
; (1 2 3 (4 5))

`( 1 2 3 ~(+ 4 5))
; (1 2 3 9)

`(1 2 3 ~lst)
; (1 2 3 [4 5 6])
`(1 2 3 ~@lst)
; (1 2 3 4 5 6)

;; Now take a look at the macro defn, we substituted list expression and body expresison



