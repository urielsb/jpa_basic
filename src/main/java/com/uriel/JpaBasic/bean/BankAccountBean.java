/**
 * 
 */
package com.uriel.JpaBasic.bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Uriel Santoyo
 *
 */
@Getter
@Setter
public class BankAccountBean {

	private int id;
	private BigDecimal balanceAmount;
	private LocalDateTime lastTransaction;
	private List<FixedDepositDetailsBean> fixedDepositDetails;
}
