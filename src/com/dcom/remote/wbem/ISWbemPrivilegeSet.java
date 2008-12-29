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

public interface ISWbemPrivilegeSet extends ISWbem {

    /**
     * get_NewEnum.
     *
     * @return An enumeration.
     * @throws AutomationException If the remote server throws an exception.
     */
    public IJIEnumVariant get_NewEnum() throws AutomationException;

    /**
     * item. Get a named Privilege from this collection
     *
     * @param iPrivilege A com.dcom.remote.wbemdisp.WbemPrivilegeEnum constant (in)
     * @return An reference to a ISWbemPrivilege
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemPrivilege item(
            int iPrivilege) throws AutomationException;

    /**
     * getCount. The number of items in this collection
     *
     * @return The iCount
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getCount() throws AutomationException;

    /**
     * add. Add a Privilege to this collection
     *
     * @param iPrivilege A com.dcom.remote.wbemdisp.WbemPrivilegeEnum constant (in)
     * @param bIsEnabled The bIsEnabled (in, optional, pass true if not required)
     * @return An reference to a ISWbemPrivilege
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemPrivilege add(
            int iPrivilege,
            boolean bIsEnabled) throws AutomationException;

    /**
     * remove. Remove a Privilege from this collection
     *
     * @param iPrivilege A com.dcom.remote.wbemdisp.WbemPrivilegeEnum constant (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void remove(
            int iPrivilege) throws AutomationException;

    /**
     * deleteAll. Delete all items in this collection
     *
     * @throws AutomationException If the remote server throws an exception.
     */
    public void deleteAll() throws AutomationException;

    /**
     * addAsString. Add a named Privilege to this collection
     *
     * @param strPrivilege The strPrivilege (in)
     * @param bIsEnabled   The bIsEnabled (in, optional, pass true if not required)
     * @return An reference to a ISWbemPrivilege
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemPrivilege addAsString(
            String strPrivilege,
            boolean bIsEnabled) throws AutomationException;

//    String IID = "26ee67bf-5804-11d2-8b4a-00600806d9b6";
//    String DISPID__4_GET_NAME = "get_NewEnum";
//    String DISPID_0_NAME = "item";
//    String DISPID_1_GET_NAME = "getCount";
//    String DISPID_2_NAME = "add";
//    String DISPID_3_NAME = "remove";
//    String DISPID_4_NAME = "deleteAll";
//    String DISPID_5_NAME = "addAsString";
    
}
