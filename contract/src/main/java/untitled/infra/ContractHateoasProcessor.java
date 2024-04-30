package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class ContractHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Contract>> {

    @Override
    public EntityModel<Contract> process(EntityModel<Contract> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/uri")
                .withRel("uri")
        );

        return model;
    }
}
