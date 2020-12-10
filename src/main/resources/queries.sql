SELECT p.id,
       p.name,
       p.surname,
       p.age,
       p.competence,
       p.competenceName,
       c.participantId, c.pointsOne, c.pointsTwo, c.pointsThree
FROM participants p
         JOIN competition c ON c.participantId = p.id;


SELECT p.id,
       p.name,
       p.surname,
       p.age,
       p.competence,
       p.competenceName,
       c.participantId, c.pointsOne, c.pointsTwo, c.pointsThree
FROM participants p
         JOIN competition c ON c.participantId = p.id
ORDER BY c.pointsOne DESC
LIMIT 1;

SELECT p.id,
       p.name,
       p.surname,
       p.age,
       p.competence,
       p.competenceName,
       c.participantId, c.pointsOne, c.pointsTwo, c.pointsThree
FROM participants p
         JOIN competition c ON c.participantId = p.id
ORDER BY (c.pointsOne + c.pointsTwo + c.pointsThree) DESC
LIMIT 1;

SELECT p.id,
       p.name,
       p.surname,
       p.age,
       p.competence,
       p.competenceName,
       c.participantId, c.pointsOne, c.pointsTwo, c.pointsThree, MAX(c.pointsOne + c.pointsTwo + c.pointsThree) as points
FROM participants p
         JOIN competition c ON c.participantId = p.id GROUP BY p.id;