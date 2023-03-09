package modelo;

public class Partida {
    private int valResultado;
    private superheroe atacante;
    private superheroe victima;
    private Escudo escudo;
    private Arma arma;
    
    public int getValResultado (){
        return valResultado;
    }
    
    public superheroe getAtacante (){
        return atacante;
    }
    
    public superheroe getVictima(){
        return victima;
    }
    
    public Escudo getEscudo(){
        return escudo;
    }
    
    public Arma getArma(){
        return arma;
    }

    public void setValResultado(int valResultado) {
        this.valResultado = valResultado;
    }

    public void setAtacante(superheroe atacante) {
        this.atacante = atacante;
    }

    public void setVictima(superheroe victima) {
        this.victima = victima;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    
    
    
    
    
    
    
    
 }
