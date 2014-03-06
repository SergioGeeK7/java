

public class Fecha {

    
    
    private int dia;
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        
        this.mes = validaMes(mes);
        this.dia = validaDia(dia);
        this.ano = validaAno(ano);
        
        
    }
    
    private int validaMes(int mes){
    
        if (mes>0 && mes<13) {
            
            return mes;
        }
    
        return -1;
    }
    
    
    private int validaDia(int dia){
        
        int dias[]= {31,28,31,30,31,30,31,31,30,31,20,31};
        
        if (dia<=dias[this.mes] && dia>0) {
            
            return dia;
            
        }
        
        return -1;
        
    }
    
    
    private int validaAno(int ano){
        
        if (ano>0) {
            return ano;
        }
        
        return -1;
        
    }
    
    
    public boolean fechaValida (){
        return this.ano != -1 && this.mes != -1 && this.dia != -1;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d",ano,mes,dia);
    }
    
    
    
    
    
    
    
}
