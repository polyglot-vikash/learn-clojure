(ns clojuredemo.advanced.lexical_dynamic_scopes)

;; Understanding about lexical and dyncamic scope

(def x 1)                                                   ;; global var

(let [x 2]
  (println x))                                              ;; 2 local
(println x)                                                 ;; 1 global

(defn foo []
  (println x))

(foo)                                                       ; 1 global

(let [x 5]
  (println x)                                               ; 5 this x is in the local scope
  (foo))                                                    ; 1 foo does not take any arg, it prits x from global x

(def ^:dynamic y 1)

(y)                                                         ; 1
(+ 1 y)                                                     ;2
(let [y 2]
  y)                                                        ; 2

(defn bar []
  (println y))
(bar)                                                       ; 1
(let [y 5]
  (bar))                                                    ; 1


(binding [y 5]
         (println y)                                        ; 5
         (bar))                                             ; 5 dynamicscope
