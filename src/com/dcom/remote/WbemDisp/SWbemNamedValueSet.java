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

import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIVariant;
import org.jinterop.dcom.core.JIString;
import org.jinterop.dcom.impls.automation.IJIEnumVariant;
import org.jinterop.dcom.impls.JIObjectFactory;
import org.jinterop.dcom.common.JIException;
import com.dcom.client.ClientInfo;
import com.dcom.exception.DCOMException;
import com.dcom.exception.AutomationException;
import com.dcom.utils.Log;


public class SWbemNamedValueSet extends WbemDisp implements ISWbemNamedValueSet {

    public SWbemNamedValueSet(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "cf2376ea-ce8c-11d1-8b05-00600806d9b6");
    }
    
    @Override
    public IJIEnumVariant get_NewEnum() throws AutomationException {
        try {
            IJIComObject objCom = (IJIComObject) getResult(get("_NewEnum"));
            IJIEnumVariant enumVARIANT = (IJIEnumVariant) JIObjectFactory.narrowObject(objCom.queryInterface(IJIEnumVariant.IID));
            return enumVARIANT;
        } catch (JIException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemNamedValue item(String strName, int iFlags) throws AutomationException {
        try {
            Object[] params = new Object[]{
                    new JIString(strName),
                    new Integer(iFlags),
            };
            return (new SWbemNamedValue(getClientInfo(), (IJIComObject) getResult(callMethod("Item", params))));

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public int getCount() throws AutomationException {
        try {
            return (Integer) getResult(get("Count"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemNamedValue add(String strName, Object varValue, int iFlags) throws AutomationException {
        try {
            Object[] params = new Object[]{
                    new JIString(strName),
                    new JIVariant(varValue),
                    new Integer(iFlags),
            };
            return (new SWbemNamedValue(getClientInfo(), (IJIComObject) getResult(callMethod("Add", params))));

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void remove(String strName, int iFlags) throws AutomationException {
        try {
            Object[] params = new Object[]{
                    new JIString(strName),
                    new Integer(iFlags),
            };
            callMethod("Remove", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemNamedValueSet zz_clone() throws AutomationException {
        try {
            return (new SWbemNamedValueSet(getClientInfo(), (IJIComObject) getResult(callMethod("Clone"))));

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void deleteAll() throws AutomationException {
        try {
            callMethod("deleteAll");
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }



}
