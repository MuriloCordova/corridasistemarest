package com.senai.corrida.Dtos;

public class VelocidadeMediaDTO {

   private String veiculo;
   private float distanciaTotal;
   private int tempoPercorrido;
   private float velocidadeMedia;

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

    public int getTempoPercorrido() {
        return tempoPercorrido;
    }

    public void setTempoPercorrido(int tempoPercorrido) {
        this.tempoPercorrido = tempoPercorrido;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
}
