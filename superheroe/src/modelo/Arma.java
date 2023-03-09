
package modelo;

public class Arma {
    private String nomArma;
    private int daoArma; 

    public Arma(String nomArma, int daoArma) {
        this.nomArma = nomArma;
        this.daoArma = daoArma;
    }
    
    
    
    
    public String getNomArma() {
        return nomArma;
    }

    public void setNomArma(String nomArma) {
        this.nomArma = nomArma;
    }

    public int getDaoArma() {
        return daoArma;
    }

    public void setDaoArma(int daoArma) {
        this.daoArma = daoArma;
    }
    
    
}
