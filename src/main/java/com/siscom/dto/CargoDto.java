package com.siscom.dto;

import com.siscom.model.Cargo;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Data
public class CargoDto {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal salario;
    private String cbo1994;
    private String cbo2002;

    public static Cargo toEntity(CargoDto dto) {
        Cargo cargo = new Cargo();
        BeanUtils.copyProperties(dto, cargo);
        return cargo;
    }
}
