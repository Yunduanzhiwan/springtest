package com.yefeng.springtest.Admin.service;

import com.yefeng.springtest.Admin.entity.Advertise;

import java.util.List;

public interface AdvertiseService {

    public List<Advertise> getAllAds();

    public Integer addAdvertise(Advertise advertise);
}
