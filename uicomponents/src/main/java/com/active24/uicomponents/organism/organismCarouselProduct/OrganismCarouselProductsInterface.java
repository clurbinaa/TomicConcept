package com.active24.uicomponents.organism.organismCarouselProduct;

import com.active24.uicomponents.organism.organismCarouselProduct.model.OrganismCarouselProductsModel;
import com.active24.uicomponents.organism.organismCarouselProduct.model.RecommendedItem;

public interface OrganismCarouselProductsInterface {

    void listenerClickCarousel(RecommendedItem item, String name);

    void listenerClickCarouselContent(OrganismCarouselProductsModel model);
}
