(ns dev
  (:require
    [io.dominic.high-example.system :as system]
    [io.dominic.high.repl :refer [start stop reset set-init! system]]))

(set-init! #(system/system-config :dev))
