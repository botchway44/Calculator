package conversions;

public class Time {
	public static double secondsToSeconds(double sec) {//C->F
		return sec;
	}
	
	public static double secondsToMinutes(double sec) {//C->F
		return sec/60;
	}
	
	public static double secondsToHours(double sec) {//C->F
		return sec/3600;
	}
	
	public static double secondsToDays(double sec) {//C->F
		return sec/86400;
	}
	
	public static double secondsToWeeks(double sec) {//C->F
		return sec/604800;
	}
	
	public static double secondsToMonths(double sec) {//C->F
		return sec/2628002.88;
	}
	
	public static double secondsToYears(double sec) {//C->F
		return sec/ (Math.pow(3.154, 7));
	}
	
	public static double secondsToDecade(double sec) {//C->F
		return sec/ (Math.pow(3.154, 8));
	}
	
	public static double secondsToCentury(double sec) {//C->F
		return sec/ (Math.pow(3.154, 9));
	}
	
	public static double minutesToSeconds(double min) {//C->F
		return min*60;
	}
	
	public static double minutesToMinutes(double min) {//C->F
		return min;
	}
	
	public static double minutesToHours(double min) {//C->F
		return min/60;
	}
	
	public static double minutesToDays(double min) {//C->F
		return min/1440;
	}
	
	public static double minutesToWeeks(double min) {//C->F
		return min/10080;
	}
	
	public static double minutesToMonths(double min) {//C->F
		return min/43800.048;
	}
	
	
	public static double minutesToYears(double min) {//C->F
		return min/ 525600;
	}
	
	public static double minutesToDecades(double min) {//C->F
		return min/ (Math.pow(5.256, 6));
	}
	
	public static double minutesToCenturys(double min) {
		return min/ (Math.pow(5.256, 7));
	}
	
	public static double hoursToseconds(double hour) {
		return hour * 3600;
	}
	public static double hoursToMinutes(double hour) {
		return hour * 60;
	}
	public static double hoursToHours(double hour) {
		return hour;
	}
	
	public static double hoursToDays(double hour) {
		return hour / 24;
	}
	
	public static double hoursToWeeks(double hour) {
		return hour /168;
	}
	
	public static double hoursToMonth(double hour) {
		return hour / 730.001;
	}
	
	public static double hoursToYear(double hour) {
		return hour /  8760;
	}
	
	public static double hoursToDecade(double hour) {
		return hour /  87600;
	}
	
	public static double hoursToCentry(double hour) {
		return hour /  876000;
	}
	
	public static double daysToSeconds(double days) {
		return days *  86400;
	}
	
	public static double daysToMinutes(double days) {
		return days *  1440;
	}
	
	public static double daysToHours(double days) {
		return days *  24;
	}
	
	public static double daysToDays(double days) {
		return days;
	}
	
	public static double daysToWeeks(double days) {
		return days / 7;
	}
	
	public static double daysToMonths(double days) {
		return days / 30.417;
	}
	
	public static double daysToYear(double days) {
		return days / 365;
	}
	
	public static double daysToDecade(double days) {
		return days / 3650;
	}
	
	public static double daysToCentury(double days) {
		return days / 36500;
	}
	
	
	public static double weekToSeconds(double week) {
		return week * 604800;
	}
	
	public static double weekToMinutes(double week) {
		return week * 10080;
	}
	
	public static double weekToHours(double week) {
		return week * 168;
	}
	
	public static double weekToDays(double week) {
		return week * 7;
	}
	
	public static double weekToWeeks(double week) {
		return week;
	}
	
	
	public static double weekToMonths(double week) {
		return week / 4.345 ;
	}
	
	
	public static double weekToYears(double week) {
		return week / 52.143 ;
	}
	
	public static double weekToDecade(double week) {
		return week / 521.429 ;
	}
	
	public static double weekToCentury(double week) {
		return week /  5214.286 ;
	}
	
	
}
