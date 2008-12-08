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

public interface ISWbemObjectPath extends ISWbem {

    /**
     * getPath. The full path
     *
     * @return The strPath
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getPath() throws AutomationException;

    /**
     * setPath. The full path
     *
     * @param strPath The strPath (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setPath(
            String strPath) throws AutomationException;

    /**
     * getRelPath. The relative path
     *
     * @return The strRelPath
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getRelPath() throws AutomationException;

    /**
     * setRelPath. The relative path
     *
     * @param strRelPath The strRelPath (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setRelPath(
            String strRelPath) throws AutomationException;

    /**
     * getServer. The name of the Server
     *
     * @return The strServer
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getServer() throws AutomationException;

    /**
     * setServer. The name of the Server
     *
     * @param strServer The strServer (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setServer(
            String strServer) throws AutomationException;

    /**
     * getNamespace. The Namespace path
     *
     * @return The strNamespace
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getNamespace() throws AutomationException;

    /**
     * setNamespace. The Namespace path
     *
     * @param strNamespace The strNamespace (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setNamespace(
            String strNamespace) throws AutomationException;

    /**
     * getParentNamespace. The parent Namespace path
     *
     * @return The strParentNamespace
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getParentNamespace() throws AutomationException;

    /**
     * getDisplayName. The Display Name for this path
     *
     * @return The strDisplayName
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getDisplayName() throws AutomationException;

    /**
     * setDisplayName. The Display Name for this path
     *
     * @param strDisplayName The strDisplayName (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setDisplayName(
            String strDisplayName) throws AutomationException;

    /**
     * getClass. The Class name
     *
     * @return The strClass
     * @throws AutomationException If the remote server throws an exception.
     */
    public String zz_getClass() throws AutomationException;

    /**
     * setClass. The Class name
     *
     * @param strClass The strClass (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setClass(
            String strClass) throws AutomationException;

    /**
     * isClass. Indicates whether this path addresses a Class
     *
     * @return The bIsClass
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isClass() throws AutomationException;

    /**
     * setAsClass. Coerce this path to address a Class
     *
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setAsClass() throws AutomationException;

    /**
     * isSingleton. Indicates whether this path addresses a Singleton Instance
     *
     * @return The bIsSingleton
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isSingleton() throws AutomationException;

    /**
     * setAsSingleton. Coerce this path to address a Singleton Instance
     *
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setAsSingleton() throws AutomationException;

    /**
     * getKeys. The collection of Key value bindings for this path
     *
     * @return An reference to a ISWbemNamedValueSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemNamedValueSet getKeys() throws AutomationException;

    /**
     * getSecurity_. Defines the security components of this path
     *
     * @return An reference to a ISWbemSecurity
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemSecurity getSecurity_() throws AutomationException;

    /**
     * getLocale. Defines locale component of this path
     *
     * @return The strLocale
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getLocale() throws AutomationException;

    /**
     * setLocale. Defines locale component of this path
     *
     * @param strLocale The strLocale (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setLocale(
            String strLocale) throws AutomationException;

    /**
     * getAuthority. Defines authentication authority component of this path
     *
     * @return The strAuthority
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getAuthority() throws AutomationException;

    /**
     * setAuthority. Defines authentication authority component of this path
     *
     * @param strAuthority The strAuthority (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setAuthority(
            String strAuthority) throws AutomationException;
//    String IID = "5791bc27-ce9c-11d1-97bf-0000f81e849c";
//    String DISPID_0_GET_NAME = "getPath";
//    String DISPID_0_PUT_NAME = "setPath";
//    String DISPID_1_GET_NAME = "getRelPath";
//    String DISPID_1_PUT_NAME = "setRelPath";
//    String DISPID_2_GET_NAME = "getServer";
//    String DISPID_2_PUT_NAME = "setServer";
//    String DISPID_3_GET_NAME = "getNamespace";
//    String DISPID_3_PUT_NAME = "setNamespace";
//    String DISPID_4_GET_NAME = "getParentNamespace";
//    String DISPID_5_GET_NAME = "getDisplayName";
//    String DISPID_5_PUT_NAME = "setDisplayName";
//    String DISPID_6_GET_NAME = "zz_getClass";
//    String DISPID_6_PUT_NAME = "setClass";
//    String DISPID_7_GET_NAME = "isClass";
//    String DISPID_8_NAME = "setAsClass";
//    String DISPID_9_GET_NAME = "isSingleton";
//    String DISPID_10_NAME = "setAsSingleton";
//    String DISPID_11_GET_NAME = "getKeys";
//    String DISPID_12_GET_NAME = "getSecurity_";
//    String DISPID_13_GET_NAME = "getLocale";
//    String DISPID_13_PUT_NAME = "setLocale";
//    String DISPID_14_GET_NAME = "getAuthority";
//    String DISPID_14_PUT_NAME = "setAuthority";
}
