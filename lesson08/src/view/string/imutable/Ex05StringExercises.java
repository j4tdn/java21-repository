package view.string.imutable;

import java.util.Arrays;

public class Ex05StringExercises {
	public static void main(String[] args) {
			
		String[] songs = { 
				"d:/music/somthingyoulike.mp3",
				"d:/music/somthingyoulike2.mp3",
				"d:/music/somthingyoulike.mov"
		};
		String[] mp3songs = getMp3Song(songs);
		System.out.println(mp3songs);
		
	}
	private static String[] getMp3Song(String[] songs) {
		String[] result = new String[songs.length];
		int count =0;
		for(String song : songs) {
			if(song.endsWith(".mp3")) {
				int lastSlashIndex = song.lastIndexOf("/");
				int lastDotIndex = song.lastIndexOf(".");
				String name = song.substring(lastSlashIndex +1, lastDotIndex);
				result[count++] = name;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
