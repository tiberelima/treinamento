package com.lima.tibere.parser;

import sun.misc.Regexp;

public abstract class AbstractParser implements Parser {

    protected String parser(String string, String padrao, String tag, Regexp regexp) {
        int length = string.split(regexp.exp).length;
        if (string.indexOf(padrao) > 0) {
            --length;
        }
        if (length % 2 == 0) {
            for (int i = 0; i <= length; i += 2) {
                string = string.replaceFirst(regexp.exp, "<" + tag + ">")
                        .replaceFirst(regexp.exp, "</" + tag + ">");
            }
        } else if (length > 2) {
            int index = 0;
            for (int i = 1; i < (length / 2) + 1; i++) {
                index = string.indexOf(padrao, 2 + index);
            }
            return parse(string.substring(0, string.indexOf(padrao, index))
                    + string.substring(string.indexOf(padrao, index) + 2));
        }
        return string;
    }
}
