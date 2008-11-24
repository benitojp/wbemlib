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

import com.dcom.exception.AutomationException;
import org.jinterop.dcom.impls.automation.IJIEnumVariant;

public interface ISWbemNamedValueSet extends ISWbem {
    /**
     * get_NewEnum.
     *
     * @return An enumeration.
     * @throws AutomationException If the remote server throws an exception.
     */
    public IJIEnumVariant get_NewEnum() throws AutomationException;

    /**
     * item. Get a named value from this Collection
     *
     * @param strName The strName (in)
     * @param iFlags  The iFlags (in, optional, pass 0 if not required)
     * @return An reference to a ISWbemNamedValue
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemNamedValue item(
            String strName,
            int iFlags) throws AutomationException;

    /**
     * getCount. The number of items in this collection
     *
     * @return The iCount
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getCount() throws AutomationException;

    /**
     * add. Add a named value to this collection
     *
     * @param strName  The strName (in)
     * @param varValue A Variant (in)
     * @param iFlags   The iFlags (in, optional, pass 0 if not required)
     * @return An reference to a ISWbemNamedValue
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemNamedValue add(
            String strName,
            Object varValue,
            int iFlags) throws AutomationException;

    /**
     * remove. Remove a named value from this collection
     *
     * @param strName The strName (in)
     * @param iFlags  The iFlags (in, optional, pass 0 if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void remove(
            String strName,
            int iFlags) throws AutomationException;

    /**
     * zz_clone. Make a copy of this collection
     *
     * @return An reference to a ISWbemNamedValueSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemNamedValueSet zz_clone() throws AutomationException;

    /**
     * deleteAll. Delete all items in this collection
     *
     * @throws AutomationException If the remote server throws an exception.
     */
    public void deleteAll() throws AutomationException;

//    String IID = "cf2376ea-ce8c-11d1-8b05-00600806d9b6";
//    String DISPID__4_GET_NAME = "get_NewEnum";
//    String DISPID_0_NAME = "item";
//    String DISPID_1_GET_NAME = "getCount";
//    String DISPID_2_NAME = "add";
//    String DISPID_3_NAME = "remove";
//    String DISPID_4_NAME = "zz_clone";
//    String DISPID_5_NAME = "deleteAll";
}
