package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyutility {
	public String getDataFroPropetyfile(String Key) throws IOException
	{
		FileInputStream file=new FileInputStream(ConstantData.property);
		Properties pro=new Properties();
		pro.load(file); 
		String value=pro.getProperty(Key);
		return Key;
		
	}

}
