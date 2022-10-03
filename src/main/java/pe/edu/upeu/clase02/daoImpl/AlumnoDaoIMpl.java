package pe.edu.upeu.clase02.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.entity.Alumno;

@Component
public class AlumnoDaoIMpl implements Todo<Alumno> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Alumno t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Alumno t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Alumno read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM producto", BeanPropertyRowMapper.newInstance(Alumno.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select p.nombre \"NOMBRE\" , concat(p.apellido1 , p.apellido2)  \"APELLIDOS\",G.nombre  \"GRADO\", A.curso  \"CURSO\", p.sexo   \"SEXO\" \n"
				+ "from alumno_se_matricula_asignatura AL inner join asignatura A \n"
				+ "on AL.id_asignatura = A.id inner join grado G on \n"
				+ "A.id_grado = G.id inner join curso_escolar C on \n"
				+ "AL.id_curso_escolar = C.id inner join persona p on\n"
				+ "AL.id_alumno = p.id;";
		return jdbcTemplate.queryForList(SQL);
		
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		String SQL = "select p.nombre \"NOMBRE\" , concat(p.apellido1 , p.apellido2)  \"APELLIDOS\", c.anyo_inicio \"ANIO DE INICIO\",G.nombre\n"
				+ "from alumno_se_matricula_asignatura AL  inner join  curso_escolar C \n"
				+ "on AL.id_curso_escolar = c.id inner join persona p on\n"
				+ "AL.id_alumno = p.id inner join asignatura A \n"
				+ "on AL.id_asignatura = A.id inner join grado G on \n"
				+ "A.id_grado = G.id order by 3;";
		return jdbcTemplate.queryForList(SQL);
	}

	

	

	
	
}
