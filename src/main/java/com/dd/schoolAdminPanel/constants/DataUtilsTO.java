/**
 * 
 */
package com.dd.schoolAdminPanel.constants;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class DataUtilsTO {

	public static final String DATE_FORMAT_SLASH = "dd-MM-yyyy";

	private static final SimpleDateFormat DATE_FORMATTER_SLASH = new SimpleDateFormat(DATE_FORMAT_SLASH,Locale.ENGLISH);
	
	private static final SimpleDateFormat DATE_FORMATTER_SLASH_DD_MMM_YYYY = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);

	public String formatDate(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_SLASH.format(dateValue);

		// Return formatted date
		return formatted;
	}
	
	public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";

	/** Instance of SimpleDateFormat based on DATE_FORMAT of this class */
	private static final SimpleDateFormat DATE_FORMATTER_YYYY_MM_DD = new SimpleDateFormat(DATE_FORMAT_YYYY_MM_DD);
	
	public String formatDate1(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_YYYY_MM_DD.format(dateValue);

		// Return formatted date
		return formatted;
	}
	
	public static final String DATE_FORMAT_WITH_TIME_SCREEN = "dd-MM-yyyy HH:mm";

	private static final SimpleDateFormat DATE_FORMATTER_WITH_TIME_SCREEN = new SimpleDateFormat(DATE_FORMAT_WITH_TIME_SCREEN);
	
	public String formatDateWithTimeTOScreen(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_WITH_TIME_SCREEN.format(dateValue);

		// Return formatted date
		return formatted;
	}
	public static final String DATE_FORMAT_WITH_24HR_TIME_SCREEN = "dd-MM-yyyy hh:mm:ss";

	private static final SimpleDateFormat DATE_FORMATTER_WITH_24HR_TIME_SCREEN = new SimpleDateFormat(DATE_FORMAT_WITH_24HR_TIME_SCREEN);
	
	public String formatDateWith12HrTimeTOScreen(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_WITH_24HR_TIME_SCREEN.format(dateValue);

		// Return formatted date
		return formatted;
	}
	
	public String formatDateDD_MMM_YYYY(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_SLASH_DD_MMM_YYYY.format(dateValue);

		// Return formatted date
		return formatted;
	}
	
	private static final SimpleDateFormat DATE_FORMATTER_HH_MM = new SimpleDateFormat("hh:mm a");

	public String formatDate_HH_MM(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_HH_MM.format(dateValue);

		// Return formatted date
		return formatted;
	}
	private static final SimpleDateFormat DATE_FORMATTER_DD_MM_YYYY_HH_MM = new SimpleDateFormat("dd-MM-yyyy hh:mm a");

	public String formatDate_DD_MM_YYYY_HH_MM(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_DD_MM_YYYY_HH_MM.format(dateValue);

		// Return formatted date
		return formatted;
	}
	
	private static final SimpleDateFormat DATE_FORMATTER_SLASH_DD_MMM_YYYY_HH24_MM = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");

	public String formatDateDD_MMM_YYYY_HH24_MM(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_SLASH_DD_MMM_YYYY_HH24_MM.format(dateValue);

		// Return formatted date
		return formatted;
	}
	
	
	private static final SimpleDateFormat DATE_FORMATTER_DD_MM_YY_HH_MM = new SimpleDateFormat("dd-MM-yy hh:mm a");

	public String formatDate_DD_MM_YY_HH_MM(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_DD_MM_YY_HH_MM.format(dateValue);

		// Return formatted date
		return formatted;
	}
	
	
	public static final String DATE_FORMAT_WITH_24HR_TIME_SCREEN_CHART = "yyyy-MM-dd hh:mm:ss";

	private static final SimpleDateFormat DATE_FORMAT_WITH_TIME_SCREEN_CHART = new SimpleDateFormat(DATE_FORMAT_WITH_24HR_TIME_SCREEN_CHART);
	
	public String formatDateWith24HrTimeTOChart(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMAT_WITH_TIME_SCREEN_CHART.format(dateValue);

		// Return formatted date
		return formatted;
	}
	
	
	private static final SimpleDateFormat DATE_FORMATTER_SLASH_DD_MMM_YYYY_HH12_MM = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");

	public String formatDateDD_MMM_YYYY_HH12_MM(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_SLASH_DD_MMM_YYYY_HH12_MM.format(dateValue);

		// Return formatted date
		return formatted;
	}
	
	private static final SimpleDateFormat DATE_FORMATTER_SLASH_DD_MMM_YYYY_HH24_MM_FOR_RETURN_FRM_PROD = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

	public String formatDateDD_MMM_YYYY_HH24_MM_FOR_RETURN_PROD(Date dateValue) {
		String formatted = null; // must init to null

		if (dateValue != null)
			formatted = DATE_FORMATTER_SLASH_DD_MMM_YYYY_HH24_MM_FOR_RETURN_FRM_PROD.format(dateValue);

		// Return formatted date
		return formatted;
	}
	
}
