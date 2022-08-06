package Logger_EXERCISE;

import Logger_EXERCISE.ClassesImplementations.Appenders.ConsoleAppender;
import Logger_EXERCISE.ClassesImplementations.Appenders.FileAppender;
import Logger_EXERCISE.ClassesImplementations.Appenders.LogFile;
import Logger_EXERCISE.ClassesImplementations.MessageLogger;
import Logger_EXERCISE.ClassesImplementations.SimpleLayout;
import Logger_EXERCISE.Interfaces.Appender;
import Logger_EXERCISE.Interfaces.File;
import Logger_EXERCISE.Interfaces.Layout;
import Logger_EXERCISE.Interfaces.Logger;


public class Main {
    public static void main(String[] args) {

        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);

        File file = new LogFile();
        Appender fileAppender = new FileAppender(simpleLayout);
        ((FileAppender) fileAppender).setFile(file);

        Logger logger = new MessageLogger(consoleAppender, fileAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");


    }
}
