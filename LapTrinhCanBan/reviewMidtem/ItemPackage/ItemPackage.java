package ItemPackage;

public class ItemPackage {
	private String name;
	private double weight;
	private double price;
	private Specificion specificion;
	private ManuFactor manuFactor;
	private Date productionDate;
	private Date expiredDate;

	public ItemPackage(String name, double weight, double price, Specificion specificion, ManuFactor manuFactor,
			Date productionDate, Date expiredDate) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.specificion = specificion;
		this.manuFactor = manuFactor;
		this.productionDate = productionDate;
		this.expiredDate = expiredDate;
	}

	public boolean heavyMoreThan(ItemPackage that) {
		return this.weight > that.weight;
	}

	public boolean inCity(String cityName) {
		return this.manuFactor.inCity(cityName);
	}

	public double volumn() {
		return this.specificion.volumn();
	}

	public boolean productionBefor(Date that) {
		return that.before(productionDate);
	}

	public boolean isExpired(Date that) {
		return that.before(this.expiredDate);
	}

	public double discount() {
		if (this.isExpired(new Date(16, 7, 2022))) {
			return 0.8;
		} else if (this.productionBefor(new Date(1, 6, 2022))) {
			return 0.25;
		}
		return 0.05;
	}

	public double discontPrice() {
		return this.price * this.discontPrice();
	}

}
