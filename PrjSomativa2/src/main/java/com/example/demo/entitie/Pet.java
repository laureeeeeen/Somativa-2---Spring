package com.example.demo.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table

public class Pet {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String tipo;

	@NotNull
	private String raca;

	@NotNull
	private int idade;
	
	@ManyToOne
	@JoinColumn(name = "clienId")

	private Cliente cliente;



public Cliente getCliente() {

		return cliente;

	}

	public void setCliente(Cliente cliente) {

		this.cliente = cliente;

	}
	
}
