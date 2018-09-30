/**
 * 
 */
package com.uriel.JpaBasic.service.impl;

import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.uriel.JpaBasic.JpaBasicApplication;
import com.uriel.JpaBasic.bean.BankAccountBean;
import com.uriel.JpaBasic.service.MyService;

/**
 * @author Uriel Santoyo
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=JpaBasicApplication.class, webEnvironment=WebEnvironment.MOCK)
public class TestMyServiceImpl {
	
	@Autowired
	private MyService service;

	/**
	 * Test method for {@link com.uriel.JpaBasic.service.impl.MyServiceImpl#getAllBankAccounts()}.
	 */
	@Test
	public void testGetAllBankAccounts() {
		List<BankAccountBean> accounts = service.getAllBankAccounts();
		assertFalse(accounts.isEmpty());
	}

	/**
	 * Test method for {@link com.uriel.JpaBasic.service.impl.MyServiceImpl#getAccountById(int)}.
	 */
	@Test
	public void testGetAccountById() {
		Optional<BankAccountBean> noSuccessResponse = service.getAccountById(100);
		assertFalse(noSuccessResponse.isPresent());
	}

}
