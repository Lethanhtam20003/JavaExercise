package ex1_7;

public class VeatherRecord 
{
	Date d;
	TemperatureRange today;
	TemperatureRange nomal;
	TemperatureRange record;
	double precipitation;
	VeatherRecord(TemperatureRange today, TemperatureRange nomal, TemperatureRange record,double precipitation, Date d)
	{
		this.d = d;
		this.nomal = nomal;
		this.record = record;
		this.precipitation = precipitation;
	}
}
