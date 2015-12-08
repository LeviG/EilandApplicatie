/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Levi
 */
public abstract class Eilandbewoner {
    protected String naam;

    public Eilandbewoner(String naam) {
        setNaam(naam);
    }

    public void getNaam() {
        System.out.print(naam);
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    
    
    
    protected abstract void reageerOpOverstroming();
    protected abstract void reageerOpVulkaanuibarsting();
    
}
