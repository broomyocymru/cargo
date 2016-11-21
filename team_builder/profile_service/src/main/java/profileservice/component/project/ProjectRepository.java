package profileservice.component.project;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
import profileservice.domain.Project;


@Repository
interface ProjectRepository extends GraphRepository<Project> {
    Project findByName(String name);
}