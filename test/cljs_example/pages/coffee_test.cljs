(ns cljs-example.pages.coffee-test
  (:require [cljs.test :refer-macros [deftest is testing]]
            [cljs-example.pages.coffee :refer [decrement-count increment-count]]
            [cljs-example.state :refer [state]]
            [reagent.core :as reagent :refer [atom]]))

(deftest increment-then-increments-count
  (with-redefs [state (atom {:coffee {:count 0}})]
    (do (increment-count))
    (is (= 1 (get-in @state [:coffee :count])))))

(deftest decrement-then-decrements-count
  (with-redefs [state (atom {:coffee {:count 0}})]
    (do (decrement-count))
    (is (= -1 (get-in @state [:coffee :count])))))

