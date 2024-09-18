package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class CarroService {

	private	CarroRepository carrosEntities;
		
		public List<CarroEntities> ListarTodos() {
		return	carrosEntities.findAll();
		}
}
