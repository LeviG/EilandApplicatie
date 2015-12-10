/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Levi
 */
public abstract class Eilandbewoner implements Observer {

    @Override
    public void update(Gebeurtenis gebeurtenis) {
        System.out.println("Hallo " + getNaam() + ", er is een "
                + gebeurtenis + " aan de gang.");
        switch (gebeurtenis) {
            case OVERSTROMING:
                this.reageerOpOverstroming();
                break;
            case VULKAANUITBARSTING:
                this.reageerOpVulkaanuitbarsting();
                break;
        }
    }

    protected String naam;

    public Eilandbewoner(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public abstract void reageerOpOverstroming();

    public abstract void reageerOpVulkaanuitbarsting();
}
