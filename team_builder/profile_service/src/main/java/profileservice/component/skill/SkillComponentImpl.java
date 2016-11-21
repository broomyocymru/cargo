package profileservice.component.skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import profileservice.domain.Skill;

@Component
class SkillComponentImpl implements SkillComponent{

    @Autowired
    private SkillRepository skillRepository;

    public void deleteAll(){
        skillRepository.deleteAll();
    }

    public Skill findByName(String name){
        return skillRepository.findByName(name);
    }

    public Skill save(Skill skill){
        return skillRepository.save(skill);
    }
}
