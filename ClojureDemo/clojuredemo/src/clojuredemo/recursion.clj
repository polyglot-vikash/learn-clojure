(ns clojuredemo.recursion)

(defn fact [n]
  (if (== n 1)
  1
  (* n (fact (dec n)))))

