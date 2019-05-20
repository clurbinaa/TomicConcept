package com.active24.uicomponents.organism.organismCarouselProduct.model;

import java.util.List;

public class OrganismCarouselProductsModel {

    private String category_id;
    private String moreLinkCategory;
    private String moreLinkStaticTextField;
    private Integer minNumRecords;
    private Integer maximumNumRecords;
    private String name;
    private List<RecommendedItem> recommendedItems = null;
    private Boolean showMore;
    private Boolean showPrice;
    private Boolean showTitle;
    private double numberVisible;

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getMoreLinkCategory() {
        return moreLinkCategory;
    }

    public void setMoreLinkCategory(String moreLinkCategory) {
        this.moreLinkCategory = moreLinkCategory;
    }

    public String getMoreLinkStaticTextField() {
        return moreLinkStaticTextField;
    }

    public void setMoreLinkStaticTextField(String moreLinkStaticTextField) {
        this.moreLinkStaticTextField = moreLinkStaticTextField;
    }

    public Integer getMinNumRecords() {
        return minNumRecords;
    }

    public void setMinNumRecords(Integer minNumRecords) {
        this.minNumRecords = minNumRecords;
    }

    public Integer getMaximumNumRecords() {
        return maximumNumRecords;
    }

    public void setMaximumNumRecords(Integer maximumNumRecords) {
        this.maximumNumRecords = maximumNumRecords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RecommendedItem> getRecommendedItems() {
        return recommendedItems;
    }

    public void setRecommendedItems(List<RecommendedItem> recommendedItems) {
        this.recommendedItems = recommendedItems;
    }

    public Boolean getShowMore() {
        return showMore;
    }

    public void setShowMore(Boolean showMore) {
        this.showMore = showMore;
    }

    public double getNumberVisible() {
        return numberVisible;
    }

    public void setNumberVisible(double numberVisible) {
        this.numberVisible = numberVisible;
    }

    public Boolean getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Boolean showPrice) {
        this.showPrice = showPrice;
    }

    public Boolean getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Boolean showTitle) {
        this.showTitle = showTitle;
    }


}

