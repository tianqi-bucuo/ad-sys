package com.cky.ad.sender;

import com.cky.ad.mysql.dto.MySqlRowData;

public interface ISender {

    void sender(MySqlRowData rowData);
}
