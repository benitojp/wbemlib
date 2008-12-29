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

import com.dcom.exception.AutomationException;

public interface ISWbemLocator extends ISWbem {

    /**
     * connectServer. Connect to a Namespace
     *
     * @param strServer            The strServer (in, optional, pass . if not required)
     * @param strNamespace         The strNamespace (in, optional, pass  if not required)
     * @param strUser              The strUser (in, optional, pass  if not required)
     * @param strPassword          The strPassword (in, optional, pass  if not required)
     * @param strLocale            The strLocale (in, optional, pass  if not required)
     * @param strAuthority         The strAuthority (in, optional, pass  if not required)
     * @param iSecurityFlags       The iSecurityFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemServices
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemServices connectServer(
            String strServer,
            String strNamespace,
            String strUser,
            String strPassword,
            String strLocale,
            String strAuthority,
            int iSecurityFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * getSecurity_. The Security Configurator for this Object
     *
     * @return An reference to a ISWbemSecurity
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemSecurity getSecurity_() throws AutomationException;

//
//  String IID = "76a6415b-cb41-11d1-8b02-00600806d9b6";
//  String DISPID_1_NAME = "connectServer";
//  String DISPID_2_GET_NAME = "getSecurity_";
}
