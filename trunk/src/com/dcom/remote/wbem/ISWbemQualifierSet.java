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

public interface ISWbemQualifierSet extends ISWbem {

    /**
     * get_NewEnum.
     *
     * @return An enumeration.
     * @throws AutomationException If the remote server throws an exception.
     */
    public IJIEnumVariant get_NewEnum() throws AutomationException;

    /**
     * item. Get a named Qualifier from this collection
     *
     * @param name   The name (in)
     * @param iFlags The iFlags (in, optional, pass 0 if not required)
     * @return An reference to a ISWbemQualifier
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemQualifier item(
            String name,
            int iFlags) throws AutomationException;

    /**
     * getCount. The number of items in this collection
     *
     * @return The iCount
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getCount() throws AutomationException;

    /**
     * add. Add a Qualifier to this collection
     *
     * @param strName               The strName (in)
     * @param varVal                A Variant (in)
     * @param bPropagatesToSubclass The bPropagatesToSubclass (in, optional, pass true if not required)
     * @param bPropagatesToInstance The bPropagatesToInstance (in, optional, pass true if not required)
     * @param bIsOverridable        The bIsOverridable (in, optional, pass true if not required)
     * @param iFlags                The iFlags (in, optional, pass 0 if not required)
     * @return An reference to a ISWbemQualifier
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemQualifier add(
            String strName,
            Object varVal,
            boolean bPropagatesToSubclass,
            boolean bPropagatesToInstance,
            boolean bIsOverridable,
            int iFlags) throws AutomationException;

    /**
     * remove. Remove a Qualifier from this collection
     *
     * @param strName The strName (in)
     * @param iFlags  The iFlags (in, optional, pass 0 if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void remove(
            String strName,
            int iFlags) throws AutomationException;
//    String IID = "9b16ed16-d3df-11d1-8b08-00600806d9b6";
//    String DISPID__4_GET_NAME = "get_NewEnum";
//    String DISPID_0_NAME = "item";
//    String DISPID_1_GET_NAME = "getCount";
//    String DISPID_2_NAME = "add";
//    String DISPID_3_NAME = "remove";
    
}
