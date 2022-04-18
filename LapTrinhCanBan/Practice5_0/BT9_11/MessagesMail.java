package BT9_11;
 
public class MessagesMail {
	private String from;
	private String To;
	private String Addrest;
	private Date date;
	private String messages;
	public MessagesMail(String from,String To,String addrest, Date date, String messages) {
		super();
		this.from =from;
		this.To = To;
		Addrest = addrest;
		this.date = date;
		this.messages = messages;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "To: "+this.To+"\n From: "+this.from+"\n Addrest: "+ this.Addrest +"\n"+ "date: "+this.date.toString()+"\n messages: "+ this.messages;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof MessagesMail)) {
			return false;
		}else {
			MessagesMail that = (MessagesMail)obj;
			return this.Addrest==that.Addrest && this.date.equals(that.date) && this.messages.equals(that.messages);
		}
	}
	public boolean hasDateOrtherThan(MessagesMail that) {
		// TODO Auto-generated method stub
		return this.date.hasDateOrtherThen(that.date);
	}

}
