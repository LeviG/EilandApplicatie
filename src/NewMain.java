
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Levi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Eiland eiland = Eiland.getInstance();
        Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader(new File("eilandbewoners.txt")))) {
            String regel = br.readLine();
            while (regel != null) {
                char soortBewoner = regel.charAt(0);
                String naam = regel.substring(1, regel.length());

                if (soortBewoner == 'V') {

                    eiland.addBewoner(new Vogel(naam));

                } else if (soortBewoner == 'Z') {
                    eiland.addBewoner(new Zoogdier(naam));
                }
                regel = br.readLine();

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(" Druk O voor overstroming en V voor vulkaanuitbarsting, S om te stoppen");
        String input = sc.next();
        

            if (input == "O") {
                eiland.overstroming();
            }
            if (input == "V") {
                eiland.vulkaanuitbarsting();
            }
            
            eiland.overstroming();
        
        
    }

}
