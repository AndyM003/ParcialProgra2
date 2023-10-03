@Path("/asignaciones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AsignacionResource {

    @POST
    public void agregarAsignacion(AsignacionDTO asignacionDTO) {
        // Lógica para agregar alumnos y cursos a una asignación
    }
}
