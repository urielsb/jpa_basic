/**
 * 
 */
package com.uriel.JpaBasic.bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Uriel Santoyo
 *
 */
@Getter
@Setter
public class FixedDepositDetailsBean {

	private int id;
	private LocalDateTime creationDate;
	private BigDecimal amount;
	private BigDecimal tenure;
	private boolean active;
}
