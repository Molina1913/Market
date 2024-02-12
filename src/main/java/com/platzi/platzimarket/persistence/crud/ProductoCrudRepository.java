package com.platzi.platzimarket.persistence.crud;

import com.platzi.platzimarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//cuando se haga la extensión de la interfaz CrudRepository<el primer dato es la tabla, el sgundo dato es el tipo de dato de la llave primaria>
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Query methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
