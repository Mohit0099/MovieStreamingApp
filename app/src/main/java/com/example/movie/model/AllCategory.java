package com.example.movie.model;

import java.util.List;

public class AllCategory {
    String categoryTitle;
    Integer categoryId;
    private List<CategoryItem>categoryItemList;

    public AllCategory( Integer categoryId,String categoryTitle, List<CategoryItem> categoryItemList) {
        this.categoryTitle = categoryTitle;
        this.categoryId = categoryId;
        this.categoryItemList = categoryItemList;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public List<CategoryItem> getCategoryItemList() {
        return categoryItemList;
    }

    public void setCategoryItemList(List<CategoryItem> categoryItemList) {
        this.categoryItemList = categoryItemList;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
