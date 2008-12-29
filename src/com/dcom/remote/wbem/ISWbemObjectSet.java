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
import org.jinterop.dcom.impls.automation.IJIEnumVariant;

public interface ISWbemObjectSet extends ISWbem {

    /**
     * get_NewEnum.
     *
     * @return An enumeration.
     * @throws AutomationException If the remote server throws an exception.
     */
    public IJIEnumVariant get_NewEnum() throws AutomationException;

    /**
     * item. Get an Object with a specific path from this collection
     *
     * @param strObjectPath The strObjectPath (in)
     * @param iFlags        The iFlags (in, optional, pass 0 if not required)
     * @return An reference to a ISWbemObject
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObject item(
            String strObjectPath,
            int iFlags) throws AutomationException;

    /**
     * getCount. The number of items in this collection
     *
     * @return The iCount
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getCount() throws AutomationException;

    /**
     * getSecurity_. The Security Configurator for this Object
     *
     * @return An reference to a ISWbemSecurity
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemSecurity getSecurity_() throws AutomationException;

//    String IID = "76a6415f-cb41-11d1-8b02-00600806d9b6";
//    String DISPID__4_GET_NAME = "get_NewEnum";
//    String DISPID_0_NAME = "item";
//    String DISPID_1_GET_NAME = "getCount";
//    String DISPID_4_GET_NAME = "getSecurity_";
    
}
