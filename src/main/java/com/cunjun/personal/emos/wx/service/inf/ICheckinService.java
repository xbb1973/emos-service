package com.cunjun.personal.emos.wx.service.inf;

/**
 * Created by CunjunWang on 2021/1/30.
 */
public interface ICheckinService {

    /**
     * 判定是否是合适的签到时间
     */
    String validTimeToCheckin(Integer userId, String date);
}
