package com.cky.ad.service;

import com.cky.ad.entity.AdPlan;
import com.cky.ad.exception.AdException;
import com.cky.ad.vo.AdPlanGetRequest;
import com.cky.ad.vo.AdPlanRequest;
import com.cky.ad.vo.AdPlanResponse;

import java.util.List;

public interface IAdPlanService {

    // 创建推广计划
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    // 获取推广计划
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    // 更新推广计划
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    // 删除推广计划
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
