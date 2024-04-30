package untitled.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/contracts")
@Transactional
public class ContractController {

    @Autowired
    ContractRepository contractRepository;

    @RequestMapping(
        value = "contracts/{id}/uri",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Contract updateContract(
        @PathVariable(value = "id") String id,
        @RequestBody UpdateContractCommand updateContractCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /contract/updateContract  called #####");
        Optional<Contract> optionalContract = contractRepository.findById(id);

        optionalContract.orElseThrow(() -> new Exception("No Entity Found"));
        Contract contract = optionalContract.get();
        contract.updateContract(updateContractCommand);

        contractRepository.save(contract);
        return contract;
    }
}
//>>> Clean Arch / Inbound Adaptor
