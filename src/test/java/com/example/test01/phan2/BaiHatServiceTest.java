package com.example.test01.phan2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaiHatServiceTest {

    private BaiHatService baiHatService;
    private BaiHat baiHat;

    @BeforeEach
    void setUp() {
        baiHatService = new BaiHatService();
    }

    @Test
    public void testAddTuongDuong_HopLe(){
        baiHatService.addBaiHat(
                new BaiHat("1", "Ten", "Ca si", 4.5f, "the loai"));
        assertEquals(1,baiHatService.getAllBaiHatList().size());
    }

    @Test
    public void testAddTuongDuong_KhongHopLe(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            baiHatService.addBaiHat(new BaiHat("1", "Ten", "Ca si", 1f, "the loai"));
        });
        assertEquals("Bai hat nam trong khoang 2s - 5s59",exception.getMessage());
    }

    @Test
    public void testAddBienDuoi_HopLe(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            baiHatService.addBaiHat(new BaiHat("1", "Ten", "Ca si", 2.0f, "the loai"));
        });
        assertEquals(1,baiHatService.getAllBaiHatList().size());
    }

    @Test
    public void testAddBienDuoi_KhongHopLe(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            baiHatService.addBaiHat(new BaiHat("1", "Ten", "Ca si", 1.9f, "the loai"));
        });
        assertEquals("Bai hat nam trong khoang 2s - 5s59",exception.getMessage());
    }

    @Test
    public void testAddBienTren_HopLe(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            baiHatService.addBaiHat(new BaiHat("1", "Ten", "Ca si", 5.9f, "the loai"));
        });
        assertEquals(1,baiHatService.getAllBaiHatList().size());
    }

    @Test
    public void testAddBienTren_KhongHopLe(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            baiHatService.addBaiHat(new BaiHat("1", "Ten", "Ca si", 6f, "the loai"));
        });
        assertEquals(1,baiHatService.getAllBaiHatList().size());
    }

    @AfterEach
    void tearDown() {
        baiHatService = null;
    }
}