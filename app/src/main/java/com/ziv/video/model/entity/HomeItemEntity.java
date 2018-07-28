package com.ziv.video.model.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class HomeItemEntity implements MultiItemEntity {

    public static final int HOME_BANNER = 1;
    public static final int HOME_BANNER_SPAN_SIZE = 1;

    private int itemType;
    private int spanSize;


    public HomeItemEntity(int itemType, int spanSize) {
        this.itemType = itemType;
        this.spanSize = spanSize;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getSpanSize() {
        return spanSize;
    }

    public void setSpanSize(int spanSize) {
        this.spanSize = spanSize;
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
