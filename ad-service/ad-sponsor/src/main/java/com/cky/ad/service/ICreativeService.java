package com.cky.ad.service;

import com.cky.ad.vo.CreativeRequest;
import com.cky.ad.vo.CreativeResponse;

public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
