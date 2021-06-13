package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        login();
        System.out.println(getSession());
    }

    public static void login(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Parametros.getInstance().setDataAcesso(dtf.format(now));
        Parametros.getInstance().setPaisAcesso("Brazil");
        Parametros.getInstance().setNavegadorAcesso("Global Browser");
    }

    public static String getSession(){
        return "Conected from: "+Parametros.getInstance().getPaisAcesso()+
                "\n" + Parametros.getInstance().getDataAcesso() + ", using " +
                Parametros.getInstance().getNavegadorAcesso();

    }

}


