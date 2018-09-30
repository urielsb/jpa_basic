package com.uriel.JpaBasic.service.impl;

import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.uriel.JpaBasic.bean.BankAccountBean;
import com.uriel.JpaBasic.persistence.repository.BankAccountRepository;
import com.uriel.JpaBasic.service.MyService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMyServiceImplMockDB {
	
	@Autowired
	private MyService service;
	
	@MockBean
	private BankAccountRepository baRepository;

	@Test
	public void testGetAllBankAccounts() {
		given(this.baRepository.findAll()).willReturn(Collections.emptyList());
		List<BankAccountBean> results = service.getAllBankAccounts();
		assertTrue(results.isEmpty());
	}

}
