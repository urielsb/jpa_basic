/**
 * 
 */
package com.uriel.JpaBasic.persistence.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Uriel Santoyo
 *
 */
@Getter
@Setter
@Entity
@Table(name="FIXED_DEPOSIT_DETAILS")
public class FixedDepositDetailsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	@Column(name="FIXED_DEPOSIT_ID")
	private int id;
	@Column(name="FD_CREATION_DATE")
	private Date crationDate;
	@Column(name="AMOUNT")
	private BigDecimal amount;
	@Column(name="TENURE")
	private BigDecimal tenure;
	@Column(name="ACTIVE")
	private boolean active;
}
