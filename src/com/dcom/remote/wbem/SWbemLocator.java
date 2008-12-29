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
package com.dcom.remote.wbem;

import com.dcom.client.ClientInfo;
import com.dcom.exception.AutomationException;
import com.dcom.exception.DCOMException;
import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIString;
import org.jinterop.dcom.core.JIVariant;

public class SWbemLocator extends WbemDisp implements ISWbemLocator {

    public SWbemLocator(ClientInfo clientInfo) throws DCOMException {
        super(clientInfo, "76a6415b-cb41-11d1-8b02-00600806d9b6");
    }

    @Override
    public ISWbemServices connectServer(String strServer,
            String strNamespace,
            String strUser,
            String strPassword,
            String strLocale,
            String strAuthority,
            int iSecurityFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                ((strServer == null)) ? JIVariant.OPTIONAL_PARAM() : new JIString(strServer),
                ((strNamespace == null)) ? JIVariant.OPTIONAL_PARAM() : new JIString(strNamespace),
                ((strUser == null)) ? JIVariant.OPTIONAL_PARAM() : new JIString(strUser),
                ((strPassword == null)) ? JIVariant.OPTIONAL_PARAM() : new JIString(strPassword),
                ((strLocale == null)) ? JIVariant.OPTIONAL_PARAM() : new JIString(strLocale),
                ((strAuthority == null)) ? JIVariant.OPTIONAL_PARAM() : new JIString(strAuthority),
                new Integer(0),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            return (new SWbemServices(getClientInfo(), (IJIComObject) getResult(callMethod("ConnectServer", params))));

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
