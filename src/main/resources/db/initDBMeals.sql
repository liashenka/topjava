DROP TABLE IF EXISTS meals;

CREATE TABLE meals
(
  id		      INTEGER NOT NULL,
  datetime  	TIMESTAMP(14) NOT NULL,
  description	VARCHAR NOT NULL,
  calories	  INTEGER NOT NULL,
  user_id     INTEGER,

  FOREIGN KEY (id) REFERENCES users (id) ON DELETE CASCADE
);