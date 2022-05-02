(ns clojuredemo.destructure)

(let [[a b] (range 10)]
  (println "a = " a)
  (println "b = " b))

(let [[a b & rest] (range 10)]
  (println "a = " a)
  (println "b = " b)
  (println "rest of the elements are = " rest))


;; :as symblol means entire collection should be assigned to var with :as
(let [[a b & rest :as entr] (range 10)]
  (println "a = " a)
  (println "b = " b)
  (println "rest of the elements are = " rest)
  (println "Entire list" entr))

;;; Destructuring with Maps
(def m {:a 1, :b 2, :c 3, :d 4})
(let [{a :a, var-c :c} m]
  (println "a:" a)
  (println "c" var-c))

;; output
;a: 1
;c 3
;nil

(let [{:keys [a c]} m]
  (println "c: " c)
  (println "a:" a))
;c:  3
;a: 1
;nil
;user=>

(let [{:keys [a c] :as ent-m } m]
  (println "c: " c)
  (println "a:" a)
  (println "ent-m" ent-m))


;; there is no e key in the map hence e should be null
(let [{:keys [a c e] :as ent-m } m]
  (println "c: " c)
  (println "a:" a)
  (println "ent-m" ent-m)
  (println "e is " e))

;; desctructuring in fun defn

(defn foo [ x & args]
  (println "x is " x)
  (println "args is " args))

;user=> (foo 1)
;x is  1
;args is  nil
;nil
;user=> (foo 1 2)
;x is  1
;args is  (2)
;nil
;user=> (foo 1 2 3 4 5)
;x is  1
;args is  (2 3 4 5)
;nil
;user=>

