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
import org.jinterop.dcom.common.JIException;
import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIString;
import org.jinterop.dcom.impls.JIObjectFactory;
import org.jinterop.dcom.impls.automation.IJIEnumVariant;

public class SWbemPrivilegeSet extends WbemDisp implements ISWbemPrivilegeSet {

    public SWbemPrivilegeSet(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "26ee67bf-5804-11d2-8b4a-00600806d9b6");
    }

    @Override
    public IJIEnumVariant get_NewEnum() throws AutomationException {
        try {
            IJIComObject objCom = (IJIComObject) getResult(get("_NewEnum"));
            IJIEnumVariant enumVARIANT = (IJIEnumVariant) JIObjectFactory.narrowObject(objCom.queryInterface(IJIEnumVariant.IID));
            return enumVARIANT;
        } catch (JIException e) {

            throw new AutomationException(e);

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemPrivilege item(int iPrivilege) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new Integer(iPrivilege)
            };
            return (new SWbemPrivilege(getClientInfo(), (IJIComObject) getResult(callMethod("Item", params))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public int getCount() throws AutomationException {
        try {
            return (Integer) getResult(get("Count"));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemPrivilege add(int iPrivilege, boolean bIsEnabled) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new Integer(iPrivilege),
                new Boolean(bIsEnabled),};
            return (new SWbemPrivilege(getClientInfo(), (IJIComObject) getResult(callMethod("Add", params))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void remove(int iPrivilege) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new Integer(iPrivilege)
            };
            getResult(callMethod("Remove", params));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void deleteAll() throws AutomationException {
        try {
            callMethod("DeleteAll");
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemPrivilege addAsString(String strPrivilege, boolean bIsEnabled) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strPrivilege),
                new Boolean(bIsEnabled),};
            return (new SWbemPrivilege(getClientInfo(), (IJIComObject) getResult(callMethod("Add", params))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }
}
