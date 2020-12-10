package tech.itpark.competition.manager;

import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tech.itpark.competition.mapper.PaidCompetitionMapper;
import tech.itpark.competition.model.PaidCompetition;
import tech.itpark.competition.service.PaymentService;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PaidCompetitionManager {
    private final NamedParameterJdbcTemplate jdbcPaidRoomsTemplate;
    private final PaidCompetitionMapper rowMapper;
    private final PaymentService paymentService;

    public PaidCompetition getByTeam(int teamNumber){
        return jdbcPaidRoomsTemplate.queryForObject(
                "SELECT id, teamNumber, paymentPaid FROM paid_competition WHERE teamNumber = :teamNumber",
                new MapSqlParameterSource("teamNumber", teamNumber),
                rowMapper
        );
    }

    public List<Integer> calculatePaymentForParticipant(int teamNumber, int participantsNumber){
        final var team = getByTeam(teamNumber);
        return paymentService.calculatePaymentForParticipant(team.getPaymentPaid(), participantsNumber);

    }

}
