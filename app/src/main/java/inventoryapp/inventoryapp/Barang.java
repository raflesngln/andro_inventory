package inventoryapp.inventoryapp;

/**
 * Created by Rafles Nainggolan on 6/29/2016.
 * This is model barang
 */
public class Barang {
    private long id;
    private String nama_barang;
    private String merk_barang;
    private String harga_barang;

    public barang(){

    }
    //return id
    public long getId(){
        return id;
    }
    //set id
    public setId(long id){
        this.id=id;
    }
    //return nama
    public long getNama_barang(){
        return nama_barang;
    }
    //set nama
    public setId(String nama_barang){
        this.nama_barang=nama_barang;
    }
    //return merk
    public long getMerk_barang(){
        return merk_barang;
    }
    //set merk
    public setMerk_barang(String merk_barang){
        this.merk_barang=merk_barang;
    }
    //return harga
    public long getHarga_barang(){
        return harga_barang;
    }
    //set harga
    public setHarga_barang(String harga_barang){
        this.harga_barang=harga_barang;
    }

    @Override
    public String toString() {
        return " Barang "+ nama_barang + " " + merk_barang + " " + harga_barang + "";
    }
}
