package com.codegym.controller;

import com.codegym.model.Brand;
import com.codegym.model.Product;
import com.codegym.service.brand.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private IBrandService brandService;
    @GetMapping
    public ResponseEntity<Iterable<Brand>> findAllBrand() {
        List<Brand> brands = (List<Brand>) brandService.findAll();
        if (brands.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }
}
