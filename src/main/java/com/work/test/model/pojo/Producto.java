package com.work.test.model.pojo;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "PRODUCTO", schema = "railway", catalog = "")
public class Producto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDPRODUCTO")
    private int idproducto;
    @Basic
    @Column(name = "PRODESCRIPCION")
    private String prodescripcion;
    @Basic
    @Column(name = "PROTIPO")
    private String protipo;
    @Basic
    @Column(name = "PROCANTIDAD")
    private Integer procantidad;


}
