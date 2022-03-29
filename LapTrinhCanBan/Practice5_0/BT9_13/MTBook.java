/**
 * 
 */
package BT9_13;


/**
 * @author lethanhtam
 *
 */
public class MTBook implements IBook {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof MTBook)) {
			return false;
		}else {
			
		return true;
		}
	}
	@Override
	public IBook thisAuthor(String authorName) {
		// TODO Auto-generated method stub
		return new MTBook();
	}
	@Override
	public IBook softByTitle() {
		// TODO Auto-generated method stub
		return new MTBook();
	}
	@Override
	public IBook inserInTitleOrther(ABook b) {
		// TODO Auto-generated method stub
		return new ConsBook(b, new MTBook());
	}
	
}
