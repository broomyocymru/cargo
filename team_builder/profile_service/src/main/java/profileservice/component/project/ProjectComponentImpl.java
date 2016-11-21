package profileservice.component.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import profileservice.domain.Project;

@Component
class ProjectComponentImpl implements ProjectComponent {

    @Autowired
    private ProjectRepository projectRepository;

    public void deleteAll(){
        projectRepository.deleteAll();
    }

    public Project findByName(String name){
        return projectRepository.findByName(name);
    }

    public Project save(Project Project){
        return projectRepository.save(Project);
    }
}
