package it.unibas.i18n;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceManager {
    
    private static final Logger logger = LoggerFactory.getLogger(ResourceManager.class.getName());

    private ResourceBundle stringsBundle;

    public void inizializza() {
        this.stringsBundle = ResourceBundle.getBundle("Strings", Locale.getDefault());
        logger.info("Caricate " + stringsBundle.keySet().size() + " voci dallo string bundle");
    }

    public String getStringResource(String key) {
        return this.stringsBundle.getString(key);
    }


}
