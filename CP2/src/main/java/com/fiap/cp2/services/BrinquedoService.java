package com.fiap.cp2.services;

import com.fiap.cp2.models.Brinquedo;

import java.util.List;
import java.util.Optional;

public interface BrinquedoService {

        Brinquedo create(Brinquedo brinquedo);
        Brinquedo read(Integer id);
        List<Brinquedo> getAll();
}
