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
public class MoveFrame extends JFrame implements ActionListener {
    JTextField j1 = new JTextField();
    JTextField j2 = new JTextField();
    JTextField j3 = new JTextField();
    
    JLabel emp_name = new JLabel("employee name");
    JLabel tmima1 = new JLabel("existing department");
    JLabel transfer_target = new JLabel("department transfer target");
    
     JPanel panel5 = new JPanel();
    JButton transfer = new JButton("transfer");
    
    
    public MoveFrame(){
    
     super("transfer employee");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        panel5.setLayout(new GridLayout(10, 2));
        panel5.add(emp_name);
        panel5.add(j1);
        panel5.add(tmima1);
        panel5.add(j2);
        panel5.add(transfer_target);
        panel5.add(j3);
    
    panel5.add(transfer);
        panel5.setVisible(true);
        add(panel5);
        transfer.addActionListener(this);
        pack();
    }
     public void actionPerformed(ActionEvent b ) {
    
        Object o=b.getSource();
        tmima tmima1_tmp=null;
        tmima tmima2_tmp=null;
        for(tmima t:Main.tmimaList2){
            if(t.onoma_tmimatos.equals(j2.getText())){
                tmima1_tmp=t;
            }
            else if(t.onoma_tmimatos.equals(j3.getText())){
                tmima2_tmp=t;
            }
        }
        Employee empl_tmp=null;
        for(Employee e:Main.empList2){
            if(e.onoma.equals(j1.getText())){
                empl_tmp=e;
            }
        }
        
        if(tmima1_tmp!=null && tmima2_tmp!=null && empl_tmp!=null)
            Main.moveEmployee(tmima1_tmp, tmima2_tmp, empl_tmp);
        System.out.println(" bike edw");
        
     //Main.moveEmployee(null, null, null);
     //moveEmployee(tm1,tm2,ypalilos)
     //System.out.println(pr1);
       
       
        
        
       
        
        
    }
    
}
