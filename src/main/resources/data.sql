DROP TABLE IF EXISTS Customer;
DROP TABLE IF EXISTS Purchase;


CREATE TABLE Customer (
  customerId VARCHAR(250)  PRIMARY KEY,
  name VARCHAR(250) NOT NULL);

CREATE TABLE Purchase (
  purchaseId VARCHAR(250)  PRIMARY KEY,
  description VARCHAR(250) NOT NULL,
  customerId VARCHAR(250));


INSERT INTO Customer (customerId, name) VALUES
  ('Aliko', 'Dangote'),
  ('Bill', 'Gates'),
  ('Folrunsho', 'Alakija');

INSERT INTO Purchase (purchaseId, description, customerId) VALUES
  ('Macys', 'Macys Options','Bill'),
  ('UHC', 'UHC Options', 'Folrunsho'),
  ('CCL', 'Carnival options', 'Folrunsho');
