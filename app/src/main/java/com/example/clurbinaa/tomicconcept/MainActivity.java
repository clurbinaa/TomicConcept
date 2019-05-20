package com.example.clurbinaa.tomicconcept;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;

import com.active24.uicomponents.organism.organismCarouselProduct.OrganismCarouselProductsInterface;
import com.active24.uicomponents.organism.organismCarouselProduct.OrganismCarouselProductsView;
import com.active24.uicomponents.organism.organismCarouselProduct.model.OrganismCarouselProductsModel;
import com.active24.uicomponents.organism.organismCarouselProduct.model.RecommendedItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linearLayout);

        OrganismCarouselProductsModel model = new OrganismCarouselProductsModel();

        model.setCategory_id("asdasd");
        model.setMaximumNumRecords(6);
        model.setMinNumRecords(1);
        model.setName("carousel");

        List<RecommendedItem> recomendedArray = new ArrayList<>();

        RecommendedItem item = new RecommendedItem();
        item.setDisplayName("producto1");
        item.setListPrice(5000.00);
        item.setPromoPrice(4500.00);
        recomendedArray.add(item);

        RecommendedItem item2 = new RecommendedItem();
        item2.setDisplayName("producto1");
        item2.setListPrice(5000.00);
        item2.setPromoPrice(4500.00);
        recomendedArray.add(item2);


        RecommendedItem item3 = new RecommendedItem();
        item3.setDisplayName("producto3");
        item3.setListPrice(5000.00);
        item3.setPromoPrice(4500.00);
        recomendedArray.add(item3);

        RecommendedItem item4 = new RecommendedItem();
        item4.setDisplayName("producto4");
        item4.setListPrice(500.00);
        item4.setPromoPrice(400.00);
        recomendedArray.add(item3);


        model.setRecommendedItems(recomendedArray);
        model.setShowTitle(true);
        model.setShowPrice(true);

        OrganismCarouselProductsView organism = new OrganismCarouselProductsView(this, model, new OrganismCarouselProductsInterface() {
            @Override
            public void listenerClickCarousel(RecommendedItem item, String name) {
                Log.d("mainActivity", "listenerClickCarousel: ");
            }

            @Override
            public void listenerClickCarouselContent(OrganismCarouselProductsModel model) {

            }
        });

        linearLayout.addView(organism);
    }
}
