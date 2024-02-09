package com.platzi.platzimarket.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {
    @EmbeddedId //Se usa cuando la clave primaria es compuesta y se debe realizar las claves compuestas en una clase aparte y crear un atributo de esta clase
    private ComprasProductoPK id;
    private Integer cantidad;
    private Double total;
    private Boolean estado;

    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
