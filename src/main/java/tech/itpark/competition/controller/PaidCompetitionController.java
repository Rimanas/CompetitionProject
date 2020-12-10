package tech.itpark.competition.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.itpark.competition.manager.PaidCompetitionManager;
import tech.itpark.competition.model.PaidCompetition;

import java.util.List;

@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor
public class PaidCompetitionController {
    private final PaidCompetitionManager manager;

    @GetMapping("/{teamNumber}")
    public PaidCompetition getByRoom(@PathVariable int teamNumber) {
        return manager.getByTeam(teamNumber);
    }

    @GetMapping("/{teamNumber}/paymentForOnePerson")
    public List<Integer> getByRoom(@PathVariable int teamNumber, @RequestParam int participantsNumber) {
        return manager.calculatePaymentForParticipant(teamNumber, participantsNumber);
    }

}
