package EX3_3;


public class WeatherRecord {
	private Date d;
	private TemperatureRange today;
	private TemperatureRange nomal;
	private TemperatureRange record;
	private double precipitation;

	/**
	 * @param d : ngay
	 * @param today  : hom nay 
	 * @param nomal : muc bing thuong 
	 * @param record : ky luc
	 * @param precipitation : luong mua
	 */
	public WeatherRecord(Date d, TemperatureRange today, TemperatureRange nomal, TemperatureRange record,
			double precipitation) {
		this.d = d;
		this.today = today;
		this.nomal = nomal;
		this.record = record;
		this.precipitation = precipitation;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public TemperatureRange getToday() {
		return today;
	}

	public void setToday(TemperatureRange today) {
		this.today = today;
	}

	public TemperatureRange getNomal() {
		return nomal;
	}

	public void setNomal(TemperatureRange nomal) {
		this.nomal = nomal;
	}

	public TemperatureRange getRecord() {
		return record;
	}

	public void setRecord(TemperatureRange record) {
		this.record = record;
	}

	public double getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}
	/**
	 *  insideRange, xác định xem mức cao và thấp của ngày hôm nay có nằm
	 *  trong phạm vi bình thường hay không;
	 *Date d = new Date (11,04,2003);
		
	 *TemperatureRange t1 = new TemperatureRange(23,32);
	 *TemperatureRange t12 = new TemperatureRange(11,32);
	 *TemperatureRange t2 = new TemperatureRange(22,33);
	 *TemperatureRange t3 = new TemperatureRange(12,40);
		
	 *WeatherRecord w1 = new WeatherRecord(d,t1,t2,t3,1500);
	 *WeatherRecord w2 = new WeatherRecord(d,t12,t2,t4,1500);
	 
	 *assertEquals(w1.withinRange(),true);
	 *assertEquals(w2.winthinRange(),false);
	 * @param that
	 * @return
	 */
	public boolean withinRange() {
		return this.today.withinRange(this.record);
	}
	/**
	 *RainDay, xác định liệu lượng mưa có cao hơn một số giá trị
	 *nhất định hay không;
	 *Date d = new Date (11,04,2003);
		
	 *TemperatureRange t1 = new TemperatureRange(23,32);
	 *TemperatureRange t2 = new TemperatureRange(22,33);
	 *TemperatureRange t3 = new TemperatureRange(12,40);
		
	 *WeatherRecord w1 = new WeatherRecord(d,t1,t2,t3,1500);

	 *assertEquals(w1.ranyDay(2000), true);
	 *assertEquals(w1.ranyDay(1000), false);
	 * @return
	 */
	public boolean ranyDay(double rany) {
		return this.precipitation >= rany;
	}
	/**
	 * recordDay, xác định xem nhiệt độ hôm nay phá kỷ lục cao hay thấp.
	 *Date d = new Date (11,04,2003);
		
	 *TemperatureRange t1 = new TemperatureRange(23,32);
	 *TemperatureRange t12 = new TemperatureRange(11,32);
	 *TemperatureRange t2 = new TemperatureRange(22,33);
	 *TemperatureRange t3 = new TemperatureRange(12,40);
		
	 *WeatherRecord w1 = new WeatherRecord(d,t1,t2,t3,1500);
	 *WeatherRecord w2 = new WeatherRecord(d,t12,t2,t4,1500);

	 *assertEquals(w1.recordDay(),false);
	 *assertEquals(w2.recordDay(),true);
	 * @param that
	 * @return
	 */
	public boolean recordDay() {
		return this.today.recordDay(this.record);
	}
}
