/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220116;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
class HalamanLogin extends JFrame implements ActionListener{
    
    JLabel header = new JLabel ("Welcome!");
    JLabel desc = new JLabel ("Silahkan Login Terlebih Dahulu!");
    JLabel user = new JLabel("Username");
    JLabel pw = new JLabel("Password");
    JTextField tuser = new JTextField();
    JTextField tpw = new JTextField();
    JButton submit = new JButton("LOGIN");
    
    HalamanLogin(){
        setVisible(true);
        setSize(580,580);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        add(desc);
        add(user);
        add(pw);
        add(tuser);
        add(tpw);
        add(submit);
        
        header.setBounds(30,30,300,30);
        header.setFont(header.getFont().deriveFont(24f));
        desc.setBounds(30,60,200,30);
        desc.setFont(desc.getFont().deriveFont(12f));
        
        user.setBounds(30,100,100,30);
        user.setFont(user.getFont().deriveFont(16f));
        
        pw.setBounds(30,150,100,30);
        pw.setFont(pw.getFont().deriveFont(16f));
        
        tuser.setBounds(130,100,150,30);
        tuser.setFont(tuser.getFont().deriveFont(16f));
        
        tpw.setBounds(130,150,150,30);
        tpw.setFont(tpw.getFont().deriveFont(16f));
        
        submit.setBounds(30,220,150,30);
        submit.setFont(submit.getFont().deriveFont(16f));
        submit.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(tuser.getText().isEmpty() || tpw.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Lengkapi Form!", "Perhatian!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            if(e.getSource() == submit){
            String username = tuser.getText();
            String password = tpw.getText();
            
                new HalamanPilihan(username);
                this.dispose();
            }
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(this, "Masukkan Jumlah dalam format angka", "Perhatian!", JOptionPane.WARNING_MESSAGE);
        }
            
    }
    
}
