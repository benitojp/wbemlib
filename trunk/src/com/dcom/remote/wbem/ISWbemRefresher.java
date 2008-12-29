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

public interface ISWbemRefresher extends ISWbem {

    /**
     * get_NewEnum.
     *
     * @return    An enumeration.

     * @exception AutomationException If the remote server throws an exception.
     */
    public java.util.Enumeration get_NewEnum() throws AutomationException;

    /**
     * item. Get an item from this refresher
     *
     * @param     iIndex The iIndex (in)
     * @return    An reference to a ISWbemRefreshableItem

     * @exception AutomationException If the remote server throws an exception.
     */
    public ISWbemRefreshableItem item(
            int iIndex) throws AutomationException;

    /**
     * getCount. The number of items in this refresher
     *
     * @return    The iCount

     * @exception AutomationException If the remote server throws an exception.
     */
    public int getCount() throws AutomationException;

    /**
     * add. Add a refreshable instance to this refresher
     *
     * @param     objWbemServices An reference to a ISWbemServicesEx (in)
     * @param     bsInstancePath The bsInstancePath (in)
     * @param     iFlags The iFlags (in, optional, pass 0 if not required)
     * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return    An reference to a ISWbemRefreshableItem

     * @exception AutomationException If the remote server throws an exception.
     */
    public ISWbemRefreshableItem add(
            ISWbemServicesEx objWbemServices,
            String bsInstancePath,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * addEnum. Add a refreshable enumerator to this refresher
     *
     * @param     objWbemServices An reference to a ISWbemServicesEx (in)
     * @param     bsClassName The bsClassName (in)
     * @param     iFlags The iFlags (in, optional, pass 0 if not required)
     * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return    An reference to a ISWbemRefreshableItem

     * @exception AutomationException If the remote server throws an exception.
     */
    public ISWbemRefreshableItem addEnum(
            ISWbemServicesEx objWbemServices,
            String bsClassName,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * remove. Remove an item from this refresher
     *
     * @param     iIndex The iIndex (in)
     * @param     iFlags The iFlags (in, optional, pass 0 if not required)

     * @exception AutomationException If the remote server throws an exception.
     */
    public void remove(
            int iIndex,
            int iFlags) throws AutomationException;

    /**
     * refresh. Refresh all items in this collection
     *
     * @param     iFlags The iFlags (in, optional, pass 0 if not required)

     * @exception AutomationException If the remote server throws an exception.
     */
    public void refresh(
            int iFlags) throws AutomationException;

    /**
     * isAutoReconnect. Whether to attempt auto-reconnection to a remote provider
     *
     * @return    The bCount

     * @exception AutomationException If the remote server throws an exception.
     */
    public boolean isAutoReconnect() throws AutomationException;

    /**
     * setAutoReconnect. Whether to attempt auto-reconnection to a remote provider
     *
     * @param     bCount The bCount (in)

     * @exception AutomationException If the remote server throws an exception.
     */
    public void setAutoReconnect(
            boolean bCount) throws AutomationException;

    /**
     * deleteAll. Delete all items in this collection
     *

     * @exception AutomationException If the remote server throws an exception.
     */
    public void deleteAll() throws AutomationException;
//  String IID = "14d8250e-d9c2-11d3-b38f-00105a1f473a";
//  String DISPID__4_GET_NAME = "get_NewEnum";
//  String DISPID_0_NAME = "item";
//  String DISPID_1_GET_NAME = "getCount";
//  String DISPID_2_NAME = "add";
//  String DISPID_3_NAME = "addEnum";
//  String DISPID_4_NAME = "remove";
//  String DISPID_5_NAME = "refresh";
//  String DISPID_6_GET_NAME = "isAutoReconnect";
//  String DISPID_6_PUT_NAME = "setAutoReconnect";
//  String DISPID_7_NAME = "deleteAll";
    
}
