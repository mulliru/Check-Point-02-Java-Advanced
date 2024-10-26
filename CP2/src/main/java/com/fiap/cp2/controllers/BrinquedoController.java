package com.fiap.cp2.controllers;

import com.fiap.cp2.dtos.BrinquedoDTO;
import com.fiap.cp2.models.Brinquedo;
import com.fiap.cp2.services.BrinquedoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    private final BrinquedoService brinquedoService;

    public BrinquedoController(BrinquedoService brinquedoService) {
        this.brinquedoService = brinquedoService;
    }

    @PostMapping
    public ResponseEntity<BrinquedoDTO> criarBrinquedo(@Valid @RequestBody BrinquedoDTO brinquedoDTO) {

        if (brinquedoDTO.getId() != null) {
            return ResponseEntity.badRequest().build();
        }

        Brinquedo brinquedo = new Brinquedo();
        brinquedo.setNome(brinquedoDTO.getNome());
        brinquedo.setTipo(brinquedoDTO.getTipo());
        brinquedo.setClassificacao(brinquedoDTO.getClassificacao());
        brinquedo.setTamanho(brinquedoDTO.getTamanho());
        brinquedo.setPreco(brinquedoDTO.getPreco());

        Brinquedo novoBrinquedo = brinquedoService.create(brinquedo);

        BrinquedoDTO responseDTO = mapearBrinquedoDTO(novoBrinquedo);

        return ResponseEntity.status(201).body(responseDTO);
    }

    @GetMapping("/{}id")
    public ResponseEntity<BrinquedoDTO> buscarBrinquedoPorId(@PathVariable int id) {
        Brinquedo brinquedo = brinquedoService.read(id);
        if (brinquedo != null) {
            BrinquedoDTO brinquedoDTO = mapearBrinquedoDTO(brinquedo);
            return ResponseEntity.ok(brinquedoDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<BrinquedoDTO>> listarBrinquedos() {
        List<Brinquedo> brinquedos = brinquedoService.getAll();
        List<BrinquedoDTO> brinquedosDTO = brinquedos.stream()
                .map(this::mapearBrinquedoDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(brinquedosDTO);
    }

    private BrinquedoDTO mapearBrinquedoDTO(Brinquedo brinquedo) {
        BrinquedoDTO brinquedoDTO = new BrinquedoDTO();
        brinquedoDTO.setId(brinquedo.getId());
        brinquedoDTO.setNome(brinquedo.getNome());
        brinquedoDTO.setTipo(brinquedo.getTipo());
        brinquedoDTO.setClassificacao(brinquedo.getClassificacao());
        brinquedoDTO.setTamanho(brinquedo.getTamanho());
        brinquedoDTO.setPreco(brinquedo.getPreco());
        return brinquedoDTO;
    }
}
