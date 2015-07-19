package me.oxlemonxo.EFPromotions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EFPromotions extends JFrame implements ActionListener {

    JButton clickVouch;
    JButton clickObject;
    JButton clickVouchRec;
    JButton clickObjectReason;
    JButton seniorClickVouch;
    JButton seniorClickObject;
    JButton seniorClickObjectReason;
    JButton seniorClickVouchRec;
    JButton about;
    String storeName;
    JButton clickDone;
    String responseObject = "0";
    String responseVouch = "0";
    String responseObjectReason = "0";
    String responseVouchRec = "0";
    String responseSeniorObjectReason = "0";
    String responseSeniorVouch = "0";
    String responseSeniorVouchRec = "0";
    String responseSeniorObject = "0";
    float objects = 1;
    float vouches = 1;
    float objectswithreasons = 2;
    float vouchandrecs = 2;
    float seniorobjects = (float) 1.5;
    float seniorvouches = (float) 1.5;
    float seniorobjectswithreasons = 3;
    float seniorvouchandrecs = 3;
    float finalobjects = 0;
    float finalvouches = 0;
    float finalobjectswithreasons = 0;
    float finalvouchandrecs = 0;
    float finalseniorobjects = 0;
    float finalseniorvouches = 0;
    float finalseniorobjectswithreasons = 0;
    float finalseniorvouchandrecs = 0;
    float RealFinal = 0;
    float Final1 = 0;
    float Final2 = 0;
    String FinalMessage = "You haven't typed anything!";

    public EFPromotions() {

        setLayout(null);
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clickVouch = new JButton("Vouches");
        clickVouch.setBounds(300, 30, 400, 200);
        clickVouch.addActionListener(this);
        add(clickVouch);

        about = new JButton("About!");
        about.setBounds(600, 690, 100, 100);
        about.addActionListener(this);
        add(about);

        clickObject = new JButton("Objects");
        clickObject.setBounds(600, 30, 400, 200);
        clickObject.addActionListener(this);
        add(clickObject);

        clickVouchRec = new JButton("Vouches and Reccomendations");
        clickVouchRec.setBounds(900, 30, 400, 200);
        clickVouchRec.addActionListener(this);
        add(clickVouchRec);

        clickObjectReason = new JButton("Objects with Reasons");
        clickObjectReason.setBounds(0, 230, 400, 200);
        clickObjectReason.addActionListener(this);
        add(clickObjectReason);

        seniorClickVouch = new JButton("Senior Vouches");
        seniorClickVouch.setBounds(0, 450, 400, 200);
        seniorClickVouch.addActionListener(this);
        add(seniorClickVouch);

        seniorClickObject = new JButton("Senior Objects");
        seniorClickObject.setBounds(300, 450, 400, 200);
        seniorClickObject.addActionListener(this);
        add(seniorClickObject);

        seniorClickVouchRec = new JButton("Senior Vouch + Recs");
        seniorClickVouchRec.setBounds(600, 450, 400, 200);
        seniorClickVouchRec.addActionListener(this);
        add(seniorClickVouchRec);

        seniorClickObjectReason = new JButton("Senior Objects with Reasons");
        seniorClickObjectReason.setBounds(0, 590, 400, 200);
        seniorClickObjectReason.addActionListener(this);
        add(seniorClickObjectReason);

        clickDone = new JButton("Click when done!");
        clickDone.setBounds(600, 730, 400, 200);
        clickDone.addActionListener(this);
        add(clickDone);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == clickObject) {
            responseObject = JOptionPane.showInputDialog(null,
                    "How many objects?",
                    "Enter the number of objects.",
                    JOptionPane.QUESTION_MESSAGE);

        }

        if (e.getSource() == clickVouch) {
            responseVouch = JOptionPane.showInputDialog(null,
                    "How many vouches?",
                    "Enter the number of vouches.",
                    JOptionPane.QUESTION_MESSAGE);
        }

        if (e.getSource() == clickVouchRec) {
            responseVouchRec = JOptionPane.showInputDialog(null,
                    "How many vouch + recs?",
                    "Enter the number of vouch+recs",
                    JOptionPane.QUESTION_MESSAGE);
        }
        if (e.getSource() == clickObjectReason) {
            responseObjectReason = JOptionPane.showInputDialog(null,
                    "How many Objects with Reasons?",
                    "Enter the number of objects with reasons.",
                    JOptionPane.QUESTION_MESSAGE);
        }

        if (e.getSource() == seniorClickObject) {
            responseSeniorObjectReason = JOptionPane.showInputDialog(null, "How many Senior Objects?", "Enter the number of Senior Objects.", JOptionPane.QUESTION_MESSAGE);
        }

        if (e.getSource() == seniorClickVouch) {
            responseSeniorVouch = JOptionPane.showInputDialog(null, "How many Senior Vouches?", "Enter the number of Senior Vouches.", JOptionPane.QUESTION_MESSAGE);
        }

        if (e.getSource() == seniorClickVouchRec) {
            responseSeniorVouchRec = JOptionPane.showInputDialog(null, "How many Senior Vouch + Recs?", "Enter the number of senior vouch + recs.", JOptionPane.QUESTION_MESSAGE);
        }
        if (e.getSource() == seniorClickObjectReason) {
            responseSeniorObjectReason = JOptionPane.showInputDialog(null, "How many Senior Objects with Reasons?", "Enter the number of senior objects with reasons.", JOptionPane.QUESTION_MESSAGE);
        }

        if (e.getSource() == about) {
            JOptionPane.showMessageDialog(null, "Version 1.0.1, made by OxLemonxO", "About app", JOptionPane.INFORMATION_MESSAGE);
        }

        if (e.getSource() == clickDone) {
            finalobjects = objects * Float.valueOf(responseObject);
            finalvouches = vouches * Float.valueOf(responseVouch);
            finalobjectswithreasons = objectswithreasons * Float.valueOf(responseObjectReason);
            finalvouchandrecs = vouchandrecs * Float.valueOf(responseVouchRec);
            finalseniorobjectswithreasons = seniorobjectswithreasons * Float.valueOf(responseSeniorObjectReason);
            finalseniorvouchandrecs = seniorvouchandrecs * Float.valueOf(responseSeniorVouchRec);
            finalseniorvouches = seniorvouches * Float.valueOf(responseSeniorVouch);
            finalseniorobjects = seniorobjects * Float.valueOf(responseSeniorObject);

            Final1 = finalvouches + finalvouchandrecs + finalseniorvouches + finalseniorvouchandrecs;
            Final2 = seniorobjectswithreasons + finalseniorobjects + finalobjects + finalobjectswithreasons + 3;
            RealFinal = Final1 - Final2;
            if (RealFinal == 0 | RealFinal > 0) {
                FinalMessage = Float.toString(RealFinal);
                JOptionPane.showMessageDialog(null, "The application is accepted. Final Count = " + FinalMessage, "App", JOptionPane.INFORMATION_MESSAGE);

            } else {
                FinalMessage = Float.toString(RealFinal);
                JOptionPane.showMessageDialog(null, "The application is denied. Final count = " + FinalMessage, "App", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    public static void main(String args[]) {

        EFPromotions s = new EFPromotions();
        s.setVisible(true);

    }
}
