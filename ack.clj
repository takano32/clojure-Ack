(defn ack [m n] 
 (cond (zero? m) (inc n)
  (zero? n) (ack (dec m) 1)
  :else (ack (dec m) (ack m (dec n)))))

;; (print "A(2, 2) =" (ack 2 2))

(print "A(4, 1) =" (ack 4 1))

