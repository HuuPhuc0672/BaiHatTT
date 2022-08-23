package com.example.baihattt.Mode;

import java.io.Serializable;

public class BaiHat implements Serializable {
    private  int anhBH;
    private String tenBH,loiBH,nguoiTheH;

    public BaiHat() {
    }

    public BaiHat(int anhBH, String tenBH, String loiBH, String nguoiTheH) {
        this.anhBH = anhBH;
        this.tenBH = tenBH;
        this.loiBH = loiBH;
        this.nguoiTheH = nguoiTheH;
    }

    public int getAnhBH() {
        return anhBH;
    }

    public void setAnhBH(int anhBH) {
        this.anhBH = anhBH;
    }

    public String getTenBH() {
        return tenBH;
    }

    public void setTenBH(String tenBH) {
        this.tenBH = tenBH;
    }

    public String getLoiBH() {
        return loiBH;
    }

    public void setLoiBH(String loiBH) {
        this.loiBH = loiBH;
    }

    public String getNguoiTheH() {
        return nguoiTheH;
    }

    public void setNguoiTheH(String nguoiTheH) {
        this.nguoiTheH = nguoiTheH;
    }
}
