(ns background)


(js/chrome.runtime.onInstalled.addListener
  #(println "Background Script installed"))


(defn init []
  (println "Background init called"))


(defn ^:dev/before-load stop [])


(defn ^:dev/after-load start [])




(println ::loaded)
