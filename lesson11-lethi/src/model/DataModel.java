package model;

import java.util.ArrayList;
import java.util.List;

import bean.CD;

public class DataModel {

	public DataModel() {
	}

	public static List<CD> cdList() {
        List<CD> cds = new ArrayList<>();
        cds.add(new CD(1, "Rock", "Singer1", 12, 15.99d));
        cds.add(new CD(2, "Jazz", "Singer2", 5, 10d));
        cds.add(new CD(3, "Rap", "Singer3", 8, 13.33d));
        cds.add(new CD(4, "Bolero", "Singer4", 10, 12d));
        cds.add(new CD(5, "Classical", "Singer5", 15, 14.56d));
        return cds;
    }

}
