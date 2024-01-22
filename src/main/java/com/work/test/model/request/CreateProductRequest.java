package com.work.test.model.request;


import lombok.Data;


@Data
public class CreateProductRequest {


    private String proDescripcion;
    private int proCantidad;
    private String proTipo;


}
