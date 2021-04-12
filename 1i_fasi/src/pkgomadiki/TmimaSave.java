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
public class TmimaSave extends JFrame implements ActionListener {
    
    JTextField j1 = new JTextField();
    JTextField j2 = new JTextField();
    
    
    JLabel depart_name = new JLabel("department name ");
    JLabel description = new JLabel("description");
    
    JPanel panel3 = new JPanel();
    JButton register = new JButton("register");
    
    
    public TmimaSave(){
    super("Department Register");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        panel3.setLayout(new GridLayout(7,2));
        panel3.add(depart_name);
        panel3.add(j1);
        panel3.add(description);
        panel3.add(j2);
    
     panel3.add(register);
        panel3.setVisible(true);
        add(panel3);
        register.addActionListener(this);
        pack();
    }
    
    public void actionPerformed(ActionEvent b ) {
    
        Object o=b.getSource();
       tmima dep1;
       dep1=new tmima(j1.getText(),j2.getText());
       Main.tmimaList2.add(dep1);
       System.out.println(dep1);
       
        
        
       
        
        
    }
    
    
}
