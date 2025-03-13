package co.edu.uceva.productoservice.model.service;

import co.edu.uceva.productoservice.model.entities.Producto;

import java.util.List;

public interface IProductoService {
    Producto save(Producto producto);
    void delete(Producto producto);
    Producto findById(Long id);
    Producto update(Producto producto);
    List<Producto> findAll();
}
