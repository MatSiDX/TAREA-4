package pe.edu.upeu.clase02.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.daoImpl.AlumnoDaoIMpl;
import pe.edu.upeu.clase02.entity.Alumno;

@Service
public class AlumnoService implements Todo<Alumno> {

	@Autowired
	private AlumnoDaoIMpl daoIMpl;

	@Override
	public  int create(Alumno t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
	}

	@Override
	public int update(Alumno t) {
		// TODO Auto-generated method stub
		return daoIMpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoIMpl.delete(id);
	}

	@Override
	public Alumno read(int id) {
		// TODO Auto-generated method stub
		return daoIMpl.read(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll3();
	}

	


}
