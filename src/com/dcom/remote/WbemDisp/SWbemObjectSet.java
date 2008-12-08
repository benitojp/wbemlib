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
import org.jinterop.dcom.core.JIVariant;
import org.jinterop.dcom.impls.JIObjectFactory;
import org.jinterop.dcom.impls.automation.IJIEnumVariant;

public class SWbemObjectSet extends WbemDisp implements ISWbemObjectSet {

    public SWbemObjectSet(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "76a6415f-cb41-11d1-8b02-00600806d9b6");
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
    public ISWbemObject item(String strObjectPath, int iFlags) throws AutomationException {
        try {
            Object[] params = new Object[]{
                ((strObjectPath == null)) ? JIVariant.OPTIONAL_PARAM() : new JIString(strObjectPath),
                new Integer(iFlags),};
            return (new SWbemObject(getClientInfo(), (IJIComObject) getResult(callMethod("Item", params))));

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
    public ISWbemSecurity getSecurity_() throws AutomationException {
        try {
            return (new SWbemSecurity(getClientInfo(), (IJIComObject) getResult(get("Security_"))));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }
}
