package profileservice.domain;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Person {

    @Relationship(type = "REVIEWEES")
    public Set<Person> reviewees;

    @Relationship(type = "SKILL")
    public Set<Skill> skills;

    @Relationship(type = "PROJECTS")
    public Set<Project> projects;

    @GraphId private Long id;

    private String firstName;
    private String lastName;
    private String username;

    private Person() {
    }

    public Person(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void reviews(Person person) {
        if (reviewees == null) {
            reviewees = new HashSet<>();
        }
        reviewees.add(person);
    }

    public void workedOn(Project project) {
        if (projects == null) {
            projects = new HashSet<>();
        }
        projects.add(project);
    }

    public Set<Skill> getSkills(){
        if (skills == null) {
            skills = new HashSet<>();
        }
        return skills;
    }

    public Set<Person> getReviewees(){
        if (reviewees == null) {
            reviewees = new HashSet<>();
        }
        return reviewees;
    }

    public Set<Project> getProjects(){
        if (projects == null) {
            projects = new HashSet<>();
        }
        return projects;
    }

    public void hasSkill(Skill skill) {
        if (skills == null) {
            skills = new HashSet<>();
        }
        skills.add(skill);
    }

    public String getDisplayName(){
        return this.getFirstName() + " " + this.getLastName();
    }

    public String getSummary() {
        String summary = this.getDisplayName() + " ";
        for(Skill s: this.getSkills()){
            summary += "Skills: " + s.getName() + " ";
        }

        for(Person s: this.getReviewees()){
            summary += "Reviewees: " + s.getDisplayName() + " ";
        }

        for(Project s: this.getProjects()){
            summary += "Projects: " + s.getName() + " ";
        }
        return summary;
    }
}