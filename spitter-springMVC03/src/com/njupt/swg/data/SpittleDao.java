package com.njupt.swg.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.njupt.swg.bean.Spittle;

@Repository
public class SpittleDao implements ISpittleDao {
	private JdbcOperations jdbcOperations;
	@Inject
	public SpittleDao(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
	}
	
	@Override
	public List<Spittle> findSpittles() {
		 return jdbcOperations.query(
			        "select id, message, time, latitude, longitude" +
			        " from t_spittle" +
			        " order by time desc limit 20",
			        new SpittleRowMapper());
	}
	
	private static class SpittleRowMapper implements RowMapper<Spittle> {
	    public Spittle mapRow(ResultSet rs, int rowNum) throws SQLException {
	      return new Spittle(
	          rs.getInt("id"),
	          rs.getString("message"), 
	          rs.getDate("time"), 
	          rs.getDouble("longitude"), 
	          rs.getDouble("latitude"));
	    }
	  }

}
