package com.iqbal.ayolah;

public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.1.6/mahasiswafinal/tambahMhs.php";
    public static final String URL_GET_ALL = "http://192.168.1.6/mahasiswafinal/tampilSemuaMhs.php";
    public static final String URL_GET_MHS = "http://192.168.1.6/mahasiswafinal/tampilMhs.php?id=";
    public static final String URL_UPDATE_MHS = "http://192.168.1.6/mahasiswafinal/updateMhs.php";
    public static final String URL_DELETE_MHS = "http://192.168.1.6/mahasiswafinal/hapusMhs.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_MHS_ID = "id";
    public static final String KEY_MHS_NAMA = "nama";
    public static final String KEY_MHS_KELAS = "kelas"; //desg itu variabel untuk posisi
    public static final String KEY_MHS_ALAMAT = "alamat"; //salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_KELAS = "kelas";
    public static final String TAG_ALAMAT = "alamat";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String MHS_ID = "mhs_id";

}
