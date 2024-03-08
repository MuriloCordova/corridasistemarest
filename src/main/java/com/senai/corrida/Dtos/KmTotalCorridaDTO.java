package com.senai.corrida.Dtos;

public class KmTotalCorridaDTO {

    private String veiculo;
    private int quantidadeVolta;
    private float tamanhoPista;
    private float kmTotalCorrida;

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public int getQuantidadeVolta() {
        return quantidadeVolta;
    }

    public void setQuantidadeVolta(int quantidadeVolta) {
        this.quantidadeVolta = quantidadeVolta;
    }

    public float getTamanhoPista() {
        return tamanhoPista;
    }

    public void setTamanhoPista(float tamanhoPista) {
        this.tamanhoPista = tamanhoPista;
    }

    public float getKmTotalCorrida() {
        return kmTotalCorrida;
    }

    public void setKmTotalCorrida(float kmTotalCorrida) {
        this.kmTotalCorrida = kmTotalCorrida;
    }
}
