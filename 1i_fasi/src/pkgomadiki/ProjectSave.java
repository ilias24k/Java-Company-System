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
public class ProjectSave extends JFrame implements ActionListener {

    JTextField j1 = new JTextField();
    JTextField j2 = new JTextField();
    JTextField j3 = new JTextField();
    JTextField j4 = new JTextField();
    JTextField j5 = new JTextField();

    JLabel project_name = new JLabel("project name ");
    JLabel description = new JLabel(" project description");
    JLabel income = new JLabel("income");
    JLabel logistics_costs = new JLabel("logistics costs");
    JLabel expenses = new JLabel("expenses");

    JPanel panel4 = new JPanel();
    JButton register = new JButton("register");

    public ProjectSave() {
        super("Project Register");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        panel4.setLayout(new GridLayout(10, 2));
        panel4.add(project_name);
        panel4.add(j1);
        panel4.add(description);
        panel4.add(j2);
        panel4.add(income);
        panel4.add(j3);
        panel4.add(logistics_costs);
        panel4.add(j4);
        panel4.add(expenses);
        panel4.add(j5);

        
        
        panel4.add(register);
        panel4.setVisible(true);
        add(panel4);
        register.addActionListener(this);
        pack();
    }
    public void actionPerformed(ActionEvent b ) {
    
        Object o=b.getSource();
       project pr1;
       pr1=new project(j1.getText(),j2.getText(),Integer.parseInt(j3.getText()),Integer.parseInt(j4.getText()),Integer.parseInt(j5.getText()));
       Main.projectList2.add(pr1);
     // System.out.println(pr1);
       
       
        
        
       
        
        
    }

}
