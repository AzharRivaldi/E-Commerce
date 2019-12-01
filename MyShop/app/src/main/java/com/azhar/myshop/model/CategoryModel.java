package com.azhar.myshop.model;

/**
 * Created by Azhar Rivaldi on 01/12/2019.
 */

public class CategoryModel {
    public int catid, icres;
    public String title;
    public boolean isBig;

    public CategoryModel(int catid, int icres, String title, boolean isBig) {
        this.catid = catid;
        this.icres = icres;
        this.title = title;
        this.isBig = isBig;
    }
}
