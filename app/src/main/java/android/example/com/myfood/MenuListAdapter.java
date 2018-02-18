package android.example.com.myfood;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by elviera on 2/18/2018.
 */

public class MenuListAdapter extends RecyclerView.Adapter<MenuListAdapter.MenuViewHolder>{

    class MenuViewHolder extends RecyclerView.ViewHolder{
        private TextView labelNama;
        private TextView labelHarga;
        private TextView labelID;
        private ImageView labelGambar;

        public MenuViewHolder(View itemView) {
            super(itemView);
            labelID = (TextView)itemView.findViewById(R.id.listID);
            labelNama = (TextView)itemView.findViewById(R.id.listNama);
            labelHarga = (TextView)itemView.findViewById(R.id.listHarga);
            labelGambar = (ImageView)itemView.findViewById(R.id.listGambar);
        }
    }

    private ArrayList<MenuModel> dataList;

    public MenuListAdapter(ArrayList<MenuModel> list) {
        this.dataList = list;
        Log.d("Jumlah Menu","Size: "+getItemCount());
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_menu_list_, parent, false);
        return new MenuViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final MenuViewHolder holder, final int position) {
        holder.labelID.setText(""+position);
        holder.labelNama.setText(dataList.get(position).getNama());
        holder.labelHarga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(dataList.get(position).getHarga()));
        holder.labelGambar.setImageResource(dataList.get(position).getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String idx = holder.labelID.getText().toString();
                Log.d("ItemMenuCLICKED","ID:"+idx);
                Toast.makeText(v.getContext(), "Memilih Menu '"+dataList.get(Integer.parseInt(idx)).getNama()+"'", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext().getApplicationContext(), DetailMenu.class);
                i.putExtra("MenuID",""+idx);
                v.getContext().startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount()  {
        return (dataList != null) ? dataList.size() : 0;
    }

}

