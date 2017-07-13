package com.njupt.swg.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.njupt.swg.bean.Spitter;

@Repository
public class SpitterDao implements ISpitterDao {
	private JdbcOperations jdbcOperations;
	@Inject
	public SpitterDao(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
	}
	
	@Override
	public Spitter save(Spitter spitter) {
		jdbcOperations.update(
			        "insert into t_spitter (username, password, first_name, last_name, email)" +
			        " values (?, ?, ?, ?, ?)",
			        spitter.getUsername(),
			        spitter.getPassword(),
			        spitter.getFirstName(),
			        spitter.getLastName(),
			        spitter.getEmail());
		 return spitter;
	}

	@Override
	public Spitter findByUsername(String username) {
		return jdbcOperations.queryForObject(
		        "select id, username, null, first_name, last_name, email from t_spitter where username=?", 
		        new SpitterRowMapper(), 
		        username);
	}
	private static class SpitterRowMapper implements RowMapper<Spitter> {
	    public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
	      return new Spitter(
	          rs.getInt("id"),
	          rs.getString("username"),
	          null,
	          rs.getString("first_name"),
	          rs.getString("last_name"),
	          rs.getString("email"));
	    }
	  }
	@Override
	public Spitter findById(int id) {
		return jdbcOperations.queryForObject(
		        "select id, username, null, first_name, last_name, email from t_spitter where id=?", 
		        new SpitterRowMapper(), 
		        id);
	}

}
