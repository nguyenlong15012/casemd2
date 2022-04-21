package service.Album;

import model.Album;
import model.AlbumF1;
import service.IServiceGeneric;

import java.util.List;

public interface IAlbumService extends IServiceGeneric<AlbumF1> {

    //    @Override
//    void save(Album album);

    Album finByAlbumName(AlbumF1 albumF1);
}
