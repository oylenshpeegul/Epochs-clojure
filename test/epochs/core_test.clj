(ns epochs.core-test
  (:require [clojure.test :refer :all]
            [epochs.core :refer :all]))

(deftest apfs-test
  (testing "apfs 1234567890000000000"
    (is (= (str (java-time/format (apfs 1234567890000000000))
                (str "2009-02-13T23:31:30Z"))))))

(deftest chrome-test
  (testing "chrome 12879041490000000"
    (is (= (str (java-time/format (chrome 12879041490000000))
                (str "2009-02-13T23:31:30Z"))))))

(deftest cocoa-test
  (testing "cocoa 256260690"
    (is (= (str (java-time/format (cocoa 256260690))
                (str "2009-02-13T23:31:30Z"))))))

(deftest unix-test
  (testing "unix 1234567890"
    (is (= (str (java-time/format (unix 1234567890))
                (str "2009-02-13T23:31:30Z"))))))

(deftest uuid-v1-test
  (testing "uuid-v1 134538606900000000"
    (is (= (str (java-time/format (uuid-v1 134538606900000000))
                (str "2009-02-13T23:31:30Z"))))))

(deftest windows-date-test
  (testing "windows-date 633701646900000000"
    (is (= (str (java-time/format (windows-date 633701646900000000))
                (str "2009-02-13T23:31:30Z"))))))

(deftest windows-file-test
  (testing "windows-file 128790414900000000"
    (is (= (str (java-time/format (windows-file 128790414900000000))
                (str "2009-02-13T23:31:30Z"))))))

