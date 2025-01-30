package com.siscom.controller;

import com.siscom.dto.CargoDto;
import com.siscom.service.CargoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    private final CargoService cargoService;

    CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping
    public ResponseEntity<List<CargoDto>> listar() {
        List<CargoDto> cargos = cargoService.listar();
        return ResponseEntity.ok(cargos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CargoDto> buscarPorId(@PathVariable Long id) {
        CargoDto cargo = cargoService.buscarPorId(id);
        return ResponseEntity.ok(cargo);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<CargoDto> salvar(@RequestBody CargoDto cargo) {
        CargoDto cargoSalvo = cargoService.salvar(cargo);
        return ResponseEntity.ok(cargoSalvo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        cargoService.remover(id);
    }

}
