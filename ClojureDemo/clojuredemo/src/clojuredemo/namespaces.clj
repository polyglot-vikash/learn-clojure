(ns clojuredemo.namespaces)

;; This is similar to package in java


;; REQUIRE

;; to include methods and variables from other namespaces we should use require keyword
;; (:require [hello.core :as hc])
;; use it like hc/main

;;  USE
;; We can import all the symbols of a namespace using USE and can use directly without any prefix

;; (: use hello.core)
;; (main) this main is actually present in hello.core namespace/package


;; require should be preffered


