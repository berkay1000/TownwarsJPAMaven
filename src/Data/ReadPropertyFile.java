package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class ReadPropertyFile {

	public Properties prop;

	public ReadPropertyFile() {
		// TODO Auto-generated method stub

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("src\\Data\\config.properties");

			prop.load(ip);

			ip.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void storePropertyFile() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("src\\Data\\config.properties");
			String[] propArray= new String[250];

			prop.load(ip);

			ip.close();
			for(int i=0; i<propArray.length;i++) {
			 propArray[0]= prop.getProperty("asdf");
			
			}
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
