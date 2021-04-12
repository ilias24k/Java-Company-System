/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgomadiki;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ilias
 */
public class EmplPr extends JFrame implements ActionListener{
     JTextField j1 = new JTextField();
    JTextField j2 = new JTextField();
    JTextField j3 = new JTextField();
    JTextField j4 = new JTextField();
    
    JLabel projName = new JLabel("project name");
    JLabel emp_name = new JLabel("employee name");
    JLabel projStart = new JLabel("project start date");
    JLabel projEnd= new JLabel("project end date");
    

    
     JPanel panel8 = new JPanel();
    JButton register = new JButton("register");
    public EmplPr(){
     super("Project to Employee");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        panel8.setLayout(new GridLayout(10, 2));
        panel8.add(projName);
        panel8.add(j1);
        panel8.add(emp_name);
        panel8.add(j2);
        panel8.add(projStart);
        panel8.add(j3);
        panel8.add(projEnd);
        panel8.add(j4);
        panel8.add(register);
        panel8.setVisible(true);
        add(panel8);
        register.addActionListener(this);
        pack();
    
    
    }
    public void actionPerformed(ActionEvent b ) {
    
        Object o=b.getSource();
       project pr1tmp=null;
       
     
        for(project p:Main.projectList2){
            if(p.onoma_project.equals(j1.getText())){
               pr1tmp=p;
            }
            
        }
        Employee empl_tmp=null;
        for(Employee e:Main.empList2){
            if(e.onoma.equals(j2.getText())){
                empl_tmp=e;
            }
        }
        if(pr1tmp!=null &&  empl_tmp!=null)
            Main.addProjectToEmp(pr1tmp,  empl_tmp,j3.getText(),j4.getText());
        System.out.println(" bike edw");
    }
        
        
}
