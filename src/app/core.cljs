(ns app.core)

(defprotocol Goo
  (do-some [this]))

(defrecord Foo [a b]
  Goo
  (do-some [this] (->Foo 4 5)))


(def foo (->Foo 5 7))

(defn ^:export init []
  (js/console.log "loaded"))

(do
  (js/console.log (do-some foo)))