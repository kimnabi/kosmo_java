package a.b.c.com.kosmem.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public abstract class DateFormatUtil {
	

	public static String ymdFormat() {
		
//		Date dd = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		String d = sdf.format(dd);		
//		return d;
		
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}
	public static String ymdFormat(String n) {
		// String str = "2019-09-02 08:10:55";
		  String[] str = n.split("-");
		  
		System.out.println("ymdFormat >>>>"+str.toString());
		String s = str.toString();
         SimpleDateFormat format = new SimpleDateFormat("yyyy년MM월dd일");
         Date date = null;
		try {
			date = format.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return format.format(date);
	}
	
	public static String ymFormat() {
		return new SimpleDateFormat("yyyyMM").format(new Date());
	}
	
	public static String yFormat() {
		return new SimpleDateFormat("yyyy").format(new Date());
	}
	
	// D M Y N
	public static String ymdFormats(String ymdFlag) {
		
		String ymd = "";
		ymdFlag = ymdFlag.toUpperCase();
		
		if ("D".equals(ymdFlag)) {
			ymd = DateFormatUtil.ymdFormat();
		}
		if ("M".equals(ymdFlag)) {
			ymd = DateFormatUtil.ymFormat();
		}
		if ("Y".equals(ymdFlag)) {
			ymd = DateFormatUtil.yFormat();
		}
		if ("N".equals(ymdFlag)) {
			ymd = "";
		}
		
		return ymd;
	}
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		 String str = "2019-09-02 08:10:55";
         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         Date date = format.parse(str);
         //System.out.println(date);
		 // Date date = new Date();
         String m = "2019-09-02 08:10:55";
		  String[] s = m.split("-");
		  System.out.println(s.toString());
	     SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	     String str1 = format1.format(date);
		System.out.println("ymdFormat() >>> : " + DateFormatUtil.ymdFormat());
		System.out.println("ymFormat() >>> : " + DateFormatUtil.ymFormat());
		System.out.println("yFormat() >>> : " + DateFormatUtil.yFormat());
	}

}
