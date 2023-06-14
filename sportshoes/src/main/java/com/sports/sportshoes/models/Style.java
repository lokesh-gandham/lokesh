package com.sports.sportshoes.models;

import javax.persistence.*;

@Entity
@Table(name="styles")
public class Style {
	//Properties
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="styleId")    
	private Long id; //primary key
	private String styleName;
	
	//Default Constructor
	public Style() {}
	
	//Parameterized Constructor
	public Style(Long id, String styleName) {
		this.id = id;
		this.styleName = styleName;
	}

	//Getters & Setters
	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public Long getId() {
		return id;
	}
	
	//Other Methods
	@Override
	public String toString() {
		return "Style [id=" + id + ", styleName=" + styleName + "]";
	}
	
}//end class