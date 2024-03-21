/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220116;
import operasi.majalah;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
class HalamanPembelian extends JFrame implements ActionListener{
    
    JLabel header = new JLabel ("Halaman Pembelian!");
    JLabel kategori = new JLabel("Kategori");
    JLabel kategorim = new JLabel();
    JLabel harga = new JLabel("Harga");
    JLabel hargam = new JLabel();
    JLabel jum = new JLabel("Jumlah");
    JTextField tjum = new JTextField();
    JButton kembali = new JButton("Kembali");
    JButton beli = new JButton("Beli");
    JLabel hasiltotal = new JLabel();
    JLabel desc = new JLabel("Total Pembelian");
    JLabel hasil = new JLabel("Total Harga");
    JLabel satuan = new JLabel("Harga Satuan");
    JLabel jml = new JLabel("Jumlah");
    JLabel hhasil = new JLabel();
    JLabel hsatuan = new JLabel();
    JLabel hjml = new JLabel();
    
    
    HalamanPembelian(String majalah, double hargabeli){
        setVisible(true);
        setSize(580,580);
        setTitle("Pembelian Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        
        add(header);
        add(kategori);
        add (kategorim);
        add(harga);
        add(hargam);
        add(jum);
        add(tjum);
        add(kembali);
        add(beli);
        add(hasiltotal);
        add(hasil);
        add(satuan);
        add(jml);
        add(hjml);
        add(hhasil);
        add(hsatuan);
        add(hjml);
        
        
        header.setBounds(30,30,300,30);
        header.setFont(header.getFont().deriveFont(24f));
        
        kategori.setBounds(30,100,100,30);
        kategori.setFont(kategori.getFont().deriveFont(16f));
        
        harga.setBounds(30,150,100,30);
        harga.setFont(harga.getFont().deriveFont(16f));
        
        kategorim.setBounds(130,100,150,30);
        kategorim.setFont(kategorim.getFont().deriveFont(16f));
        kategorim.setText(majalah);
        
        hargam.setBounds(130,150,150,30);
        hargam.setFont(hargam.getFont().deriveFont(16f));
        hargam.setText(""+hargabeli);
        
        
        jum.setBounds(30,200,100,30);
        jum.setFont(jum.getFont().deriveFont(16f));
        
        tjum.setBounds(130,200,150,30);
        tjum.setFont(tjum.getFont().deriveFont(16f));
        

        kembali.setBounds(30,250,150,30);
        kembali.setFont(kembali.getFont().deriveFont(16f));
        kembali.addActionListener(this);
        
        beli.setBounds(230,250,150,30);
        beli.setFont(beli.getFont().deriveFont(16f));
        beli.addActionListener(this);
    
        satuan.setBounds(30,300,150,30);
        satuan.setFont(satuan.getFont().deriveFont(16f));
        
        hsatuan.setBounds(180,300,150,30);
        hsatuan.setFont(hsatuan.getFont().deriveFont(16f));
        
        jml.setBounds(30,350,150,30);
        jml.setFont(jml.getFont().deriveFont(16f));
        
        hjml.setBounds(180,350,150,30);
        hjml.setFont(hjml.getFont().deriveFont(16f));
        
        
        hasil.setBounds(30,400,150,30);
        hasil.setFont(hasil.getFont().deriveFont(16f));
        
        hasiltotal.setBounds(180,400,150,30);
        hasiltotal.setFont(hasiltotal.getFont().deriveFont(16f));
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(tjum.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Lengkapi Form!", "Perhatian!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        double jumlahbeli = Double.parseDouble(tjum.getText());
        double hargabeli = Double.parseDouble(hargam.getText());
        if (e.getSource() == beli){
            majalah majalahan = new majalah(jumlahbeli, hargabeli);
            String hargatotal = String.valueOf(majalahan.hitungan());
            hasiltotal.setText(hargatotal);
            hjml.setText(jumlahbeli + " pcs");
            hsatuan.setText("Rp. " + hargabeli);
        } else if(e.getSource() == kembali){
            String username = "123220116";
            new HalamanPilihan(username);
            this.dispose();
        }
        }
        
    }

