package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private String url;
    //private String chromeDriverPath;

    public ConfigReader() {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");
            prop.load(input);

            this.url = prop.getProperty("url");
            //this.chromeDriverPath = prop.getProperty("chrome_driver_path");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public String getUrl() {
        return url;
    }

  //  public String getChromeDriverPath() {
     //   return chromeDriverPath;
   // }


}
