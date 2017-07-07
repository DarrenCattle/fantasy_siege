(ns fantasy-siege.events
  (:require [re-frame.core :as re-frame]
            [fantasy-siege.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))
