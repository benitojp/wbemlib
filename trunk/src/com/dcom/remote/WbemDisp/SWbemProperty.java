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
import org.jinterop.dcom.core.JIVariant;

public class SWbemProperty extends WbemDisp implements ISWbemProperty {

    public SWbemProperty(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "1a388f98-d4ba-11d1-8b09-00600806d9b6");
    }

    @Override
    public Object getValue() throws AutomationException {
        try {
            return getResult(get("Value"));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void setValue(Object varValue) throws AutomationException {
        try {
            put("Value", new JIVariant(varValue));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
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
    public boolean isLocal() throws AutomationException {
        try {
            return (Boolean) getResult(get("Local"));
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
    public int getCIMType() throws AutomationException {
        try {
            return (Integer) getResult(get("CIMType"));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemQualifierSet getQualifiers_() throws AutomationException {
        try {
            return (new SWbemQualifierSet(getClientInfo(), (IJIComObject) getResult(get("SWbemQualifierSet"))));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public boolean isArray() throws AutomationException {
        try {
            return (Boolean) getResult(get("Array"));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }
}
