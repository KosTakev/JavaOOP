package Logger_EXERCISE.ClassesImplementations;

import Logger_EXERCISE.Enums.ReportLevel;
import Logger_EXERCISE.Interfaces.Layout;

public class SimpleLayout implements Layout {

    @Override
    public String format(String time, String message, ReportLevel reportLevel) {
        return String.format("%s - %s - %s", time, reportLevel, message);
    }
}
