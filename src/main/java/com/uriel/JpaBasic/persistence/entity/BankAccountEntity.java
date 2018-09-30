/**
 * 
 */
package com.uriel.JpaBasic.persistence.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="BANK_ACCOUNT_DETAILS")
public class BankAccountEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	@Column(name="ACCOUNT_ID")
	private int id;
	@Column(name="BALANCE_AMOUNT")
	private BigDecimal balanceAmount;
	@Column(name="LAST_TRANSACTION_TS")
	private Date lastTransactionTime;
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="ACCOUNT_ID")
	private List<FixedDepositDetailsEntity> depositDetails; 
}
