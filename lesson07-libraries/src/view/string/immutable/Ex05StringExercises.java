package view.string.immutable;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex05StringExercises {
	public static void main(String[] args) {
		/*
		 Viết chương trình in ra danh sách bài nhạc mp3 có trong thư mục múic
		 String [] = arrStr = {bh1, bh2, bh3}
		 
		 output:
		 Danh sách bài hát mp3 trong thư mục d:/music gồm:
		 	1.something you like
		 	2.foreoverandone
		 	
		 */
		
		String [] songs = {
				"d/music/somthingyoulike.mp3",
				"d/music/foreoverandone.mp3",
				"d/music/takemetoyouheart.mov"
		};
		songs = getMp3Songs(songs);
		printf(songs);
	}
	
	private static String[] getMp3Songs(String[] songs) {
		String[] result = new String[songs.length];
		int count = 0;
		for(int i = 0; i < songs.length; i++) {
			if(songs[i].endsWith(".mp3")) {
				int lastSlashIndex = songs[i].lastIndexOf("/");
				int lastDotIndex = songs[i].lastIndexOf(".");
				String name = songs[i].substring(lastSlashIndex + 1, lastDotIndex);
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
