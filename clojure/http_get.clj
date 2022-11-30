(require '[clj-http.client :as http])

;; Just send a GET request to https://httpbin.org/json
(let [response (http/get "https://httpbin.org/json" {:accept :json, :query-params {"q" "bear that says funny word"}})]
  (def body (get response :body))
  (println body))

;; Log the time taken to get a response
(let [start (System/currentTimeMillis)]
  (http/get "https://httpbin.org/get")
  (def end (System/currentTimeMillis))
  (def diff (- end start))
  (println (format "It took %sms to ping https://httpbin.org/get" diff)))