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
import org.jinterop.dcom.core.IJIComObject;

public class SWbemMethod extends WbemDisp implements ISWbemMethod {

    public SWbemMethod(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "422e8e90-d955-11d1-8b09-00600806d9b6");
    }

    @Override
    public String getName() throws AutomationException {
        try {
            return (String) getResult(get("Name"));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public String getOrigin() throws AutomationException {
        try {
            return (String) getResult(get("Origin"));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObject getInParameters() throws AutomationException {
        try {
            return (new SWbemObject(getClientInfo(), (IJIComObject) getResult(get("InParameters"))));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObject getOutParameters() throws AutomationException {
        try {
            return (new SWbemObject(getClientInfo(), (IJIComObject) getResult(get("OutParameters"))));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemQualifierSet getQualifiers_() throws AutomationException {
        try {
            return (new SWbemQualifierSet(getClientInfo(), (IJIComObject) getResult(get("Qualifiers_"))));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }
}
