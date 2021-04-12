/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgomadiki;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ilias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Employee> empList2 = new ArrayList<Employee>();
    public static ArrayList<tmima> tmimaList2 = new ArrayList<tmima>();
    public static ArrayList<project> projectList2 = new ArrayList<project>();
    public static String path;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException {

        path = System.getProperty("user.dir");
        System.out.println("path: " + path);
        ReadFiles();

        Menu m = new Menu();

    }

    public static void ReadFiles() throws IOException {
        File theDir = new File(path + "\\projectFiles");
        File employeeFile = new File(theDir + "\\employee.txt");
        File departFile = new File(theDir + "\\depart.txt");
        File projectFile = new File(theDir + "\\project.txt");
        /*
         if exists
         an einai h 1h fora poy anoigw to programma o fakelos den tha yparxei
         opote  ta ftiaxnw gia na uparxoun sth poreia
        
         else
         an uparxei o fakelos tote tha uparxoun kai ta arxeia mesa se auton 
         tote tha ta diavasoume, tha ta krathsoume sta arraylist kai tha adeiasoyme 
         to periexomeno tvn arxeivn wste an xreiastei na ananevsv ena pedio 
         px. enas employee allaxei department na mh panw grapsw tote kati 
         kai dhmiourghthei provlhma apo diaforetiko arithmo xarakthrwn stis eggrafes
         */
        if (!theDir.exists()) {
            theDir.mkdirs();
            if (employeeFile.createNewFile()) {
                System.out.println("employees File created!");
            }
            if (departFile.createNewFile()) {
                System.out.println("departs File created!");
            }
            if (projectFile.createNewFile()) {
                System.out.println("projects File created!");
            }
        } else {
            BufferedReader br_employee = new BufferedReader(new FileReader(employeeFile));
            BufferedReader br_depart = new BufferedReader(new FileReader(departFile));
            BufferedReader br_project = new BufferedReader(new FileReader(projectFile));
            String st;
            /*
             edw tha diavasoume ta arxeia kai tha gemizoume tis listes mas
             */

            while ((st = br_depart.readLine()) != null) {
                System.out.println(st);
                String[] fields = st.split(":");
                tmima tm1 = new tmima(fields[0], fields[1]);
                tmimaList2.add(tm1);
            }
            br_depart.close();
            while ((st = br_project.readLine()) != null) {
                System.out.println(st);
                String[] fields = st.split(":");
                project pr1 = new project(fields[0], fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]), Integer.parseInt(fields[4]));
                projectList2.add(pr1);
            }
            br_project.close();
            while ((st = br_employee.readLine()) != null) {
                System.out.println(st);
                String[] fields = st.split(":");
                Employee e1 = new Employee(fields[0], fields[1], fields[2], fields[3], fields[4], Integer.parseInt(fields[5]), Integer.parseInt(fields[6]), fields[7]);
                String line = br_employee.readLine();
                String[] fields2 = line.split(";");
                for (String t : fields2) {
                    String[] fields3 = t.split(":");
                    for (project p : projectList2) {
                        if (p.onoma_project.equals(fields3[0])) {
                            e1.prList.add(new EmployeeProject(p, fields3[1], fields3[2]));

                        }

                    }

                }

                empList2.add(e1);

            }
            br_employee.close();

        }
        System.out.println("-------------------EMPLOYEES------------------");
        System.out.println(empList2);
        System.out.println("-------------------DEPARTS--------------------");
        System.out.println(tmimaList2);
        System.out.println("-------------------PROJECTS-------------------");
        System.out.println(projectList2);
        System.out.println("----------------------------------------------");
    }

    //best net income of project
    public static int bestIncome() throws IOException {

        int max = 0;
        int net_income = 0;
        int pos = 0;
        for (int i = 1; i < projectList2.size(); i++) {

            net_income = projectList2.get(i).esoda - projectList2.get(i).exoda - projectList2.get(i).Ydapanes;
            if (projectList2.get(i).esoda > projectList2.get(i - 1).esoda) {
                max = projectList2.get(i).esoda;
                pos = i;

            }
        }
        System.out.println("\nbest net income is : " + max);
        return pos;

    }

    // show all income from projects
    public static int income() throws IOException {
        int sum = 0;

        int net_income;
        for (int i = 0; i < projectList2.size(); i++) {
            sum += projectList2.get(i).esoda;
            //net_income=projectList2.get(i).esoda-projectList2.get(i).exoda-projectList2.get(i).Ydapanes;

        }
        System.out.println("\n income from projects : " + sum);

        return sum;

    }
    //transfer employee 

    public static void moveEmployee(tmima tm1, tmima tm2, Employee ypalilos) {
        Employee employee2transfer = ypalilos;
        employee2transfer.setTmima(tm2.onoma_tmimatos);
        tm2.addEmployee(tm1.removeEmployee(ypalilos.onoma));
        System.out.println("\n transfer completed");

    }

    public static void addProjectToEmp(project pr1, Employee ypalilos, String startDate, String endDate) {
       // Employee emp=null;
        //   project project2employee=pr1;
        ypalilos.prList.add(new EmployeeProject(pr1, startDate, endDate));
        System.out.println("added project");

    }

    //save list on exit
    public static void saveLIstsonExit() throws IOException {
        File theDir = new File(path + "\\projectFiles");
        File employeeFile = new File(theDir + "\\employee.txt");
        File departFile = new File(theDir + "\\depart.txt");
        File projectFile = new File(theDir + "\\project.txt");

        /*
         the false parameter will overwrite the file 
         i.e. clear the file and write to it again.
        
         true would append 
         */
        FileWriter fw_emploee = new FileWriter(employeeFile, false);
        FileWriter fw_depart = new FileWriter(departFile, false);
        FileWriter fw_project = new FileWriter(projectFile, false);

        String string_employee = "";
        for (Employee e : empList2) {
            String eidikotita = e.eidikotita;
            for (tmima d : tmimaList2) {
                System.out.println(d.director);
                if (d.onoma_tmimatos.equals(e.tmima)) {
                    if (d.director != null && d.director.onoma.equals(e.onoma)) {
                        eidikotita = "director";
                    }
                }
            }
            String line = e.onoma + ":" + e.imerominia_genisis + ":" + e.oik_kat + ":" + eidikotita + ":" + e.spoudes + ":" + e.paidia + ":" + e.etos_prosl + ":" + e.tmima + "\n";
            System.out.println("employee--> " + line);
            string_employee += line;
            for (EmployeeProject p : e.prList) {
                string_employee += p.pr.onoma_project + ":" + p.StartDate + ":" + p.EndDate;
                
            }
            string_employee+="\n";
        }
        
        fw_emploee.write(string_employee);
        fw_emploee.close();

        String string_depart = "";
        for (tmima t : tmimaList2) {
            String line = t.onoma_tmimatos + ":" + t.perigrafi_tmima + ":" + "\n";
            System.out.println("department--> " + line);
            string_depart += line;
        }
        fw_depart.write(string_depart);
        fw_depart.close();

        String string_project = "";
        for (project p : projectList2) {
            String line = p.onoma_project + ":" + p.perigrafi_project + ":" + p.esoda + ":" + p.exoda + ":" + p.Ydapanes + "\n";
            System.out.println("project--> " + line);
            string_project += line;
        }
        fw_project.write(string_project);
        fw_project.close();

    }

}
