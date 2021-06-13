import java.util.ArrayList;

public class Rota {
    private String nomeRota;
    private ArrayList<String> cidades = new ArrayList<>();
    private DataHora chegada = new DataHora();
    private DataHora ida = new DataHora();
    private int idRota;

    public void setRota(String c1, String c2, String c3, String c4, String c5){
        this.cidades.add(c1);
        this.cidades.add(c2);
        this.cidades.add(c3);
        this.cidades.add(c4);
        this.cidades.add(c5);
    }
    public void setRota(String c){
        this.cidades.add(c);
    }
    public void printRota(){
        System.out.println("Nome da rota "+getIdRota()+": "+getNomeRota());
        System.out.println("Cidades da rota: "+getRota());
        System.out.println("Horario de ida: "+getIda());
        System.out.println("Horario de chegada: "+getChegada()+"\n");
    }
    public ArrayList<String> getRota(){
        return cidades;
    }
    public int getIdRota(){return this.idRota;}
    public void setIdRota(int id){
        this.idRota = id;
    }
    public String getCidPartida(){
        return this.cidades.get(0);
    }
    public String getCidChegada(){
        return this.cidades.get(this.cidades.size());
    }
    public void setNomeRota(String nomeRota) {
        this.nomeRota = nomeRota;
    }
    public String getNomeRota() {
        return nomeRota;
    }

    public void setIda(int hora, int minutos) {
        this.ida.setHorario(hora,minutos);
    }
    public String getIda() {
        return ida.getHorario();
    }

    public void setChegada(int hora, int minutos) {
        this.chegada.setHorario(hora, minutos);
    }
    public String getChegada() {
        return chegada.getHorario();
    }
}
