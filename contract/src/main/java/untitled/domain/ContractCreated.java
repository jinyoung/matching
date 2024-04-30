package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ContractCreated extends AbstractEvent {

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public ContractCreated(Contract aggregate) {
        super(aggregate);
    }

    public ContractCreated() {
        super();
    }
}
//>>> DDD / Domain Event
