(ns juxt.clip-example.http)

(defn handler
  [db]
  (fn [req]
    {:status 200
     :body "You're not OK!"}))

;; TODO: Until I figure out how to do .forms on things
(defn stop-jetty
  [jetty]
  (.stop jetty)
  (.join jetty))
