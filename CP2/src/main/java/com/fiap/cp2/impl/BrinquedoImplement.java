package com.fiap.cp2.impl;

import com.fiap.cp2.models.Brinquedo;
import com.fiap.cp2.repositories.BrinquedoRepository;
import com.fiap.cp2.services.BrinquedoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class BrinquedoImplement implements BrinquedoService {

    private final BrinquedoRepository brinquedoRepository;

    public BrinquedoImplement(BrinquedoRepository brinquedoRepository) {
        this.brinquedoRepository = brinquedoRepository;
    }

    @Override
    public Brinquedo create(Brinquedo brinquedo) {
        return  brinquedoRepository.save(brinquedo);
    }

    @Override
    public Brinquedo read(Integer id) {
        return brinquedoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Brinquedo> getAll() {
        return brinquedoRepository.findAll();
    }

}