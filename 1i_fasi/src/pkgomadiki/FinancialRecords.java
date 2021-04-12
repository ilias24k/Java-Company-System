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
public class FinancialRecords extends JFrame implements ActionListener {

    JPanel panel6 = new JPanel();
    JButton showAll = new JButton("show all employees departmends and project");
    JButton showBest = new JButton(" best net income of project");
    JButton showIncome = new JButton("total income from projects");
    JFrame frame = new JFrame();
    public FinancialRecords() {
        super("FINANCIAL RECORDS");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());

        panel6.setLayout(new GridLayout(2, 1));
        panel6.add(showAll);
        panel6.add(showBest);
        panel6.add(showIncome);

        panel6.setVisible(true);
        add(panel6);

        showAll.addActionListener(this);
        showBest.addActionListener(this);
        showIncome.addActionListener(this);

        pack();

    }

    @Override
    public void actionPerformed(ActionEvent a) {
        Object o = a.getSource();
        if (o == showAll) {
            JOptionPane.showMessageDialog(frame, "Employees: '" + Main.empList2 + " \nProjects" + Main.projectList2 + "\ndepartments" + Main.tmimaList2);

        }
         if (o == showBest) {
            try {
                JOptionPane.showMessageDialog(frame,Main.projectList2.get(Main.bestIncome()));
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
          if (o == showIncome) {
            try {
                JOptionPane.showMessageDialog(frame, Main.income());
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
