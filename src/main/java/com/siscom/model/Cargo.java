package com.siscom.model;

import com.siscom.dto.CargoDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "cargo")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cargo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String nome;
    private String descricao;
    private BigDecimal salario;

    @Column(name = "cbo_1994")
    private String cbo1994;

    @Column(name = "cbo_2002")
    private String cbo2002;

    public static CargoDto toDto(Cargo cargo) {
        CargoDto dto = new CargoDto();
        BeanUtils.copyProperties(cargo, dto);
        return dto;
    }

}
