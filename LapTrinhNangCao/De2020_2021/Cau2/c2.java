package Cau2;

import java.util.ArrayList;
import java.util.List;

public class c2 {
	List<ArtObject> listArt = new ArrayList<ArtObject>();

	public c2(List<ArtObject> listArt) {
		this.listArt = listArt;
		listArt.add(new Painting("heheh", 22, "ss", "ss", "s"));
	}
	
}
