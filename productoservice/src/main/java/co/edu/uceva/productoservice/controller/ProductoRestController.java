package co.edu.uceva.productoservice.controller;

import co.edu.uceva.productoservice.model.entities.Producto;
import co.edu.uceva.productoservice.model.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/producto-service")
public class ProductoRestController {

   private IProductoService productoService;

   @Autowired
    public ProductoRestController(IProductoService productoService) {
       this.productoService = productoService;
   }

   @GetMapping("/productos")
   public List<Producto> getProductos(){
       return productoService.findAll();
   }

   @GetMapping("/productos/{id}")
   public Producto getProductoById(@PathVariable("id") Long id){
       return productoService.findById(id);
   }

   @PostMapping("/productos")
   public Producto save(@RequestBody Producto producto) {
       return productoService.save(producto);
   }

   @DeleteMapping("/productos")
   public void delete(@RequestBody Producto producto) {
       productoService.delete(producto);
   }


   @PutMapping("/productos")
    public Producto update(@RequestBody Producto producto) {
       return productoService.update(producto);
   }

}
