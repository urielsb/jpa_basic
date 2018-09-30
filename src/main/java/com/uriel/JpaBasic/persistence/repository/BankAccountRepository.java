/**
 * 
 */
package com.uriel.JpaBasic.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uriel.JpaBasic.persistence.entity.BankAccountEntity;

/**
 * @author Uriel Santoyo
 *
 */
public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Integer> {}
