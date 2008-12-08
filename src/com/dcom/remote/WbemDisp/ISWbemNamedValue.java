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

public interface ISWbemNamedValue extends ISWbem {

    /**
     * getValue. The Value of this Named element
     *
     * @return A Variant
     * @throws AutomationException If the remote server throws an exception.
     */
    public Object getValue() throws AutomationException;

    /**
     * setValue. The Value of this Named element
     *
     * @param varValue A Variant (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setValue(
            Object varValue) throws AutomationException;

    /**
     * getName. The Name of this Value
     *
     * @return The strName
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getName() throws AutomationException;

//    String IID = "76a64164-cb41-11d1-8b02-00600806d9b6";
//    String DISPID_0_GET_NAME = "getValue";
//    String DISPID_0_PUT_NAME = "setValue";
//    String DISPID_2_GET_NAME = "getName";
}
