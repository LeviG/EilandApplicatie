/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Levi
 */
public class Vogel  extends Eilandbewoner{

    @Override
    public void reageerOpOverstroming() {
        System.out.println(" vliegt in een boom");
    }

    @Override
    public void reageerOpVulkaanuibarsting() {
        System.out.println("Ik vlieg hogerop");
    }
    
}
