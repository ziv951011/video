package com.ziv.video.model.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class HomeItemEntity implements MultiItemEntity {


    // 最近热播
    public static final int HOME_RECENT_HIT = 1;
    public static final int HOME_RECENT_HIT_SPAN_SIZE = 1;

    // 近期上线
    public static final int HOME_RECENT_LAUNCH = 2;
    public static final int HOME_RECENT_LAUNCH_SPAN_SIZE = 2;

    // GIF电影
    public static final int HOME_GIT_MOIVE = 3;
    public static final int HOME_GIT_MOIVE_SPAN_SIZE = 3;




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
