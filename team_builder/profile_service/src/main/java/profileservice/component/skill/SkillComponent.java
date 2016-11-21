package profileservice.component.skill;

import profileservice.domain.Skill;

public interface SkillComponent {
    void deleteAll();
    Skill findByName(String name);
    Skill save(Skill skill);
}
