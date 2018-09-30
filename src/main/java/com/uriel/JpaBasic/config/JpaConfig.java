/**
 * 
 */
package com.uriel.JpaBasic.config;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Uriel Santoyo
 *
 */
@Configuration
public class JpaConfig {

	@Bean
	Mapper getMapper() {
		return new DozerBeanMapper(Arrays.asList("dozer/mapping_file.xml"));
	}
}
