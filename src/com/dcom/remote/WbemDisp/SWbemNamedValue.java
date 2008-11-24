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
import com.dcom.exception.AutomationException;
import com.dcom.exception.DCOMException;
import com.dcom.utils.Log;
import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIVariant;

public class SWbemNamedValue extends WbemDisp implements ISWbemNamedValue {

    public SWbemNamedValue(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "76a64164-cb41-11d1-8b02-00600806d9b6");
    }   

    @Override
    public Object getValue() throws AutomationException {
        try {
            return getResult(get("Value"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setValue(Object varValue) throws AutomationException {
        try {
            put("Value", new JIVariant(varValue));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public String getName() throws AutomationException {
        try {
            return (String) getResult(get("Name"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }


}
