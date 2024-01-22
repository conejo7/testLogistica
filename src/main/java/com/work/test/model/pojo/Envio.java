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
public class Envio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDENVIO")
    private int idenvio;
    @Basic
    @Column(name = "ENVFECHAREGISTRO")
    private Timestamp envfecharegistro;
    @Basic
    @Column(name = "ENVFECHAENTREGA")
    private Timestamp envfechaentrega;
    @Basic
    @Column(name = "ENVBODEGA")
    private String envbodega;
    @Basic
    @Column(name = "ENVPRECIO")
    private Integer envprecio;
    @Basic
    @Column(name = "ENVPLACAVEHICULO")
    private String envplacavehiculo;
    @Basic
    @Column(name = "ENVNUMGUIA")
    private Integer envnumguia;
    @Basic
    @Column(name = "ENVNUMFLOTA")
    private String envnumflota;
    @Basic
    @Column(name = "ENVPUERTO")
    private String envpuerto;


}
