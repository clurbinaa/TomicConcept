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
}