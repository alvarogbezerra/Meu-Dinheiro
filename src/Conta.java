import java.util.List;

public class Conta {
    private String banco;
    private String descricao;

    List<Receita> historicoReceitas;
    List<Despesa> historicoDespesas;
    
    public Conta(String banco, String descricao) {
        this.banco = banco;
        this.descricao = descricao;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
