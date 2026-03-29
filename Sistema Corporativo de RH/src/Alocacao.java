import java.time.LocalDate;
import java.time.LocalDateTime;

public class Alocacao {

    // Um recurso só pode ser alocado se estiver disponivel == true.

    int colaboradorId;
    int recursoId;
    LocalDateTime data;
    String observacao;

    public Alocacao(int colaboradorId, int recursoId, LocalDateTime data, String observacao) {
        this.colaboradorId = colaboradorId;
        this.recursoId = recursoId;
        this.data = LocalDateTime.now();
        this.observacao = observacao;
    }

    public int getColaboradorId() {
        return colaboradorId;
    }

    public int getRecursoId() {
        return recursoId;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getObservacao() {
        return observacao;
    }
}
