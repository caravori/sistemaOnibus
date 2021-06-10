public class Cliente extends Pessoa{
    private String profissao;
    Cliente(int id, String nome, String identidade, String nascimento, String profissao, String endereco){
        super(id, nome, identidade, nascimento, endereco);
        setProfissao(profissao);
    }
    public void setProfissao(String prof){
        this.profissao = prof;
    }
    public String getProfissao(){
        return this.profissao;
    }
}
