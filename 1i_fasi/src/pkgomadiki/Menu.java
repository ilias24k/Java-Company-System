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
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ilias
 */
public class Menu extends JFrame implements ActionListener {

    JPanel panel1 = new JPanel();
    JButton newEmployee = new JButton("new employee");
    JButton newDirector = new JButton("new director");
    JButton newTmima = new JButton("new department");
    JButton newProject = new JButton("new project");
    JButton addEmplPr = new JButton("add project  to employee");
    JButton transfer = new JButton("transfer");
    JButton showFR = new JButton("show financial records");
    JButton exit = new JButton("exit");
  //  JTextField allList = new JTextField("All list");
    JFrame frame = new JFrame();

    public Menu() {
        super("WELCOME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());

        panel1.setLayout(new GridLayout(2, 1));
        panel1.add(newEmployee);
        panel1.add(newDirector);
        panel1.add(newTmima);
        panel1.add(newProject);
        panel1.add(showFR);
        panel1.add(transfer);
        panel1.add(addEmplPr);
       
        panel1.add(exit);
        panel1.setVisible(true);
        add(panel1);

        newEmployee.addActionListener(this);
        newDirector.addActionListener(this);
        newTmima.addActionListener(this);
        newProject.addActionListener(this);
        transfer.addActionListener(this);
        addEmplPr.addActionListener(this);
       
        showFR.addActionListener(this);
        exit.addActionListener(this);

        pack();

    }

    @Override
    public void actionPerformed(ActionEvent a) {
        Object o = a.getSource();
        if (o == newEmployee) {
            EmpSave sa = new EmpSave() {
            };
        }
        if (o == newDirector) {
            DirectorFr dr=new DirectorFr();
        }
        if (o == addEmplPr) {
            EmplPr ee=new EmplPr();
        }
        if (o == newTmima) {
            TmimaSave depa = new TmimaSave();
        }
        if (o == newProject) {
            ProjectSave prs1 = new ProjectSave();
        }
        if (o == transfer) {
            MoveFrame tran = new MoveFrame();
        }

        if (o == showFR) {
            FinancialRecords fr=new FinancialRecords();

        }
        
        if (o == exit) {
            try {
                Main.saveLIstsonExit();
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }

    }

}
