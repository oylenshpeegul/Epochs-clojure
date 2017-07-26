(ns epochs.core
  (:require [java-time]))
  
(defn epoch2time
  "Given a number n, a dividend d, and a shift s, do the divide and
  shift and return the result as a java-time/instant."
  [n d s]
  (-> n
      (/ d)
      (+ s)
      (* 1000) ;; Java time is in milliseconds, not seconds.
      (java-time/instant)))

(defn unix
  "Unix time is the number of seconds since 1970-01-01."
  [n]
  (epoch2time n 1 0))

(defn uuid-v1
  "UUID version 1 time (RFC 4122) is the number of hectonanoseconds
  (100 ns) since 1582-10-15, which is 12,219,292,800 seconds before
  the Unix epoch."
  [n]
  (epoch2time n 10000000 -12219292800))

(defn windows-date
  "Windows date time (e.g., .NET) is the number of
  hectonanoseconds (100 ns) since 0001-01-01, which is 62,135,596,800
  seconds before the Unix epoch."
  [n]
  (epoch2time n 10000000 -62135596800))

(defn windows-file
  "Windows file time (e.g., NTFS) is the number of
  hectonanoseconds (100 ns) since 1601-01-01, which is 11,644,473,600
  seconds before the Unix epoch."
  [n]
  (epoch2time n 10000000 -11644473600))