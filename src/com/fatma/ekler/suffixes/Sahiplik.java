package com.fatma.ekler.suffixes;

import com.fatma.ekler.helpers.VowelCheck;

import java.util.Arrays;

public class Sahiplik {
    public String str;

    public Sahiplik(String str) {
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
                    ek = "sı";
                    break;
                case "e":
                case "i":
                    ek = "si";
                    break;
                case "o":
                case "u":
                    ek = "su";
                    break;
                case "ö":
                case "ü":
                    ek = "sü";
                    break;
                default:
                    ek = "sü";
                    break;
            }
        } else {
            switch (lastVowelStr) {
                case "a":
                case "ı":
                    ek = "ı";
                    break;
                case "e":
                case "i":
                    ek = "i";
                    break;
                case "o":
                case "u":
                    ek = "u";
                    break;
                case "ö":
                case "ü":
                    ek = "ü";
                    break;
                default:
                    ek = "ü";
                    break;
            }

        }
        return ek;
    }
}

