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

public interface ISWbemMethod extends ISWbem {
    /**
     * getName. The name of this Method
     *
     * @return The strName
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getName() throws AutomationException;

    /**
     * getOrigin. The originating class of this Method
     *
     * @return The strOrigin
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getOrigin() throws AutomationException;

    /**
     * getInParameters. The in parameters for this Method.
     *
     * @return An reference to a ISWbemObject
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObject getInParameters() throws AutomationException;

    /**
     * getOutParameters. The out parameters for this Method.
     *
     * @return An reference to a ISWbemObject
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObject getOutParameters() throws AutomationException;

    /**
     * getQualifiers_. The collection of Qualifiers of this Method.
     *
     * @return An reference to a ISWbemQualifierSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemQualifierSet getQualifiers_() throws AutomationException;

//    String IID = "422e8e90-d955-11d1-8b09-00600806d9b6";
//    String DISPID_1_GET_NAME = "getName";
//    String DISPID_2_GET_NAME = "getOrigin";
//    String DISPID_3_GET_NAME = "getInParameters";
//    String DISPID_4_GET_NAME = "getOutParameters";
//    String DISPID_5_GET_NAME = "getQualifiers_";
}
