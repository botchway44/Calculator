package conversions;

public class Temperature {

	public static double CelciusToFahrenheite(double cel) {//C->F
		return (cel * 9/5) + 32;
	}
	
	public static double FahrenhiteToCelcius(double fel) {//F->C
		return  (fel - 32) * 5/9;
	}
	
	public static double KelvinToCelcius(double kel) {//K->C
		return  (kel - 273.15);
	}
	
	public static double CelciusToKelvin(double cel) {//C->K
	return  (cel + 273.15);
}
	
	public static double KelvinToFahrenheite(double kel) {//K->F
		return  (kel - 273.15) * 9/5 + 32;
	}
	
	public static double FahrenhiteToKelvin(double fel) {//F->K
		return  (fel - 32) * 5/9 + 273.15;
	}


}
