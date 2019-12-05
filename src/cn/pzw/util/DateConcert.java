package cn.pzw.util;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConcert implements Converter<String,Date> {

	@Override
	public Date convert(String source) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time=null;
		try {
			
		time=sdf.parse(source);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}

}
