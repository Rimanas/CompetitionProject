package tech.itpark.competition.mapper;

import org.springframework.jdbc.core.RowMapper;
import tech.itpark.competition.model.Participant;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ParticipantRowMapper implements RowMapper<Participant> {
    public Participant mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Participant(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("surname"),
                rs.getString("country"),
                rs.getString("city"),
                rs.getInt("age"),
                rs.getString("gender"),
                rs.getString("competence"),
                rs.getString("competence_name"),
                rs.getString("url_image")
        );
    }
}
