package day_12.Biblioteca;

public class Data {
	private int day;
	private int month;
	private int year;

	public Data(int day, int month, int year) {
	    if (isValid(day, month, year)) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    } else {
	        System.out.println();
	        this.day = 0;
	        this.month = 0;
	        this.year = 0;
	    }
	}

	// Costruttore copia
	public Data(Data other) {
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}

	public static boolean isValid(int day, int month, int year) {
		if (month < 1 || month > 12 || day < 1)
			return false;
		return day <= giorniNelMese(month, year);
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int aDay) {
		this.day = aDay;
	}

	public void setMonth(int aMonth) {
		this.month = aMonth;
	}

	public void setYear(int aYear) {
		this.year = aYear;
	}

	public void previousDay() {
		day--;
		if (day < 1) {
			month--;
			if (month < 1) {
				month = 12;
				year--;
			}
			day = giorniNelMese(month, year);
		}
	}

	public void nextDay() {
		day++;
		if (day > giorniNelMese(month, year)) {
			day = 1;
			month++;
			if (month > 12) {
				month = 1;
				year++;
			}
		}
	}

	public boolean isEqual(Data other) {
		return this.day == other.day && this.month == other.month && this.year == other.year;
	}

	public static int giorniNelMese(int mese, int anno) {
		switch (mese) {
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isBisestile(anno) ? 29 : 28;
		default:
			return 31;
		}
	}

	public static boolean isBisestile(int anno) {
		return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
	}

	public String toString() {
		return String.format("%02d/%02d/%04d", day, month, year);
	}
}