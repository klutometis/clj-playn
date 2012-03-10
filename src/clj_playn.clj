(ns clj-playn
  (:import (playn.core Game PlayN)
           (playn.java JavaPlatform))
  (:gen-class
   :implements [playn.core.Game]))

(defn -main [& args]
  (let [platform (JavaPlatform/register)]
    #_(.setPathPrefix (.assets platform) ".")
    (PlayN/run (clj_playn.))))

(defn -updateRate [this]
  25)

(defn -init [this]
  )

(defn -update [this delta])

(defn -paint [this alpha])