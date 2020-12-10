package tech.itpark.competition.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.itpark.competition.manager.CompetitionManager;
import tech.itpark.competition.model.Competition;

import java.util.List;

@RestController
@RequestMapping("/competition")
@RequiredArgsConstructor
public class CompetitionController {
    private final CompetitionManager manager;

    @GetMapping("/points/{participantId}")
    public List<Competition> getPointsById(@PathVariable long participantId) {
        return manager.getPointsById(participantId);
    }
}
