/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgomadiki;

/**
 *
 * @author ilias
 */
public class project {

    public String onoma_project, perigrafi_project;
    public int esoda, Ydapanes, exoda;

    public project(String onoma_project, String perigrafi_project, int esoda, int Ydapanes, int exoda) {

        this.onoma_project = onoma_project;
        this.perigrafi_project = perigrafi_project;
        this.esoda = esoda;
        this.Ydapanes = Ydapanes;
        this.exoda = exoda;

    }
//add project 
    public void addProject() {

        this.onoma_project = onoma_project;
        this.perigrafi_project = perigrafi_project;
        this.esoda = esoda;
        this.Ydapanes = Ydapanes;
        this.exoda = exoda;

    }

    public String getOnoma_project() {
        return onoma_project;
    }

    public String getPerigrafi_project() {
        return perigrafi_project;
    }

    public int getEsoda() {
        return esoda;
    }

    public int getYdapanes() {
        return Ydapanes;
    }

    public int getexoda() {
        return exoda;
    }

    public String toString() {
        return "onoma project: " + onoma_project + "\nperigrafi project" + perigrafi_project + "\nesoda " + esoda + "\nylikotexnikes dapanes" + Ydapanes + "\nexoda" + exoda;
    }
}
