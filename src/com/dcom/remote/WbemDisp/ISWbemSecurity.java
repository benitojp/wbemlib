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

public interface ISWbemSecurity extends ISWbem {
    /**
     * getImpersonationLevel. The security impersonation level
     *
     * @return A com.dcom.remote.wbemdisp.WbemImpersonationLevelEnum constant
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getImpersonationLevel() throws AutomationException;

    /**
     * setImpersonationLevel. The security impersonation level
     *
     * @param iImpersonationLevel A com.dcom.remote.wbemdisp.WbemImpersonationLevelEnum constant (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setImpersonationLevel(
            int iImpersonationLevel) throws AutomationException;

    /**
     * getAuthenticationLevel. The security authentication level
     *
     * @return A com.dcom.remote.wbemdisp.WbemAuthenticationLevelEnum constant
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getAuthenticationLevel() throws AutomationException;

    /**
     * setAuthenticationLevel. The security authentication level
     *
     * @param iAuthenticationLevel A com.dcom.remote.wbemdisp.WbemAuthenticationLevelEnum constant (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setAuthenticationLevel(
            int iAuthenticationLevel) throws AutomationException;

    /**
     * getPrivileges. The collection of privileges for this object
     *
     * @return An reference to a ISWbemPrivilegeSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemPrivilegeSet getPrivileges() throws AutomationException;

//    String IID = "b54d66e6-2287-11d2-8b33-00600806d9b6";
//    String DISPID_1_GET_NAME = "getImpersonationLevel";
//    String DISPID_1_PUT_NAME = "setImpersonationLevel";
//    String DISPID_2_GET_NAME = "getAuthenticationLevel";
//    String DISPID_2_PUT_NAME = "setAuthenticationLevel";
//    String DISPID_3_GET_NAME = "getPrivileges";
}
