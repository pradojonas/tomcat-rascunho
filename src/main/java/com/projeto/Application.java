package com.projeto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Application {

    // HashMap contendo as propriedades definidas
    // private static final Logger LOGGER = LogManager.getLogger("painel");
    private static final Properties mapProperties = loadProperties();

    public static Properties loadProperties() {
        try {
            // LOGGER.info("Carregando informações");
            InputStream inputStream = Application.class.getClassLoader()
                                                       .getResourceAsStream("config.properties");
            Properties  properties  = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {

            // LOGGER.error(e.getMessage(), e);
        }
        return null;
    }

    private static FileInputStream getProductionProperties()
                                                             throws FileNotFoundException {

        String home = Paths.get(System.getProperty("user.dir"))
                           .getFileSystem()
                           .getRootDirectories()
                           .iterator()
                           .next()
                           .toString();
        Path   path = Paths.get(home,
                                "painel",
                                "config",
                                "config.properties");
        return new FileInputStream(path.toFile());

    }

    public static String getStringAppProp(String prop) {
        return (String) mapProperties.get(prop);
    }

    public static String getApplicationEnvProperty() {
        return getStringAppProp("application.env");
    }
}