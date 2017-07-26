(ns epochs.core-test
  (:require [clojure.test :refer :all]
            [epochs.core :refer :all]))

(deftest apfs-test
  (testing "apfs"
    (is (= (str (java-time/format (apfs 1234567890000000000)))
           (str "2009-02-13T23:31:30Z")))
    (is (= (str (java-time/format (apfs 1234567890123000000)))
           (str "2009-02-13T23:31:30.123Z")))
    (is (= (str (java-time/format (apfs 1234567890123456000)))
           (str "2009-02-13T23:31:30.123Z")))
    (is (= (str (java-time/format (apfs 1234567890123456789)))
           (str "2009-02-13T23:31:30.123Z")))))

(deftest chrome-test
  (testing "chrome"
    (is (= (str (java-time/format (chrome 12879041490000000)))
           (str "2009-02-13T23:31:30Z")))
    (is (= (str (java-time/format (chrome 12879041490123000)))
           (str "2009-02-13T23:31:30.123Z")))
    (is (= (str (java-time/format (chrome 12879041490123456)))
           (str "2009-02-13T23:31:30.123Z")))))

(deftest cocoa-test
  (testing "cocoa"
    (is (= (str (java-time/format (cocoa 256260690)))
           (str "2009-02-13T23:31:30Z")))))

(deftest java-test
  (testing "java"
    (is (= (str (java-time/format (java 1234567890000)))
           (str "2009-02-13T23:31:30Z")))
    (is (= (str (java-time/format (java 1234567890123)))
           (str "2009-02-13T23:31:30.123Z")))))

(deftest mozilla-test
  (testing "mozilla"
    (is (= (str (java-time/format (mozilla 1234567890000000)))
           (str "2009-02-13T23:31:30Z")))
    (is (= (str (java-time/format (mozilla 1234567890123000)))
           (str "2009-02-13T23:31:30.123Z")))
    (is (= (str (java-time/format (mozilla 1234567890123456)))
           (str "2009-02-13T23:31:30.123Z")))))

(deftest symbian-test
  (testing "symbian"
    (is (= (str (java-time/format (symbian 63401787090000000)))
           (str "2009-02-13T23:31:30Z")))
    (is (= (str (java-time/format (symbian 63401787090123000)))
           (str "2009-02-13T23:31:30.123Z")))
    (is (= (str (java-time/format (symbian 63401787090123456)))
           (str "2009-02-13T23:31:30.123Z")))))

(deftest unix-test
  (testing "unix"
    (is (= (str (java-time/format (unix 1234567890)))
           (str "2009-02-13T23:31:30Z")))))

(deftest uuid-v1-test
  (testing "uuid-v1"
    (is (= (str (java-time/format (uuid-v1 134538606900000000)))
           (str "2009-02-13T23:31:30Z")))
    (is (= (str (java-time/format (uuid-v1 134538606901230000)))
           (str "2009-02-13T23:31:30.123Z")))
    (is (= (str (java-time/format (uuid-v1 134538606901234567)))
           (str "2009-02-13T23:31:30.123Z")))))

(deftest windows-date-test
  (testing "windows-date"
    (is (= (str (java-time/format (windows-date 633701646900000000)))
           (str "2009-02-13T23:31:30Z")))
    (is (= (str (java-time/format (windows-date 633701646901230000)))
           (str "2009-02-13T23:31:30.123Z")))
    (is (= (str (java-time/format (windows-date 633701646901234567)))
           (str "2009-02-13T23:31:30.123Z")))))

(deftest windows-file-test
  (testing "windows-file"
    (is (= (str (java-time/format (windows-file 128790414900000000)))
           (str "2009-02-13T23:31:30Z")))
    (is (= (str (java-time/format (windows-file 128790414901230000)))
           (str "2009-02-13T23:31:30.123Z")))
    (is (= (str (java-time/format (windows-file 128790414901234567)))
           (str "2009-02-13T23:31:30.123Z")))))

