package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FixtureUtils {
    private FixtureUtils() {
    }

    public static String getFixture(String path) {
        ClassLoader classLoader = FileUtils.class.getClassLoader();
        File file = new File(classLoader.getResource("fixtures/" + path).getFile());
        try {
            return org.apache.commons.io.FileUtils.readFileToString(file, "UTF-8");
        } catch (IOException e) {
            throw new GetFixtureException(e);
        }
    }

    public static class GetFixtureException extends RuntimeException {
        public GetFixtureException(Throwable t) {
            super(t);
        }
    }
}
