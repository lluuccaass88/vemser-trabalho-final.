import java.lang.reflect.Array;
import java.util.ArrayList;

public class Viagem {
    private Caminhao caminhao;
    private Motorista motorista;
    private Rota rota;
    private boolean finalizada;
    private ArrayList<Posto> postosCredenciados = new ArrayList();


    public Viagem(Caminhao caminhao, Motorista motorista, Rota rota, ArrayList<Posto> postosCredenciados) {
        this.caminhao = caminhao;
        this.motorista = motorista;
        this.rota = rota;
        this.finalizada = false;
        this.postosCredenciados = postosCredenciados;
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

    public void finalizarViagem(){ //OK
        this.finalizada = true;
        caminhao.setEmViagem(false);
        motorista.setEmViagem(false);
    }

    public boolean abastecer(Posto posto, int quantidade){ //Teria que chamar a função abastecer do caminhão, então preciso da classe caminhão
        if(this.caminhao.abastecer(quantidade)){
            System.out.println("Abastecido no posto " + posto.getNome() + ".");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if(this.finalizada){
            return "Motorista: " + this.motorista.getNome() + "\nCaminhao: " + this.caminhao.getPlaca() + "\n=== Rota === \nPartida: " + "\nStatus: Finalizada.";
        }else{
            return "Motorista: " + this.motorista.getNome() + "\nCaminhao: " + this.caminhao.getPlaca() + "\n=== Rota === \nPartida: " + "\nStatus: Viagem em andamento.";
        }
    }
}