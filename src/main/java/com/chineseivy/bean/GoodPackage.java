package com.chineseivy.bean;

public class GoodPackage {

    private Integer goodid;

    private Shop shop;

    private Recommend recommend;

    private Activity activity;

    private GoodClass goodClass;

    private int goodclassid;

    public int getGoodclassid() {
        return goodclassid;
    }

    public void setGoodclassid(int goodclassid) {
        this.goodclassid = goodclassid;
    }

    private Double recommendprice;

    private String goodname;

    private Double oldprice;

    private Double price;

    private Double activityprice;

    private String picture;

    private String standard;

    private Integer goodstate;

    private Integer activtiystate;

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Double getRecommendprice() {
        return recommendprice;
    }

    public void setRecommendprice(Double recommendprice) {
        this.recommendprice = recommendprice;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public Double getOldprice() {
        return oldprice;
    }

    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getActivityprice() {
        return activityprice;
    }

    public void setActivityprice(Double activityprice) {
        this.activityprice = activityprice;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public Integer getGoodstate() {
        return goodstate;
    }

    public void setGoodstate(Integer goodstate) {
        this.goodstate = goodstate;
    }

    public Integer getActivtiystate() {
        return activtiystate;
    }

    public void setActivtiystate(Integer activtiystate) {
        this.activtiystate = activtiystate;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Recommend getRecommend() {
        return recommend;
    }

    public void setRecommend(Recommend recommend) {
        this.recommend = recommend;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public GoodClass getGoodClass() {
        return goodClass;
    }

    public void setGoodClass(GoodClass goodClass) {
        this.goodClass = goodClass;
    }
}