-- Creating a table 1)

CREATE TABLE helloworld (phrase TEXT);
.tables

-- Inserting data into a table 2)

CREATE TABLE helloworld (phrase TEXT);
INSERT INTO helloworld VALUES ("Hello, World!");
INSERT INTO helloworld VALUES ("Goodbye, World!");
SELECT COUNT(*) FROM helloworld;

-- Selecting from a table 3)

SELECT * FROM helloworld WHERE phrase = "Hello, World!";
