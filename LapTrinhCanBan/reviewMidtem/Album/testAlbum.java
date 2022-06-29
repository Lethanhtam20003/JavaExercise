package Album;

import EX3_4.ClockTime;
import junit.framework.TestCase;

public class testAlbum extends TestCase {
	public void testConstructor() {

		MusicItem m1 = new MusicItem(new Song("khát vộng", "Phạm Minh Tuấn", "cách mạng"),
				new SourceFile("khatvong.mp3", 5043, new clockTime(4, 48), 15350), "Quang dũng");

		MusicItem m2 = new MusicItem(new Song("Nơi anh gặp em", "Hoàng Điệp", "Trữ tình"),
				new SourceFile("noigapem.mp3", 4230, new clockTime(4, 12), 2651), "Quang dũng,Mỹ tâm");

		MusicItem m3 = new MusicItem(new Song("Con đường có lá me bay", "Hoàng Điệp", "Cách Mạng"),
				new SourceFile("mebay.mp3", 5130, new clockTime(4, 36), 198), "Quang dũng");

		MusicItem m4 = new MusicItem(new Song("sao biển", "Phạm Minh Tuấn", "Trữ tình"),
				new SourceFile("saobien.mp3", 48711, new clockTime(4, 17), 5361), "Quang dũng");

		MTMusicItem empty = new MTMusicItem();
		ConsMusicItem c1 = new ConsMusicItem(m1,
				new ConsMusicItem(m2, new ConsMusicItem(m3, new ConsMusicItem(m4, empty))));

		Album a1 = new Album("Con đường có lá me bay", 2021, c1, "Quang dũng");

		// ss
		MusicItem n1 = new MusicItem(new Song("Nắm lấy tay anh", "Tú NGuyễn", "trữ tình"),
				new SourceFile("namlay.mp3", 5011, new clockTime(4, 30), 32917), "tuấn hưng");

		MusicItem n2 = new MusicItem(new Song("Người yêu tuyệt vời", "Trịnh thăng Bình", "Trữ tình"),
				new SourceFile("nguoiyeutv.mp3", 6110, new clockTime(5, 12), 1221), "Trịnh Thăng Bình");

		MusicItem n3 = new MusicItem(new Song("Anh Sợ Mất em", "OnlyC - Jongkay", "trữ tinh"),
				new SourceFile("ánhomatem.mp3", 4120, new clockTime(4, 13), 59210), "the man");

		MusicItem n4 = new MusicItem(new Song("Anh nhơ người yêu cũ", "khánh Đơn", "Trữ tình"),
				new SourceFile("nhonguoiyeucu.mp3", 4320, new clockTime(4, 45), 3592), "Nam Vương M4U");

		MusicItem n5 = new MusicItem(new Song("Lời hứa chỉ la lời hứa", "Bình nguyên", "Trữ tình"),
				new SourceFile("chilaloihua.mp3", 4350, new clockTime(4, 20), 35361), "Nam Du");

		ConsMusicItem c2 = new ConsMusicItem(n1,
				new ConsMusicItem(n2, new ConsMusicItem(n3, new ConsMusicItem(n4, new ConsMusicItem(n5, empty)))));

		Album a2 = new Album("Top Bài hát Việt Nam",0, c2,null);
		System.out.println(a1+"\n\n\n"+a2);
	}

	MusicItem m1 = new MusicItem(new Song("khát vộng", "Phạm Minh Tuấn", "cách mạng"),
			new SourceFile("khatvong.mp3", 5043, new clockTime(4, 48), 15350), "Quang dũng");

	MusicItem m2 = new MusicItem(new Song("Nơi anh gặp em", "Hoàng Điệp", "Trữ tình"),
			new SourceFile("noigapem.mp3", 4230, new clockTime(4, 12), 2651), "Quang dũng,Mỹ tâm");

	MusicItem m3 = new MusicItem(new Song("Con đường có lá me bay", "Hoàng Điệp", "Cách Mạng"),
			new SourceFile("mebay.mp3", 5130, new clockTime(4, 36), 198), "Quang dũng");

	MusicItem m4 = new MusicItem(new Song("sao biển", "Phạm Minh Tuấn", "Trữ tình"),
			new SourceFile("saobien.mp3", 5361, new clockTime(4, 17), 48711), "Quang dũng");

	MTMusicItem empty = new MTMusicItem();
	ConsMusicItem c1 = new ConsMusicItem(m1,
			new ConsMusicItem(m2, new ConsMusicItem(m3, new ConsMusicItem(m4, empty))));

	Album a1 = new Album("Con đường có lá me bay", 2021, c1, "Quang dũng");

	public void testMoreFavoriteThan() {
		assertEquals(m1.moreFavoriteThan(m2), true);
		assertEquals(m2.moreFavoriteThan(m1), false);
	}

	public void testLongerThan() {
		assertEquals(m1.longerThan(m2), true);
		assertEquals(m2.longerThan(m1), false);
	}

	public void testFavoriteRate() {
		assertEquals(m1.favouriteRate(), "Phổ Biến");
		assertEquals(m4.favouriteRate(), "Hot");
		assertEquals(m3.favouriteRate(), "");
	}
	public void testHowMany() {
		assertEquals(a1.howMany(), 4);
	}
	public void testTotalTime() {
		//assertEquals(a1.totalTime(), new ClockTime(17, 53));
		assertEquals(a1.totalTime(), 1073);
	}
	public void testThisAuthor() {
		System.out.println(a1.thisAuthor("Hoàng Điệp"));
	}
	public void testSoftByTime() {
		System.out.println("s");
		System.out.println(a1.softByTime());
	}
	
}
