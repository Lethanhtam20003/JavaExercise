package Ex5_2;


public class Entry {
	private Date date;
	private double distanse;
	private int duration;
	private String comment;
	public Entry(Date date, double distanse, int duration, String comment) {
		super();
		this.date = date;
		this.distanse = distanse;
		this.duration = duration;
		this.comment = comment;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Date: "+ this.date +"       "+ this.distanse+"(km)   "+ this.duration +" (minute)    "+"\n"+ "Comment:  "+this.comment;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Entry)) {
			return false;
		}else {
			Entry that = (Entry)obj;
			return this.date.equals(that.date) 
					&& this.distanse == that.distanse 
					&& this.duration == that.duration
					&& this.comment.equals(that.comment);
		}
	}
}
