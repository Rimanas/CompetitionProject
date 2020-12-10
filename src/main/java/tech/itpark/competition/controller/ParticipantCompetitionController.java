package tech.itpark.competition.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.itpark.competition.manager.ParticipantCompetitionManager;
import tech.itpark.competition.model.ParticipantCompetition;

import java.util.List;

@RestController
@RequestMapping("/points")
@RequiredArgsConstructor
public class ParticipantCompetitionController {
    private final ParticipantCompetitionManager managerPartComp;
    @GetMapping
    public List<ParticipantCompetition> getPointsOfParticipantCompetition(){
        return managerPartComp.getPointsOfParticipantCompetition();
    }

    @GetMapping("/max")
    public List<ParticipantCompetition> getParticipantCompetitionMaxPoint(){
        return managerPartComp.getParticipantCompetitionMaxPoint();
    }

}
