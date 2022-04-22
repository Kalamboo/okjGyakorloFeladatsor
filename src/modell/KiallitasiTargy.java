/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.time.LocalDate;

/**
 *
 * @author Szabo.Gergo
 */
public abstract class KiallitasiTargy {
    private LocalDate letrehozDatum;
    private String keszito, cim;

    public KiallitasiTargy(LocalDate letrehozDatum, String keszito, String cim) {
        this.letrehozDatum = letrehozDatum;
        this.keszito = keszito;
        this.cim = cim;
    }

    public KiallitasiTargy(String keszito, String cim) {
        this(LocalDate.now(), keszito, cim);
    }

    public String getCim() {
        return cim;
    }

    public String getKeszito() {
        return keszito;
    }

    public LocalDate getLetrehozDatum() {
        return letrehozDatum;
    }   
}
