import java.util.Date;


public class Funcionario extends Pessoa{
    private Integer matricula;
    private double salario;
    private Date dataAdmissao;
    private String cargo;
    private String colecaoTefone;
    private String endereco;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getColecaoTefone() {
        return colecaoTefone;
    }

    public void setColecaoTefone(String colecaoTefone) {
        this.colecaoTefone = colecaoTefone;
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
