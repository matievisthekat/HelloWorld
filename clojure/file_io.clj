(ns file_io
  (:require [clojure.java.io :as io]))

;; Read whole file at once
(def file (slurp "./clojure/file.txt"))
(println file)

;; Read larger file line-by-line
(with-open [reader (io/reader "./clojure/large-file.txt")]
  (doseq [line (line-seq reader)]
    (if (not (= line ""))
      (println line)
      nil)))