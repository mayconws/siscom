package com.siscom.service;

import com.siscom.dto.CargoDto;
import com.siscom.exception.RecursoNaoEncontradoException;
import com.siscom.model.Cargo;
import com.siscom.repository.CargoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    private final CargoRepository cargoRepository;

    CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<CargoDto> listar() {
        return cargoRepository.findAll()
                .stream()
                .map(Cargo::toDto)
                .toList();
    }

    public CargoDto buscarPorId(Long id) {
        Cargo cargo = cargoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Recurso não encontrado"));
        return Cargo.toDto(cargo);
    }

    public CargoDto salvar(CargoDto cargoDto) {
        Cargo cargo = CargoDto.toEntity(cargoDto);
        cargo = cargoRepository.save(cargo);
        return Cargo.toDto(cargo);
    }

    public void remover(Long id) {
        cargoRepository.findById(id)
                .ifPresentOrElse(cargoRepository::delete, () -> {
                            throw new RecursoNaoEncontradoException("Recurso não encontrado");
                        }
                );
    }

}
