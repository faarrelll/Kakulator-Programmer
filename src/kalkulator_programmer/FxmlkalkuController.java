/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_programmer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FxmlkalkuController implements Initializable {
    String angka="";
   int angka1, angka2,jumlah;
    int pilih;
    
    @FXML
    private TextField bilangan;
    @FXML
    private TextField hasil;
    @FXML
    private Button btnkali;
    @FXML
    private Button btnjumlah;
    @FXML
    private Button btnkurang;
    @FXML
    private Button btnbagi;
    @FXML
    private Button btntambah;
    @FXML
    private Button b0;
    @FXML
    private Button b3;
    @FXML
    private Button b2;
    @FXML
    private Button bthpersen;
    @FXML
    private Button b1;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b4;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Button d;
    @FXML
    private Button e;
    @FXML
    private Button f;
    @FXML
    private Button a;
    @FXML
    private Button b;
    @FXML
    private Button c;
    @FXML
    private Button btnbinner;
    @FXML
    private Button btnoct;
    @FXML
    private Button btndec;
    @FXML
    private Button btndel;
    @FXML
    private Button btnc;
    @FXML
    private Button btnce;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bilangan1(ActionEvent event) {
        
                     
        
        
    }

    @FXML
    private void hasiloperasi(ActionEvent event) {
    
    }

    @FXML
    private void perkalian(ActionEvent event) {
        angka1=Integer.parseInt(angka);
          bilangan.setText(String.valueOf(" x "));
        angka="";
        pilih = 2;
    }

    @FXML
    private void hasilnya(ActionEvent event) {
        switch(pilih){
            case 1 : angka2=Integer.parseInt(angka);
                     jumlah = angka1+angka2;
                     angka = Integer.toString(jumlah);
                     bilangan.setText(angka);
                     break;
            case 2 : angka2=Integer.parseInt(angka);
                     jumlah = angka1*angka2;
                     angka = Integer.toString(jumlah);
                     bilangan.setText(angka);
                     break;
            case 3 : angka2=Integer.parseInt(angka);
                     jumlah = angka1/angka2;
                     angka = Integer.toString(jumlah);
                     bilangan.setText(angka);
                     break;
             case 4 : angka2=Integer.parseInt(angka);
                     jumlah = angka1-angka2;
                     angka = Integer.toString(jumlah);
                     bilangan.setText(angka);
                     break;
             case 5 : angka2=Integer.parseInt(angka);
                     jumlah = angka1%angka2;
                     angka = Integer.toString(jumlah);
                     bilangan.setText(angka);
                     break;
             
    }
    }

    @FXML
    private void pengurangan(ActionEvent event) {
        angka1=Integer.parseInt(angka);
         bilangan.setText(String.valueOf(" - "));
        angka="";
        pilih = 4;
    }

    @FXML
    private void pembagian(ActionEvent event) {
        angka1=Integer.parseInt(angka);
         bilangan.setText(String.valueOf(" : "));
        angka="";
        pilih = 3;
    }

    @FXML
    private void penjumlahan(ActionEvent event) {
        angka1=Integer.parseInt(angka);
        bilangan.setText(String.valueOf(" + "));
        angka="";
        pilih = 1;
        
    }

    @FXML
    private void bill0(ActionEvent event) {
        angka += "0";
          bilangan.setText(angka);
    }

    @FXML
    private void bill3(ActionEvent event) {
        angka += "3";
         bilangan.setText(angka);
    }

    @FXML
    private void bill2(ActionEvent event) {
        angka += "2";
          bilangan.setText(angka);
    }

    @FXML
    private void hasilbagi(ActionEvent event) {
          angka1=Integer.parseInt(angka);
         bilangan.setText(String.valueOf(" % "));
        angka="";
        pilih = 5;
        
    }

    @FXML
    private void bill1(ActionEvent event) {
        angka += "1";
          bilangan.setText(angka);
    }

    @FXML
    private void bill5(ActionEvent event) {
        angka += "5";
          bilangan.setText(angka);
    }

    @FXML
    private void bill6(ActionEvent event) {
        angka += "6";
          bilangan.setText(angka);
    }

    @FXML
    private void bill4(ActionEvent event) {
        angka += "4";
          bilangan.setText(angka);
    }

    @FXML
    private void bill7(ActionEvent event) {
        angka += "7";
          bilangan.setText(angka);
    }

    @FXML
    private void bill8(ActionEvent event) {
        angka += "8";
          bilangan.setText(angka);
    }

    @FXML
    private void bill9(ActionEvent event) {
        angka += "9";
          bilangan.setText(angka);
    }

    @FXML
    private void billd(ActionEvent event) {
        angka += "14";
          bilangan.setText(angka);
    }

    @FXML
    private void bille(ActionEvent event) {
        angka += "15";
          bilangan.setText(angka);
    }

    @FXML
    private void billf(ActionEvent event) {
        angka += "16";
          bilangan.setText(angka);
    }

    @FXML
    private void billa(ActionEvent event) {
        angka += "11";
          bilangan.setText(angka);
    }

    @FXML
    private void billb(ActionEvent event) {
        angka += "12";
          bilangan.setText(angka);
    }

    @FXML
    private void billc(ActionEvent event) {
        angka += "13";
          bilangan.setText(angka);
    }

    @FXML
    private void bin(ActionEvent event) {
       String hexa = bilangan.getText();
       int outDes2=Integer.parseInt(hexa,16);
       String HasilDes= Integer.toUnsignedString(outDes2);
       int hasilBinner = Integer.parseInt(HasilDes);
       hasil.setText(Integer.toBinaryString(hasilBinner));
       
    }

    @FXML
    private void oct(ActionEvent event) {
        String hexa3 = bilangan.getText();
             int outDes3 = Integer.parseInt(hexa3,16);
            String hasilDes2 = Integer.toUnsignedString(outDes3);
            int hasilOktal2 = Integer.parseInt(hasilDes2);
            hasil.setText(Integer.toOctalString(hasilOktal2));

    }

    @FXML
    private void dec(ActionEvent event) {
        String oktal = bilangan.getText();
             int outDes3 = Integer.parseInt(oktal,8);
             hasil.setText(Integer.toUnsignedString(outDes3));

    }

    @FXML
    private void del(ActionEvent event) {
       
    

    }

    @FXML
    private void c(ActionEvent event) {
        bilangan.setText("");
        angka1=0;
        angka2=0;
        jumlah=0;
        angka="";
        
        hasil.setText("");
    
    }

    @FXML
    private void ce(ActionEvent event) {
        bilangan.setText("");
        angka1=0;
        angka2=0;
        jumlah=0;
        angka="";
        
        hasil.setText("");
    }
    
}
