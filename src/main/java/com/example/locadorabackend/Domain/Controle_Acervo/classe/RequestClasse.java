package com.example.locadorabackend.Domain.Controle_Acervo.classe;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

public record RequestClasse(
        Long id,
        @NotBlank
        String nome,

        @NotNull
        int valor,
        @NotBlank
        String dataDevolucao
) {
    public Date getDataDevolucaoAsDate() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(dataDevolucao);
        } catch (Exception e) {
            return null;
        }
    }
}
