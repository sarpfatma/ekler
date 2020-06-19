package com.fatma.ekler.suffixes;

import com.fatma.ekler.helpers.VowelCheck;

import java.util.Arrays;

public class Iyelik {
    public String str;

    public Iyelik(String str) {
        this.str = str;
    }

    public String get() {
        VowelCheck vowelCheck = new VowelCheck(this.str);
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
        // Iyelik eki hesaplama
        if (Arrays.asList(volwetchars).contains(sonHarfStr)) {
            switch (sonHarfStr) {
                case "a":
                case "ı":
                    ek = "nın";
                    break;
                case "e":
                case "i":
                    ek = "nin";
                    break;
                case "o":
                case "u":
                    ek = "nun";
                    break;
                case "ö":
                case "ü":
                    ek = "nün";
                    break;
                default:
                    ek = "nün";
                    break;
            }
        } else {
            switch (lastVowelStr) {
                case "a":
                case "ı":
                    ek = "ın";
                    break;
                case "e":
                case "i":
                    ek = "in";
                    break;
                case "o":
                case "u":
                    ek = "un";
                    break;
                case "ö":
                case "ü":
                    ek = "ün";
                    break;
                default:
                    ek = "ün";
                    break;
            }

        }
        return ek;
    }
}

