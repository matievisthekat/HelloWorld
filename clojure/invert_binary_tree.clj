(require '[clojure.pprint])

(defn invert-binary-tree [node]
  (if (nil? node) ;; Check if the node is nil. If it is, return nil
    nil
    ;; Get the "left" and "right" values from the node
    (let [node-left (get node :left), node-right (get node :right)]
      ;; Here we merge the previous node with our new node we just created
      ;; merging allows us to keep the other properties (other than "left" and "right") the same on our new node
      (merge
        node
        {
          :left (invert-binary-tree node-right),
          :right (invert-binary-tree node-left)
         }
       ))))

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