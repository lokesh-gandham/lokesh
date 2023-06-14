package com.sports.sportshoes.models;

import javax.persistence.*;

@Entity
@Table(name="occasions")
public class Occasion {
	//Properties
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="occasion_name")    
	private String occasionName;
	
	@Column(name="occasionId")
	private Long  id;
	//Default Constructor
	public Occasion() {}
	
	//Parameterized Constructor
	public Occasion(Long id, String occasionName) {
		this.id = id;
		this.occasionName = occasionName;
	}
	
	//Getters & Setters
	public String getOccasionName() {
		return occasionName;
	}

	public void setOccasionName(String occasionName) {
		this.occasionName = occasionName;
	}

	public Long getId() {
		return id;
	}
	
	//Other Methods
	@Override
	public String toString() {
		return "Occasion [id=" + id + ", occasionName=" + occasionName + "]";
	}

}