/**
 * 
 */
package com.uriel.JpaBasic.service;

import java.util.List;
import java.util.Optional;

import com.uriel.JpaBasic.bean.BankAccountBean;

/**
 * @author Uriel Santoyo
 *
 */
public interface MyService {

	/**
	 * List all acounts.
	 * 
	 * @return {@link List}
	 */
	public List<BankAccountBean> getAllBankAccounts();
	
	/**
	 * Return Bank Account data by his id.
	 * @param id Identifier of Bank account to search.
	 * @return {@link BankAccountBean}
	 */
	public Optional<BankAccountBean> getAccountById(int id);
}
