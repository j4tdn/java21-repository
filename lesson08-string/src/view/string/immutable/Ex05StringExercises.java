package view.string.immutable;

import java.util.Arrays;

public class Ex05StringExercises {
	public static void main(String[] args) {
		String[] songs = { "somthingyoulike.mp3", "foreoverandone.mp3", "taketoyourheart.mov" };
		String[] mp3Songs = { "somthingyoulike.mp3", "foreoverandone.mp3", "taketoyourheart.mov" };
		printf(mp3Songs);
	}

	private static String[] getMp3Songs(String[] songs) {
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

	private static void printf(String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			System.out.println((i + 1 + "." + elements[i]));
		}

	}
}
