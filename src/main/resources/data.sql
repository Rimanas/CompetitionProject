INSERT INTO participants (id, name, surname, country, city, age, gender, competence, competenceName, urlImage)VALUES
(1, 'Lee', 'Jong Suk', 'South Korea', 'Seoul', '18', 'M', 'Creativity and Design', 'Jewelry skill', 'https://mtdata.ru/u21/photo591B/20115901394-0/original.jpg'),
(2, 'Park', 'Seo Joon', 'South Korea', 'Pusan', '21', 'M', 'Creativity and Design', 'Visual merchandising', 'https://cdn.smartfacts.ru/367994/park-seo-jun_0.jpg'),
(3, 'Park', 'Shin Hye', 'South Korea', 'Gwangju', '25', 'M', 'Creativity and Design', 'Graphic design', 'https://www.iloveasia.su/wp-content/uploads/2015/12/71483-3792591.jpg'),
(4, 'Bae', 'Suzy', 'South Korea', 'Suwon', '22', 'F', 'Creativity and Design', 'Fashion technology', 'https://www.k-pop.ru/wp-content/uploads/2013/01/Suzy_-_Bean_Pole_accessory_catalogue_2015_Spring-Summer_05.jpg'),
(5, 'Shin', 'Min A', 'South Korea', 'Seoul', '31', 'F', 'Creativity and Design', 'Floristics', 'https://i.pinimg.com/736x/e5/5c/e1/e55ce195d2788d8ba2deb20683145aa9.jpg'),
(6, 'Mark', 'Prin Suparat', 'Thailand', 'Bangkok', '29', 'M', 'Creativity and Design', 'Fashion technology', 'https://i.pinimg.com/736x/94/ab/39/94ab395e2528795c6f16f09150148257.jpg'),
(7, 'Yaya', 'Urassaraya', 'Thailand', 'Trat', '24', 'M', 'Creativity and Design', 'Graphic design', 'https://i.pinimg.com/736x/fa/1f/bb/fa1fbb97d73d6b81dc2159b15b012718.jpg'),
(8, 'Shakrit', 'Yamnarm', 'Thailand', 'Bangkok', '23', 'M', 'Creativity and Design', 'Visual merchandising', 'https://wp.silksweb.com/wp-content/uploads/2018/07/pkg14-795x1024-795x1024.jpg'),
(9, 'Palpat', 'Attanpanyapol', 'Thailand', 'Krabi', '22', 'F', 'Creativity and Design', 'Jewelry skill', 'https://i.pinimg.com/originals/fb/e9/55/fbe95531564dd02947dd0a31b6f4f72d.jpg'),
(10, 'Sara', 'Lidge', 'Thailand', 'Surin', '27', 'F', 'Creativity and Design', 'Floristics', 'https://s1.imgs.cc/img/v4OhYWY.jpg'),
(11, 'Lee', 'Jong Suk', 'South Korea', 'Seoul', '18', 'M', 'Creativity and Design', 'Floristics', 'https://asiapoisk.com/uploads/cache/people/jW6zwc-465x600.jpg');

INSERT INTO competition (id, participantId, pointsOne, pointsTwo, pointsThree) VALUES
(1, '1', '25', '19', '26'),
(2, '2', '19', '23', '23'),
(3, '3', '22', '27', '21'),
(4, '4', '27', '28', '24'),
(6, '6', '28', '26', '29'),
(7, '7', '30', '25', '23'),
(8, '8', '21', '24', '27'),
(9, '9', '26', '28', '15'),
(10, '10', '29', '15', '20'),
(11, '11', '23', '19', '23');

INSERT INTO paid_competition (id, teamNumber, paymentPaid) VALUES
(1, '1', '10000'),
(2, '2', '135000'),
(3, '3', '2313000');

