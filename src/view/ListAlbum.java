package view;

import controller.AlbumController;
import service.Album.IAlbumServiceIMPL;

import java.util.Scanner;

public class ListAlbum {
    Scanner sc = new Scanner(System.in);
        AlbumController albumController = new AlbumController();
    public ListAlbum(){
        System.out.println(albumController.showListAlbum());
       // System.out.println(IAlbumServiceIMPL.albumList);
        System.out.println("Enter 'quit' back to Menu: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
