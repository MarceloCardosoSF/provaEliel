package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarroEntities {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String modelo;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Long getId() {
		return id;
	}
	
	
}
