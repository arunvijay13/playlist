package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

    private final ArrayList<Song> albumList;
    private LinkedList<Song> playList;
    private ListIterator<Song> list;
    private boolean moveForward;

    public Album() {
        this.albumList = new ArrayList<>();
        this.moveForward = true;
    }

    public void createPlaylist(){
        playList = new LinkedList<>();
        System.out.println("playlist is created, add song:)");
    }

    public void addAlbum(String name,int minutes){
        if(isFound(name) != -1){
            System.out.println("song already added to the album");
        }else{
            albumList.add(new Song(name,minutes));
            System.out.println("song added to the album");
        }
    }

    public void addPlaylist(String name){
        int position = isFound(name);
        boolean isExist = playList.indexOf(albumList.get(position)) == 0;
        if(position != -1 ){
            if(!isExist){
                playList.add(albumList.get(position));
                list = playList.listIterator();
                System.out.println("song successfully added to the playlist");
            }else{
                System.out.println("song already added to the playlist");
            }
        }else{
            System.out.println("song not in the album list");
        }
    }

    public void listPlaylistSong(){
        if(playList.size() == 0){
            System.out.println("list empty add song to the playlist");
        }else{
            System.out.println("list of songs:");
            for(Song s:playList){
                System.out.println("song name "+ s.getTitle()
                        +" minutes "+ s.getMinutes() );
            }
        }
    }

    public void replayCurrentSong(){
        if(moveForward){
            if(list.hasNext()){
                System.out.println("song " + list.next().getTitle() + " replayed");
            }else{
                System.out.println("Reached end of the song");
                moveForward = false;
            }
        }else{
            if(list.hasPrevious()){
                System.out.println("song " + list.previous().getTitle() + " replayed");
            }else{
                System.out.println("Reached start of the song");
                moveForward = true;
            }
        }


    }

    public void removeCurrentSong(){

        if(list.hasNext()){
            System.out.println("song "+list.next().getTitle()+" removed");
            list.remove();
        }else if(list.hasPrevious()){
            System.out.println("song "+list.previous().getTitle()+" removed");
            list.remove();
        }else{
            System.out.println("playList is empty");
        }
    }

    public void skipForward(){
        if(!moveForward){
            if(list.hasNext()){
                list.next();
            }
            moveForward = true;
        }
        if(list.hasNext()){
            System.out.println("song " + list.next().getTitle() + " skipped");
        }else{
            System.out.println("Reached end of the song");
            moveForward = false;
        }
    }

    public void skipBackward(){
        if(moveForward){
           if(list.hasPrevious()){
               list.previous();
           }
           moveForward = false;
        }
        if(list.hasPrevious()){
            System.out.println("song " + list.previous().getTitle() + " skipped");
        }else{
            System.out.println("Reached start of the song");
            moveForward = true;
        }
    }

    private int isFound(String name){
        for(int i=0;i<albumList.size();i++){
            if(albumList.get(i).getTitle().equals(name)){
                return i;
            }
        }
        return -1;
    }



}
