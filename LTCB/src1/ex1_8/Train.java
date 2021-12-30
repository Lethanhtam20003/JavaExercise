package ex1_8;

public class Train 
{
	Schedule schedule;
	Route route;
	boolean local;
	Train(Schedule schedule, Route route, boolean local)
	{
		this.local = local;
		this.route = route;
		this.schedule = schedule;
	}
}
