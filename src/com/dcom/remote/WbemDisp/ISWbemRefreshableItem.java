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

public interface ISWbemRefreshableItem extends ISWbem {
    /**
     * getIndex. The index of this item in the parent refresher
     *
     * @return The iIndex
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getIndex() throws AutomationException;

    /**
     * getRefresher. The parent refresher
     *
     * @return An reference to a ISWbemRefresher
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemRefresher getRefresher() throws AutomationException;

    /**
     * isSet. Whether this item represents a single object or an object set
     *
     * @return The bIsSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isSet() throws AutomationException;

    /**
     * getObject. The object
     *
     * @return An reference to a ISWbemObjectEx
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectEx getObject() throws AutomationException;

    /**
     * getObjectSet. The object set
     *
     * @return An reference to a ISWbemObjectSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectSet getObjectSet() throws AutomationException;

    /**
     * remove. Remove this item from the parent refresher
     *
     * @param iFlags The iFlags (in, optional, pass 0 if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void remove(
            int iFlags) throws AutomationException;


//    String IID = "5ad4bf92-daab-11d3-b38f-00105a1f473a";
//    String DISPID_1_GET_NAME = "getIndex";
//    String DISPID_2_GET_NAME = "getRefresher";
//    String DISPID_3_GET_NAME = "isSet";
//    String DISPID_4_GET_NAME = "getObject";
//    String DISPID_5_GET_NAME = "getObjectSet";
//    String DISPID_6_NAME = "remove";
}
