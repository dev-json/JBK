package de.jbk.sys.credentials;

import java.io.File;
import java.util.Properties;
import java.util.Scanner;

public class CredentialsController {

    private Credentials credentials;
    private Properties properties;
    private File propFile;
    private Scanner scanner;

    public CredentialsController(String propFileName) {
        this.credentials = new Credentials();
        this.properties = new Properties();
        this.propFile = new File(propFileName);
        loadPropertiesFile();
    }

    private void loadPropertiesFile() {

    }

}
