package main;

//Declaración de la clase Fecha
public class Fecha {
	//Variables de instancia
	int hora;
	int minuto;
	int dia;
	int mes;
	int anual;

	// Primer constructor de la clase
	//Parámetros: day, month y year
	public Fecha(int day, int month, int year) {
		dia = day;
		mes = month;
		anual = year;
		hora = 0;
		minuto = 0;
	}

	//Segundo constructor de la clase
	//Parámetros: hour, minute, day, month y year
	public Fecha(int hour, int minute, int day, int month, int year) {
		dia = day;
		mes = month;
		anual = year;
		hora = hour;
		minuto = minute;
	}

	public void setDate(int day, int month, int year) {
		dia = day;
		mes = month;
		anual = year;
	}

	public void setHour(int hour, int minute) {
		hora = hour;
		minuto = minute;
	}

	public int getYear() {
		return anual;
	}

	public int getMonth() {
		return mes;
	}

	public int getDay() {
		return dia;
	}

	//Plantilla: dia/mes/año
	public String getDate() {
		return String.format("%d/%d/%d", dia, mes, anual);
	}

	//Plantilla: hora/minuto
	public String getHour() {
		return String.format("%d:%d", hora, minuto);
	}
}