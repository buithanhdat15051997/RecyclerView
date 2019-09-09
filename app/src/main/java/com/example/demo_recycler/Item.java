package com.example.demo_recycler;

class Item {
    int hinhanh;
    String ten;

    public Item(int hinhanh, String ten) {
        this.hinhanh = hinhanh;
        this.ten = ten;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
