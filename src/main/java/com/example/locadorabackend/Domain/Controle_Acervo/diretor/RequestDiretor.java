package com.example.locadorabackend.Domain.Controle_Acervo.diretor;

import jakarta.validation.constraints.NotBlank;

public record RequestDiretor(
        Long id,
        @NotBlank
        String nome
) {
}
