package pe.edu.upeu.clase02.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.entity.Profesor;

@Component
public class ProfesorDaoIMpl implements Todo<Profesor> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	@Override
	public int create(Profesor t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Profesor t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Profesor read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Profesor> readAll() {
		// TODO Auto-generated method stub	
		return jdbcTemplate.query("SELECT * FROM profesor", BeanPropertyRowMapper.newInstance(Profesor.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select p.id_profesor as \"ID\", pe.nombre as \"NOMBRE\",concat(pe.apellido1 ,' , ', pe.apellido2)  \"APELLIDOS\", d.nombre as \"Departamento\" \n"
				+ "from profesor p inner join departamento d on \n"
				+ "p.id_departamento = d.id inner join persona pe on \n"
				+ "p.id_profesor = pe.id order by 1; ";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	

}
