package FirstPKG;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateANDtimeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat df0 = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(df0.format(d));
		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM hh:mm:ss");
		System.out.println(df1.format(d));
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df2.format(d));
	}

}
