(ns clojuredemo.core
  (:require clojuredemo.namespacedemo.greet as g))


(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn add [x] (+ x 10))

(g/greet)