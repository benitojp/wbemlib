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

public interface ISWbemServices extends ISWbem {

    /**
     * get. Get a single Class or Instance
     *
     * @param strObjectPath        The strObjectPath (in, optional, pass  if not required)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObject
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObject get(
            String strObjectPath,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * getAsync. Get a single Class or Instance asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param strObjectPath        The strObjectPath (in, optional, pass  if not required)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void getAsync(
            ISWbem objWbemSink,
            String strObjectPath,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * delete. Delete a Class or Instance
     *
     * @param strObjectPath        The strObjectPath (in)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void delete(
            String strObjectPath,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * deleteAsync. Delete a Class or Instance asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param strObjectPath        The strObjectPath (in)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void deleteAsync(
            ISWbem objWbemSink,
            String strObjectPath,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * instancesOf. Enumerate the Instances of a Class
     *
     * @param strClass             The strClass (in)
     * @param iFlags               The iFlags (in, optional, pass 16 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObjectSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectSet instancesOf(
            String strClass,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * instancesOfAsync. Enumerate the Instances of a Class asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param strClass             The strClass (in)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void instancesOfAsync(
            ISWbem objWbemSink,
            String strClass,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * subclassesOf. Enumerate the subclasses of a Class
     *
     * @param strSuperclass        The strSuperclass (in, optional, pass  if not required)
     * @param iFlags               The iFlags (in, optional, pass 16 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObjectSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectSet subclassesOf(
            String strSuperclass,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * subclassesOfAsync. Enumerate the subclasses of a Class asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param strSuperclass        The strSuperclass (in, optional, pass  if not required)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void subclassesOfAsync(
            ISWbem objWbemSink,
            String strSuperclass,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * execQuery. Execute a Query
     *
     * @param strQuery             The strQuery (in)
     * @param strQueryLanguage     The strQueryLanguage (in, optional, pass WQL if not required)
     * @param iFlags               The iFlags (in, optional, pass 16 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObjectSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectSet execQuery(
            String strQuery,
            String strQueryLanguage,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * execQueryAsync. Execute an asynchronous Query
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param strQuery             The strQuery (in)
     * @param strQueryLanguage     The strQueryLanguage (in, optional, pass WQL if not required)
     * @param lFlags               The lFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void execQueryAsync(
            ISWbem objWbemSink,
            String strQuery,
            String strQueryLanguage,
            int lFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * associatorsOf. Get the Associators of a class or instance
     *
     * @param strObjectPath             The strObjectPath (in)
     * @param strAssocClass             The strAssocClass (in, optional, pass  if not required)
     * @param strResultClass            The strResultClass (in, optional, pass  if not required)
     * @param strResultRole             The strResultRole (in, optional, pass  if not required)
     * @param strRole                   The strRole (in, optional, pass  if not required)
     * @param bClassesOnly              The bClassesOnly (in, optional, pass false if not required)
     * @param bSchemaOnly               The bSchemaOnly (in, optional, pass false if not required)
     * @param strRequiredAssocQualifier The strRequiredAssocQualifier (in, optional, pass  if not required)
     * @param strRequiredQualifier      The strRequiredQualifier (in, optional, pass  if not required)
     * @param iFlags                    The iFlags (in, optional, pass 16 if not required)
     * @param objWbemNamedValueSet      A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObjectSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectSet associatorsOf(
            String strObjectPath,
            String strAssocClass,
            String strResultClass,
            String strResultRole,
            String strRole,
            boolean bClassesOnly,
            boolean bSchemaOnly,
            String strRequiredAssocQualifier,
            String strRequiredQualifier,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * associatorsOfAsync. Get the Associators of a class or instance asynchronously
     *
     * @param objWbemSink               A reference to another Automation Object (IDispatch) (in)
     * @param strObjectPath             The strObjectPath (in)
     * @param strAssocClass             The strAssocClass (in, optional, pass  if not required)
     * @param strResultClass            The strResultClass (in, optional, pass  if not required)
     * @param strResultRole             The strResultRole (in, optional, pass  if not required)
     * @param strRole                   The strRole (in, optional, pass  if not required)
     * @param bClassesOnly              The bClassesOnly (in, optional, pass false if not required)
     * @param bSchemaOnly               The bSchemaOnly (in, optional, pass false if not required)
     * @param strRequiredAssocQualifier The strRequiredAssocQualifier (in, optional, pass  if not required)
     * @param strRequiredQualifier      The strRequiredQualifier (in, optional, pass  if not required)
     * @param iFlags                    The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet      A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext       A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void associatorsOfAsync(
            ISWbem objWbemSink,
            String strObjectPath,
            String strAssocClass,
            String strResultClass,
            String strResultRole,
            String strRole,
            boolean bClassesOnly,
            boolean bSchemaOnly,
            String strRequiredAssocQualifier,
            String strRequiredQualifier,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * referencesTo. Get the References to a class or instance
     *
     * @param strObjectPath        The strObjectPath (in)
     * @param strResultClass       The strResultClass (in, optional, pass  if not required)
     * @param strRole              The strRole (in, optional, pass  if not required)
     * @param bClassesOnly         The bClassesOnly (in, optional, pass false if not required)
     * @param bSchemaOnly          The bSchemaOnly (in, optional, pass false if not required)
     * @param strRequiredQualifier The strRequiredQualifier (in, optional, pass  if not required)
     * @param iFlags               The iFlags (in, optional, pass 16 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObjectSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectSet referencesTo(
            String strObjectPath,
            String strResultClass,
            String strRole,
            boolean bClassesOnly,
            boolean bSchemaOnly,
            String strRequiredQualifier,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * referencesToAsync. Get the References to a class or instance asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param strObjectPath        The strObjectPath (in)
     * @param strResultClass       The strResultClass (in, optional, pass  if not required)
     * @param strRole              The strRole (in, optional, pass  if not required)
     * @param bClassesOnly         The bClassesOnly (in, optional, pass false if not required)
     * @param bSchemaOnly          The bSchemaOnly (in, optional, pass false if not required)
     * @param strRequiredQualifier The strRequiredQualifier (in, optional, pass  if not required)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void referencesToAsync(
            ISWbem objWbemSink,
            String strObjectPath,
            String strResultClass,
            String strRole,
            boolean bClassesOnly,
            boolean bSchemaOnly,
            String strRequiredQualifier,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * execNotificationQuery. Execute a Query to receive Notifications
     *
     * @param strQuery             The strQuery (in)
     * @param strQueryLanguage     The strQueryLanguage (in, optional, pass WQL if not required)
     * @param iFlags               The iFlags (in, optional, pass 48 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemEventSource
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemEventSource execNotificationQuery(
            String strQuery,
            String strQueryLanguage,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * execNotificationQueryAsync. Execute an asynchronous Query to receive Notifications
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param strQuery             The strQuery (in)
     * @param strQueryLanguage     The strQueryLanguage (in, optional, pass WQL if not required)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void execNotificationQueryAsync(
            ISWbem objWbemSink,
            String strQuery,
            String strQueryLanguage,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * execMethod. Execute a Method
     *
     * @param strObjectPath        The strObjectPath (in)
     * @param strMethodName        The strMethodName (in)
     * @param objWbemInParameters  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObject
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObject execMethod(
            String strObjectPath,
            String strMethodName,
            ISWbem objWbemInParameters,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * execMethodAsync. Execute a Method asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param strObjectPath        The strObjectPath (in)
     * @param strMethodName        The strMethodName (in)
     * @param objWbemInParameters  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void execMethodAsync(
            ISWbem objWbemSink,
            String strObjectPath,
            String strMethodName,
            ISWbem objWbemInParameters,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * getSecurity_. The Security Configurator for this Object
     *
     * @return An reference to a ISWbemSecurity
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemSecurity getSecurity_() throws AutomationException;

//    String IID = "76a6415c-cb41-11d1-8b02-00600806d9b6";
//    String DISPID_1_NAME = "get";
//    String DISPID_2_NAME = "getAsync";
//    String DISPID_3_NAME = "delete";
//    String DISPID_4_NAME = "deleteAsync";
//    String DISPID_5_NAME = "instancesOf";
//    String DISPID_6_NAME = "instancesOfAsync";
//    String DISPID_7_NAME = "subclassesOf";
//    String DISPID_8_NAME = "subclassesOfAsync";
//    String DISPID_9_NAME = "execQuery";
//    String DISPID_10_NAME = "execQueryAsync";
//    String DISPID_11_NAME = "associatorsOf";
//    String DISPID_12_NAME = "associatorsOfAsync";
//    String DISPID_13_NAME = "referencesTo";
//    String DISPID_14_NAME = "referencesToAsync";
//    String DISPID_15_NAME = "execNotificationQuery";
//    String DISPID_16_NAME = "execNotificationQueryAsync";
//    String DISPID_17_NAME = "execMethod";
//    String DISPID_18_NAME = "execMethodAsync";
//    String DISPID_19_GET_NAME = "getSecurity_";
    
}
