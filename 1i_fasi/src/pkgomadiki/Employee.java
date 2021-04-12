/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgomadiki;

import java.util.ArrayList;

/**
 *
 * @author ilias
 */
public class Employee {
    

   
    protected String onoma, imerominia_genisis;
    public String oik_kat, eidikotita, spoudes;
    public int paidia, misthos = 0;
    ArrayList<EmployeeProject> prList= new ArrayList<EmployeeProject>();
    public project ergo;
    public String imerominia_analipsis, anathesi;
    public String tmima;
    protected int etos_prosl;

    Employee(String onoma, String imerominia_genisis, String oik_kat, String eidikotita, String spoudes, int paidia, int etos_prosl,String tmima) {

        this.eidikotita = eidikotita;
        this.onoma = onoma;
        this.etos_prosl = etos_prosl;
        this.paidia = paidia;
        this.spoudes = spoudes;
        this.imerominia_genisis = imerominia_genisis;
        this.oik_kat = oik_kat;
        this.tmima=tmima;
        misthos = misthos(oik_kat, spoudes, paidia, etos_prosl,prList);
        this.misthos = misthos;

    }

    //misthos 
    public int misthos(String oik_kat, String spoudes, int paidia, int etos_prosl, ArrayList<EmployeeProject> prList) {
        int misthos = 0;
        int epidomaTe = 60;
        int epidomaSp = 80;
        int epidomaPr = 40;

        if (paidia == 0) {
            epidomaTe = 60;
        } else if (paidia == 1) {
            epidomaTe = 120;
        } else if (paidia >= 3) {
            epidomaTe = 180;
        }
        if (spoudes == "panepistimio") {
            epidomaSp = 80;
        } else if (spoudes == "metaptyxiako") {
            epidomaSp = 160;
        } else if (spoudes == "didaktoriko") {
            epidomaSp = 240;
        }
        if (2021 - etos_prosl < 3) {
            epidomaPr = 0;
        } else if (2021 - etos_prosl >= 3 && 2021 - etos_prosl < 6) {
            epidomaPr = 40;
        } else if (2021 - etos_prosl >= 6 && 2021 - etos_prosl < 9) {
            epidomaPr = 80;
        } else if (2021 - etos_prosl >= 9) {
            epidomaPr = 120;
        }

        misthos = 750 + epidomaTe + epidomaSp + epidomaPr+100*prList.size();              
        return misthos;
    }

    public String getEidikotita() {
        return eidikotita;
    }

    public String getOnoma() {
        return onoma;
    }

    public String getImerominia_genisis() {
        return imerominia_genisis;
    }

    public String getSpoudes() {
        return spoudes;
    }

    public String getOik_kat() {
        return oik_kat;
    }

    public int getPaidia() {
        return paidia;
    }

    public int getEtos_prosl() {
        return etos_prosl;
    }

    public int getMisthos() {
        return misthos;
    }

    public project getErgo() {
        return ergo;
    }

    public String getTmima() {
        return tmima;
    }

    public void setTmima(String tmima) {
        this.tmima = tmima;
    }

    public void setEidikotita() {
        this.eidikotita = eidikotita;
    }

    public void setOnoma() {
        this.onoma = onoma;
    }

    public void setImerominia_genisis() {
        this.imerominia_genisis = imerominia_genisis;
    }

    public void addErgo(project ergo,String StartDate,String EndDate) {
        this.prList.add(new EmployeeProject(ergo,StartDate,EndDate));
    }

    public void setSpoudes() {
        this.spoudes = spoudes;
    }

    public void setOik_kat() {
        this.oik_kat = oik_kat;
    }

    public void setPaidia() {
        this.paidia = paidia;
    }

    public void setEtos_prosl() {
        this.etos_prosl = etos_prosl;
    }

    public String toString() {
        return "onoma: " + onoma + "\nimerominia genisis " + imerominia_genisis
                + "\neidikotita " + eidikotita + "\netos proslipsis " + etos_prosl
                + "\nspoudes " + spoudes + "\narithmos paidiwn " + paidia
                + "\noikogeniaki katastasi " + oik_kat + "\nmisthos " + misthos;
    }

}
