package tech.itpark.competition.manager;


import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import tech.itpark.competition.mapper.ParticipantRowMapper;
import tech.itpark.competition.model.Participant;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ParticipantManager { //TODO: сама - самостоятельно поуправлять созданием/ Для задания параметров PreparedStatementSetter

    private final NamedParameterJdbcTemplate template;
    private final ParticipantRowMapper rowMapper = new ParticipantRowMapper();

    public List<Participant> getAll(){
        return template.query(
                "SELECT id, name, surname, country, city, age, gender, competence, competence_name, url_image FROM participants ORDER BY id LIMIT 50",
                rowMapper
        );
    }

    public Participant getById(long id){
        return template.queryForObject(
                "SELECT id, name, surname, country, city, age, gender, competence, competence_name, url_image FROM participants WHERE id = :id",
                new MapSqlParameterSource("id", id),
                rowMapper
        );
    }

    public Participant save(Participant item) {
        if (item.getId() == 0) {
            KeyHolder keyHolder = new GeneratedKeyHolder();
            template.update(
                    "INSERT INTO participants(name, surname, country, city, age, gender, competence, competence_name, url_image) VALUES (:name, :surname, :country, :city, :age, :gender, :competence, :competence_name, :url_image)",
                    new BeanPropertySqlParameterSource(item),
                    keyHolder
            );
            long id = keyHolder.getKey().longValue();
            return getById(id);
        }

            template.update(
                    "UPDATE participants SET name = :name, surname = :surname, country = :country, city = :city, age = :age, gender = :gender, competence = :competence, competence_name = :competence_name, url_image = :url_image WHERE id = :id",
                    new BeanPropertySqlParameterSource(item)
            );
        return item;

    }

    public List<Participant> search(int min_age, int max_age, String competence_name) {
//        HashMap<String, Integer> param = new HashMap<>();
        MapSqlParameterSource param= new MapSqlParameterSource();
        param.addValue("min_age", min_age);
        param.addValue("max_age", max_age);
        param.addValue("competence_name", competence_name);
        return template.query(
                "SELECT id, name, surname, country, city, age, gender, competence, competence_name, url_image FROM participants WHERE (age BETWEEN :min_age AND :max_age) AND (competence_name = :competence_name) ORDER BY age ASC",
                param,
                rowMapper);
    }



    public Participant removeById(long id) {
        Participant item = getById(id);

        template.update(
                "DELETE FROM participants WHERE id = :id",
                new MapSqlParameterSource("id", item.getId())
        );
        return item;
    }

}
