package com.alwi.ole.kumpulanhadist.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alwi.ole.kumpulanhadist.DetailActivity;
import com.alwi.ole.kumpulanhadist.R;
import com.alwi.ole.kumpulanhadist.model.Doa;
import com.alwi.ole.kumpulanhadist.viewholder.DoaHolder;

import java.util.List;

/**
 * Created by ole on 10/8/18.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<Doa> doas;

    Context context;

    public DoaAdapter(Context context, List<Doa> doas) {
        this.context=context;
        this.doas=doas;
    }

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DoaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa,null));
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, final int position) {
        holder.txtNamaDoa.setText(doas.get(position).getNama());
        holder.txtArtiDoa.setText(doas.get(position).getArti());

        holder.cardItemDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailActivity.class);
                i.putExtra("id_nama", doas.get(position).getNama());
                i.putExtra("id_surah", doas.get(position).getSurah());
                i.putExtra("id_arti", doas.get(position).getArti());
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }
}
