package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertiesFiles {
	
	public static Properties readConfigFile(String path) throws Exception {
		File file=new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}

}
