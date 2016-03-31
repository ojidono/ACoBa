package fr.treeptik.runtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Runtime {
	
	public static void main(String[] args) {
		try {
			System.out.println(new SimpleDateFormat("yyyy-ww").parse(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))+"-"+String.valueOf(Calendar.getInstance().get(Calendar.WEEK_OF_YEAR))));
			System.out.println(new SimpleDateFormat("yyyy-MM").parse(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))+"-"+String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1)));
			System.out.println(new SimpleDateFormat("yyyy").parse(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
