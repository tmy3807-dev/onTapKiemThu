package com.example.test01.phan2;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
   List<BaiHat> baiHatList =  new ArrayList<>();

    public List<BaiHat> getAllBaiHatList() {
        return baiHatList;
    }

    public void addBaiHat(BaiHat baiHat){
        if(baiHat == null){
            throw new IllegalArgumentException("Bai hat is null");
        }
        if (baiHat.getMa() == null || baiHat.getMa().trim().isBlank()||
            baiHat.getTen() == null || baiHat.getTen().trim().isBlank()||
            baiHat.getTenCaSi() == null || baiHat.getTenCaSi().trim().isBlank()||
            baiHat.getTheLoai() == null || baiHat.getTheLoai().trim().isBlank()
        ){
            throw new IllegalArgumentException("Bai hat is null");
        }
        if (baiHat.getThoiLuong() < 2.00 || baiHat.getThoiLuong() > 5.59 || baiHat.getThoiLuong() == null ){
            throw new IllegalArgumentException("Bai hat nam trong khoang 2s - 5s59");
        }
        baiHatList.add(baiHat);
    }

}
