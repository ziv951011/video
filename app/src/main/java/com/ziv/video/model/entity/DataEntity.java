package com.ziv.video.model.entity;

import java.util.ArrayList;
import java.util.List;

public class DataEntity {


    /***
     * 主页
     * @return
     */
    public static List<HomeItemEntity> getHomeData() {
        List<HomeItemEntity> homeItemEntities = new ArrayList<>();
        homeItemEntities.add(new HomeItemEntity(HomeItemEntity.HOME_BANNER, HomeItemEntity.HOME_BANNER_SPAN_SIZE));
        return homeItemEntities;
    }
}
