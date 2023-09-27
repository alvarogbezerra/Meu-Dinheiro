import java.util.List;

public class Usuario {
    private String nome;
    private String email;

    List<Investimento> Investimentos;
    List<Orcamento> Orcamentos;
    List<Meta> Metas;
    
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
