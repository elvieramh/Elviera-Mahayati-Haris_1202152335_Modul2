package android.example.com.myfood;

import android.support.v7.app.AppCompatActivity;

public class MenuModel extends AppCompatActivity {

    private String nama;
    private int harga;
    private int gambar;
    private String komposisi;

    public MenuModel(MenuModel menuAdapter) {
    }

    public MenuModel(String nama, int harga, int gambar, String komposisi) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
        this.komposisi = komposisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getKomposisi() {
        return komposisi;
    }

    public void setKomposisi(String komposisi) {
        this.komposisi = komposisi;
    }
}