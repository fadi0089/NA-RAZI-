package bankaccount;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class createaccount {
	String bname,title;
	Scanner s=new Scanner(System.in);
	void setaccount(String bname,String title)
	{
		this.bname=bname;
		this.title=title;
	}
	String getbankname()
	{
		return bname;
	}
	String gettitle()
	{
		return title;
	}
	
	public void opendate()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
	public void closedate()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
}
