/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Szabo.Gergo
 */
public class Galeria{
    private List<KiallitasiTargy> galeria;

    public Galeria() {
        galeria = new ArrayList<>();
        galeria.add(new KiallitasiTargy("Károly", "Lábak a tengerben") {});
        galeria.add(new KiallitasiTargy(LocalDate.now(), "Károly", "Lábak a tengerben") {});
        galeria.add(new KiallitasiTargy(LocalDate.now(), "Károly", "Lábak a tengerben") {});
        galeria.add(new KiallitasiTargy("Károly", "Lábak a tengerben") {});
    }
    
    public void Keszitorend(){
    }
    public void Targycimrend(){
        
    }
    
    
}
