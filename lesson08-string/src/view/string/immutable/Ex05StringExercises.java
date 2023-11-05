package view.string.immutable;

import java.util.Arrays;

public class Ex05StringExercises {

	public static void main(String[] args) {
		
		String[] songs = {
				"d:/music/somethingyoulike.mp3",
				"d:/music/foreoverandone.mp3",
				"d:/music/takemetoyourheart.mov"
		};
		
		String[] mp3Songs = getMp3Songs(songs);
		printf(mp3Songs);
	}
	
	private static String[] getMp3Songs(String[] songs) {
		
		String[] result = new String[songs.length];
		int count = 0;
		for(String song:songs) {
			if(song.endsWith(".mp3")) {
				int lastSlashIndex = song.lastIndexOf("/");
				int lastDotIndex = song.lastIndexOf(".");
				String name = song.substring(lastSlashIndex + 1, lastDotIndex);
				result[count++] = name;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
		
	}
	
	private static void printf(String[] elements) {
		for(int i = 0; i < elements.length; i++) {
			System.out.println((i+1) + ". " + elements[i]);
		}
	}
}
