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
    competence_name TEXT NOT NULL,
    url_image TEXT
);

CREATE TABLE competition
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT ,
    participant_id INTEGER REFERENCES participants,
    points_one INTEGER,
    points_two INTEGER,
    points_three INTEGER
);