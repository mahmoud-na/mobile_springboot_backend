package com.mahmoud.springboot.v1.models;

import java.util.List;

public class RestaurantModel {


    private int restaurantId;
    private String restaurantName;
    private List<String> restaurantPhones;
    private List<BranchModel> restaurantBranches;
    private List<String> restaurantImages;
    private List<String> restaurantMenuImages;
    private String restaurantLogoImage;
    private String restaurantOpeningTime;
    private String restaurantClosingTime;
    private String restaurantDescription;
    private String restaurantHotline;
    private int restaurantViewers;

    public RestaurantModel(
            int restaurantId,
            String restaurantName,
            List<String> restaurantPhones,
            List<BranchModel> restaurantBranches,
            List<String> restaurantImages,
            List<String> restaurantMenuImages,
            String restaurantLogoImage,
            String restaurantOpeningTime,
            String restaurantClosingTime,
            String restaurantDescription,
            String restaurantHotline,
            int restaurantViewers
    ) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantPhones = restaurantPhones;
        this.restaurantBranches = restaurantBranches;
        this.restaurantImages = restaurantImages;
        this.restaurantMenuImages = restaurantMenuImages;
        this.restaurantLogoImage = restaurantLogoImage;
        this.restaurantOpeningTime = restaurantOpeningTime;
        this.restaurantClosingTime = restaurantClosingTime;
        this.restaurantDescription = restaurantDescription;
        this.restaurantHotline = restaurantHotline;
        this.restaurantViewers = restaurantViewers;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<String> getRestaurantPhones() {
        return restaurantPhones;
    }

    public void setRestaurantPhones(List<String> restaurantPhones) {
        this.restaurantPhones = restaurantPhones;
    }

    public List<BranchModel> getRestaurantBranches() {
        return restaurantBranches;
    }

    public void setRestaurantBranches(List<BranchModel> restaurantBranches) {
        this.restaurantBranches = restaurantBranches;
    }

    public List<String> getRestaurantImages() {
        return restaurantImages;
    }

    public void setRestaurantImages(List<String> restaurantImages) {
        this.restaurantImages = restaurantImages;
    }

    public List<String> getRestaurantMenuImages() {
        return restaurantMenuImages;
    }

    public void setRestaurantMenuImages(List<String> restaurantMenuImages) {
        this.restaurantMenuImages = restaurantMenuImages;
    }

    public String getRestaurantLogoImage() {
        return restaurantLogoImage;
    }

    public void setRestaurantLogoImage(String restaurantLogoImage) {
        this.restaurantLogoImage = restaurantLogoImage;
    }

    public String getRestaurantOpeningTime() {
        return restaurantOpeningTime;
    }

    public void setRestaurantOpeningTime(String restaurantOpeningTime) {
        this.restaurantOpeningTime = restaurantOpeningTime;
    }

    public String getRestaurantClosingTime() {
        return restaurantClosingTime;
    }

    public void setRestaurantClosingTime(String restaurantClosingTime) {
        this.restaurantClosingTime = restaurantClosingTime;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }

    public String getRestaurantHotline() {
        return restaurantHotline;
    }

    public void setRestaurantHotline(String restaurantHotline) {
        this.restaurantHotline = restaurantHotline;
    }

    public int getRestaurantViewers() {
        return restaurantViewers;
    }

    public void setRestaurantViewers(int restaurantViewers) {
        this.restaurantViewers = restaurantViewers;
    }
}
