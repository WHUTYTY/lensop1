package com.len.mapper;

import com.len.entity.PUserDevice;
import tk.mybatis.mapper.common.Mapper;

public interface PUserDeviceMapper extends Mapper<PUserDevice> {
    void addUserDevice(PUserDevice pUserDevice);

    String getuidbyeid(String eid);
}