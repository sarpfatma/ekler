package com.fatma.ekler.suffixes;

import com.fatma.ekler.helpers.VowelCheck;

import java.util.Arrays;

public class Mastar {
    public String str;

    public Mastar(String str) {
        this.str = str;
    }

    public String get() {
        VowelCheck vowelCheck = new VowelCheck(str);
        if (!vowelCheck.check()) {
            return null;
        }

        String ek = null;
        String sesli = "aeıioöuü";
        String[] volwetchars = sesli.split("");
        String sessiz = "bcçdfgğhjklmnprsştvyz";

        // Son harfi getirme
        int sonHarfIndexi = this.str.length() - 1;
        char sonHarfChar = this.str.charAt(sonHarfIndexi);
        String sonHarfStr = this.str.substring(sonHarfIndexi);

        // Son unlu harfi getirme
        final String vowels = "aeiou";
        String lastVowelStr = null;
        for (int i = this.str.length() - 1; i > 0; i--) {
            if (vowels.indexOf(this.str.toLowerCase().charAt(i)) >= 0) {
                char lastVowelChar = this.str.charAt(i);
                lastVowelStr = this.str.substring(i, i + 1);
                break;
            }
        }
        // Sahiplik eki hesaplama
        if (Arrays.asList(volwetchars).contains(sonHarfStr)) {
            switch (sonHarfStr) {
                case "a":
                case "ı":
                case "o":
                case "u":
                    ek = "mak";
                    break;
                case "e":
                case "i":
                case "ö":
                case "ü":
                    ek = "mek";
                    break;

                default:
                    ek = "mak";
                    break;
            }
        }
        return ek;
    }
}

