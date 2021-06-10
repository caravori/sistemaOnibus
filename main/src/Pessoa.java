public abstract class Pessoa {
    private int id;
    private String nome;
    private String identidade;
    private String nascimento;
    private String endereco;
    Pessoa(int id, String nome, String identidade, String nascimento, String endereco) {
        setId(id);
        setNome(nome);
        setIdentidade(identidade);
        setNascimento(nascimento);
        setEndereco(endereco);
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNome(){
        return this.nome;
    }
    public String getIdentidade(){
        return this.identidade;
    }
    public String getNascimento(){
        return this.nascimento;
    }
    public int getId(){
        return this.id;
    }
    public void setNome(String name){
        this.nome = name;
    }
    public void setIdentidade(String ident){
        this.identidade = ident;
    }
    public void setNascimento(String nasc){
        this.nascimento = nasc;
    }
    public void setId(int n){
        this.id = n;
    }
}
