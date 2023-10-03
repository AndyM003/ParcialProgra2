@Path("/catedraticos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CatedraticoResource {

    @Inject
    CatedraticoRepository catedraticoRepository;

    @GET
    public List<Catedratico> listarCatedraticos() {
        return catedraticoRepository.listAll();
    }

    @POST
    public void guardarCatedratico(Catedratico catedratico) {
        catedraticoRepository.persist(catedratico);
    }

    @PUT
    @Path("/{id}")
    public void actualizarCatedratico(@PathParam("id") Long id, Catedratico catedratico) {
        // Lógica para actualizar un catedrático por ID
    }

    @DELETE
    @Path("/{id}")
    public void eliminarCatedratico(@PathParam("id") Long id) {
        // Lógica para eliminar un catedrático por ID
    }
}
