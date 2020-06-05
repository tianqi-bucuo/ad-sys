package com.cky.ad.service.impl;

import com.cky.ad.dao.CreativeRepository;
import com.cky.ad.entity.Creative;
import com.cky.ad.service.ICreativeService;
import com.cky.ad.vo.CreativeRequest;
import com.cky.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreativeServiceImpl implements ICreativeService {

    @Autowired
    private CreativeRepository creativeRepository;

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
