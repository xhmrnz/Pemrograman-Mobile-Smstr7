package com.ilham.myfoodcatalogue.model;

import java.util.ArrayList;

public class DrinkData {
    public static String[][] data = new String[][]{
            {"Es Cendol", "Di Jawa Barat, minuman ini dikenal dengan sebutan es Cendol, sedangkan di Banjarnegara minuman ini disebut dengan es Dawet. Ini adalah minuman dingin yang terbuat dari campuran tepung honkwe, dan pewarna daun suji atau pasta pandan, yang dibentuk memanjang. Sedangkan kuahnya terbuat dari  serutas es, air gula merah dan juga santan.", "https://www.gotravelly.com/blog/wp-content/uploads/2017/12/minuman-tradisional-indonesia-cendol.jpg", "8.000"},
            {"Es Pisang Hijau", "Ini adalah salah satu minuman menyegarkan khas Makasar. Disebut es pisang hijau karena warna pisang ini hijau, karena dibalut oleh kulit yang berwarna hijau.", "https://www.gotravelly.com/blog/wp-content/uploads/2017/12/minuman-tradisional-indonesia-es-pisang-hijau.jpg", "12.000"},
            {"Es Nona", "Kata Nona memang identik dengan seorang wanita muda, namun jika mendengar kata es Nona, maka Anda akan menemukan minuman menyegarkan nan cantik khas daerah Pontianak. Ini adalah salah satu minuman menyegarkan yang legendaris dari daerah tersebut.", "https://www.gotravelly.com/blog/wp-content/uploads/2017/12/minuman-tradisional-indonesia-es-nona.jpg", "10.000"},
            {"Es Selendang Mayang", "Es Selendang Mayang ini adalah salah satu minuman tradisional Indonesia dari daerah Betawi atau Jakarta. Minuman yang satu ini memang agak sulit dicari.", "https://www.gotravelly.com/blog/wp-content/uploads/2017/12/minuman-tradisional-indonesia-es-selendang-mayang.jpg","15.000"},
            {"Bajigur", "Jika minuman khas Indonesia sebelumnya memiliki cita rasa menyegarkan, minuman khas Indonesia asal Sunda, Jawa Barat berikutnya ini justru terkenal akan cita rasanya yang mampu menghangatkan tubuh.", "https://img-global.cpcdn.com/recipes/fbd758f3a54e8a44/751x532cq70/bajigur-foto-resep-utama.jpg","7.000"},
            {"Sekoteng", "Minuman tradisional lainnya asal Jawa Tengah adalah Sekoteng. Dengan cita rasa khas jahe yang menghangatkan, minuman asal Indonesia ini disajikan dalam keadangan hangat bersama beragam topping seperti kacang hijau, kacang tanah, pacar cina dan potongan roti tawar.", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2019/08/minuman-khas-Indonesia-4-Pontianak-Post.jpg", "10.000"},
            {"Wedang Ronde", "Masih berasal dari Jawa, ciri khas dari minuman tradisional khas Indonesia ini adalah adanya bola-bola yang terbuat dari tepung ketan putih dilengkapi dengan isian lain seperti kolang-kaling, kacang tanah, dan juga potongan roti.", "https://cdn.idntimes.com/content-images/community/2018/08/3187e478b1ded978280cab82ded10846_600x400.jpg", "12.000"},
            {"Es Teh Manis", "Minuman khas Indonesia selanjutnya ini berasal dari Keraton Yogyakarta dan dikenal dengan nama Wedang Secang. Nama minuman ini sendiri didapatkan dari salah satu bahannya yakni kayu secang, bahan yang juga memberikan warna merah khas pada minuman tradisional satu ini.", "https://faktualnews.co/images/2018/12/Es-teh.jpg", "5.000"},
    };

    public static ArrayList<Drink> getListData() {
        ArrayList<Drink> list = new ArrayList<>();
        for (String[] aData : data) {
            Drink drink = new Drink();
            drink.setName(aData[0]);
            drink.setDesc(aData[1]);
            drink.setPhoto(aData[2]);
            drink.setHarga(aData[3]);
            list.add(drink);
        }

        return list;
    }
}