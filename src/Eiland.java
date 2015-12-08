
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Levi
 */
public class Eiland {

    private static Eiland uniqueInstance;
    private ArrayList<Eilandbewoner> bewoners = new ArrayList<>();

    public void addBewoner(Eilandbewoner eilandbewoner) {
        bewoners.add(eilandbewoner);
    }

    public void overstroming() {
        for (Eilandbewoner eilandbewoner : bewoners) {
            eilandbewoner.getNaam();
            eilandbewoner.reageerOpOverstroming();
        }
    }
    public void vulkaanuitbarsting() {
        for (Eilandbewoner eilandbewoner : bewoners) {
            eilandbewoner.getNaam();
            eilandbewoner.reageerOpVulkaanuibarsting();
        }
    }

    private Eiland() {

    }

    public static Eiland getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Eiland();
        }
        return uniqueInstance;
    }
}
