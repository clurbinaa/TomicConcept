package com.active24.uicomponents.organism.organismCarouselProduct.model;

public class RecommendedItem {
    private String displayName;

    private String largeImage;

    private String productId;

    private Double listPrice;

    private Double promoPrice;

    private Double salePrice;

    private String groupType;

    private Boolean isHybrid;

    private Double minimumListPrice;

    private Double maximumListPrice;

    private Double minimumPromoPrice;

    private Double maximumPromoPrice;



    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }


    public Double getMinimumListPrice() {
        return minimumListPrice;
    }

    public void setMinimumListPrice(Double minimumListPrice) {
        this.minimumListPrice = minimumListPrice;
    }

    public Double getMaximumListPrice() {
        return maximumListPrice;
    }

    public void setMaximumListPrice(Double maximumListPrice) {
        this.maximumListPrice = maximumListPrice;
    }

    public Double getMinimumPromoPrice() {
        return minimumPromoPrice;
    }

    public void setMinimumPromoPrice(Double minimumPromoPrice) {
        this.minimumPromoPrice = minimumPromoPrice;
    }

    public Double getMaximumPromoPrice() {
        return maximumPromoPrice;
    }

    public void setMaximumPromoPrice(Double maximumPromoPrice) {
        this.maximumPromoPrice = maximumPromoPrice;
    }

    public Boolean getHybrid() {
        return isHybrid;
    }

    public void setHybrid(Boolean hybrid) {
        isHybrid = hybrid;
    }
}
