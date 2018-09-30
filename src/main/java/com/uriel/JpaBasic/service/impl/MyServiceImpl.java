/**
 * 
 */
package com.uriel.JpaBasic.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uriel.JpaBasic.bean.BankAccountBean;
import com.uriel.JpaBasic.persistence.entity.BankAccountEntity;
import com.uriel.JpaBasic.persistence.repository.BankAccountRepository;
import com.uriel.JpaBasic.service.MyService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Uriel Santoyo
 *
 */
@Slf4j
@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	private BankAccountRepository baRepository;
	@Autowired
	Mapper mapper;

	/* (non-Javadoc)
	 * @see com.uriel.JpaBasic.service.MyService#getAllBankAccounts()
	 */
	@Transactional(readOnly=true)
	@Override
	public List<BankAccountBean> getAllBankAccounts() {
		log.debug("getAllBankAccounts --->");
		List<BankAccountEntity> bankAccounts = baRepository.findAll();
		log.info("Number of rows -> " + bankAccounts.size());

		return bankAccountToBean(bankAccounts);
	}
	
	/* (non-Javadoc)
	 * @see com.uriel.JpaBasic.service.MyService#getAccountById(int)
	 */
	@Transactional(readOnly=true)
	@Override
	public Optional<BankAccountBean> getAccountById(int id) {
		Optional<BankAccountEntity> baEntity = baRepository.findById(id);
		if(baEntity.isPresent()) {
			log.info("Number of fixed deposit of this account: " + baEntity.get().getDepositDetails().size());
			return Optional.of(bankAccountToBean(baEntity.get()));
		}else {
			log.warn("No Bank Account with id " + id);
			return Optional.empty();
		}
	}
	
	private List<BankAccountBean> bankAccountToBean(List<BankAccountEntity> baEntities){
		return ObjectUtils.<List<BankAccountEntity>>defaultIfNull(baEntities, Collections.emptyList()).stream()
			.map(this::bankAccountToBean)
			.collect(Collectors.toList());
	}
	
	private BankAccountBean bankAccountToBean(BankAccountEntity baEntity) {
		return mapper.map(baEntity, BankAccountBean.class);
	}
}
