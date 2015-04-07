(ns structured-data)

(defn do-a-thing [x]
  (let [t (+ x x)] 
    (Math/pow t t))
)

(defn spiff [v]
  (+ (get v 1) (get v 3) )
  )

(defn cutify [v]
  (conj v "<3")
  )

(defn spiff-destructuring [v]
  (let
    [[a1 a2 a3] v]
    (+ a1 a3)
  )
)

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  (let [[[x1 y1][x2 y2]] rectangle]
    (- x2 x1)
    )
  )

(defn height [rectangle]
  (let [[[x1 y1][x2 y2]] rectangle]
    (- y2 y1)
    )
  )

(defn square? [rectangle]
  (if (= (width rectangle) (height rectangle))
         true 
         false 
    )
)

(defn area [rectangle]
  (* (height rectangle) (width rectangle))
  )

(defn contains-point? [rectangle point]
  (let [[[x1 y1][x2 y2]] rectangle
        [x3 y3] point]
    (if (or 
          (and (<= x1 x3 x2) (<= y1 y3 y2) ) 
          (and (<= x2 x3 x1) (<= y2 y3 y2) )
          )
      true
      false
        )
    )
  )

(defn contains-rectangle? [outer inner]
  (let [[[x1 y1][x2 y2]] inner ]
    (if (and (contains-point? outer [x1 y1]) (contains-point? outer [x2 y2] ) )
      true
      false)
    )
  )

(defn title-length [book]
  :-)

(defn author-count [book]
  :-)

(defn multiple-authors? [book]
  :-)

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
