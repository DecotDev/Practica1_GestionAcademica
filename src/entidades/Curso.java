package entidades;

import java.io.Serializable;

public class Curso implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idCurso;
	private String nombreCurso;
	
	public Curso() {}

	public Curso(int idCurso, String nombreCurso) {
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	
	public String toString() {
		return this.idCurso+" - "+this.nombreCurso;
	}
	
}
