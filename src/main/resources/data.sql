DROP TABLE IF EXISTS product;

CREATE TABLE product (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  weight INTEGER NOT NULL
);

INSERT INTO product (name, description, weight) VALUES
  ('Product 1', 'Nice product', 500),
  ('Product 2', 'Also Nice product', 250);