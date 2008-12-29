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
import org.jinterop.dcom.impls.automation.IJIDispatch;

public interface ISWbemProperty extends java.io.Serializable {

    /**
     * getValue. The value of this Property
     *
     * @return A Variant
     * @throws AutomationException If the remote server throws an exception.
     */
    public Object getValue() throws AutomationException;

    /**
     * setValue. The value of this Property
     *
     * @param varValue A Variant (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setValue(
            Object varValue) throws AutomationException;

    /**
     * getName. The name of this Property
     *
     * @return The strName
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getName() throws AutomationException;

    /**
     * isLocal. Indicates whether this Property is local or propagated
     *
     * @return The bIsLocal
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isLocal() throws AutomationException;

    /**
     * getOrigin. The originating class of this Property
     *
     * @return The strOrigin
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getOrigin() throws AutomationException;

    /**
     * getCIMType. The CIM Type of this Property
     *
     * @return A com.dcom.remote.wbemdisp.WbemCimtypeEnum constant
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getCIMType() throws AutomationException;

    /**
     * getQualifiers_. The collection of Qualifiers of this Property
     *
     * @return An reference to a ISWbemQualifierSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemQualifierSet getQualifiers_() throws AutomationException;

    /**
     * isArray. Indicates whether this Property is an array type
     *
     * @return The bIsArray
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isArray() throws AutomationException;

    /**
     * getIID()
     *
     * @return
     */
    public String getIID();

    /**
     * getDispatch()
     *
     * @return IJIDispatch
     */
    public IJIDispatch getDispatch() throws AutomationException;

//  String IID = "1a388f98-d4ba-11d1-8b09-00600806d9b6";
//  String DISPID_0_GET_NAME = "getValue";
//  String DISPID_0_PUT_NAME = "setValue";
//  String DISPID_1_GET_NAME = "getName";
//  String DISPID_2_GET_NAME = "isLocal";
//  String DISPID_3_GET_NAME = "getOrigin";
//  String DISPID_4_GET_NAME = "getCIMType";
//  String DISPID_5_GET_NAME = "getQualifiers_";
//  String DISPID_6_GET_NAME = "isArray";
    
}
