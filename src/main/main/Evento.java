package main;

public class Evento {
	String nombre; 
	String comentario;
	Fecha fecha;
	int importancia;
	
	public Evento(String name, Fecha date, String comment, int importance)
	{
		nombre = name;
		fecha = date;
		comentario = comment;
		importancia = importance;
	}
	
	public void setComentario(String comment){comentario = comment;}
	
	public void setNombre(String name){nombre = name;}
	
	public void setFecha(Fecha date){fecha = date;}
	
	public String getComentario(){return comentario;}
	
	public String getNombre(){return nombre;}
	
	public Fecha getFecha(){return fecha;}
	
	public int getImportancia(){return importancia;}	
}