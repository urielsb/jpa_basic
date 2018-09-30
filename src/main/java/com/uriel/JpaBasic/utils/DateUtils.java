/**
 * 
 */
package com.uriel.JpaBasic.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author Uriel Santoyo
 *
 */
public final class DateUtils {

	/**
	 * Convert from {@link Date} to {@link LocalDateTime}.
	 * 
	 * @param dateToConvert Source to create {@link LocalDateTime}
	 * @return In case dateToConvert be null, return null.
	 */
	public static LocalDateTime toLocalDateTime(Date dateToConvert) {
		if (dateToConvert != null) {
			return Instant.ofEpochMilli(dateToConvert.getTime())
					.atZone(ZoneId.systemDefault())
					.toLocalDateTime();
		} else {
			return null;
		}
	}

	/**
	 * Convert from {@link LocalDateTime} to {@link Date}.
	 * 
	 * @param localDateTimeToConvert Source to create {@link Date}
	 * @return In case localDateTimeToConvert be null, return null.
	 */
	public static Date toDate(LocalDateTime localDateTimeToConvert) {
		if (localDateTimeToConvert != null) {
			return Date.from(localDateTimeToConvert.atZone(ZoneId.systemDefault()).toInstant());
		} else {
			return null;
		}
	}
}
