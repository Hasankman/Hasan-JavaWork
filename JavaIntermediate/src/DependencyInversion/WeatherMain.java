package DependencyInversion;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherTracker N=new WeatherTracker();
		Mobile M=new Mobile();
		M.alertWeatherConditions(null);
		Email E=new Email();
		E.alertWeatherConditions(null);
		
		
		N.setConditions("cloudy");
		
		System.out.println(N.getConditions());
	}

}
