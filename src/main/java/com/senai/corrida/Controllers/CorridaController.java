package com.senai.corrida.Controllers;



import com.senai.corrida.Dtos.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/corrida")
public class CorridaController {

@GetMapping("/infocorrida")
public ResponseEntity<InfoCorridaDTO> infoCorrida(){
    InfoCorridaDTO resultado = new InfoCorridaDTO();

    resultado.setNomeCorrida("LeMans");
    resultado.setCarro("Porshe 911 GT3");
    resultado.getDataHoraEspecifica();

   return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultado);
}
@PostMapping("/VMedia")
    public ResponseEntity<VelocidadeMediaDTO> velocidadeMedia (@RequestBody VelocidadeMediaDTO dados){
    VelocidadeMediaDTO resultado = new VelocidadeMediaDTO();

        resultado.setVelocidadeMedia(dados.getDistanciaTotal()/dados.getTempoPercorrido());
        resultado.setDistanciaTotal(dados.getDistanciaTotal());
        resultado.setVeiculo(dados.getVeiculo());
        resultado.setTempoPercorrido(dados.getTempoPercorrido());

    return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultado);
}
@PostMapping("/KmLitro")
    public ResponseEntity<KmPorLitroDTO> kmPorLitro (@RequestBody KmPorLitroDTO dados){
       KmPorLitroDTO resultado = new KmPorLitroDTO();

        resultado.setKmPorLitro(dados.getDistanciaTotal()/dados.getCombustivelConsumido());
        resultado.setVeiculo(dados.getVeiculo());
        resultado.setCombustivelConsumido(dados.getCombustivelConsumido());
        resultado.setDistanciaTotal(dados.getDistanciaTotal());

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultado);
    }
@PostMapping("/totalCorrida")
    public ResponseEntity<KmTotalCorridaDTO> kmTotalCorrida (@RequestBody KmTotalCorridaDTO dados){
    KmTotalCorridaDTO resultado = new KmTotalCorridaDTO();

    resultado.setKmTotalCorrida(dados.getQuantidadeVolta() * dados.getTamanhoPista());
    resultado.setVeiculo(dados.getVeiculo());
    resultado.setQuantidadeVolta(dados.getQuantidadeVolta());
    resultado.setTamanhoPista(dados.getTamanhoPista());
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultado);
}

}
