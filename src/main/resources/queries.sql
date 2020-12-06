SELECT p.id,
       p.name,
       p.surname,
       p.age,
       p.competence,
       p.competence_name,
       c.participant_id, c.points_one, c.points_two, c.points_three
FROM participants p
         JOIN competition c ON c.participant_id = p.id;