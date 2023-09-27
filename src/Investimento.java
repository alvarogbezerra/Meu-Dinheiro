import java.time.LocalDate;

public class Investimento {
    private Double valor;
    private LocalDate data;


    public Investimento(Double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

}
