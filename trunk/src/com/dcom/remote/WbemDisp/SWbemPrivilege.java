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

import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIVariant;
import com.dcom.client.ClientInfo;
import com.dcom.exception.DCOMException;
import com.dcom.exception.AutomationException;

public class SWbemPrivilege extends WbemDisp implements ISWbemPrivilege {

    public SWbemPrivilege(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "26ee67bd-5804-11d2-8b4a-00600806d9b6");
    }

    @Override
    public boolean isEnabled() throws AutomationException {
        try {
            return (Boolean) getResult(get("IsEnabled"));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void setIsEnabled(boolean bIsEnabled) throws AutomationException {
        try {
            put("IsEnabled", new JIVariant(bIsEnabled));
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
    public String getDisplayName() throws AutomationException {
        try {
            return (String) getResult(get("DisplayName"));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public int getIdentifier() throws AutomationException {
        try {
            return (Integer) getResult(get("Identifier"));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }
}
