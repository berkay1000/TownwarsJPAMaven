package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public Properties prop;

	public ReadPropertyFile() {
		// TODO Auto-generated method stub

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("src\\Data\\config.properties");

			prop.load(ip);

			// TODO Auto-generated catch block
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
			FileOutputStream out = new FileOutputStream("src\\Data\\config.properties");

			prop.store(out, "test=test");

			// TODO Auto-generated catch block
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
