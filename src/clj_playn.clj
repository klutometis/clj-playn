(ns clj-playn
  (:import (playn.core
            Game
            Image
            PlayN
            )
           (playn.java
            JavaPlatform
            ))
  (:gen-class
   :implements [playn.core.Game]))

(defn -main [& args]
  (let [platform (JavaPlatform/register)]
    #_(.setPathPrefix (.assets platform) "resources")
    (PlayN/run (clj_playn.))))

(defn -updateRate [this]
  25)

(defn -init [this]
  (let [image (.getImage (PlayN/assets) "feynman.png")
        layer (.createImageLayer (PlayN/graphics) image)]
    (.add (.rootLayer (PlayN/graphics)) layer)))

(defn -update [this delta])

(defn -paint [this alpha])
