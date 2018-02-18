package android.example.com.myfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgPilihMenu;
    RadioButton rbDineIn;
    RadioButton rbTakeAway;
    Button buttonPesanSkrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create toast show
        Toast.makeText(this, getString(R.string.nama_nim), Toast.LENGTH_LONG).show();

        //create atribut radio button
        rbDineIn = findViewById(R.id.rbDineIn);
        rbTakeAway = findViewById(R.id.rbTakeAway);
        rgPilihMenu = findViewById(R.id.rgPilihMenu);
        buttonPesanSkrg = findViewById(R.id.buttonPesanSkrg);

        buttonPesanSkrg.setOnClickListener(new View.OnClickListener() {
            //mengatur radio button apabila diklik
            @Override
            public void onClick(View view) {

                int a = rgPilihMenu.getCheckedRadioButtonId();
                switch (a) { //switch digunakan untuk menentukan sebuah pilihan

                    case R.id.rbDineIn:
                        //menampilkan toast ketika diklik dinein
                        Toast.makeText(getBaseContext(), "Dine In", Toast.LENGTH_SHORT).show();

                        //menghubungkan aktivitas menu utama ke take away
                        Intent dineIn = new Intent(getApplicationContext(), DineIn.class);
                        startActivity(dineIn);

                        break;

                    case R.id.rbTakeAway:
                        //menampilkan toast ketika diklik takeaway
                        Toast.makeText(getBaseContext(), "Take Away", Toast.LENGTH_SHORT).show();

                        //menghubungkan aktiitas menu utama ke take away
                        Intent TakeAway = new Intent (getApplicationContext(), android.example.com.myfood.TakeAway.class);

                        startActivity(TakeAway);
                        break;



                }
            }




        });
    }
}