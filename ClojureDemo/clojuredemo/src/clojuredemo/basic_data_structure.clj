(ns clojuredemo.basic_data_structure)

;; List

; REPL
;user=> (list 1 3 5 7)
;(1 3 5 7)
;user=> '(1 3 5 7) Please note ' prevents expression evaluation, if we would have removed ' from the begining then clojure would try to
; execute (1 3 5 7) and there is no method name 1 hence error would be thrown. ' prevents the same.
;(1 3 5 7)


;; Operations on List
;user=> (concat '(1 2 3) '(5 6 7))
;(1 2 3 5 6 7)
;user=> (first '(1 2 3 4))
;1
;user=> (second '(1 2 3 4))
;2

;; There is no third method
;user=> (third '(1 2 3 4))
;Syntax error compiling at (REPL:1:1).
;Unable to resolve symbol: third in this context

;; rest returns the entire list except first element
;user=> (rest '(1 2 3 4 5 6))
;(2 3 4 5 6)

;; drop drops the first n elements of the parameter
; user=> (drop 3 '(1 2 3 4 5 6))
; (4 5 6)

;user=> (drop-while odd? '(1 3 5 7 8 9 10))
;(8 9 10)
;user=>

;user=> (drop-while odd? '(1 3 5 7 8 9 10))
;(8 9 10)
;user=> (first nil)
;nil
;user=> (rest nil)
;()
;user=> (drop 5 nil)
;()
;user=> (concat '( 1 2 3) nil)
;(1 2 3)
;user=> (concat nil '(1 2 3))
;(1 2 3)
;user=>

;; -----------------------------------------------------------------------------

;; Vector
;; Similar to list but it has constant time access to element by index, also it adds the element at the end and List does it in the begining

;user=> [1 2 3]
;[1 2 3]
;user=> (vector 1 2 3 4 5)
;[1 2 3 4 5]
;
;user=> (get [4 5 6 8 7] 2)
;6
;user=> (get [4 5 6 8 7] 12)         No out of bound exception
;nil
;user=>

;user=> (get [4 5 6 8 7] 2)
;6
;user=> (get [4 5 6 8 7] 12)
;nil
;user=> (def my-vector [2 3 4 5 6 7 8])
;#'user/my-vector
;user=> ( get my-vector 15)
;nil
;user=> ( get my-vector 1)
;3
;user=> (my-vector 2)
;4
;user=> (my-vector 12) in this case there will be out of bound excepton
;Execution error (IndexOutOfBoundsException) at user/eval56 (REPL:1).
;null
;user=>


;; conj add elements to the end of the vector and begining of the list

;user=> (conj my-vector 11)
;[2 3 4 5 6 7 8 11]
;user=> (conj my-vector 12)
;[2 3 4 5 6 7 8 12]
;user=> (conj '(1 2 3 4) 5)
;(5 1 2 3 4)
;user=>
;
;; -----------------------------------------------------------------------------
;; COUNT


;user=> (count [1 2 3 4])
;4
;user=> (count '(1 2 3 4))
;4
;user=>


;; -----------------------------------------------------------------------------

;; SET
;
;user=> #{1 2 3}
;#{1 3 2}
;user=> (def s #{1 2 3})
;#'user/s
;user=> s
;#{1 3 2}
;user=> (get s 3)
;3
;user=> (get s 11)
;nil
;user=> (s 3)
;3
;user=> (s 5)
;nil
;user=> (contains? s 2)
;true
;user=> (contains? s 22)
;false
;user=>
;
;user=> (conj s 6)
;#{1 6 3 2}
;user=> (disj s 1) returns a set removing the given ekements
;#{3 2}
;user=> s
;#{1 3 2}

;; -----------------------------------------------------------------------------

;; MAPS
;
;user=> {:a 1, :b 2, :c 3}
;{:a 1, :b 2, :c 3}
;user=> (def m{:a 1, :b 2, :c 3})
;#'user/m
;user=> {"name" "Vikash", "Age" 22}
;{"name" "Vikash", "Age" 22}
;user=> (get m :a)
;1
;user=> (get m :aa)
;nil
;user=> (get m :d -1)
;-1
;user=> (contains? m :d)
;false
;user=> (contains? m :b)
;true
;user=> (assoc m :z 42)
;{:a 1, :b 2, :c 3, :z 42}
;user=> (dissoc m :b)
;{:a 1, :c 3}
;user=> (merge m {:z 32, :x 22})
;{:a 1, :b 2, :c 3, :z 32, :x 22}
;user=>

;; -----------------------------------------------------------------------------
;; Immutability
;; All the data structure in clojure are immutable, when we do operations on them they return a new collection instead of changing existing one
;
;user=> (conj [1 2 3 4] 5)
;[1 2 3 4 5]
;user=> (def v [1 2 3])
;#'user/v
;user=> (conj v 4)
;[1 2 3 4]
;user=> v
;[1 2 3]
;user=> (def s #{1 2 3})
;#'user/s
;user=> (disj s 3)
;#{1 2}
;user=> s
;#{1 3 2}
;user=> (def m {:a 1, :b 2, :c 3})
;#'user/m
;user=> (assoc m {:x 11})
;Execution error (ArityException) at user/eval116 (REPL:1).
;Wrong number of args (2) passed to: clojure.core/assoc--5481
;user=> (assoc m :x 11)
;{:a 1, :b 2, :c 3, :x 11}
;user=> m
;{:a 1, :b 2, :c 3}
;user=>
;




