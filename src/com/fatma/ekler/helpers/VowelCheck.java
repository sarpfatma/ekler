package com.fatma.ekler.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCheck {
    private String str;
    public VowelCheck(String str) {
        this.str = str;
    }

    public Boolean check() {
        Pattern pattern = Pattern.compile("[\\w]([aeiouâãäåæçèéêëìíîïðñòóôõøùúûü])", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(this.str);
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }

    }
}
