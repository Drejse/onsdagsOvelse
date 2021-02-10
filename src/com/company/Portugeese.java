package com.company;

public class Portugeese implements Dialog{

    private String s = "Portugeese";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "pressione q para sair";
    }

    @Override
    public String selectedLanguage() {
        return "o idioma selecionado é ";
    }
}
