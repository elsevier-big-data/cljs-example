(ns cljs-example.test-runner
  (:require cljs-example.pages.coffee-test
            [figwheel.main.testing :refer [run-tests-async]]))

(defn -main [& args]
  (run-tests-async 5000))
