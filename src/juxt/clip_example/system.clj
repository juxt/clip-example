(ns juxt.clip-example.system
  (:require
    [clojure.java.io :as io]
    [clojure.edn :as edn]))

(defn system-config
  [profile]
  ;; TODO: This could use edn/read and produce nicer error messages in case
  ;; of failure.
  (edn/read-string
    (slurp
      (io/resource
        (str "juxt/clip_example/system_" (name profile) ".edn")))))
