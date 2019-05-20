package com.active24.uicomponents.organism.organismCarouselProduct;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;


import com.active24.uicomponents.R;
import com.active24.uicomponents.organism.organismCarouselProduct.model.OrganismCarouselProductsModel;

public class OrganismCarouselProductsView extends LinearLayout {

    private Context context;
    private OrganismCarouselProductsModel model;
    private RecyclerView recyclerView;

    public OrganismCarouselProductsView(Context context, OrganismCarouselProductsModel model){
        super(context);
        this.context = context;
        this.model = model;
        init();
    }

    private void init() {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View vista = null;
        vista = inflater.inflate(R.layout.organism_carousel_products_view, this, true);
        this.recyclerView = vista.findViewById(R.id.carousel_recycled_horizontal);
        if (null != this.model){
            OrganismCarouselProductsAdapter adapter = new OrganismCarouselProductsAdapter(this.model,this.context);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false);
            this.recyclerView.setAdapter(adapter);
            this.recyclerView.setLayoutManager(layoutManager);
        }
    }

}
