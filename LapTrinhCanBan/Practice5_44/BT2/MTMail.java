package BT2;
 
public class MTMail implements IMail {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof MTMail)) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public IMail softByDate() {
		// TODO Auto-generated method stub
		return new MTMail();
	}

	@Override
	public IMail insertInDateOrther(MessagesMail m) {
		// TODO Auto-generated method stub
		return new ConsMail(m, new MTMail());
	}

}
