package clock.core;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ed
 * Date: 8/17/13
 * Time: 10:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class Logger {

    private Logger() {};

    private static final Object lock = new Object();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss.S");

    public static void log(final String text)
    {
            synchronized(lock)
            {
                 Date now = new Date();
                 print(sdf.format(now) + ": " + text);
            }
    }

    public static void log(final Exception e)
    {
        synchronized(lock)
        {
            final Writer result = new StringWriter();
            final PrintWriter printWriter = new PrintWriter(result);
            e.printStackTrace(printWriter);
            print (sdf.format(new Date())
                    + ": \n\n"
                    + result.toString());
        }
    }


    private static void print(String s)
    {
         System.out.println(s);
    }

}
