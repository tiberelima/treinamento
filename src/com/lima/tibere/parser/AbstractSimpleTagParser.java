package com.lima.tibere.parser;

public abstract class AbstractSimpleTagParser implements Parser {

    protected String tag;
    protected String regexp;
    protected String pattern;

    protected String parser(String string) {
        int numeroDeOcorrencias = contarNumeroDeOcorrencias(string);
        if (numeroDeOcorrencias % 2 == 0) {
            string = substituirPadraoPorTags(numeroDeOcorrencias, string);
        } else if (numeroDeOcorrencias > 2) {
            return removerOcorrenciaCentral(numeroDeOcorrencias, string);
        }
        return string;
    }

    private int contarNumeroDeOcorrencias(String string) {
        int length = string.split(regexp).length;
        if (string.indexOf(pattern) > 0) {
            --length;
        }
        return length;
    }

    private String removerOcorrenciaCentral(int length, String string) {
        int index = 0;
        for (int i = 1; i < (length / 2) + 1; i++) {
            index = string.indexOf(pattern, 2 + index);
        }
        return parse(string.substring(0, string.indexOf(pattern, index))
                + string.substring(string.indexOf(pattern, index) + 2));
    }

    private String substituirPadraoPorTags(int length, String string) {
        for (int i = 0; i <= length; i += 2) {
            string = string.replaceFirst(regexp, "<" + tag + ">")
                    .replaceFirst(regexp, "</" + tag + ">");
        }
        return string;
    }

    public String getTag() {
        return tag;
    }

    public String getRegexp() {
        return regexp;
    }

    public String getPattern() {
        return pattern;
    }
}
