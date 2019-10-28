package com.dicoding.iwakuproduct;

import java.util.ArrayList;

public class ProductData {
    public static String[][] data = new String[][]{
            {"Ikan Bandeng", "Rp 50.000/kg", "https://ecs7.tokopedia.net/img/cache/700/product-1/2017/12/2/0/0_4633e219-d42d-40a2-8576-51ffda2a05b0_677_591.jpg", "1 Kwintal", "Tersedia di Depot", "9 - 11 cm", "+- 8 kg"},
            {"Ikan Tongkol", "Rp 30.000/kg", "http://www.masakapaya.com/Uploads/istilah%20memasak/Bahan/angga/stock%20foto/ikan%20tongkol.jpg?width=960&quality=95", "50 Kilogram", "Baru saja ditangkap", "8 - 11 cm", "+- 6 kg"},
            {"Ikan Sarden", "Rp 35.000/kg", "https://asset-a.grid.id//crop/0x0:0x0/700x465/photo/bobofoto/original/21491_ikan-makarel.jpg", "70 Kilogram", "Baru saja ditangkap", "3 - 5 cm", "+- 500 gr"},
            {"Ikan Cue", "Rp 42.000/kg", "https://www.mypangandaran.com/gambar/blog/aneka-asyiknya-serok-ikan-saat-musim-ikan-layang-datang-66_a.jpg", "2 Kwintal", "Tersedia di depot", "6 - 8 cm", "+- 2 kg"},
            {"Ikan Tenggiri", "Rp 77.000/kg", "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/6/6/34561598/34561598_35860e06-9a3d-4025-83d8-c11fde491106_1600_1386.jpg", "30 Kilogram", "Baru saja ditangkap", "10 - 12 cm", "+- 5 kg"},
            {"Ikan Kembung", "Rp 26.000/kg", "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/12/8/28784277/28784277_bce899f9-3176-4fcf-9b5b-e094c72413b4_400_300.jpg", "90 Kilogram", "Tersedia di depot", "7 - 10 cm", "+- 7 kg"},
    };

    public static ArrayList<Product> getListData(){
        Product product = null;
        ArrayList<Product> list = new ArrayList<>();
        for (String[] aData : data) {
            product = new Product();
            product.setName(aData[0]);
            product.setRemarks(aData[1]);
            product.setPhoto(aData[2]);
            product.setStocks(aData[3]);
            product.setCondition(aData[4]);
            product.setSize(aData[5]);
            product.setWeight(aData[6]);

            list.add(product);
        }

        return list;
    }
}