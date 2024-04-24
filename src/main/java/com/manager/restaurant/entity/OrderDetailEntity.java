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
@Table(name="order_detail")
@Getter
@Setter
public class OrderDetailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int orderId;
	
	private int menuId;
	
	private byte quantity;
	
	@CurrentTimestamp(event= EventType.INSERT)
	private LocalDate createdAt;
	
	@CurrentTimestamp(event= {EventType.UPDATE})
	private LocalDate updatedAt;
}
