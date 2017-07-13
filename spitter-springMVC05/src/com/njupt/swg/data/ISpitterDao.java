package com.njupt.swg.data;

import java.util.List;

import com.njupt.swg.bean.Spitter;

public interface ISpitterDao {
	Spitter save(Spitter spitter);
	Spitter findByUsername(String username);
	Spitter findById(int id);
	public List<Spitter> getAllSpitters();
}
