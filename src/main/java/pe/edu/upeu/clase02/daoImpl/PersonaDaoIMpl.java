package pe.edu.upeu.clase02.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.entity.Persona;

@Component
public class PersonaDaoIMpl implements Todo<Persona> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return  jdbcTemplate.query("SELECT * FROM producto", BeanPropertyRowMapper.newInstance(Persona.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select * from persona\n"
				+ "WHERE telefono is NOT NULL\n"
				+ "order by 8;";
		return jdbcTemplate.queryForList(SQL);
		
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
