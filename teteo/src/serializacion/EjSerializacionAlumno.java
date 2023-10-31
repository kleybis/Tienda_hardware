package serializacion;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EjSerializacionAlumno {

	static List<Alumno> alumnosList;
	static Path miFichero;
	static Path miFicheroListaAlumnos;
	static Path miFicheroListaCompleta;

	public static void main(String[] args) {

		miFichero = Paths.get("Ficheros/alumnosSerial.dat");
		alumnosList = new ArrayList<Alumno>();
		inicializarLista();

		// Serializar de un alumno
		serializarAlumno();
		Alumno a = deserializacionAlumno();
		System.out.println(a.toString());
		// Serializacion lista de alumnos de uno en uno
		miFicheroListaAlumnos = Paths.get("Ficheros/listaAlumnosSerial.dat");
		serializarVariosAlumnos();
		List<Alumno> listaAlumnos = deserializarVariosAlumnos();
		System.out.println(listaAlumnos);
		// Serializacion de una lista de alumnos completa
		miFicheroListaCompleta = Paths.get("Ficheros/listaCompletaSerial.dat");
		serializacionCompleta();
		ListaAlumnos alumnos = deserializarCompleto();
		System.out.println("---------------------");
		System.out.println(alumnos);
	}

	private static ListaAlumnos deserializarCompleto() {
		InputStream istream;
		ListaAlumnos alumnos = null;
		try {
			istream = Files.newInputStream(miFicheroListaCompleta);
			ObjectInputStream ois = new ObjectInputStream(istream);
			alumnos=(ListaAlumnos) ois.readObject();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();

		}
		return alumnos;
	}

	private static void serializacionCompleta() {
		OutputStream ostream;
		try {
			ostream = Files.newOutputStream(miFicheroListaCompleta);
			ObjectOutputStream oos = new ObjectOutputStream(ostream);
			oos.writeObject(new ListaAlumnos(alumnosList));
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<Alumno> deserializarVariosAlumnos() {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		Alumno a;
		InputStream istream;
		try {
			istream = Files.newInputStream(miFicheroListaAlumnos);
			ObjectInputStream ois = new ObjectInputStream(istream);
			for (int i = 0; i < 3; i++) {
				a = (Alumno) ois.readObject();
				listaAlumnos.add(a);
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();

		}
		return listaAlumnos;
	}

	private static void serializarVariosAlumnos() {
		OutputStream ostream;
		try {
			ostream = Files.newOutputStream(miFicheroListaAlumnos);
			ObjectOutputStream oos = new ObjectOutputStream(ostream);
			alumnosList.forEach(a -> {
				try {
					oos.writeObject(a);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Alumno deserializacionAlumno() {
		Alumno a1 = null;
		InputStream istream;
		try {
			istream = Files.newInputStream(miFichero);
			ObjectInputStream ois = new ObjectInputStream(istream);
			a1 = (Alumno) ois.readObject();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return a1;
	}

	private static void serializarAlumno() {
		try {
			OutputStream ostream = Files.newOutputStream(miFichero);
			ObjectOutputStream oos = new ObjectOutputStream(ostream);
			oos.writeObject(alumnosList.get(0));
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void inicializarLista() {
		alumnosList.add(new Alumno(2, "Perez", "Ana"));
		alumnosList.add(new Alumno(1, "Sanz", "Jose"));
		alumnosList.add(new Alumno(2, "Arranz", "Maria"));
		alumnosList.add(new Alumno(1, "Perez", "Juan"));
		// System.out.println(alumnosList);
	}
}
