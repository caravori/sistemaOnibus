public class Funcionario extends Pessoa{

    private String cnh;
    private String admissao;


    Funcionario(int id, String nome, String identidade, String nascimento,String endereco, String cnh, String admissao) {
        super(id, nome, identidade, nascimento,endereco);
        this.cnh = cnh;
        this.admissao = admissao;
    }

}
