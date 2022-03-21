package Ex8_1;

public class MTLogRuner implements ILogRuner {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public ILogRuner sapXepTheokhoanCach() {
		// TODO Auto-generated method stub
		return new MTLogRuner();
	}

	@Override
	public ILogRuner chenTheoThuTuKhoanCach(Entry e) {
		// TODO Auto-generated method stub
		return new ConsLogRuner(e, new MTLogRuner());
	}
}
