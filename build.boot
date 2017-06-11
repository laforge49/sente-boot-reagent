(set-env!
 :source-paths   #{"src"}
 :resource-paths #{"resources"}
 :dependencies '[
                 [org.clojure/clojure                       "1.9.0-alpha14"  :scope "provided"]
                 [org.clojure/core.async                    "0.2.395"]
                 [org.clojure/clojurescript "1.9.473"]
                 [adzerk/boot-cljs      "2.0.0" :scope "test"]
                 [adzerk/boot-reload    "0.5.1"      :scope "test"]
                 [org.clojure/tools.nrepl "0.2.12"]
                 [com.taoensso/sente        "1.11.0"] ; <--- Sente
                 [com.taoensso/timbre       "4.7.4"]

   ;;; ---> Choose (uncomment) a supported web server <---
                 [http-kit                  "2.2.0"]
                 ;; [org.immutant/web       "2.0.0-beta2"]

                 [ring                      "1.6.1"]
                 [ring/ring-defaults        "0.3.0"] ; Includes `ring-anti-forgery`, etc.

                 [compojure                 "1.6.0"] ; Or routing lib of your choice
                 [reagent "0.6.0"]

   ;;; Transit deps optional; may be used to aid perf. of larger data payloads
   ;;; (see reference example for details):
                 [com.cognitect/transit-clj  "0.8.290"]
                 [com.cognitect/transit-cljs "0.8.239"]])

(require
 '[adzerk.boot-cljs      :refer [cljs]]
 '[adzerk.boot-reload    :refer [reload]]
 'example.server)

(deftask run []
  (with-pass-thru _
    (example.server/-main)))

(deftask dev
  "Run a restartable system in the Repl"
  []
  (comp
   (watch)
   (cljs :source-map true
         :optimizations :none)
   (reload)
   (run)))
