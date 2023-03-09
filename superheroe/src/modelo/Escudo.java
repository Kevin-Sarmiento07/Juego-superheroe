
package modelo;

public class Escudo {
    private String nomEscudo;
    private int protEscudo;
    
    public Escudo (String nomEscudo, int protEscudo){
        this.nomEscudo = nomEscudo;
        this.protEscudo = protEscudo;
    }
    
     public String getNomEscudo(){
           return nomEscudo;
       }
       
     public int getProtEscudo(){
         return protEscudo;
     }
     
     public void setNomEscudo (String nomEscudo){
           this.nomEscudo = nomEscudo;
       }
       
       public void setProtEscudo(int protEscudo){
           this.protEscudo = protEscudo;
       }
    
}
