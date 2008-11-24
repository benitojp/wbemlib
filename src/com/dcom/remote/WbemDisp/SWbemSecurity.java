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


public class SWbemSecurity extends WbemDisp implements ISWbemSecurity {

    public SWbemSecurity(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "b54d66e6-2287-11d2-8b33-00600806d9b6");
    }

    @Override
    public int getImpersonationLevel() throws AutomationException {
        try {
            return (Integer) getResult(get("ImpersonationLevel"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setImpersonationLevel(int iImpersonationLevel) throws AutomationException {
        try {
            put("ImpersonationLevel", new JIVariant(iImpersonationLevel));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public int getAuthenticationLevel() throws AutomationException {
        try {
            return (Integer) getResult(get("AuthenticationLevel"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setAuthenticationLevel(int iAuthenticationLevel) throws AutomationException {
        try {
            put("AuthenticationLevel", new JIVariant(iAuthenticationLevel));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemPrivilegeSet getPrivileges() throws AutomationException {
        try {
            return (new SWbemPrivilegeSet(getClientInfo(), (IJIComObject) getResult(get("Privileges"))));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }
}
