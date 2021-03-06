(defproject de.otto/tesla-microservice "0.1.26"
  :description "basic microservice."
  :url "https://github.com/otto-de/tesla-microservice"
  :license {:name "Apache License 2.0"
            :url  "http://www.apache.org/license/LICENSE-2.0.html"}
  :scm {:name "git"
        :url  "https://github.com/otto-de/tesla-microservice"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.1"]
                 [clojurewerkz/propertied "1.2.0"]
                 [org.clojure/data.json "0.2.6"]
                 [beckon "0.1.1"]
                 [environ "1.0.1"]
                 [clj-time "0.11.0"]

                 [de.otto/status "0.1.0"]

                 ;; io
                 [ring/ring-core "1.4.0"]

                 [compojure "1.4.0"]
                 [metrics-clojure "2.6.1"]
                 [metrics-clojure-graphite "2.6.1"]

                 [org.clojure/tools.logging "0.3.1"]]

  :exclusions [org.clojure/clojure
               org.slf4j/slf4j-nop
               org.slf4j/slf4j-log4j12
               log4j
               commons-logging/commons-logging]

  :test-selectors {:default     (constantly true)
                   :integration :integration
                   :unit        :unit
                   :all         (constantly true)}
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[javax.servlet/servlet-api "2.5"]
                                      [org.slf4j/slf4j-api "1.7.13"]
                                      [ch.qos.logback/logback-core "1.1.3"]
                                      [ch.qos.logback/logback-classic "1.1.3"]
                                      [ring-mock "0.1.5"]]
                       :plugins      [[lein-ancient "0.5.4"]
                                      [lein-environ "1.0.0"]]}}
  :test-paths ["test" "test-resources"])
