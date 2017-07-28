(ns epochs.core)
  
(defn epoch2time
  "Given a number n, a dividend d, and a shift s, do the divide and
  shift and return the result as a java.time.Instant."
  [n d s]
  (-> n
      (/ d)
      (+ s)
      (* 1000)
      (java.time.Instant/ofEpochMilli)))

(defn apfs
  "APFS time is in nanoseconds since the Unix epoch."
  [n]
  (epoch2time n 1000000000 0))

(defn chrome
  "Chrome time is the number of microseconds since 1601-01-01, which is
  11,644,473,600 seconds before the Unix epoch."
  [n]
  (epoch2time n 1000000 -11644473600))

(defn cocoa
  "Cocoa time is the number of seconds since 2001-01-01, which
  is 978,307,200 seconds after the Unix epoch."
  [n]
  (epoch2time n 1 978307200))

(defn google-calendar
  "Google Calendar time seems to count 32-day months from the day
  before the Unix epoch. @noppers worked out how to do this."
  [n]
  (def seconds-per-day (* 24 60 60))
  (def total-days (quot n seconds-per-day))
  (def total-seconds (rem n seconds-per-day))
  (def google-months (quot total-days 32))
  (def google-days (rem total-days 32))
  (def ldt (java.time.LocalDateTime/ofEpochSecond
            (- seconds-per-day) 0 java.time.ZoneOffset/UTC))
  (-> ldt
      (.plusDays google-days)
      (.plusMonths google-months)
      (.toInstant java.time.ZoneOffset/UTC)
      (.plusSeconds total-seconds)))

(defn java
  "Java time is the number of milliseconds since the Unix epoch."
  [n]
  (epoch2time n 1000 0))

(defn mozilla
  "Mozilla time is the number of microseconds since the Unix epoch."
  [n]
  (epoch2time n 1000000 0))

(defn symbian
  "Symbian time is the number of microseconds since the year 0, which
  is 62,167,219,200 seconds before the Unix epoch."
  [n]
  (epoch2time n 1000000 -62167219200))

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
