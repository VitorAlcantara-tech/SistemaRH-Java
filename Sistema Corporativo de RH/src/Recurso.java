public class Recurso {

    // só pode ser alocado se tiver disponivel

    int id;
    String nomeDoRecurso;
    String categoria;
    boolean disponivel;
    double valorEstimado;

    public Recurso(int id, String nomeDoRecurso, String categoria, boolean disponivel, double valorEstimado) {
        this.id = id;
        this.nomeDoRecurso = nomeDoRecurso;
        this.categoria = categoria;
        this.disponivel = disponivel;
        this.valorEstimado = valorEstimado;
    }

    public int getId() {
        return id;
    }

    public String getNomeDoRecurso() {
        return nomeDoRecurso;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public boolean podeSerAlocado() {

        return disponivel && valorEstimado <= 5000;
    }
}
