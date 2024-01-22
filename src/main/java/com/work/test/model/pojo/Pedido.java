package com.work.test.model.pojo;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Pedido {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDPEDIDO")
    private int idpedido;
    @Basic
    @Column(name = "IDCLIENTE")
    private int idcliente;
    @Basic
    @Column(name = "IDENVIO")
    private int idenvio;
    @Basic
    @Column(name = "IDPRODUCTO")
    private int idproducto;
    @Basic
    @Column(name = "PEDFECHA")
    private Timestamp pedfecha;
    @Basic
    @Column(name = "PEDESTADO")
    private Integer pedestado;


}
