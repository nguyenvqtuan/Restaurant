package com.manager.restaurant.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.generator.EventType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="menu")
@Getter
@Setter
public class MenuEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private long price;
	
	private String description;
	
	@CurrentTimestamp(event= EventType.INSERT)
	private LocalDate createdAt;
	
	@CurrentTimestamp(event= {EventType.UPDATE})
	private LocalDate updatedAt;
}
