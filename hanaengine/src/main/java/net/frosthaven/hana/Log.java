package net.frosthaven.hana;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Log {

    static Logger coreLogger;
    public static Logger getCoreLogger() {
        return coreLogger;
    }

    static Logger appLogger;
    public static Logger getAppLogger() {
        return appLogger;
    }

    public static void init() {
        coreLogger = LogManager.getLogger("Hana");
        appLogger = LogManager.getLogger("App");
    }
}
