package android.example.com.myfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DineIn extends AppCompatActivity{
    private Spinner NoMeja;
    private TextView Nama;
    String HasilMeja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);


        Nama=(TextView)findViewById(R.id.name);
        NoMeja = (Spinner)findViewById(R.id.spinnerLabel);
        ArrayList<String> list = dataMeja();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        NoMeja.setAdapter(dataAdapter);
    }

    public ArrayList<String> dataMeja() {
        int maks = 20;
        ArrayList<String> data = new ArrayList<>();
        for (int i = 1; i <= maks; i++) {data.add("Meja " + i);}
        return data;
    }

    public void buttonDine (View view){
        String nomejax, namax;
        nomejax = String.valueOf(NoMeja.getSelectedItem());
        namax = Nama.getText().toString();
        Toast.makeText(this, nomejax+" atas Nama "+namax+" Dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, DaftarMenu.class));

    }
}
