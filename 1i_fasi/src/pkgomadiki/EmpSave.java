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
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ilias
 */
public class EmpSave extends JFrame implements ActionListener {

    JTextField j1 = new JTextField();
    JTextField j2 = new JTextField();
    JTextField j3 = new JTextField();
    JTextField j4 = new JTextField();
    JTextField j5 = new JTextField();
    JTextField j6 = new JTextField();
    JTextField j7 = new JTextField();
    JTextField j8 = new JTextField();

    JLabel name = new JLabel("name ");
    JLabel birthDate = new JLabel("date of birth");
    JLabel married = new JLabel("family status (A for unmarried,E for married)");
    JLabel specialty = new JLabel("specialty");
    JLabel studies = new JLabel("studies(panepistimio,metaptyxiako,didaktoriko)");
    JLabel children = new JLabel("number of children");
    JLabel recruitmentYear = new JLabel("recruitment year ");
    JLabel department = new JLabel("department");

    JPanel panel2 = new JPanel();
    JButton register = new JButton("register");

    public EmpSave() {
        super("Employee Register");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(10, 2));
        panel2.add(name);
        panel2.add(j1);
        panel2.add(birthDate);
        panel2.add(j2);
        panel2.add(married);
        panel2.add(j3);
        panel2.add(specialty);
        panel2.add(j4);
        panel2.add(studies);
        panel2.add(j5);
        panel2.add(children);
        panel2.add(j6);
        panel2.add(recruitmentYear);
        panel2.add(j7);
        panel2.add(department);
        panel2.add(j8);

        //panel2.add(j3);
        panel2.add(register);
        panel2.setVisible(true);
        add(panel2);
        register.addActionListener(this);
        pack();
    }

    public void actionPerformed(ActionEvent b) {

        Object o = b.getSource();
        Employee e1;

        e1 = new Employee(j1.getText(), j2.getText(), j3.getText(), j4.getText(), j5.getText(), Integer.parseInt(j6.getText()), Integer.parseInt(j7.getText()), j8.getText());
        Main.empList2.add(e1);
        System.out.println("in EmpSave");
        System.out.println(Main.empList2);
      // empList

    }
}
