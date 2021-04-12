/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgomadiki;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ilias
 */
public class tmima {

    protected String onoma_tmimatos, perigrafi_tmima;
    ArrayList<Employee> empList = new ArrayList<Employee>();
    String onoma, imerominia_genisis, oik_kat, eidikotita, spoudes;
    Director director;

    public tmima(String onoma_tmimatos, String perigrafi_tmima) {

        this.onoma_tmimatos = onoma_tmimatos;
        this.perigrafi_tmima = perigrafi_tmima;
       

    }
// add employee

    public void addEmployee(Employee upal) {
        empList.add(upal);
    }
//remove employee for transfer
    public Employee removeEmployee(String onoma) {
        Employee ypal=null;
        for(int i=0; i <empList.size(); i++){
            if (empList.get(i).onoma.equals(onoma)){
                ypal=empList.get(i);
                empList.remove(i);
                
                return ypal;
            }
        
        }
        
        return null;
    }
    
//ypologismos dapanwn tmimatos
    public void dapanes(ArrayList<Employee> empList) {
        int dapanes = 0;
        //int index = 0;

        for (int i = 0; i < empList.size(); i++) {
            dapanes = dapanes + empList.get(i).misthos;
          //  System.out.println("bike");

        }

        System.out.println(dapanes);

    }

    public String getOnoma_tmimatos() {
        return onoma_tmimatos;
    }

    public String getPerigrafi_tmima() {
        return perigrafi_tmima;
    }

    public void setOnoma_tmimatos() {
        this.onoma_tmimatos = onoma_tmimatos;
    }
    //set director 
     public void setDirector(String onoma, String imerominia_analipsis) {
         Employee ypal=null;
        for(int i=0; i <Main.empList2.size(); i++){
            if (Main.empList2.get(i).onoma.equals(onoma)){
                ypal=Main.empList2.get(i);
                //Main.empList2.remove(i);
            }
        
        }
        
        this.director = new Director(ypal.onoma, ypal.imerominia_genisis, ypal.oik_kat, ypal.eidikotita, ypal.spoudes,ypal.paidia,ypal.etos_prosl,imerominia_analipsis,ypal.tmima);
        
    }
    public void setPerigrafi_tmima() {
        this.perigrafi_tmima = perigrafi_tmima;
    }

    public String toString() {
        return "onoma tmimatos : " + onoma_tmimatos + "\nperigrafi tmimatos : " + perigrafi_tmima + "\n director : "+director ;
    }
}
