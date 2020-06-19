package com.fatma.ekler;

import com.fatma.ekler.suffixes.Iyelik;
import com.fatma.ekler.suffixes.Mastar;
import com.fatma.ekler.suffixes.Sahiplik;

public class Ekler {
    public String str;

    public Ekler(String str) {
        this.str = str;
    }

    public String iyelik() {
        Iyelik ek = new Iyelik(this.str);
        return ek.get();
    }

    public String sahiplik() {
        Sahiplik ek = new Sahiplik(this.str);
        return ek.get();
    }

    public String mastar() {
        Mastar ek = new Mastar(this.str);
        return ek.get();
    }
}
