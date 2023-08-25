package com.singh.base.constants;

public class GlobalRegex {
	
	public static final String emailRegex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*" 
	        + "@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	
	public static final String dateFormat = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
	public static final String dateOfBirthFormat = "^\\d{4}-\\d{2}-\\d{2}$";
	public static final String stringNotContainsDigit = "^[a-zA-Z]+$" ;
	public static final String BloodGroup = "^(A|B|AB|O)[-+]$";
	public static final String aadharCheck = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
	public static final String panNumberCheck = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
	public static final String ageCheck = "^\\d+$";

}
