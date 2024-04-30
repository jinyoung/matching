package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ContractUpdated extends AbstractEvent {

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public ContractUpdated(Contract aggregate) {
        super(aggregate);
    }

    public ContractUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
