package com.example.demo_recycler.until;

public class Const {
    //169.254.75.208
    public static final String URL = "url";
    public static final int GET = 0;
    public static final int HEADERS = 4;
    public static final int POST = 1;
    public static final int NO_REQUEST = -1;
    public static final int TIMEOUT = 300000;
    public static final int MAX_RETRY = 5;
    public static final int CHOOSE_PHOTO = 100;
    public static final float DEFAULT_BACKOFF_MULT = 1f;

    public static  String localhost ="http://169.254.75.208:80";
    public  static  String DuongDanLoaiSp=  localhost +"/Server/getloaisp.php";
    public  static  String DuongDanSanPhamNew=  localhost +"/Server/getsanphammoinhat.php";
    public  static  String DuongDanDienThoai =  localhost +"/Server/getsanpham.php?page=";
    public  static  String DuongDanThongTinKH =  localhost + "/Server/thongtinkhachhang.php";
    public  static  String DuongDanChiTietDonHang = localhost +"/Server/chitietdonhang.php";
}
