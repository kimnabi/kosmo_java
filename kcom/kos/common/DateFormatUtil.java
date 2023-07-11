package a.b.c.com.kos.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateFormatUtil {
	

	public static String ymdFormat() {
		
//		Date dd = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		String d = sdf.format(dd);		
//		return d;
		
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ymdFormat() >>> : " + DateFormatUtil.ymdFormat());
		System.out.println("ymFormat() >>> : " + DateFormatUtil.ymFormat());
		System.out.println("yFormat() >>> : " + DateFormatUtil.yFormat());
	}

}
