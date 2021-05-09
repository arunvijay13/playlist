package Playlist;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Album album = new Album();

    public static void main(String[] args) {

        int choice;
        boolean quit = false;
        printChoice();
        while (!quit){
            System.out.println("enter the choice");
            choice = scanner.nextInt();
            scanner.nextLine();  // neglect newline

            switch (choice){
                case 1:
                    printChoice();
                    break;
                case 2:
                    createAlbum();
                    break;
                case 3:
                    album.createPlaylist();
                    break;
                case 4:
                    addSongToPlaylist();
                    break;
                case 5:
                    album.listPlaylistSong();
                    break;
                case 6:
                    album.skipForward();
                    break;
                case 7:
                    album.skipBackward();
                    break;
                case 8:
                    album.replayCurrentSong();
                    break;
                case 9:
                    album.removeCurrentSong();
                    break;
                case 10:
                    quit = true;
                    break;
            }
        }
    }

    public static void printChoice(){
        System.out.println("choose 1 for display choice\n" +
                "choose 2 for create album\n" +
                "choose 3 for create playlist\n" +
                "choose 4 for add song to playlist\n" +
                "choose 5 for list song in playlist\n" +
                "choose 6 for skip forward\n" +
                "choose 7 for skip backward\n" +
                "choose 8 for replay current song\n" +
                "choose 9 for remove current song\n" +
                "choose 10 for quit\n");
    }

    public static void createAlbum(){
        System.out.println("enter song name");
        String song = scanner.nextLine();
        System.out.println("enter the minutes");
        int minutes = scanner.nextInt();

        album.addAlbum(song,minutes);
    }

    public static void addSongToPlaylist(){
        System.out.println("enter the song name");
        String name = scanner.nextLine();
        album.addPlaylist(name);
    }
}
