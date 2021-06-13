public class Funcionario extends Pessoa{

    private String cnh;
    private String admissao;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    Funcionario(int id, String nome, String identidade, String nascimento,String endereco, String cnh, String admissao) {
        super(id, nome, identidade, nascimento,endereco);
        this.cnh = cnh;
        this.admissao = admissao;
    }

}
