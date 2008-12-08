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

import com.dcom.client.ClientInfo;
import com.dcom.exception.AutomationException;
import com.dcom.exception.DCOMException;
import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIVariant;
import org.jinterop.dcom.core.JIString;

public class SWbemObject extends WbemDisp implements ISWbemObject {

    public SWbemObject(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "76a6415a-cb41-11d1-8b02-00600806d9b6");
    }

    public SWbemObject(ClientInfo clientInfo, IJIComObject comObj, String iid) throws DCOMException {
        super(clientInfo, comObj, iid);
    }

    @Override
    public ISWbemObjectPath put_(int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            return (new SWbemObjectPath(getClientInfo(), (IJIComObject) getResult(callMethod("Put_", params))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void putAsync_(ISWbem objWbemSink, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("PutAsync_", params);

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void delete_(int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)};
            callMethod("Delete_", params);

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void deleteAsync_(ISWbem objWbemSink, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("DeleteAsync_", params);

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObjectSet instances_(int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)};
            return (new SWbemObjectSet(getClientInfo(), (IJIComObject) getResult(callMethod("Instances_", params))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void instancesAsync_(ISWbem objWbemSink, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("InstancesAsync_", params);

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObjectSet subclasses_(int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            return (new SWbemObjectSet(getClientInfo(), (IJIComObject) getResult(callMethod("Subclasses_", params))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void subclassesAsync_(ISWbem objWbemSink, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("SubclassesAsync_", params);

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
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
            ISWbem objWbemNamedValueSet) throws AutomationException {

        try {
            Object[] params = new Object[]{
                new JIString(strAssocClass),
                new JIString(strAssocClass),
                new JIString(strResultRole),
                new JIString(strRole),
                new JIVariant(bClassesOnly),
                new JIVariant(bSchemaOnly),
                new JIString(strRequiredAssocQualifier),
                new JIString(strRequiredQualifier),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            return (new SWbemObjectSet(getClientInfo(), (IJIComObject) getResult(callMethod("AssociatorsOf", params))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void associatorsAsync_(ISWbem objWbemSink,
            String strAssocClass,
            String strResultClass,
            String strResultRole,
            String strRole,
            boolean bClassesOnly,
            boolean bSchemaOnly,
            String strRequiredAssocQualifier,
            String strRequiredQualifier,
            int iFlags, ISWbem objWbemNamedValueSet,
            ISWbem objWbemAsyncContext) throws AutomationException {
        try {

            Object[] params = new Object[]{
                new JIString(strAssocClass),
                new JIString(strAssocClass),
                new JIString(strResultRole),
                new JIString(strRole),
                new JIVariant(bClassesOnly),
                new JIVariant(bSchemaOnly),
                new JIString(strRequiredAssocQualifier),
                new JIString(strRequiredQualifier),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            callMethod("AssociatorsAsync_", params);

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObjectSet references_(String strResultClass, String strRole, boolean bClassesOnly, boolean bSchemaOnly, String strRequiredQualifier, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strResultClass),
                new JIString(strRole),
                new JIVariant(bClassesOnly),
                new JIVariant(bSchemaOnly),
                new JIString(strRequiredQualifier),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            return (new SWbemObjectSet(getClientInfo(), (IJIComObject) getResult(callMethod("References_", params))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void referencesAsync_(ISWbem objWbemSink, String strResultClass, String strRole, boolean bClassesOnly, boolean bSchemaOnly, String strRequiredQualifier, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strResultClass),
                new JIString(strRole),
                new JIVariant(bClassesOnly),
                new JIVariant(bSchemaOnly),
                new JIString(strRequiredQualifier),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("ReferencesAsync_", params);

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObject execMethod_(String strMethodName, ISWbem objWbemInParameters, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strMethodName),
                putOptionalISWbem(objWbemInParameters),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };

            return (new SWbemObject(getClientInfo(), (IJIComObject) getResult(callMethod("ExecMethod_", params))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public void execMethodAsync_(ISWbem objWbemSink, String strMethodName, ISWbem objWbemInParameters, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strMethodName),
                new JIVariant(objWbemInParameters.getDispatch()),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };

            callMethod("ExecMethodAsync_", params);

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObject clone_() throws AutomationException {
        try {
            return (SWbemObject) getResult(callMethod("Clone_"));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public String getObjectText_(int iFlags) throws AutomationException {
        try {
            Object[] params = new Object[]{new Integer(iFlags)};
            return (String) getResult(callMethod("GetObjectText_", params));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObject spawnDerivedClass_(int iFlags) throws AutomationException {
        try {
            Object[] params = new Object[]{new Integer(iFlags)};
            return (new SWbemObject(getClientInfo(), (IJIComObject) getResult(callMethod("SpawnDerivedClass_", params))));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObject spawnInstance_(int iFlags) throws AutomationException {
        try {
            Object[] params = new Object[]{new Integer(iFlags)};
            return (new SWbemObject(getClientInfo(), (IJIComObject) getResult(callMethod("SpawnInstance_", params))));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public boolean compareTo_(ISWbem objWbemObject, int iFlags) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemObject.getDispatch()),
                new Integer(iFlags)
            };

            return (Boolean) getResult(callMethod("CompareTo_", params));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemQualifierSet getQualifiers_() throws AutomationException {
        try {
            return (new SWbemQualifierSet(getClientInfo(), (IJIComObject) getResult(get("Qualifiers_"))));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemPropertySet getProperties_() throws AutomationException {
        try {
            return (new SWbemPropertySet(getClientInfo(), (IJIComObject) getResult(get("Properties_"))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemMethodSet getMethods_() throws AutomationException {
        try {
            return (new SWbemMethodSet(getClientInfo(), (IJIComObject) getResult(get("Methods_"))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public Object getDerivation_() throws AutomationException {
        try {
            // mio TODO : pls check this
            return getResult(get("Derivation_"));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObjectPath getPath_() throws AutomationException {
        try {
            return (new SWbemObjectPath(getClientInfo(), (IJIComObject) getResult(get("Path_"))));
        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemSecurity getSecurity_() throws AutomationException {
        try {
            return (new SWbemSecurity(getClientInfo(), (IJIComObject) getResult(get("Security_"))));

        } catch (DCOMException e) {

            throw new AutomationException(e);
        }
    }
}
