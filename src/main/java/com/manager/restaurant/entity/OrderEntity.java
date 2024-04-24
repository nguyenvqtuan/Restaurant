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
@Table(name="ordered")
@Getter
@Setter
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private byte quantityCustomer;
	
	private int employeeId;
	
	// Ordered multiple tables
	private String inventoryStrId;
	
	private long total;
	
	// 0: cash, 1: credit card
	private byte paymentMethod;
	
	@CurrentTimestamp(event= EventType.INSERT)
	private LocalDate createdAt;
	
	@CurrentTimestamp(event= {EventType.UPDATE})
	private LocalDate updatedAt;
}
