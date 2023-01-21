package it.unibas.i18n;

import java.util.Locale;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceManager {

    private static final Logger logger = LoggerFactory.getLogger(ResourceManager.class.getName());
    private ResourceBundle stringsBundle;

    public void inizializza() {
        if (logger.isDebugEnabled()) {
            Locale.setDefault(Locale.ENGLISH);
        }
        this.stringsBundle = ResourceBundle.getBundle("Strings", Locale.getDefault());
        logger.info("Caricate {} voci dallo string bundle", stringsBundle.keySet().size());
    }

    public String getStringResource(String key) {
        return this.stringsBundle.getString(key);
    }


}
