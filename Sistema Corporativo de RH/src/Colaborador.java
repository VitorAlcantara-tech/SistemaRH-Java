import java.time.LocalDate;

public class Colaborador {

    // Um colaborador recém-admitido sempre começa como ativo = true.

    int id;
    String nome;
    String cargo;
    double salario;
    boolean ativo;
    LocalDate dataDeAdmissao;

    public Colaborador (int id, String nome, String cargo, double salario, boolean ativo, LocalDate dataDeAdmissao){
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void promover(String novoCargo, double novoSalario) {
        this.cargo = novoCargo;
        this.salario = novoSalario;
    }

}
