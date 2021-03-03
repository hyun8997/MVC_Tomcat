package d20210303;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {
	public static void main(String[] args) {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd a hh:mm");
		
		String time = sdf.format(d);
		
		System.out.println(time);
	}
}
