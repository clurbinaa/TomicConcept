package com.active24.uicomponents.organism.organismCarouselProduct;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.active24.uicomponents.R;
import com.active24.uicomponents.molecule.MoleculeCarouselProduct;
import com.active24.uicomponents.organism.organismCarouselProduct.model.OrganismCarouselProductsModel;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class OrganismCarouselProductsAdapter  extends RecyclerView.Adapter {
    private OrganismCarouselProductsModel model;
    private Context contexto;


    public OrganismCarouselProductsAdapter(OrganismCarouselProductsModel model, Context contexto) {
        this.model = model;
        this.contexto = contexto;

        WindowManager wm = (WindowManager) this.contexto.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.molecule_carousel_product, parent, false);

        MoleculeCarouselProduct vh = new MoleculeCarouselProduct(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final MoleculeCarouselProduct v = (MoleculeCarouselProduct) holder;
        v.view.setTag(position);
        final OrganismCarouselProductsModel.RecommendedItem item = this.model.getRecommendedItems().get(position);
        final String urlImage = !TextUtils.isEmpty(item.getLargeImage()) ? item.getLargeImage() : "";

        v.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
//            if (!urlImage.equals("")) {
//                AppPicasso.getInstance().getPicasso().with(contexto).load(urlImage).fit().placeholder(ContextCompat.getDrawable(contexto, R.drawable.ic_carga_chica_carousel)).into(v.image);
//            } else {
//                v.image.setImageDrawable(ContextCompat.getDrawable(contexto, R.drawable.ic_carga_chica_carousel));
//            }

        if (this.model.getShowTitle()) {
            v.title.setVisibility(VISIBLE);
            v.title.setText(item.getDisplayName());
        } else {
            v.title.setVisibility(GONE);
        }

        if (this.model.getShowPrice()) {
            this.prices(item, v);
        } else {
            v.price2.setVisibility(GONE);
            v.price1.setVisibility(GONE);
        }
    }

    @Override
    public int getItemCount() {
        return (this.model.getRecommendedItems().size() > this.model.getMaximumNumRecords() && this.model.getMaximumNumRecords() != 0) ? this.model.getMaximumNumRecords() : this.model.getRecommendedItems().size();
    }

    private void prices(OrganismCarouselProductsModel.RecommendedItem item, MoleculeCarouselProduct v) {
        v.price2.setVisibility(VISIBLE);
        v.price1.setVisibility(VISIBLE);

        v.price1.setText(String.valueOf(item.getListPrice()));
        v.price2.setText(String.valueOf(item.getListPrice()));
    }
}