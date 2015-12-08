/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Levi
 */
public class Zoogdier extends Eilandbewoner{

    public Zoogdier(String naam) {
        super(naam);
    }

    @Override
    public void reageerOpOverstroming() {
        System.out.println(" gaat naar de bergen");
    }

    @Override
    public void reageerOpVulkaanuibarsting() {
        System.out.println(" schuilt in het hol");
    }
    
}
