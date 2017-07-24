package com.ssm.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;


public class DateConveter implements Converter<String, Date>{

	public Date convert(String source) {
	       try {
	           if(null != source){//2017-07-14
	               DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	               return df.parse(source);
	           }
	       } catch (Exception e) {
	           e.toString();
	       }
	       return null;
	    }

	

}
