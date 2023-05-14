INSERT INTO users(id, first_name, last_name, email, password)
VALUES ( 1, 'Marian', 'Kowalski', 'marian@kowalski.com', 'password');
INSERT INTO users(user_id, first_name, last_name, email, password)
VALUES ( 2, 'Michał', 'Basiński', 'michal@basiński.com', 'password');
INSERT INTO users(user_id, first_name, last_name, email, password)
VALUES ( 3, 'Oskar', 'Welt', 'oskar@welt.com', 'password');
INSERT INTO users(user_id, first_name, last_name, email, password)
VALUES ( 4, 'Paweł', 'Manowski', 'pawel@manowski.com', 'password');
INSERT INTO users(user_id, first_name, last_name, email, password)
VALUES ( 5, 'Janina', 'Nowak', 'janina@nowak.com', 'password');
INSERT INTO users(user_id, first_name, last_name, email, password)
VALUES ( 6, 'Aleksandra', 'Pietruszka', 'ola@pietruszka.com', 'password');
INSERT INTO users(user_id, first_name, last_name, email, password)
VALUES ( 7, 'Krzysztof', 'Dudek', 'kdudek@gmail.com', 'password');

INSERT INTO adress(id, country, address, state, city, zip)
VALUES ( 1, 'Polska' , 'Garncarska 17a', 'Pomorskie', 'Gdańsk', '12-345');

INSERT INTO product(id, name, category, description, price_nett, price_gross)
VALUES ( 1, 'Dead Space' , 'HORROR', 'some description here' , 10, 15);

INSERT INTO orders(id, user_id, order_date, total_value, order_status)
VALUES ( 1, 1, '14.06.2022', 10, 'RECIEVED');

INSERT INTO product(product_id, name, category , price_nett, price_gross)
VALUES ( 2, 'Mass Effect' , 'SCIFI', 100, 123);
INSERT INTO product(product_id, name, category , price_nett, price_gross)
VALUES ( 3, 'Red Dead Redemtion' , 'STORY' , 150, 180);
INSERT INTO product(product_id, name, category , price_nett, price_gross)
VALUES ( 4, 'Forza' , 'RACES' , 80, 100);
INSERT INTO product(product_id, name, category , price_nett, price_gross)
VALUES ( 5, 'Warzone' , 'ACTION' , 100, 123);