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

import com.dcom.exception.AutomationException;
import org.jinterop.dcom.impls.automation.IJIEnumVariant;

public interface ISWbemPropertySet extends ISWbem {
    /**
     * get_NewEnum.
     *
     * @return An enumeration.
     * @throws AutomationException If the remote server throws an exception.
     */
    public IJIEnumVariant get_NewEnum() throws AutomationException;

    /**
     * item. Get a named Property from this collection
     *
     * @param strName The strName (in)
     * @param iFlags  The iFlags (in, optional, pass 0 if not required)
     * @return An reference to a ISWbemProperty
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemProperty item(
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
     * add. Add a Property to this collection
     *
     * @param strName  The strName (in)
     * @param iCimType A com.dcom.remote.WbemDisp.WbemCimtypeEnum constant (in)
     * @param bIsArray The bIsArray (in, optional, pass false if not required)
     * @param iFlags   The iFlags (in, optional, pass 0 if not required)
     * @return An reference to a ISWbemProperty
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemProperty add(
            String strName,
            int iCimType,
            boolean bIsArray,
            int iFlags) throws AutomationException;

    /**
     * remove. Remove a Property from this collection
     *
     * @param strName The strName (in)
     * @param iFlags  The iFlags (in, optional, pass 0 if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void remove(
            String strName,
            int iFlags) throws AutomationException;

//    String IID = "dea0a7b2-d4ba-11d1-8b09-00600806d9b6";
//    String DISPID__4_GET_NAME = "get_NewEnum";
//    String DISPID_0_NAME = "item";
//    String DISPID_1_GET_NAME = "getCount";
//    String DISPID_2_NAME = "add";
//    String DISPID_3_NAME = "remove";
}
