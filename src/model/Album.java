package model;

public class Album {
    private int id;
    private String tenAlbum;
    private String caSiAlbum;
    private String hinhAnhAlbum;

    public Album() {
    }

    public Album(int id, String tenAlbum, String caSiAlbum, String hinhAnhAlbum) {
        this.id = id;
        this.tenAlbum = tenAlbum;
        this.caSiAlbum = caSiAlbum;
        this.hinhAnhAlbum = hinhAnhAlbum;
    }

    public Album(int id, String tenAlbum, String caSiAlbum) {
        this.id = id;
        this.tenAlbum = tenAlbum;
        this.caSiAlbum = caSiAlbum;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenAlbum() {
        return tenAlbum;
    }

    public void setTenAlbum(String tenAlbum) {
        this.tenAlbum = tenAlbum;
    }

    public String getCaSiAlbum() {
        return caSiAlbum;
    }

    public void setCaSiAlbum(String caSiAlbum) {
        this.caSiAlbum = caSiAlbum;
    }

    public String getHinhAnhAlbum() {
        return hinhAnhAlbum;
    }

    public void setHinhAnhAlbum(String hinhAnhAlbum) {
        this.hinhAnhAlbum = hinhAnhAlbum;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", tenAlbum='" + tenAlbum + '\'' +
                ", caSiAlbum='" + caSiAlbum + '\'' +
                ", hinhAnhAlbum='" + hinhAnhAlbum + '\'' +
                '}';
    }

    public void hienThiAlbum() {
        System.out.printf("%-10d %-20s %-20s %-10d \n", id, tenAlbum, caSiAlbum, hinhAnhAlbum);
    }
}
