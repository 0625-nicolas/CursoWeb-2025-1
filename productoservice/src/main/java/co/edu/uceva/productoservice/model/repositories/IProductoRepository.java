package co.edu.uceva.productoservice.model.repositories;

import co.edu.uceva.productoservice.model.entities.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface que hereda de CrudRepository para realizar las operacioes de CRUD sobre la entidad Producto
 * CRUD: Create, Retrieve, Update, Delete
 */

public interface IProductoRepository extends CrudRepository<Producto, Long> {

}
