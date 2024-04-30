package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateContractCommand {

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
}
