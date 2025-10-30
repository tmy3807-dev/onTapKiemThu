package com.example.test01.phan1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HocLucTest {
    HocLuc hocLuc;
    @BeforeEach
    void setUp() {
    hocLuc = new HocLuc();
    }

    @Test
    public void testHocLuc_TuongDuong_XuatSac(){
        assertEquals("Xuat sac", hocLuc.xetHocLuc(9.8f));
    }

    @Test
    public void testHocLuc_TuongDuong_Gioi(){
        assertEquals("Gioi", hocLuc.xetHocLuc(8f));
    }

    @Test
    public void testHocLuc_TuongDuong_TrungBinh(){
        assertEquals("Trung binh", hocLuc.xetHocLuc(6.5f));
    }

    @Test
    public void testHocLuc_TuongDuong_Yeu(){
        assertEquals("Yeu", hocLuc.xetHocLuc(4f));
    }

    @Test
    public void testHocLuc_TuongDuong_NgoaiLe(){
        assertThrows(IllegalArgumentException.class, () -> hocLuc.xetHocLuc(-2f));
    }

    @AfterEach
    void tearDown() {
       hocLuc = null;
    }
}