package view;

import controller.SongController;
import model.Album;

import java.util.Scanner;

public class ListMusic {
    SongController songController = new SongController();
    Scanner sc = new Scanner(System.in);
    public void ListSongView(){
        System.out.println(songController.showListSong());
        System.out.println("Enter 'quit' back to ListAlbum: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")){
            new ListAlbum();
        }
    }
}
