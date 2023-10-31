package serializacion;

import java.io.Serializable;
import java.util.List;

public class ListaAlumnos implements Serializable {

private List<Alumno> listaAlumnos;

	
	public ListaAlumnos() {
		super();
	}

	public ListaAlumnos(List<Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "ListaAlumnos [listaAlumnos=" + listaAlumnos + "]";
	}
	
	
}
