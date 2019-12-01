package com.azhar.myshop.util;

import com.azhar.myshop.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Azhar Rivaldi on 01/12/2019.
 */

public class Constant {
    public static Map<Integer, String> _gayahidup = new HashMap<Integer, String>() {{
        put(R.drawable.ic_cat8, "Fashion Wanita");
        put(R.drawable.ic_cat11, "Fashion Pria");
        put(R.drawable.ic_cat19, "Fashion Muslim");
        put(R.drawable.ic_cat4, "Fashion Anak");
        put(R.drawable.ic_cat2, "Kecantikan");
        put(R.drawable.ic_cat24, "Rumah Tangga");
        put(R.drawable.ic_cat20, "Kesehatan");
        put(R.drawable.ic_cat33, "Olahraga");
        put(R.drawable.ic_cat22, "Otomotif");
        put(R.drawable.ic_cat18, "Dapur");
    }};
    public static Map<Integer, String> _teknologi = new HashMap<Integer, String>() {{
        put(R.drawable.ic_cat0, "Handphone & Tablet");
        put(R.drawable.ic_cat31, "Laptop & Aksesoris");
        put(R.drawable.ic_cat6, "Komputer & Aksesoris");
        put(R.drawable.ic_cat15, "Elektronik");
        put(R.drawable.ic_cat28, "Kamera");
        put(R.drawable.ic_cat34, "Software");
    }};
    public static Map<Integer, String> _catlain = new HashMap<Integer, String>() {{
        put(R.drawable.ic_cat3, "Mainan & Hobi");
        put(R.drawable.ic_cat37, "Makanan & Minuman");
        put(R.drawable.ic_cat14, "Ibu & Bayi");
        put(R.drawable.ic_cat16, "Souvenir, Kado & Hadiah");
        put(R.drawable.ic_cat5, "Office & Stationery");
        put(R.drawable.ic_cat22, "Buku");
        put(R.drawable.ic_cat23, "Film, Musik & Game");
        put(R.drawable.ic_cat1, "Produk Lainnya");
    }};
    public static Map<Integer, String> _pembayaran = new HashMap<Integer, String>() {{
        put(R.drawable.ic_cat25, "Saldo My Shop");
        put(R.drawable.ic_cat30, "BPJS");
        put(R.drawable.ic_cat13, "Pulsa");
        put(R.drawable.ic_cat36, "Voucher Game");
        put(R.drawable.ic_cat7, "Angsuran Kredit");
        put(R.drawable.ic_cat21, "Donasi");
        put(R.drawable.ic_cat17, "Pascabayar");
        put(R.drawable.ic_cat32, "Tiket Kereta Api");
        put(R.drawable.ic_cat10, "Listrik PLN");
        put(R.drawable.ic_cat29, "Paket Data");
        put(R.drawable.ic_cat9, "Kartu Kredit");
        put(R.drawable.ic_cat26, "Air PDAM");
        put(R.drawable.ic_cat27, "TV Kabel");
        put(R.drawable.ic_cat35, "Telepon");
    }};
    public static Map<String, Map<Integer, String>> cards = new HashMap<String, Map<Integer, String>>() {{
        put("Gaya Hidup", _gayahidup);
        put("Teknologi", _teknologi);
        put("Kategori Lain", _catlain);
        put("Pembayatan & Top Up", _pembayaran);
    }};
}
