DELETE FROM user_roles;
DELETE FROM users;
DELETE FROM meals;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password) VALUES
  ('User', 'user@yandex.ru', 'password'),
  ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id) VALUES
  ('ROLE_USER', 100000),
  ('ROLE_ADMIN', 100001);

INSERT INTO meals(id, dateTime, description, calories) values (100000, '2018-12-31 07:34:56', 'Завтрак', 550);
INSERT INTO meals(id, dateTime, description, calories) values (100000, '2018-12-31 12:34:56', 'Обед', 1050);
INSERT INTO meals(id, dateTime, description, calories) values (100000, '2018-12-31 18:34:56', 'Ужин', 500);
INSERT INTO meals(id, dateTime, description, calories) values (100000, '2018-12-30 06:55:55', 'Завтрак', 550);
INSERT INTO meals(id, dateTime, description, calories) values (100000, '2018-12-30 13:34:23', 'Обед', 550);
INSERT INTO meals(id, dateTime, description, calories) values (100000, '2018-12-30 18:22:23', 'Ужин', 450);
INSERT INTO meals(id, dateTime, description, calories) values (100001, '2018-12-30 09:22:23', 'Админ_ланч', 950);
INSERT INTO meals(id, dateTime, description, calories) values (100001, '2018-12-30 11:22:23', 'Админ_бранч', 1150);