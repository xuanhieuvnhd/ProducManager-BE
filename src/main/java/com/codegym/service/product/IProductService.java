package com.codegym.service.product;

import com.codegym.model.Brand;
import com.codegym.model.Product;
import com.codegym.service.IGeneralService;

public interface IProductService extends IGeneralService<Product> {
    Iterable<Product> findAllByNameContaining(String name);

    Iterable<Product> findAllByOrderByPrice();

    Iterable<Product> findAllByOrderByPriceDesc();

    Iterable<Product> findAllByBrand(Brand brand);
}
