package Logger_EXERCISE.Interfaces;

import Logger_EXERCISE.Enums.ReportLevel;

public interface Appender {

    void append(String time, String message, ReportLevel reportLevel);
}
