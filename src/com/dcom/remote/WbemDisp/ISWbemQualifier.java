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

public interface ISWbemQualifier extends ISWbem {
    /**
     * getValue. The value of this Qualifier
     *
     * @return A Variant
     * @throws AutomationException If the remote server throws an exception.
     */
    public Object getValue() throws AutomationException;

    /**
     * setValue. The value of this Qualifier
     *
     * @param varValue A Variant (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setValue(
            Object varValue) throws AutomationException;

    /**
     * getName. The name of this Qualifier
     *
     * @return The strName
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getName() throws AutomationException;

    /**
     * isLocal. Indicates whether this Qualifier is local or propagated
     *
     * @return The bIsLocal
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isLocal() throws AutomationException;

    /**
     * isPropagatesToSubclass. Determines whether this Qualifier can propagate to subclasses
     *
     * @return The bPropagatesToSubclass
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isPropagatesToSubclass() throws AutomationException;

    /**
     * setPropagatesToSubclass. Determines whether this Qualifier can propagate to subclasses
     *
     * @param bPropagatesToSubclass The bPropagatesToSubclass (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setPropagatesToSubclass(
            boolean bPropagatesToSubclass) throws AutomationException;

    /**
     * isPropagatesToInstance. Determines whether this Qualifier can propagate to instances
     *
     * @return The bPropagatesToInstance
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isPropagatesToInstance() throws AutomationException;

    /**
     * setPropagatesToInstance. Determines whether this Qualifier can propagate to instances
     *
     * @param bPropagatesToInstance The bPropagatesToInstance (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setPropagatesToInstance(
            boolean bPropagatesToInstance) throws AutomationException;

    /**
     * isOverridable. Determines whether this Qualifier can be overridden where propagated
     *
     * @return The bIsOverridable
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isOverridable() throws AutomationException;

    /**
     * setIsOverridable. Determines whether this Qualifier can be overridden where propagated
     *
     * @param bIsOverridable The bIsOverridable (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setIsOverridable(
            boolean bIsOverridable) throws AutomationException;

    /**
     * isAmended. Determines whether the value of this Qualifier has been amended
     *
     * @return The bIsAmended
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isAmended() throws AutomationException;


//    String IID = "79b05932-d3b7-11d1-8b06-00600806d9b6";
//    String DISPID_0_GET_NAME = "getValue";
//    String DISPID_0_PUT_NAME = "setValue";
//    String DISPID_1_GET_NAME = "getName";
//    String DISPID_2_GET_NAME = "isLocal";
//    String DISPID_3_GET_NAME = "isPropagatesToSubclass";
//    String DISPID_3_PUT_NAME = "setPropagatesToSubclass";
//    String DISPID_4_GET_NAME = "isPropagatesToInstance";
//    String DISPID_4_PUT_NAME = "setPropagatesToInstance";
//    String DISPID_5_GET_NAME = "isOverridable";
//    String DISPID_5_PUT_NAME = "setIsOverridable";
//    String DISPID_6_GET_NAME = "isAmended";
}
