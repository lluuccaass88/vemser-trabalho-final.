public class Colaborador  extends Usuario implements Imprimir{
    private String rg;

    public Colaborador(String nome, String cpf, double salario, int idade) {
        super(nome, cpf, salario, idade);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public void imprimir() {
        System.out.printf("Nome: %s , CPF: %s , Salario: %f , Idade: %d, RG: %s", getNome(),getCpf(),getSalario(),getIdade(),getRg());
    }
}
