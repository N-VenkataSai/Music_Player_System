package com.musicplayer;

import java.util.Scanner;

public class MusicPlayerSystemTest {
	
	public static void main(String[] args) {
		
		MusicPlayer mp = new MusicPlayer();
		Scanner sc = new Scanner(System.in);
		while (true) {

            System.out.println("\n========= MUSIC PLAYER MENU =========");
            System.out.println("1. Add New Song");
            System.out.println("2. Update Existing Song");
            System.out.println("3. Delete Song");
            System.out.println("4. Display All Songs");
            System.out.println("5. Create New Playlist");
            System.out.println("6. Add Song to Playlist");
            System.out.println("7. Display All Playlists");
            System.out.println("8. Display Songs in Playlist");
            System.out.println("9. Play Song in Playlist");
            System.out.println("10. Pause Song in Playlist");
            System.out.println("11. Stop Song in Playlist");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Song ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();

                    System.out.print("Enter Duration: ");
                    int duration = sc.nextInt();
                    sc.nextLine();

                    Song s = new Song(id, title, artist, duration);
                    mp.addSongs(s);
                    break;

                case 2:
                    System.out.print("Enter existing Song Name: ");
                    String oldName = sc.nextLine();

                    System.out.print("Enter new Song ID: ");
                    int newId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new Song Title: ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter new Artist: ");
                    String newArtist = sc.nextLine();

                    System.out.print("Enter new Duration: ");
                    int newDuration = sc.nextInt();
                    sc.nextLine();

                    Song newSong = new Song(newId, newTitle, newArtist, newDuration);
                    mp.updateSong(oldName, newSong);
                    break;

                case 3:
                    System.out.print("Enter Song Name to delete: ");
                    String delName = sc.nextLine();
                    mp.deleteSong(delName);
                    break;

                case 4:
                    mp.displayAllSongs();
                    break;

                case 5:
                    System.out.print("Enter Playlist Name: ");
                    String plName = sc.nextLine();
                    mp.createPlayList(plName);
                    break;

                case 6:
                    System.out.print("Enter Playlist Name: ");
                    String pName = sc.nextLine();

                    System.out.print("Enter Song ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    mp.addSongToPlaylist(pName, sid);
                    break;

                case 7:
                    mp.displayAllPlayList();
                    break;

                case 8:
                    System.out.print("Enter Playlist Name: ");
                    String dspName = sc.nextLine();

                    Playlist p1 = mp.getPlayList(dspName);
                    if (p1 != null) {
                        p1.displaySongs();
                    } else {
                        System.out.println("Playlist not found");
                    }
                    break;

                case 9:
                    System.out.print("Enter Playlist Name: ");
                    String playName = sc.nextLine();

                    System.out.print("Enter Song ID: ");
                    int playId = sc.nextInt();
                    sc.nextLine();

                    Playlist p2 = mp.getPlayList(playName);
                    if (p2 != null) {
                        p2.play(playId);
                    } else {
                        System.out.println("Playlist not found");
                    }
                    break;

                case 10:
                    System.out.print("Enter Playlist Name: ");
                    String pauseName = sc.nextLine();

                    System.out.print("Enter Song ID: ");
                    int pauseId = sc.nextInt();
                    sc.nextLine();

                    Playlist p3 = mp.getPlayList(pauseName);
                    if (p3 != null) {
                        p3.pause(pauseId);
                    } else {
                        System.out.println("Playlist not found");
                    }
                    break;

                case 11:
                    System.out.print("Enter Playlist Name: ");
                    String stopName = sc.nextLine();

                    System.out.print("Enter Song ID: ");
                    int stopId = sc.nextInt();
                    sc.nextLine();

                    Playlist p4 = mp.getPlayList(stopName);
                    if (p4 != null) {
                        p4.stop(stopId);
                    } else {
                        System.out.println("Playlist not found");
                    }
                    break;

                case 12:
                    System.out.println("Exiting Music Player...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
	}

}
