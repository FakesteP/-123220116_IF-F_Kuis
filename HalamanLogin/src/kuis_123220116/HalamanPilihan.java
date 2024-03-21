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
class HalamanPilihan extends JFrame implements ActionListener {
    
    JLabel header = new JLabel("Selamat Datang");
    JLabel desc = new JLabel ("Silahkan pilih menu di bawah untuk membeli majalah");
    JButton anak = new JButton("MAJALAH ANAK");
    JButton remaja = new JButton("MAJALAH REMAJA");
    JButton dewasa = new JButton("MAJALAH DEWASA");
    
    
    HalamanPilihan(String username){
        setVisible(true);
        setSize(580,580);
        setTitle("Pilihan Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        add(desc);
        add(anak);
        add(remaja);
        add(dewasa);
        
        
        header.setBounds(30,30,400,30);
        header.setFont(header.getFont().deriveFont(24f));
        header.setText("Selamat Datang, " + username);
        desc.setBounds(30,60,300,30);
        desc.setFont(desc.getFont().deriveFont(12f));
        
        
        anak.setBounds(30,120,300,30);
        anak.setFont(anak.getFont().deriveFont(16f));
        
        remaja.setBounds(30,170,300,30);
        remaja.setFont(remaja.getFont().deriveFont(16f));
        
        dewasa.setBounds(30, 220,300,30);
        dewasa.setFont(dewasa.getFont().deriveFont(16f));
        
        anak.addActionListener(this);
        remaja.addActionListener(this);
        dewasa.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==anak){
            String majalah = "Majalah Anak";
            double hargabeli = 12700;
            new HalamanPembelian(majalah, hargabeli);
            this.dispose();
        } else if(e.getSource()==remaja){
            String majalah = "Majalah Remaja";
            double hargabeli = 15200;
            new HalamanPembelian(majalah, hargabeli);
            this.dispose();
        } else if(e.getSource()==dewasa){
            String majalah = "Majalah Dewasa";
            double hargabeli = 26900;
            new HalamanPembelian(majalah, hargabeli);
            this.dispose();
        }

    }
    
}
