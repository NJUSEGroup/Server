package hrs.server.DatabaseUtility;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import hrs.common.util.IDTemplate;
@Component
public class JDBCTemplate {
	@Resource
	private NamedParameterJdbcTemplate jdbcHelper;

	public <T> void update(String sql, T t) {
		jdbcHelper.update(sql, new BeanPropertySqlParameterSource(t));
	}

	public <T> void delete(String sql, T t) {
		jdbcHelper.getJdbcOperations().update(sql, t);
	}

	public <T> List<T> findAll(String sql, Class<T> clazz) {
		List<T> list = null;
		try {
			list = jdbcHelper.getJdbcOperations().query(sql, BeanPropertyRowMapper.newInstance(clazz));
		} catch (EmptyResultDataAccessException e) {
//			e.printStackTrace();
			list = null;
			System.out.println("Not find List!");
		}
		return list;
	}

	public <T> List<T> findAll(String sql, Class<T> clazz, Object... constraints) {
		List<T> list = null;
		try {
			list = jdbcHelper.getJdbcOperations().query(sql, BeanPropertyRowMapper.newInstance(clazz), constraints);
		} catch (EmptyResultDataAccessException e) {
//			e.printStackTrace();
			list = null;
			System.out.println("Not find List!");
		}
		return list;
	}

	public <T> T find(String sql, Class<T> clazz, Object... constraints) {
		T t = null;
		try {
			t = jdbcHelper.getJdbcOperations().queryForObject(sql, BeanPropertyRowMapper.newInstance(clazz),
					constraints);
		} catch (EmptyResultDataAccessException e) {
//			e.printStackTrace();
			System.out.println("Not find entity!");
		}
		return t;
	}

	public <T extends IDTemplate> void addIncludesId(String sql, T t) {
		SqlParameterSource ps = new BeanPropertySqlParameterSource(t);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcHelper.update(sql, ps, keyHolder);
		int id = keyHolder.getKey().intValue();
		t.setId(id);
	}

	public <T> void add(String sql, T t) {
		jdbcHelper.update(sql, new BeanPropertySqlParameterSource(t));
	}

}
