package service.Album;

import config.ConfigReadAndWriteFile;
import model.Album;
import model.AlbumF1;

import java.util.List;

public class IAlbumServiceIMPL implements IAlbumService{
    public static String PATH_ALBUM = ConfigReadAndWriteFile.PATH+"album.txt";
    public static List<AlbumF1> albumF1List = new ConfigReadAndWriteFile<AlbumF1>().readFromFile(PATH_ALBUM);
    @Override
    public List<AlbumF1> findAll() {
        new ConfigReadAndWriteFile<AlbumF1>().writeToFile(PATH_ALBUM, albumF1List, );
        return albumF1List;
    }

    @Override
    public void save(AlbumF1 albumF1) {
        albumF1List.add(albumF1);
    }

    @Override
    public Album finByAlbumName(AlbumF1 albumF1) {
        return null;
    }



//    @Override
//    public void save(Album album) {
//        albumList.add(album);
//        new ConfigReadAndWriteFile<Album>().writeToFile(PATH_ALBUM, albumList);
//    }

//    @Override
//    public Album finByAlbumName(AlbumF1 albumF1) {
//        for (int i = 0; i < albumList.size(); i++) {
//            if (albumF1.equals(albumList.get(i).getTenAlbum())){
//                return albumList.get(i);
//            }
//        }
//        return null;
//    }

}
