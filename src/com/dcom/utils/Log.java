/**
 * WBEM lib
 *
 * Copyright (C) 2008  Igor Vdovichenko
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * Though a sincere effort has been made to deliver a professional,
 * quality product,the library itself is distributed WITHOUT ANY WARRANTY;
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 */
package com.dcom.utils;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @author mio
 */
public class Log {

    private static Log _instance = null;
    private static Logger _logger = Logger.getLogger("com.dcom.wbemlib");

    private Log() {
        setInBuiltLogHandler(false);
    }

    public synchronized static Log getInstance() {
        if (_instance == null) {
            _instance = new Log();
        }

        return _instance;
    }

    /**
     * Returns the logger identified by the name "com.vizioncore.vautomator.ap.mshv".
     *
     * @return Logger
     */
    public Logger getLogger() {
        return _logger;
    }

    /**
     * Return method name
     *
     * @return method name
     */
    public static String getMethodName() {
        StackTraceElement[] elms = Thread.currentThread().getStackTrace();
        return elms[3].getMethodName();
    }

    /**
     * Return class name
     *
     * @return Return class name
     */
    public static String getClassName() {
        StackTraceElement[] elms = Thread.currentThread().getStackTrace();
        return elms[3].getClassName();
    }


    /**
     * setInBuiltLogHandler()
     *
     * @param useParentHandlers true if output is to be sent to the logger's parent.
     */
    protected void setInBuiltLogHandler(boolean useParentHandlers) {

        try {
            _logger.setLevel(Level.ALL);
            _logger.setUseParentHandlers(useParentHandlers);

            FileHandler fileHandler = new FileHandler("%t/wbemlib%g.log", 0, 1, true);
            fileHandler.setFormatter(new SimpleFormatter());
            _logger.addHandler(fileHandler);

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


    }

    /**
     * Log throwing the given exception.
     *
     * @param e Exception
     */
    public static void throwing(Exception e) {
        _logger.throwing(Log.getClassName(), Log.getMethodName(), e);
    }
}
