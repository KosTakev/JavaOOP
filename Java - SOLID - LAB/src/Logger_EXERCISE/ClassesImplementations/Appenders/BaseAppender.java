package Logger_EXERCISE.ClassesImplementations.Appenders;

import Logger_EXERCISE.Interfaces.Appender;
import Logger_EXERCISE.Interfaces.Layout;

public abstract class BaseAppender implements Appender {
    Layout layout;

    public BaseAppender(Layout layout) {
        this.layout = layout;
    }
}
