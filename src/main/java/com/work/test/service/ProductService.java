package com.work.test.service;


import com.work.test.model.pojo.Producto;
import com.work.test.model.request.CreateProductRequest;

import java.util.List;

public interface ProductService {

    List<Producto> getProducts();
    //List<Productosimple> getProductos();

    Producto getProduct(Integer productId);

    Producto updateProduct(Integer productId, Producto productosimple);


    Boolean removeProduct(Integer productId);

    Producto createProduct(CreateProductRequest request);

}
