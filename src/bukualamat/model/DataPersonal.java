/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Asror
 */
public class DataPersonal {
    
    private StringProperty namadepan = new SimpleStringProperty();
    private StringProperty namabelakang = new SimpleStringProperty();
    private StringProperty alamat = new SimpleStringProperty();
    private StringProperty kotakabupaten = new SimpleStringProperty();
    private StringProperty nohp = new SimpleStringProperty();

    public DataPersonal() {
    }
    
    public DataPersonal(String namadepan, String namabelakang) {
        this.namadepan = new SimpleStringProperty(namadepan);
        this.namabelakang = new SimpleStringProperty(namabelakang);
        
        this.alamat = new SimpleStringProperty("Suatu Kota");
        this.kotakabupaten = new SimpleStringProperty("Suatu Kota");
        this.nohp = new SimpleStringProperty("01010101");
        
    }

    
    //start nohp
    public String getNohp() {
        return nohp.get();
    }

    
    public void setNohp(String value) {
        nohp.set(value);
    }
    
    public StringProperty nohpProperty(){
        return nohp;
    }
    
    //end of nohp
    
    //start kotakabupaten
    public String getKotakabupaten() {
        return kotakabupaten.get();
    }

    
    public void setKotakabupaten(String value) {
        kotakabupaten.set(value);
    }
    
    public StringProperty kotakabupatenProperty(){
        return kotakabupaten;
    }
    
    //end of kotakabupaten
    
    
    //start alamat
    public String getAlamat() {
        return alamat.get();
    }

    
    public void setAlamat(String value) {
        alamat.set(value);
    }
    
    public StringProperty alamatProperty(){
        return alamat;
    }
    
    //end of alamat
    
    //start namabelakang
    public String getNamabelakang() {
        return namabelakang.get();
    }

    
    public void setNamabelakang(String value) {
        namabelakang.set(value);
    }
    
    public StringProperty namabelakangProperty(){
        return namabelakang;
    }
    
    //end of namabelakang
    
    //start namadepan
    public String getNamadepan() {
        return namadepan.get();
    }

    
    public void setNamadepan(String value) {
        namadepan.set(value);
    }
    
    public StringProperty namadepanProperty(){
        return namadepan;
    }
    //end of namadepan
}   
