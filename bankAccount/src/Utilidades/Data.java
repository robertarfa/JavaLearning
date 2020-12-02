package Utilidades;

public class Data {
	private int day;
	private int month;
	private int year;
	
	public Data(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
	public void setData(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
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
}
