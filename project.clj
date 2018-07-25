(defproject the-little-schemer-exercises-in-clojure "0.1.0-SNAPSHOT"
  :description "The Little Schemer exercises in Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot the-little-schemer-exercises-in-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
