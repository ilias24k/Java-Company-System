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
public class DirectorFr extends JFrame implements ActionListener {

    JTextField j1 = new JTextField();
    JTextField j2 = new JTextField();
    JTextField j3 = new JTextField();
    JPanel panel7 = new JPanel();
    JLabel name = new JLabel("name ");
    JLabel dateStart = new JLabel("date of taking office");
    JLabel depart = new JLabel("department to take over");
    JFrame frame = new JFrame();
    JButton register = new JButton("register");

    public DirectorFr() {
        super("SET DIRECTOR");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());

        panel7.setLayout(new GridLayout(5, 1));
        panel7.add(name);
        panel7.add(j1);

        panel7.add(dateStart);
        panel7.add(j2);
        panel7.add(depart);
        panel7.add(j3);
        panel7.setVisible(true);
        panel7.add(register);
        add(panel7);

        register.addActionListener(this);

        pack();

    }

    public void actionPerformed(ActionEvent b) {

        Object o = b.getSource();
        Director dr1;
        tmima temp=null;
        for(tmima t:Main.tmimaList2){
            if (j3.getText().equals(t.onoma_tmimatos))
            {
                temp=t;
                break;
            }
        
        }
       
        temp.setDirector(j1.getText(), j2.getText());
        System.out.println("\nset director : ");
        System.out.println(temp.director);

    }
}
