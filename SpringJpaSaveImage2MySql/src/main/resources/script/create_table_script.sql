CREATE TABLE image_model(
   id BIGINT NOT NULL,
   name VARCHAR(100) NOT NULL,
   type VARCHAR(10) NOT NULL,
   pic BLOB NOT NULL,
   PRIMARY KEY (id)
);