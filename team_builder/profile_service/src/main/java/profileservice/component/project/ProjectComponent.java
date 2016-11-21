package profileservice.component.project;

import profileservice.domain.Project;

public interface ProjectComponent {
    void deleteAll();
    Project findByName(String name);
    Project save(Project project);
}

