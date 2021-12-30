package ex1_6;

public class Book 
{
	String namebook;
	double price;
	int yearpublication;
	Author a;
	Book(String namebook, double price,int yearpublication, Author a)
	{
		this.a = a;
		this.namebook = namebook;
		this.yearpublication = yearpublication;
		this.price = price;
	}
}
