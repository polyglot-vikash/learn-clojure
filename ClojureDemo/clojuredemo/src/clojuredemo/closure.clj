(namespace clojuredemo.closure)

(defn make-inc [x]
  (fn [y]
    (+ x y)))

(def inc-8 (make-inc 8))
(inc-8 2)
;; 10

(def inc-20 (make-inc 20))
(inc-20 5)
;; 25

(inc-8 5)
;; 13

(let [a 5]
  (defn foo [b]
    (* b a)))
(foo 5)
; 25