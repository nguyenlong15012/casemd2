package dto;

public class AlbumDTO {
    private String tenAlbum;
    private String caSiAlbum;

    public AlbumDTO() {
    }

    public AlbumDTO(String tenAlbum, String caSiAlbum) {
        this.tenAlbum = tenAlbum;
        this.caSiAlbum = caSiAlbum;
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

    @Override
    public String toString() {
        return "AlbumDTO{" +
                "tenAlbum='" + tenAlbum + '\'' +
                ", caSiAlbum='" + caSiAlbum + '\'' +
                '}';
    }
}
