/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Levi
 */
public class BewonerFactory {
    public Eilandbewoner getBewoner(String type, String naam){
        if(type.equals("V")){
            return new Vogel(naam);
            
        }
        if(type.equals("Z")){
            return new Zoogdier(naam);
        }
        return null;
    }
}
