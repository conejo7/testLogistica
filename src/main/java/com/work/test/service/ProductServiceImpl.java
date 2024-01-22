package com.work.test.service;


import com.work.test.data.ProductoRepository;
import com.work.test.model.pojo.Producto;
import com.work.test.model.request.CreateProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> getProducts() {
        List<Producto> products = productoRepository.findAll();
        return products.isEmpty() ? null : products;
    }

    @Override
    public Producto getProduct(Integer productId) {
        return productoRepository.findById((productId)).orElse(null);
    }

    @Override
    public Producto updateProduct(Integer productId, Producto productosimple) {
        Producto productosimple1 = productoRepository.findById((productId)).orElse(null);
        if (productosimple1!=null){
            productosimple1.setProcantidad(productosimple.getProcantidad());
            productoRepository.save(productosimple1);
        }
        return productosimple1;
    }

    @Override
    public Boolean removeProduct(Integer productId) {
        Producto product = productoRepository.findById((productId)).orElse(null);

        if (product != null) {
            productoRepository.delete(product);
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    @Override
    public Producto createProduct(CreateProductRequest request) {
        if (request != null && StringUtils.hasLength(request.getProDescripcion().trim())
                && StringUtils.hasLength(String.valueOf(request.getProCantidad()))
                && StringUtils.hasLength(String.valueOf(request.getProTipo()))) {

            Producto product = Producto.builder().prodescripcion(request.getProDescripcion()).
                    procantidad(request.getProCantidad())
                    .protipo(request.getProTipo()).build();

            return productoRepository.save(product);
        } else {
            return null;
        }
    }


}
