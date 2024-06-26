package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.MatchingApplication;

@Entity
@Table(name = "Project_table")
@Data
//<<< DDD / Aggregate Root
public class Project {

    @Id
    private String projectId;

    private String title;

    private String duration;

    private Money budget;

    private String manager;

    private Email managerEmail;

    private String client;

    private List<File> files;

    public static ProjectRepository repository() {
        ProjectRepository projectRepository = MatchingApplication.applicationContext.getBean(
            ProjectRepository.class
        );
        return projectRepository;
    }
}
//>>> DDD / Aggregate Root
