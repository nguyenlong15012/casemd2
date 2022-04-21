package service.Song;

import config.ConfigReadAndWriteFile;
import model.Song;
import model.SongName;

import java.util.List;

public class ISongServiceIMPL implements ISongService {
    public static String PATH_SONG = ConfigReadAndWriteFile.PATH+"song.txt";
    public static List<Song> songList = new ConfigReadAndWriteFile<Song>().readFromFile(PATH_SONG);
    @Override
    public List<Song> findAll() {
        new ConfigReadAndWriteFile<Song>().writeToFile(PATH_SONG, songList);
        return songList;
    }

//    @Override
//    public void save(Object o) {
//
//    }

    @Override
    public void save(Song song) {
        songList.add(song);
        new ConfigReadAndWriteFile<Song>().writeToFile(PATH_SONG, songList);
    }

    @Override
    public Song findBySongName(SongName songName) {
        for (int i = 0; i < songList.size(); i++) {
            if (songName.equals(songList.get(i).getTenCD())){
                return songList.get(i);
            }
        }
        return null;
    }


}
