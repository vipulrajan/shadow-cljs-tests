(ns app.core
  (:require [app.goo :refer [Goo]]))


(defrecord Foo [a b])

(extend-type Foo
  Goo
  (do-some [this] (->Foo 4 5)))


(def foo (->Foo 5 7))

(defn ^:export init []
  (js/console.log "loaded"))

(do
  (js/console.log (do-some foo)))