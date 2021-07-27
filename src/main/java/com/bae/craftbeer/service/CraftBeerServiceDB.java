package com.bae.craftbeer.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.bae.craftbeer.data.CraftBeer;

@Primary
@Service // FUTURE FUNCTIONALITY - PLZ DO NOT USE
public class CraftBeerServiceDB implements CraftBeerService {

	@Override
	public CraftBeer createCraftBeer(CraftBeer cb) { // less fancy
		return null;
	}

	@Override
	public List<CraftBeer> getAllBeers() {
		return null;
	}

	@Override
	public CraftBeer getBeerByID(int id) {
		return null;
	}

	@Override
	public CraftBeer replaceCraftBeer(int id, CraftBeer newCB) {
		return null;
	}

	@Override
	public String deleteCraftBeer(int id) {
		return null;
	}

	@Override
	public List<CraftBeer> getBeerByName(String name) {
		return null;
	}

}
