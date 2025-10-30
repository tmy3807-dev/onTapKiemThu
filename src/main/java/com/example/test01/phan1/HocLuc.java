package com.example.test01.phan1;

public class HocLuc {
    public String xetHocLuc(float diem){
        if (diem < 0 || diem > 10){
            throw new IllegalArgumentException("Diem khong hop le");
        } if(diem >= 9){return "Xuat sac";}
        if(diem >= 7){return "Gioi";}
        if(diem >= 5){return "Trung binh";}
        return "Yeu";
    }
}
