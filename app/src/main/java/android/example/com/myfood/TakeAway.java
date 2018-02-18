package android.example.com.myfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TakeAway extends AppCompatActivity {
    private Button button_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        //untuk dapat digunakan klik button
        button_main = (Button)findViewById(R.id.buttonPilPes1);
        button_main.setOnClickListener(new View.OnClickListener() {

            @Override //menghubungkan dengan daftar menu activity
            public void onClick(View view) {
                Intent q = new Intent(getApplicationContext(),DaftarMenu.class);
                startActivity(q);

            }
        });

        }
}
