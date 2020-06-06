package com.cky.ad.search;

import com.cky.ad.search.vo.SearchRequest;
import com.cky.ad.search.vo.SearchResponse;

public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
