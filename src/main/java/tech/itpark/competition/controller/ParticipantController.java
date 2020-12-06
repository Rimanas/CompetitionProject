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


@RestController // чтобы возвращал джейсон
@RequestMapping("/participant")   // что реагировать будет на пути типа participant
@RequiredArgsConstructor   // чтобы могли писать далее private final ParticipantManager manager. Конструктор из ломбок
public class ParticipantController {
    private final ParticipantManager manager;
    private final CompetitionManager managerComp;
    private final ParticipantCompetitionManager managerPartComp;

    @GetMapping
    public List<Participant> getAll(){
        return manager.getAll();
    }

//    @GetMapping("/part")
//    public List<Participant> getPart(){
//        return manager.getPart();
//    }

    @GetMapping("/{id}")
    public Participant getById(@PathVariable long id){
        return manager.getById(id);
    }

    @GetMapping("/search")
    public List<Participant> search(@RequestParam("min_age") int min_age, @RequestParam("max_age") int max_age, @RequestParam("competence_name") String competence_name){
        return manager.search(min_age,max_age, competence_name);
    }

    @PostMapping
    public Participant save(@RequestBody Participant item){ // будем говорить, собери весь объект из тела запроса
        return manager.save(item);
    }

    @DeleteMapping("/{id}")
    public Participant removeById(@PathVariable long id){
        return manager.removeById(id);
    }

    @GetMapping("/points")
    public List<Competition> getAllComp(){
        return managerComp.getAllComp();
    }

    @RequestMapping("/points/{participant_id}")
    public List<Competition> getPointsById(@PathVariable long participant_id) {
        return managerComp.getPointsById(participant_id);
    }


}
