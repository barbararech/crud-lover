package com.cars.api.dto;

import java.util.Date;

import org.springframework.format.annotation.NumberFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

public record CarDTO(
    @NotBlank String modelo,

    @NotBlank String fabricante,

    @Past Date dataFabricacao,

    @NotBlank @NumberFormat String valor,

    @NumberFormat String anoModelo) {
}
