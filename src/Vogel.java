

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Levi
 */
public class Vogel extends Eilandbewoner {

    public Vogel(String naam) {
        super(naam);
    }
    
    

    @Override
    public void reageerOpOverstroming() {
        System.out.println(getNaam() + " vliegt in een boom");
    }

    @Override
    public void reageerOpVulkaanuitbarsting() {
        System.out.println(getNaam() + " vliegt hogerop");
    }

}
