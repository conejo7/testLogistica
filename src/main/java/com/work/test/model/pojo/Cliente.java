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
public class Cliente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDCLIENTE")
    private int idcliente;
    @Basic
    @Column(name = "CLINOMBRE")
    private String clinombre;
    @Basic
    @Column(name = "CLIDIRECCION")
    private String clidireccion;
    @Basic
    @Column(name = "CLICELULAR")
    private String clicelular;
    @Basic
    @Column(name = "CLICEDULA")
    private String clicedula;


}
