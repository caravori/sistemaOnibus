import java.util.ArrayList;
public class Onibus {
    ArrayList <String> rota = new ArrayList<>();
    private String motorista;
    private String modelo;
    private String placa;
    private String ano;
    private String kilometragem;


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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(String kilometragem) {
        this.kilometragem = kilometragem;
    }
    int[][] h = new int[5][11];

    int i,b;
    public void initCadeiras(){
        for(i = 1;i<=10;i++) {
            for (b = 1; b <= 4; b++) {
                this.h[b][i] = 0;
            }
        }
    }

    public void setCadeira(int b,int i,int id){
        this.h[i][b]=id;
    }

    public float getCadeira(int b,int i){
        return this.h[i][b];
    }

    public void printCadeiras(){
        for(i = 1;i<=10;i++) {
            System.out.print("["+(i)+"]");
            for (b = 1; b <= 4; b++) {
                if(this.h[b][i]>0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
