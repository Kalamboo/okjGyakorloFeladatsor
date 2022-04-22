/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Szabo.Gergo
 */
public class Festmeny {
    private File eleresiUt;

    public Festmeny(File eleresiUt) {
        this.eleresiUt = eleresiUt;
        System.out.println(Beolvas(eleresiUt));
    }
    
    private String Beolvas(File eleresiUt){
        String txt = "megjelenítés folyamatban...";
        try{
            Scanner sc = new Scanner(eleresiUt);
        } catch (FileNotFoundException e){
            txt = "nem lehet megjeleníteni!";
        }
        return txt;
    }

    @Override
    public String toString() {
        return "Festmeny{" + "eleresiUt=" + eleresiUt + '}';
    }
}
