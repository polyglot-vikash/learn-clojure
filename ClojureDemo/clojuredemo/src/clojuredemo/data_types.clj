(ns clojuredemo.data_types)


;; premitive data types

;; int --> 1
;; flat 2.3
;; ratio 2/3
;; BigInt 12345687N . Can be verified type (12345687N)
;; BigDecimal 82776876M . type(82776876M) will return BigDecimal


;; Characters and Strings

;; character \H \W . Use backslash

;; "abc" use double quote for string repel snipets

;user=> \H
;\H
;user=> \x
;\x
;user=> (.length "hello")
;5
;user=> (.toLowerCase "Hello")
;"hello"
;user=> (.toUpperCase "baba")
;"BABA"
;user=> (.charAt(2) "Helloworld")
;Execution error (ClassCastException) at user/eval153 (REPL:1).
;class java.lang.Long cannot be cast to class clojure.lang.IFn (java.lang.Long is in module java.base of loader 'bootstrap'; clojure.lang.IFn is in unnamed module of loader 'app')
;                                                                              user=> (.charAt "Helloworld" 2)
;                                                                              \l
;                                                                              user=>

;; . before a method means call the method of java class.

;; Boolean value true/false/nil

;; logical operations (and true true) - true
;; logical operations (or true false) - true
;; logical operations (and false true) - false
;; logical operations (or false false) - false

;; predicate - > functions that return boolean value
; REPL for predicate
;Clojure 1.11.1
;user=> (even? 22)
;true
;user=> (even? 21)
;false
;user=> (odd? 21)
;true
;user=> (odd? 22)
;false
;user=>

