{:user {:plugins [[venantius/ultra "0.1.9"]]
        :ultra {:color-scheme :solarized_dark}
        :dependencies [[spyscope "0.1.5"]
                       [org.clojure/tools.trace "0.7.5"]
                       [redl "0.2.4"]]
        :injections [(require 'spyscope.core)
                     (require 'clojure.tools.trace)
                     (require '[redl complete core])]}}
