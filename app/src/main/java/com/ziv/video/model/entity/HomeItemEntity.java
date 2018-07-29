package com.ziv.video.model.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class HomeItemEntity implements MultiItemEntity {

    // 导航栏
    public static final int HOME_BANNER = 1;
    public static final int HOME_BANNER_SPAN_SIZE = 1;

    // 最近热播
    public static final int HOME_RECENT_HIT = 2;
    public static final int HOME_RECENT_HIT_SPAN_SIZE = 2;

    // 近期上线
    public static final int HOME_RECENT_LAUNCH = 3;
    public static final int HOME_RECENT_LAUNCH_SPAN_SIZE = 3;

    // GIF电影
    public static final int HOME_GIT_MOIVE = 4;
    public static final int HOME_GIT_MOIVE_SPAN_SIZE = 4;




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
