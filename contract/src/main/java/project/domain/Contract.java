package project.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import project.ContractApplication;
import project.domain.ContractCreated;
import project.domain.ContractDeleted;

@Entity
@Table(name = "Contract_table")
@Data
//<<< DDD / Aggregate Root
public class Contract {

    @Id
    private String name;

    private Date startDate;

    private Date endDate;

    @PostPersist
    public void onPostPersist() {
        ContractCreated contractCreated = new ContractCreated(this);
        contractCreated.publishAfterCommit();

        ContractDeleted contractDeleted = new ContractDeleted(this);
        contractDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ContractRepository repository() {
        ContractRepository contractRepository = ContractApplication.applicationContext.getBean(
            ContractRepository.class
        );
        return contractRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateContract(UpdateContractCommand updateContractCommand) {
        //implement business logic here:

        ContractUpdated contractUpdated = new ContractUpdated(this);
        contractUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
