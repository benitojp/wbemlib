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
package com.dcom.remote.WbemDisp;

import com.dcom.exception.AutomationException;

public interface ISWbemEventSource extends ISWbem {
    /**
     * nextEvent. Retrieve the next event within a specified time period. The timeout is specified in milliseconds.
     *
     * @param iTimeoutMs The iTimeoutMs (in, optional, pass -1 if not required)
     * @return An reference to a ISWbemObject
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObject nextEvent(
            int iTimeoutMs) throws AutomationException;

    /**
     * getSecurity_. The Security Configurator for this Object
     *
     * @return An reference to a ISWbemSecurity
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemSecurity getSecurity_() throws AutomationException;


//    String IID = "27d54d92-0ebe-11d2-8b22-00600806d9b6";
//    String DISPID_1_NAME = "nextEvent";
//    String DISPID_2_GET_NAME = "getSecurity_";
}
