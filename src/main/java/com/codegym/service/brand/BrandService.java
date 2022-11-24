package com.codegym.service.brand;

import com.codegym.model.Brand;
import com.codegym.repository.IBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BrandService implements IBrandService{
    @Autowired
    private IBrandRepository brandRepository;
    @Override
    public Iterable<Brand> findAll() {
        return brandRepository.findAll();
    }

    @Override
    public Optional<Brand> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Brand save(Brand brand) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
