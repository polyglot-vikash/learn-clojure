(ns clojuredemo.advanced.read_eval)


; read-string reads string as code
(read-string "(def x 2)")

(eval (read-string "(def x 2)"))
; 2 output


;; apply - it applies a function to the argument list
(+ 1 2 3 )                                                     ; 3

(def lst [1 2 3 4 ])
(+ lst)                                                     ;; will throw error hence we can use apply
(apply + lst)                                               ;; this will apply + over all the elements of lst vector

(defn our-repl []
  (let [cmd (read-string (read-line))]
    (println cmd)
    (when-not (= 'quit cmd )
      (println ";; =>" (eval cmd))
      (recur))))



(our-repl)
(+ 1 2 3)
(+ 1 2 3)
;; => 6
(def y 10)
(def y 10)
;; => #'user/y
y
;; => 10