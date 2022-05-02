(ns clojuredemo.functional_programming)

; sum of two args
(defn foo [x y] (+ x y))

; bar is a var assigned a function which adds two value
(def bar (fn [x y] (+ x y))
  )

;user=> (foo 5 5)
;10
;user=> (bar 5 5)
;10

(let [boo (fn [x] (+ x 10))] )

(let [boo (fn [x] (+ x 10))] (boo 5))
;; 15

;; function can return another function

(defn make-inc []
  (fn [x] (+ x 1)))

(def my-inc (make-inc))

(my-inc 10)
;; 11

(defn make-incr [x]
  (fn [y] (+ y x)))

(def inc-5 (make-incr 5))

;; Pass function as the paramter of another func
(defn my-apply-two [f1 f2 arg]
  (f1 (f2 arg)))

;; (my-apply-two inc inc)
(my-apply-two inc #(* 5 %) 5)
;26

;; Composition, it means a function taking other functions as argument and retuning a function after applying the args

(defn my-comp [f1 f2]
  (fn [arg] (f1 (f2 arg))))

(def x (my-comp inc #(* 5 %)))
(x 5)
; 26

;; -----------------------------------------------------------------------------
;;;  Collection processing, there are three main functions for processing collections. map, filter and reduce

(map inc [1 2 3])
;; (2 3 4)

;; Passing anonymous function
(map #(* 100 %) [1 2 3])
;; output (100 200 300)

;; Filter -> it filters element from a collection based on a predicate

(filter odd? (range 10))
;; (1 3 5 7 9)

(remove odd? (range 10))
;; (0 2 4 6 8)


;; reduce, it reduces the collection to one element (reduce  <operation> <start val> <collection>)
;; Does the same operation with all the elements of collection
(reduce + 10 [ 1 2 3 4 ])                                   ; ((((10 + 1) + 2) + 3)+4)