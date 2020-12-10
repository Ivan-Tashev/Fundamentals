CREATE DATABASE employees;
USE employees;

CREATE TABLE people(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
email VARCHAR(40) NOT NULL,
first_name VARCHAR(25) NOT NULL,
last_namme VARCHAR(25) NOT NULL);

INSERT INTO `people` (`email`, `first_name`, `last_namme`)
VALUES ('anl@abv.bg', 'Ivan', 'Tashev'),
('tsvetinna@abv.bg', 'Tsvetina', 'Stamboliyska'),
('maxi@abv.bg', 'Maxim', 'Tashev'),
('anl@abv.bg', 'Ivan', 'Tashev'),
('tsvetinna@abv.bg', 'Tsvetina', 'Stamboliyska'),
('maxi@abv.bg', 'Maxim', 'Tashev');

SELECT * FROM `people`;
SELECT `first_name`, `last_namme` FROM `people`;
SELECT * FROM `people` LIMIT 2;
SELECT * FROM `people` WHERE `first_name` = 'Maxim' 
AND `last_namme` = 'Tashev';

UPDATE `people` SET `first_name` = 'Peter' 
WHERE `id` = 1;

TRUNCATE `people`;
DROP TABLE `people`;