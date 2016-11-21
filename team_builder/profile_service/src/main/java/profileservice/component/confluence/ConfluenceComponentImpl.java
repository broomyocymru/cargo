package profileservice.component.confluence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import profileservice.component.person.PersonComponent;
import profileservice.component.project.ProjectComponent;
import profileservice.component.skill.SkillComponent;
import profileservice.domain.Person;
import profileservice.domain.Project;
import profileservice.domain.Skill;

@Component
class ConfluenceComponentImpl {

    @Scheduled(cron = "${syncteam.cron}")
    public void syncTeamDetails(){
        // call rest api for top of tree
        // recurse through each child page
        // get all labels
        // get page title

        if(isSyncTeamEnabled) {
            mockData();
        }
    }

    @Value("${syncteam.enable}")
    private boolean isSyncTeamEnabled;

    @Autowired
    private PersonComponent personComponent;

    @Autowired
    private SkillComponent skillComponent;

    @Autowired
    private ProjectComponent projectComponent;

    private void mockData(){
        skillComponent.deleteAll();
        Skill java = new Skill("Java");
        Skill python = new Skill("Python");
        Skill ruby = new Skill("Ruby");
        skillComponent.save(python);

        projectComponent.deleteAll();
        Project blue = new Project("Blue");
        Project red = new Project("Red");
        Project green = new Project("Green");
        Project yellow = new Project("Yellow");


        personComponent.deleteAll();
        Person greg = new Person("Greg", "Brown", "gbrown");
        greg.hasSkill(java);
        greg.hasSkill(ruby);
        greg.workedOn(blue);
        personComponent.save(greg);

        Person roy = new Person("Roy", "Blue", "rblue");
        roy.hasSkill(java);
        roy.workedOn(green);
        roy.workedOn(yellow);
        personComponent.save(roy);

        Person craig = new Person("Craig", "White", "cwhite");
        craig.hasSkill(ruby);
        craig.reviews(roy);
        craig.reviews(greg);
        personComponent.save(craig);
    }
}
