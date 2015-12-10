
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
        // We maken een instantie van eiland.
        Eiland bali = Eiland.INSTANCE;
        BewonerFactory factory = new BewonerFactory();

        try (BufferedReader br = new BufferedReader(new FileReader(new File("eilandbewoners.txt")))) {
            String regel = br.readLine();
            while (regel != null) {
                String soortBewoner = regel.substring(0, 1);
                String naam = regel.substring(1, regel.length());
                bali.registerObserver(factory.getBewoner(soortBewoner, naam));

                regel = br.readLine();

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println(" Druk O voor overstroming en V voor vulkaanuitbarsting, S om te stoppen");
        String input = sc.next();

        while (!input.equals("S")) {
            if (input.equals("O")) {

                bali.setGebeurtenis(Gebeurtenis.OVERSTROMING);
            }
            if (input.equals("V")) {
                bali.setGebeurtenis(Gebeurtenis.VULKAANUITBARSTING);
            }
            System.out.println(" Druk O voor overstroming en V voor vulkaanuitbarsting, S om te stoppen");
            input = sc.next();
        }
    }

}
