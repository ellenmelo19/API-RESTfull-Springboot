package com.example.springboot.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.UUID;
import java.math.BigDecimal;

@Entity
@Table (name = "TB_PRODUCTS")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**Atributos (colunas da tabela)**/
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) /**Inicia Automaticamente o valor para o ID**/
    private UUID idProduct; /**Identificador universal distribuido - base de dados por microservicos**/
    private String name;
    private BigDecimal value;

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}

/**essa interface é apenas para marcar e mostrar para a JVM**/