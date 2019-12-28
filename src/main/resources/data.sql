DROP TABLE IF EXISTS pills;

CREATE TABLE pills (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  weight INTEGER NOT NULL
);

INSERT INTO pills (name, description, weight) VALUES
  ('Kepra', 'Lek przeciwpadaczkowy', 500),
  ('Polopiryna', 'Przeciwgorączkowy', 250);