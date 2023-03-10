package src.logistica.model;

import java.util.Scanner;

public class Caminhao {

    private Integer idCaminhao;
    private String modelo;
    private String placa;
    private Integer gasolina;
    private EmViagem emViagem; // 1 - estacionado | 2 - em viagem

    public Integer getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(Integer idCaminhao) {
        this.idCaminhao = idCaminhao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getGasolina() {
        return gasolina;
    }

    public void setGasolina(Integer gasolina) {
        this.gasolina = gasolina;
    }

    public EmViagem getEmViagem() {
        return emViagem;
    }

    public void setEmViagem(EmViagem emViagem) {
        this.emViagem = emViagem;
    }

    @Override
    public String toString() {
        return "Id: " + this.idCaminhao + "\nMoelo: " + this.modelo + "\nPlaca: " + this.placa + "\nGasolina: " + this.gasolina + "\nEm viagem: " + this.emViagem + "\n ====================";

    }
}