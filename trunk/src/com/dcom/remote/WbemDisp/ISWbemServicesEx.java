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

public interface ISWbemServicesEx extends ISWbemServices, ISWbem {
    /**
     * put. Save the Object to this Namespace
     *
     * @param objWbemObject        An reference to a ISWbemObjectEx (in)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObjectPath
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectPath put(ISWbemObjectEx objWbemObject, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * putAsync. Save the Object to this Namespace asynchronously
     *
     * @param objWbemSink          An reference to a ISWbemSink (in)
     * @param objWbemObject        An reference to a ISWbemObjectEx (in)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void putAsync(ISWbemSink objWbemSink, ISWbemObjectEx objWbemObject, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException;

//  String IID = "d2f68443-85dc-427e-91d8-366554cc754c";
//  String DISPID_20_NAME = "put";
//  String DISPID_21_NAME = "putAsync";
}
