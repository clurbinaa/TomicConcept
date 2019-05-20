package com.active24.uicomponents.molecule;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.active24.uicomponents.R;

public class MoleculeCarouselProduct extends RecyclerView.ViewHolder {

    public View view;
    public TextView title;
    public TextView price1;
    public TextView price2;
    public ImageView image;

    public MoleculeCarouselProduct(View v) {
        super(v);
        view = v;
        title = (TextView) view.findViewById(R.id.textViewCarouselProduct);
        price1 = (TextView) view.findViewById(R.id.textViewPrice1CarouselProduct);
        price2 = (TextView) view.findViewById(R.id.textViewPrice2CarouselProduct);
        image = (ImageView) view.findViewById(R.id.imgCarouselProduct);

    }
}
