(defproject webtorrent-cljs "0.1.0-SNAPSHOT"
  :description "porting webtorrent to clojurescript for fun and learning"
  :url "https://github.com/rozifus/webtorrent-cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]]

  :plugins [[lein-cljsbuild "1.0.5"]
            [lein-npm "0.6.1"]]

  :source-paths ["src"]
  :cljsbuild {;; :test-commands {"ui" ["phantomjs" "phantom/unit-test.js" "phantom/unit-test.html"]}
              :builds [{:id "test"
                        :source-paths ["src" "test"]
                        :notify-command ["phantomjs" 
                                         "phantom/unit-test.js" 
                                         "phantom/unit-test.html"]
                        :compiler {:optimizations :whitespace
                                   :pretty-print true
                                   :output-to "target/testable.js"}}]})

