package udemy.com;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name,artist;
    private ArrayList<Song> songs;

    public Album(String name,String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title,double duration){
        Song check = findSong(title);
        if (check==null){
            Song sng = new Song(title,duration);
            songs.add(sng);
            return true;

        }
        return false;
    }

    private static Song findSong(String title){
        for (Song checkedSong : songs){
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int num, LinkedList<Song> playlist){
        int index = num - 1;
        if ((index>=0) &&(index<=songs.size())){
            playlist.add(songs.get(num));
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if (checkedSong!=null){
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }
}