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
package com.dcom.remote.wbemdisp;

import com.dcom.client.ClientInfo;
import com.dcom.exception.DCOMException;
import com.dcom.exception.AutomationException;
import org.jinterop.dcom.core.IJIComObject;

public class SWbemEventSource extends WbemDisp implements ISWbemEventSource {

    public SWbemEventSource(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "27d54d92-0ebe-11d2-8b22-00600806d9b6");
    }

    @Override
    public ISWbemObject nextEvent(int iTimeoutMs) throws AutomationException {
        try {
            Object[] params = new Object[]{new Integer(iTimeoutMs)};
            return (new SWbemObject(getClientInfo(), (IJIComObject) getResult(callMethod("NextEvent", params))));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemSecurity getSecurity_() throws AutomationException {
        try {
            return (new SWbemSecurity(getClientInfo(), (IJIComObject) getResult(get("Security_"))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }
}
