package com.platzi.platzimarket.persistence.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

//This annotation @Entity is isued to map out a table from teh database
//The annotation @Table to reference the class Producto to the table productos
@Entity
@Table(name = "productos")
public class Producto {
    @Id //This annotation indicates that this attribute is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This annotation allows java to generate sequence automatically
    @Column(name = "id_producto") //Specified the name of the column used when the name of the class attribute is different o table column name according to good practices
    private Integer idProducto;
    private String nombre;
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Column(name = "codigo_barras")
    private String codigoDeBarras;
    @Column(name = "precio_venta")
    private Double precioVenta;
    @Column(name = "cantidad_stock")
    private Integer cantidadStock;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)//insertable y updatable significa que no vamos a borrar ni actualizar ni insertar una nueva categoria a traves de la relación
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
