package com.nightsale.ebios.resource;

import com.nightsale.ebios.domain.AttackStep;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/api/v1/attack-graph/steps")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AttackGraphResource {

    // Récupérer toutes les actions élémentaires (nœuds du graphe)
    @GET
    public List<AttackStep> getAllSteps() {
        return AttackStep.listAll();
    }

    // Ajouter une nouvelle action élémentaire pour l'Atelier 4
    @POST
    @Transactional
    public Response createStep(AttackStep step) {
        step.persist();
        return Response.status(Response.Status.CREATED).entity(step).build();
    }
}