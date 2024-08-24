package com.example.springboot.dtos;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;

//    Objetos para transferencia de dados DTO
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {

}
