package com.alwi.ole.kumpulanhadist.viewholder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alwi.ole.kumpulanhadist.R;

/**
 * Created by ole on 10/8/18.
 */

public class DoaHolder extends RecyclerView.ViewHolder{

    public TextView txtNamaDoa;
    public TextView txtArtiDoa;
    public View cardItemDoa;
    public ImageView imgDoa;

    public DoaHolder(View itemView) {
        super(itemView);
        cardItemDoa = (CardView) itemView.findViewById(R.id.carditem_doa);
        imgDoa = (ImageView) itemView.findViewById(R.id.img_doa);
        txtNamaDoa = itemView.findViewById(R.id.txt_Nama_Doa);
        txtArtiDoa = itemView.findViewById(R.id.txt_Arti_Doa);
    }

}
