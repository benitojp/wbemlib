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

public interface ISWbemPrivilege extends ISWbem {

    /**
     * isEnabled. Whether the Privilege is to be enabled or disabled
     *
     * @return The bIsEnabled
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isEnabled() throws AutomationException;

    /**
     * setIsEnabled. Whether the Privilege is to be enabled or disabled
     *
     * @param bIsEnabled The bIsEnabled (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setIsEnabled(
            boolean bIsEnabled) throws AutomationException;

    /**
     * getName. The name of the Privilege
     *
     * @return The strDisplayName
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getName() throws AutomationException;

    /**
     * getDisplayName. The display name of the Privilege
     *
     * @return The strDisplayName
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getDisplayName() throws AutomationException;

    /**
     * getIdentifier. The Privilege identifier
     *
     * @return A com.dcom.remote.wbemdisp.WbemPrivilegeEnum constant
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getIdentifier() throws AutomationException;

//    String IID = "26ee67bd-5804-11d2-8b4a-00600806d9b6";
//    String DISPID_0_GET_NAME = "isEnabled";
//    String DISPID_0_PUT_NAME = "setIsEnabled";
//    String DISPID_1_GET_NAME = "getName";
//    String DISPID_2_GET_NAME = "getDisplayName";
//    String DISPID_3_GET_NAME = "getIdentifier";
    
}
