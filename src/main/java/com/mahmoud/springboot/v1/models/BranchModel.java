package com.mahmoud.springboot.v1.models;

import java.util.List;

public class BranchModel {
    private int branchId;
    private String branchPhone;
    private String branchLocation;
    private List<ServicesModel> branchServices;


    public BranchModel(int branchId, String branchPhone, String branchLocation, List<ServicesModel> branchServices) {
        this.branchId = branchId;
        this.branchPhone = branchPhone;
        this.branchLocation = branchLocation;
        this.branchServices = branchServices;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchPhone() {
        return branchPhone;
    }

    public void setBranchPhone(String branchPhone) {
        this.branchPhone = branchPhone;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public List<ServicesModel> getBranchServices() {
        return branchServices;
    }

    public void setBranchServices(List<ServicesModel> branchServices) {
        this.branchServices = branchServices;
    }
}
