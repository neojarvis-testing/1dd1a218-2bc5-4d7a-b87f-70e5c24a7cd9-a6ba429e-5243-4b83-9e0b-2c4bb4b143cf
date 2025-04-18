package utils;
 
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
 
public class LogHelper {
 
    private static final Logger logger = Logger.getLogger(LogHelper.class);
 
 
    /**
     * Description: This  logHelper code  is to create and Append a file inside log folder
     *  @author 10830839 -Kaustubh sharma 
     */
    static {
        try {
            // Set up a file appender with a timestamp in the filename
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String logFileName = "logs/logfile_" + timestamp + ".log";
           
            FileAppender fileAppender = new FileAppender(new PatternLayout("%d{ISO8601} %-5p %c - %m%n"), logFileName, true);
            logger.addAppender(fileAppender);
        } catch (Exception e) {
            logger.error("Failed to initialize logger file appender", e);
        }
    }
    /**
     * Description :This method is for the log level info
     * @param message
     */
    public static void info(String message) {
        logger.info(message);
    }
    /**
     *  Description :This method is for the log level error
     * @param message
     */
    public static void error(String message) {
        logger.error(message);
    }
<<<<<<< HEAD
<<<<<<< HEAD
}
=======
}
>>>>>>> 9f219f829f86dbf13c3e5531cb180372efe454ad
=======
}
>>>>>>> 1f54fdbeae194607d9a30e4f4896fcabdd5cb136
