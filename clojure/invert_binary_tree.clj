(require '[clojure.pprint])

(defn invert-binary-tree [node]
  (if (nil? node)
    nil
    (let [node-left (get node :left), node-right (get node :right)]
      (merge node {:left (invert-binary-tree node-right), :right (invert-binary-tree node-left)}))))

(def tree {
          :id 1
           :left {
                   :id 3
                   :left {
                           :id 5
                           }
                   :right {
                            :id 2
                            }}
           :right {
                    :id 4
                    :left {
                            :id 6
                            }
                    :right {
                             :id 8
                             }
                    }
           })
(def inverted (invert-binary-tree tree))
(clojure.pprint/pprint inverted)