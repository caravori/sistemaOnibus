import java.util.ArrayList;
public class Onibus {
    ArrayList <String> rota = new ArrayList<>();
    private String motorista;
    private String modelo;
    private String placa;
    private int ano;
    private float kilometragem;


    Onibus(String motorista, String modelo, String placa, int ano, float km){
        setMotorista(motorista);
        setModelo(modelo);
        setPlaca(placa);
        setAno(ano);
        setKilometragem(km);
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(float kilometragem) {
        this.kilometragem = kilometragem;
    }
    float[][] h = new float[4][10];

    int i,b;
    public void initCadeiras(){
        for(i = 0;i<10;i++) {
            for (b = 0; b < 4; b++) {
                h[b][i] = 0;
            }
        }
    }

    public void setRota(String cid1,String cid2,String cid3,String cid4,String cid5){
        rota.add(cid1);
        rota.add(cid2);
        rota.add(cid3);
        rota.add(cid4);
        rota.add(cid5);
        System.out.println("\nDigite o horario de ida");
    }
    public ArrayList<String> getRota(){
        return rota;
    }
}
