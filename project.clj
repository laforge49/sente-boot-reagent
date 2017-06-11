(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :dependencies
  [[org.clojure/clojure "1.9.0-alpha14" :scope "provided"]
   [org.clojure/core.async "0.2.395"]
   [org.clojure/clojurescript "1.9.473"]
   [adzerk/boot-cljs "2.0.0" :scope "test"]
   [adzerk/boot-reload "0.5.1" :scope "test"]
   [org.clojure/tools.nrepl "0.2.12"]
   [com.taoensso/sente "1.11.0"]
   [com.taoensso/timbre "4.7.4"]
   [http-kit "2.2.0"]
   [ring "1.6.1"]
   [ring/ring-defaults "0.3.0"]
   [compojure "1.6.0"]
   [reagent "0.6.0"]
   [com.cognitect/transit-clj "0.8.290"]
   [com.cognitect/transit-cljs "0.8.239"]]
  :source-paths
  ["src" "resources"])