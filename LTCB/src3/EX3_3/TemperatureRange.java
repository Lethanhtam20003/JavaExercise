package EX3_3;

public class TemperatureRange {
	private int low;
	private int high;

	public TemperatureRange(int low, int high) {
		this.low = low;
		this.high = high;
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}
	/**
	 *  insideRange, xác định xem mức cao và thấp của ngày hôm nay có nằm
	 *  trong phạm vi bình thường hay không;
	 *  
	 * @param that
	 * @return
	 */
	public boolean withinRange(TemperatureRange that) {
		return this.low >= that.low && this.high <= that.high;
	}
	/**
	 * recordDay, xác định xem nhiệt độ hôm nay phá kỷ lục cao hay thấp.
	 * @param that
	 * @return
	 */
	public boolean recordDay(TemperatureRange that) {
		return this.low < that.low || this.high > that.high;
	}
}
