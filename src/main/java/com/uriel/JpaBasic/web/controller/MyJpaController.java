/**
 * 
 */
package com.uriel.JpaBasic.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uriel.JpaBasic.bean.BankAccountBean;
import com.uriel.JpaBasic.service.MyService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Uriel Santoyo
 *
 */
@Slf4j
@RestController
public class MyJpaController {

	@Autowired
	private MyService myService;
	
	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public List<BankAccountBean> listAllAcounts(){
		log.info("Consulting all acounts -->");
		return myService.getAllBankAccounts();
	}
	
	@RequestMapping(value="/account/{id}", method=RequestMethod.GET)
	public BankAccountBean getBankAccount(@PathVariable("id") int id) {
		log.info("Consullting account with id: " + id);
		return myService.getAccountById(id).orElseGet(() -> null);
	}
}
