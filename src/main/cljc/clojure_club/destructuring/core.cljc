(ns clojure-club.destructuring.core)

(def fib-seq (map first (iterate (fn [[a b]] [b (+ a b)]) [0N 1N])))

;(defn mxn [fab m]
;  (loop [[f & r] m]
;    (recur r (map () r))))