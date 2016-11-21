package profileservice.component.skill;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
import profileservice.domain.Skill;

@Repository
interface SkillRepository extends GraphRepository<Skill> {
    Skill findByName(String name);
}