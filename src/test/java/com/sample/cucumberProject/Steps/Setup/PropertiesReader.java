package com.sample.cucumberProject.Steps.Setup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	private final Properties properties;
	private final String propertyFilePath = "config.properties";

	public PropertiesReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getAppURL() {
		String appURL = properties.getProperty("AppURL");
		if (appURL != null)
			return appURL;
		else
			throw new RuntimeException("App URL is not specified in the Configuration.properties file.");
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait is not specified in the Configuration.properties file.");
	}

	public String getBrowserName() {
		String browserNae = properties.getProperty("browser");
		if (browserNae != null)
			return browserNae;
		else
			throw new RuntimeException("Browser is not specified in the Configuration.properties file.");
	}

}
