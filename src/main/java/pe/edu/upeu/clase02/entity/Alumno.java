package pe.edu.upeu.clase02.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id_alumno;
	private int id_asignatura;
	private int id_curso__escolar;	
	
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public int getId_asignatura() {
		return id_asignatura;
	}
	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}
	public int getId_curso__escolar() {
		return id_curso__escolar;
	}
	public void setId_curso__escolar(int id_curso__escolar) {
		this.id_curso__escolar = id_curso__escolar;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		
	
	
	
	
	
}
