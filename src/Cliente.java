
public class Cliente extends Pessoa{
    private String codigo;
    private String profissao;
    private String colecaoTelefone;
    private String endereco;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getColecaoTelefone() {
        return colecaoTelefone;
    }

    public void setColecaoTelefone(String colecaoTelefone) {
        this.colecaoTelefone = colecaoTelefone;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
