package com.bl.addressbook.utility;

public class UtilRegex {
	public static final String START_WITH_CAPITAL_LETTER = "^[A-Z]{1}[A-Za-z]{1,16}$";
	public static final String MOBILE_NUMBER = "^[6-9]{1}[1-9]{9}$";
	public static final String ZIP_CODE = "^[0-9]{4}$";
	public static final String EMAIL_ID = "^[A-Za-z0-9+_.-]+@(.+)$";
}