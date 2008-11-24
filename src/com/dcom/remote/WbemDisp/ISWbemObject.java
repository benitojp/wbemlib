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

public interface ISWbemObject extends ISWbem {
    /**
     * put_. Save this Object
     *
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObjectPath
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectPath put_(
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * putAsync_. Save this Object asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void putAsync_(
            ISWbem objWbemSink,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * delete_. Delete this Object
     *
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void delete_(
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * deleteAsync_. Delete this Object asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if notrequired)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void deleteAsync_(
            ISWbem objWbemSink,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * instances_. Return all instances of this Class
     *
     * @param iFlags               The iFlags (in, optional, pass 16 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObjectSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectSet instances_(
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * instancesAsync_. Return all instances of this Class asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void instancesAsync_(
            ISWbem objWbemSink,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * subclasses_. Enumerate subclasses of this Class
     *
     * @param iFlags               The iFlags (in, optional, pass 16 if not required)
     * @param objWbemNamedValueSet A reference to another Automation ISWbem (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObjectSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectSet subclasses_(
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * subclassesAsync_. Enumerate subclasses of this Class asynchronously
     *
     * @param objWbemSink          A reference to another Automation ISWbem (IDispatch) (in)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation ISWbem (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation ISWbem (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void subclassesAsync_(
            ISWbem objWbemSink,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * associators_. Get the Associators of this Object
     *
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
    public ISWbemObjectSet associators_(
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
     * associatorsAsync_. Get the Associators of this Object asynchronously
     *
     * @param objWbemSink               A reference to another Automation Object (IDispatch) (in)
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
    public void associatorsAsync_(
            ISWbem objWbemSink,
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
     * references_. Get the References to this Object
     *
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
    public ISWbemObjectSet references_(
            String strResultClass,
            String strRole,
            boolean bClassesOnly,
            boolean bSchemaOnly,
            String strRequiredQualifier,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * referencesAsync_. Get the References to this Object asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
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
    public void referencesAsync_(
            ISWbem objWbemSink,
            String strResultClass,
            String strRole,
            boolean bClassesOnly,
            boolean bSchemaOnly,
            String strRequiredQualifier,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * execMethod_. Execute a Method of this Object
     *
     * @param strMethodName        The strMethodName (in)
     * @param objWbemInParameters  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @return An reference to a ISWbemObject
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObject execMethod_(
            String strMethodName,
            ISWbem objWbemInParameters,
            int iFlags,
            ISWbem objWbemNamedValueSet) throws AutomationException;

    /**
     * execMethodAsync_. Execute a Method of this Object asynchronously
     *
     * @param objWbemSink          A reference to another Automation Object (IDispatch) (in)
     * @param strMethodName        The strMethodName (in)
     * @param objWbemInParameters  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param iFlags               The iFlags (in, optional, pass 0 if not required)
     * @param objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @param objWbemAsyncContext  A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void execMethodAsync_(
            ISWbem objWbemSink,
            String strMethodName,
            ISWbem objWbemInParameters,
            int iFlags,
            ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException;

    /**
     * clone_. Clone this Object
     *
     * @return An reference to a ISWbemObject
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObject clone_() throws AutomationException;

    /**
     * getObjectText_. Get the MOF text of this Object
     *
     * @param iFlags The iFlags (in, optional, pass 0 if not required)
     * @return The strObjectText
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getObjectText_(
            int iFlags) throws AutomationException;

    /**
     * spawnDerivedClass_. Create a subclass of this Object
     *
     * @param iFlags The iFlags (in, optional, pass 0 if not required)
     * @return An reference to a ISWbemObject
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObject spawnDerivedClass_(
            int iFlags) throws AutomationException;

    /**
     * spawnInstance_. Create an Instance of this Object
     *
     * @param iFlags The iFlags (in, optional, pass 0 if not required)
     * @return An reference to a ISWbemObject
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObject spawnInstance_(
            int iFlags) throws AutomationException;

    /**
     * compareTo_. Compare this Object with another
     *
     * @param objWbemObject A reference to another Automation Object (IDispatch) (in)
     * @param iFlags        The iFlags (in, optional, pass 0 if not required)
     * @return The bResult
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean compareTo_(
            ISWbem objWbemObject,
            int iFlags) throws AutomationException;

    /**
     * getQualifiers_. The collection of Qualifiers of this Object
     *
     * @return An reference to a ISWbemQualifierSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemQualifierSet getQualifiers_() throws AutomationException;

    /**
     * getProperties_. The collection of Properties of this Object
     *
     * @return An reference to a ISWbemPropertySet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemPropertySet getProperties_() throws AutomationException;

    /**
     * getMethods_. The collection of Methods of this Object
     *
     * @return An reference to a ISWbemMethodSet
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemMethodSet getMethods_() throws AutomationException;

    /**
     * getDerivation_. An array of strings describing the class derivation heirarchy, in most-derived-from order (the first element in the array defines the superclass and the last element defines the dynasty class).
     *
     * @return A Variant
     * @throws AutomationException If the remote server throws an exception.
     */
    public Object getDerivation_() throws AutomationException;

    /**
     * getPath_. The path of this Object
     *
     * @return An reference to a ISWbemObjectPath
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemObjectPath getPath_() throws AutomationException;

    /**
     * getSecurity_. The Security Configurator for this Object
     *
     * @return An reference to a ISWbemSecurity
     * @throws AutomationException If the remote server throws an exception.
     */
    public ISWbemSecurity getSecurity_() throws AutomationException;


//    String IID = "76a6415a-cb41-11d1-8b02-00600806d9b6";
//    String DISPID_1_NAME = "put_";
//    String DISPID_2_NAME = "putAsync_";
//    String DISPID_3_NAME = "delete_";
//    String DISPID_4_NAME = "deleteAsync_";
//    String DISPID_5_NAME = "instances_";
//    String DISPID_6_NAME = "instancesAsync_";
//    String DISPID_7_NAME = "subclasses_";
//    String DISPID_8_NAME = "subclassesAsync_";
//    String DISPID_9_NAME = "associators_";
//    String DISPID_10_NAME = "associatorsAsync_";
//    String DISPID_11_NAME = "references_";
//    String DISPID_12_NAME = "referencesAsync_";
//    String DISPID_13_NAME = "execMethod_";
//    String DISPID_14_NAME = "execMethodAsync_";
//    String DISPID_15_NAME = "clone_";
//    String DISPID_16_NAME = "getObjectText_";
//    String DISPID_17_NAME = "spawnDerivedClass_";
//    String DISPID_18_NAME = "spawnInstance_";
//    String DISPID_19_NAME = "compareTo_";
//    String DISPID_20_GET_NAME = "getQualifiers_";
//    String DISPID_21_GET_NAME = "getProperties_";
//    String DISPID_22_GET_NAME = "getMethods_";
//    String DISPID_23_GET_NAME = "getDerivation_";
//    String DISPID_24_GET_NAME = "getPath_";
//    String DISPID_25_GET_NAME = "getSecurity_";
}
