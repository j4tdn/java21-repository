package file.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {

	public static void main(String[] args) {

		FileUtils.createNewFile("wdata/winventory.txt");

		System.out.println("... Finished ...");

	}

}