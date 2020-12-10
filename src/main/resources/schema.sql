CREATE TABLE participants    -- первое создание и выполнение Ctrl+Enter , выравниание CTRL+Alt+Enter
(
    id    INTEGER PRIMARY KEY AUTO_INCREMENT,
    name  TEXT    NOT NULL,
    surname TEXT NOT NULL,
    country TEXT NOT NULL,
    city TEXT NOT NULL,
    age INTEGER NOT NULL CHECK (age > 17),
    gender TEXT NOT NULL,
    competence TEXT NOT NULL,
    competenceName TEXT NOT NULL,
    urlImage TEXT
);

CREATE TABLE competition
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    participantId INTEGER REFERENCES participants,
    pointsOne INTEGER,
    pointsTwo INTEGER,
    pointsThree INTEGER
);

CREATE TABLE paid_competition
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    teamNumber INTEGER NOT NULL,
    paymentPaid INTEGER NOT NULL
);