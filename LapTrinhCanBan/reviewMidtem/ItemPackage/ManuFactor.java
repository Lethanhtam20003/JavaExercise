package ItemPackage;

public class ManuFactor {
	private String companyName;
	private String city;
	public ManuFactor(String companyName, String city) {
		this.companyName = companyName;
		this.city = city;
	}
	public boolean inCity(String cityName) {
		// TODO Auto-generated method stub
		return this.city.equals(cityName);
	}
	
}
