package src.logistica.model;

import java.util.ArrayList;

public class Viagem  { // implements ViagemMotorista {
    private Caminhao caminhao;
    private Motorista motorista;
    private Rota rota;
    private boolean finalizada;
    private ArrayList<Posto> postosCredenciados = new ArrayList();


    public Viagem(Caminhao caminhao, Motorista motorista, Rota rota) {
        this.caminhao = caminhao;
        this.motorista = motorista;
        this.rota = rota;
        this.finalizada = false;
    }

    public Viagem() {

    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    //========== Metodos =========

//    @Override
//    public void finalizarViagem(){
//        this.finalizada = true;
//        caminhao.setEmViagem(false);
//        motorista.setEmViagem(false);
//    }

    @Override
    public String toString() {
        if(this.finalizada){
            return "Motorista: " + this.motorista.getNome() + "\nCaminhao: " + this.caminhao.getPlaca() + "\n=== Rota === \nPartida: " + this.rota.getLocalPartida() + "\nStatus: Finalizada.";
        }else{
            return "Motorista: " + this.motorista.getNome() + "\nCaminhao: " + this.caminhao.getPlaca() + "\n=== Rota === \nPartida: " + this.rota.getLocalPartida() + "\nDestino: " + "\nStatus: Viagem em andamento.";
        }
    }
}
