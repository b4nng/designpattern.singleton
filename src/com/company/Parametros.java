package com.company;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance(){ return instance; }

    private String paisAcesso;
    private String navegadorAcesso;
    private String dataAcesso;

    public String getDataAcesso() { return dataAcesso; }
    public void setDataAcesso(String dataAcesso) { this.dataAcesso = dataAcesso; }

    public String getPaisAcesso(){ return paisAcesso; }
    public void setPaisAcesso(String paisAcesso){ this.paisAcesso = paisAcesso; }

    public String getNavegadorAcesso(){ return navegadorAcesso; }
    public void setNavegadorAcesso(String navegadorAcesso){ this.navegadorAcesso = navegadorAcesso; }

}
