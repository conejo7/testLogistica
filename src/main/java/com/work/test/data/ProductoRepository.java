package com.work.test.data;


import com.work.test.model.pojo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

//List<Producto> findByProSimId (Long id);
//List<Producto> findByIdproducto (Long id);
}
