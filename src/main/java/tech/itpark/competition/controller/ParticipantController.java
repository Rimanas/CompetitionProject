package tech.itpark.competition.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.itpark.competition.manager.CompetitionManager;
import tech.itpark.competition.manager.ParticipantCompetitionManager;
import tech.itpark.competition.manager.ParticipantManager;
import tech.itpark.competition.model.Competition;
import tech.itpark.competition.model.Participant;
import tech.itpark.competition.model.ParticipantCompetition;

import java.util.List;


@RestController
@RequestMapping("/participants")
@RequiredArgsConstructor
public class ParticipantController {
    private final ParticipantManager manager;
    private final ParticipantCompetitionManager managerPartComp;

    @GetMapping
    public List<Participant> getAll() {
        return manager.getAll();
    }

    @GetMapping("/{id}")
    public Participant getById(@PathVariable long id) {
        return manager.getById(id);
    }

    @GetMapping("/search")
    public List<Participant> search(@RequestParam("minAge") int minAge,
                                    @RequestParam("maxAge") int maxAge,
                                    @RequestParam("competenceName") String competenceName) {

        return manager.search(minAge, maxAge, competenceName);
    }

    @PostMapping
    public Participant save(@RequestBody Participant item) { // будем говорить, собери весь объект из тела запроса
        return manager.save(item);
    }

    @DeleteMapping("/{id}")
    public Participant removeById(@PathVariable long id) {
        return manager.removeById(id);
    }


    @GetMapping("/points")
    public List<ParticipantCompetition> getPointsOfParticipantCompetition(){
        return managerPartComp.getPointsOfParticipantCompetition();
    }

    @GetMapping("/points/max")
    public List<ParticipantCompetition> getParticipantCompetitionMaxPoint(){
        return managerPartComp.getParticipantCompetitionMaxPoint();
    }

}
