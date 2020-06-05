package com.cky.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// 创意与推广单元关联表
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeUnitResponse {
    private List<Long> ids;
}
