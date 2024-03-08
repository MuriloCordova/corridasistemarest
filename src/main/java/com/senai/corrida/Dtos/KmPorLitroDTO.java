package com.senai.corrida.Dtos;

public class KmPorLitroDTO {
    private String veiculo;
    private float distanciaTotal;
    private float combustivelConsumido;
    private float kmPorLitro;

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public float getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(float distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public float getCombustivelConsumido() {
        return combustivelConsumido;
    }

    public void setCombustivelConsumido(float combustivelConsumido) {
        this.combustivelConsumido = combustivelConsumido;
    }

    public float getKmPorLitro() {
        return kmPorLitro;
    }

    public void setKmPorLitro(float kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }
}
