/**
 * 
 */
package BT4;
 
/**
 * @author lethanhtam
 *
 */
public class ConsBook implements IBook {
	private ABook first;
	private IBook rest;

	public ConsBook(ABook first, IBook rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Literary: " + this.first.toString() + "\n\n" + this.rest.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof ConsBook)) {
			return false;
		} else {
			ConsBook that = (ConsBook) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}

	@Override
	public IBook thisAuthor(String authorName) {
		// TODO Auto-generated method stub
		if (this.first.sameAuthor(authorName)) {
			return new ConsBook(this.first, this.rest.thisAuthor(authorName));
		} else {
			return this.rest.thisAuthor(authorName);
		}
	}
	
	

	@Override
	public IBook softByTitle() {
		// TODO Auto-generated method stub
		return this.rest.softByTitle().inserInTitleOrther(this.first);
	}

	@Override
	public IBook inserInTitleOrther(ABook b) {
		// TODO Auto-generated method stub
		if(b.softByOrther(b)) {
			return new ConsBook(b, this);
		}else {
			return new ConsBook(this.first, this.rest.inserInTitleOrther(b));
		}
	}

}
