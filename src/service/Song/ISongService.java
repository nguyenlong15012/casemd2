package service.Song;

import model.Song;
import model.SongName;
import service.IServiceGeneric;

public interface ISongService extends IServiceGeneric<Song> {
    void save(Song song);
    Song findBySongName(SongName songName);
}
