package view;

import controller.AlbumController;
import dto.AlbumDTO;
import service.Album.IAlbumServiceIMPL;

import java.util.Scanner;

public class AddAlbumView {
    Scanner sc = new Scanner(System.in);
    AlbumController albumController = new AlbumController();
    public AddAlbumView(){
        System.out.println("======Thêm Bài Hát======");
        System.out.println("Nhap tên Album: ");
        String name = sc.nextLine();
        System.out.println("Nhap tên Ca Si Album: ");
        String casi = sc.nextLine();
//        AlbumDTO albumDTO = new AlbumDTO(name, casi);
//        albumController.writeToAlbum(albumDTO);
//albumController.showListAlbum();
    }
}
