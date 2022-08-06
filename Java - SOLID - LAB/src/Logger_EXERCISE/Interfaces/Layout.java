package Logger_EXERCISE.Interfaces;

import Logger_EXERCISE.Enums.ReportLevel;

public interface Layout {

    String format(String time, String message, ReportLevel reportLevel);
}
