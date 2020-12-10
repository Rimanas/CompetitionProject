package tech.itpark.competition.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import tech.itpark.competition.model.PaidCompetition;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PaidCompetitionMapper implements RowMapper<PaidCompetition> {
    public PaidCompetition mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new PaidCompetition(
                rs.getLong("id"),
                rs.getInt("teamNumber"),
                rs.getInt("paymentPaid")
        );
    }

}
