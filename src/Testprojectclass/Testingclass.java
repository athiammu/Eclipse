package Testprojectclass;

import org.testng.annotations.Test;

import Baseproject.Wordpressbaseclass;
import Pageproject.Wordpresspageclass;
import Proutility.Excelutil;

public class Testingclass extends Wordpressbaseclass {
	@Test
	public void verifyLoginWithValidCred() throws Exception
	{
		Wordpresspageclass k1=new Wordpresspageclass(driver);
		
		//reading the data from excel file by the specified path
		
		String xl="D:\\data.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutil.getRowCount(xl,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excelutil.getCellValue(xl,Sheet,i,0);
			System.out.println("username---"+UserName);
			String pwd=Excelutil.getCellValue(xl,Sheet,i,1);
			System.out.println("password---"+pwd);
			
			k1.setvalues(UserName, pwd);
			k1.login();
			
		}
	}	

}
