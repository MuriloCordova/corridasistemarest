package com.senai.corrida.Dtos;
import java.awt.*;
import java.time.LocalDateTime;

public class InfoCorridaDTO {
    private String carro;
    private String nomeCorrida;

    private LocalDateTime dataHoraEspecifica = LocalDateTime.of(2024, 3, 7, 10, 30);

    public String getNomeCorrida() {
        return nomeCorrida;
    }

    public void setNomeCorrida(String nomeCorrida) {
        this.nomeCorrida = nomeCorrida;
    }

    public LocalDateTime getDataHoraEspecifica() {
        return dataHoraEspecifica;
    }

    public void setDataHoraEspecifica(LocalDateTime dataHoraEspecifica) {
        this.dataHoraEspecifica = dataHoraEspecifica;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
}
