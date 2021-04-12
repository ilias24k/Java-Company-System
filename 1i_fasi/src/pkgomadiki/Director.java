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
public class Director extends Employee {
    public String imerominia_analipsis;
    private Boolean ypovivasmos;
    public Director(String onoma, String imerominia_genisis, String oik_kat, String eidikotita, String spoudes, int paidia, int etos_prosl, String imerominia_analipsis, String anthesi) {
        super(onoma, imerominia_genisis, oik_kat, eidikotita, spoudes, paidia, etos_prosl, anthesi);
        
        this.imerominia_analipsis=imerominia_analipsis;
    }
    
    
    
    public int misthos(String oik_kat, String spoudes, int paidia, int etos_prosl ,ArrayList<EmployeeProject> prList) {
        int misthos = 0;
        int epidomaTe = 60;
        int epidomaSp = 80;
        int epidomaPr = 40;
       // int bonus = 400;

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

        misthos = 750 + epidomaTe + epidomaSp + epidomaPr + 100*prList.size() + 400;                  
        return misthos;
    }
    
}
