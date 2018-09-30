/**
 * 
 */
package com.uriel.JpaBasic.utils;

import java.time.LocalDateTime;
import java.util.Date;

import org.dozer.CustomConverter;
import org.dozer.MappingException;

/**
 * @author Uriel Santoyo
 *
 */
public class MapperDateConverter implements CustomConverter {

	/* (non-Javadoc)
	 * @see org.dozer.CustomConverter#convert(java.lang.Object, java.lang.Object, java.lang.Class, java.lang.Class)
	 */
	@Override
	public Object convert(Object destination, Object source, Class<?> destinationClass, Class<?> sourceClass) {
		if(source == null) {
			return null;
		} else if(source instanceof Date) {
			return DateUtils.toLocalDateTime((Date)source);
		} else if(source instanceof LocalDateTime) {
			return DateUtils.toDate((LocalDateTime)source);
		} else {
			throw new MappingException(String.format("Wrong use of this converter, class types must be %s and %s", 
					Date.class.getName(), LocalDateTime.class.getName()));
		}
	}

}
