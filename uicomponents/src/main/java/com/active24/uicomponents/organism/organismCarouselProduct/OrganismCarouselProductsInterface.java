package com.active24.uicomponents.organism.organismCarouselProduct;

import com.active24.uicomponents.organism.organismCarouselProduct.model.OrganismCarouselProductsModel;

public interface OrganismCarouselProductsInterface {

    void listenerClickCarousel(OrganismCarouselProductsModel.RecommendedItem item, String name);

    void listenerClickCarouselContent(OrganismCarouselProductsModel model);
}
