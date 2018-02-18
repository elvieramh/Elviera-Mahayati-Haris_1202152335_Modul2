package android.example.com.myfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MenuListAdapter menuAdapter;

    public static ArrayList<MenuModel> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        menuAdapter = new MenuListAdapter(menuList);
        recyclerView.setAdapter(menuAdapter);

//recyclerView.addOnItemTouchListener(new RecycleView.Item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public ArrayList<MenuModel> isiMenu(){
        ArrayList<MenuModel> data = new ArrayList<>();
        //menumodel berisi(String nama, int harga, int gambar, String deskripsi)
        data.add(new MenuModel("Cheese Bayam", 14500, R.drawable.cheesebayam, "Bayam, Keju, Susu"));
        data.add(new MenuModel("Banana Split", 21500, R.drawable.bananasplit, "Pisang, Susu, Ice Cream"));
        data.add(new MenuModel("Burger", 25500, R.drawable.burger, "Roti, HAM, Sayur"));
        data.add(new MenuModel("Sandwitch", 17500, R.drawable.sndwtch, "Roti, HAM, Sayur, Mayonise"));
        data.add(new MenuModel("Spageti Tuna", 14500, R.drawable.tuna, "Ikan Tuna, Spageti"));
        data.add(new MenuModel("Milk Shake Strawberry", 18500, R.drawable.milkshake, "Susu, Strawberry"));
        data.add(new MenuModel("Coffee", 30000, R.drawable.coffeilly, "Kopi Import, Air, Gula"));
        return data;
    }


}