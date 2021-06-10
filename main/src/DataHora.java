public class DataHora{
    private int horas;
    private int minutos;

    private int dia;
    private int mes;
    private int ano;

    public DataHora(int horas, int minutos, int dia, int mes, int ano){
        setHorario(horas, minutos);
        setData(dia, mes, ano);
    }
    public String getHorario(){
        String horario = getHora()+":"+getMin();
        return horario;
    }
    public String getData(){
        String data = getDia()+"/"+getMes()+"/"+getAno();
        return data;
    }
    public void setHorario(int horas, int minutos){
        setHora(horas);
        setMin(minutos);
    }
    public void setData(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }
    public void setHora(int horas){
        if(horas>=24){
            System.out.println("Insira uma hora valida");
        }
        else{
            this.horas=horas;
        }
    }
    public void setMin(int minutos){
        if(minutos>=60){
            System.out.println("Insira um minuto valido!");
        }
        else{
            this.minutos = minutos;
        }
    }
    public void setDia(int dia){
        if(dia>31){
            System.out.println("Dia invalido!");
        }
        else{
            this.dia = dia;
        }
    }
    public void setMes(int mes){
        if(mes>12){
            System.out.println("Mes invalido!");
        }
        else{
            this.mes = mes;
        }
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public int getMin(){
        return this.minutos;
    }
    public int getHora(){
        return this.horas;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
}