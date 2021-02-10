package com.company;

public class German implements Dialog{

    private String s = "German";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Drücken Sie zum Beenden q";
    }

    @Override
    public String selectedLanguage() {
        return "Die ausgewählte Sprache ist ";
    }
}
