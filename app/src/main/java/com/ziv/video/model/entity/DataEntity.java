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
        homeItemEntities.add(new HomeItemEntity(HomeItemEntity.HOME_RECENT_HIT, HomeItemEntity.HOME_RECENT_HIT_SPAN_SIZE));
        homeItemEntities.add(new HomeItemEntity(HomeItemEntity.HOME_RECENT_LAUNCH, HomeItemEntity.HOME_RECENT_LAUNCH_SPAN_SIZE));
        homeItemEntities.add(new HomeItemEntity(HomeItemEntity.HOME_GIT_MOIVE, HomeItemEntity.HOME_GIT_MOIVE_SPAN_SIZE));
        return homeItemEntities;
    }
}
