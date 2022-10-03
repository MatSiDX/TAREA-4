package pe.edu.upeu.clase02.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String anyo_inicio;
	private String anyo_fin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnyo_inicio() {
		return anyo_inicio;
	}
	public void setAnyo_inicio(String anyo_inicio) {
		this.anyo_inicio = anyo_inicio;
	}
	public String getAnyo_fin() {
		return anyo_fin;
	}
	public void setAnyo_fin(String anyo_fin) {
		this.anyo_fin = anyo_fin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
