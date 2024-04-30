package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ContractDeleted extends AbstractEvent {

    private String name;

    public ContractDeleted(Contract aggregate) {
        super(aggregate);
    }

    public ContractDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
