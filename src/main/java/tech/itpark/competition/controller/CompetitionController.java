package tech.itpark.competition.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.itpark.competition.manager.CompetitionManager;
import tech.itpark.competition.model.Competition;

import java.util.List;

@RestController // чтобы возвращал джейсон
@RequestMapping("/competition")   // что реагировать будет на пути типа participant
@RequiredArgsConstructor
public class CompetitionController {
    private final CompetitionManager manager;

    @GetMapping("/points/{participant_id}")
    public List<Competition> getPointsById(@PathVariable long participant_id) {
        return manager.getPointsById(participant_id);
    }
}
