package main;

public class Fecha {
	int hora;
	int minuto;
	int dia;
	int mes;
	int anual;

	public Fecha(int day, int month, int year) {
		dia = day;
		mes = month;
		anual = year;
		hora = 0;
		minuto = 0;
	}

	public Fecha(int hour, int minute, int day, int month, int year) {
		dia = day;
		mes = month;
		anual = year;
		hora = hour;
		minuto = minute;
	}

	public void setFecha(int day, int month, int year) {
		dia = day;
		mes = month;
		anual = year;
	}

	public void setHora(int hour, int minute) {
		hora = hour;
		minuto = minute;
	}

	public int getAnno() {
		return anual;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	public String getFecha() {
		return String.format("%d/%d/%d", dia, mes, anual);
	}

	public String getHora() {
		return String.format("%d:%d", hora, minuto);
	}
}