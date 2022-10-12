package StringManipulation;

public class StringsExercises {
	public static void main(String[] args) {
		String sun = "today it is sunny";
        String rain = "yesterday it was raining";
        
        System.out.println(sun.toUpperCase()+", "+rain.toUpperCase());
        
        String mySubSun = sun.substring(0, 11);
        String mySubRain = rain.substring(16, 24);
        System.out.println(mySubSun.toUpperCase() + mySubRain.toUpperCase());
        
	}
	
	
}
