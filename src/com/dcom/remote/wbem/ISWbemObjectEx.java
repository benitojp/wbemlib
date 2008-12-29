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

public interface ISWbemObjectEx extends ISWbemObject, ISWbem {

    /**
     * refresh_. Refresh this Object
     *
     * @param     iFlags The iFlags (in, optional, pass 0 if not required)
     * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)

     * @exception AutomationException If the remote server throws an exception.
     */
    public void refresh_(int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * getSystemProperties_. The collection of System Properties of this Object
     *
     * @return    An reference to a ISWbemPropertySet
     * @exception AutomationException If the remote server throws an exception.
     */
    public ISWbemPropertySet getSystemProperties_() throws AutomationException;

    /**
     * getText_. Retrieve a textual representation of this Object
     *
     * @param     iObjectTextFormat A com.dcom.remote.wbemdisp.WbemObjectTextFormatEnum constant (in)
     * @param     iFlags The iFlags (in, optional, pass 0 if not required)
     * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return    The bsText
     * @exception AutomationException If the remote server throws an exception.
     */
    public String getText_(
            int iObjectTextFormat,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * setFromText_. Set this Object using the supplied textual representation
     *
     * @param     bsText The bsText (in)
     * @param     iObjectTextFormat A com.dcom.remote.wbemdisp.WbemObjectTextFormatEnum constant (in)
     * @param     iFlags The iFlags (in, optional, pass 0 if not required)
     * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @exception AutomationException If the remote server throws an exception.
     */
    public void setFromText_(
            String bsText,
            int iObjectTextFormat,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;
//  String IID = "269ad56a-8a67-4129-bc8c-0506dcfe9880";
//  String DISPID_26_NAME = "refresh_";
//  String DISPID_27_GET_NAME = "getSystemProperties_";
//  String DISPID_28_NAME = "getText_";
//  String DISPID_29_NAME = "setFromText_";
}
