package view.string.immutable;

import java.util.Arrays;

public class Ex05StringExercises {
	
	public static void main(String[] args) {
		String[] songs = {
				"d:/music/somethingyoulike.mp3",
				"d:/music/foreveralone.mp3",
				"d:/music/takemetoyourheart.mp3"};
		
		String[] mp3 = getMp3Song(songs);
		print(mp3);
		
	}
	
	private static String[] getMp3Song(String[] songs) {
		String[] result = new String[songs.length];
		int count = 0;
		for (String s : songs) {
			if (s.endsWith(".mp3")) {
				int lastSlashIndex = s.lastIndexOf("/");
				int lastDotIndex = s.lastIndexOf(".");
				String name = s.substring(lastSlashIndex + 1, lastDotIndex);
				result[count++] = name;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void print(String[] elements) {
		for(int i = 0; i < elements.length; i++) {
			System.out.println((i + 1) + ". " + elements[i]);
		}
	}
}
