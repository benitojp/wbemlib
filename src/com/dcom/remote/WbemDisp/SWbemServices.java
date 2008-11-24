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
import com.dcom.exception.DCOMException;
import com.dcom.exception.AutomationException;
import com.dcom.utils.Log;
import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIVariant;
import org.jinterop.dcom.core.JIString;

public class SWbemServices extends WbemDisp implements ISWbemServices {

    public SWbemServices(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "76a6415c-cb41-11d1-8b02-00600806d9b6");
    }

    @Override
    public ISWbemObject get(String strObjectPath, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                ((strObjectPath == null)) ? JIVariant.OPTIONAL_PARAM() : new JIString(strObjectPath),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)};
            return (new SWbemObject(getClientInfo(), (IJIComObject) getResult(callMethod("Get", params))));

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void getAsync(ISWbem objWbemSink, String strObjectPath, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strObjectPath),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("GetAsync", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void delete(String strObjectPath, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strObjectPath),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            callMethod("Delete", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void deleteAsync(ISWbem objWbemSink, String strObjectPath, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strObjectPath),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("DeleteAsync", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObjectSet instancesOf(String strClass, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strClass),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            return (new SWbemObjectSet(getClientInfo(), (IJIComObject) getResult(callMethod("InstancesOf", params))));

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void instancesOfAsync(ISWbem objWbemSink, String strClass, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strClass),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("InstancesOfAsync", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObjectSet subclassesOf(String strSuperclass, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strSuperclass),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            return (new SWbemObjectSet(getClientInfo(), (IJIComObject) getResult(callMethod("SubclassesOf", params))));

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void subclassesOfAsync(ISWbem objWbemSink, String strSuperclass, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strSuperclass),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("SubclassesOfAsync", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObjectSet execQuery(String strQuery, String strQueryLanguage, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strQuery),
                ((strQueryLanguage == null)) ? JIVariant.OPTIONAL_PARAM() : new JIString(strQuery),
                new Integer(iFlags),
                ((objWbemNamedValueSet == null)) ? JIVariant.OPTIONAL_PARAM() : putOptionalISWbem(objWbemNamedValueSet)};
            return (new SWbemObjectSet(getClientInfo(), (IJIComObject) getResult(callMethod("ExecQuery", params))));

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void execQueryAsync(ISWbem objWbemSink, String strQuery, String strQueryLanguage, int lFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strQuery),
                new JIString(strQueryLanguage),
                new Integer(lFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("ExecQueryAsync", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObjectSet associatorsOf(String strObjectPath, String strAssocClass, String strResultClass, String strResultRole, String strRole, boolean bClassesOnly, boolean bSchemaOnly, String strRequiredAssocQualifier, String strRequiredQualifier, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strObjectPath),
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
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void associatorsOfAsync(ISWbem objWbemSink, String strObjectPath, String strAssocClass, String strResultClass, String strResultRole, String strRole, boolean bClassesOnly, boolean bSchemaOnly, String strRequiredAssocQualifier, String strRequiredQualifier, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strObjectPath),
                new JIString(strAssocClass),
                new JIString(strResultRole),
                new JIString(strRole),
                new JIVariant(bClassesOnly),
                new JIVariant(bSchemaOnly),
                new JIString(strRequiredAssocQualifier),
                new JIString(strRequiredQualifier),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("AssociatorsOfAsync", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObjectSet referencesTo(String strObjectPath, String strResultClass, String strRole, boolean bClassesOnly, boolean bSchemaOnly, String strRequiredQualifier, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strObjectPath),
                new JIString(strResultClass),
                new JIString(strRole),
                new JIVariant(bClassesOnly),
                new JIVariant(bSchemaOnly),
                new JIString(strRequiredQualifier),
                new JIString(strRequiredQualifier),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            return (new SWbemObjectSet(getClientInfo(), (IJIComObject) getResult(callMethod("ReferencesTo", params))));

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void referencesToAsync(ISWbem objWbemSink, String strObjectPath, String strResultClass, String strRole, boolean bClassesOnly, boolean bSchemaOnly, String strRequiredQualifier, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strObjectPath),
                new JIString(strResultClass),
                new JIString(strRole),
                new JIVariant(bClassesOnly),
                new JIVariant(bSchemaOnly),
                new JIString(strRequiredQualifier),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("ReferencesToAsync", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemEventSource execNotificationQuery(String strQuery, String strQueryLanguage, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strQuery),
                new JIString(strQueryLanguage),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet)
            };
            return (new SWbemEventSource(getClientInfo(), (IJIComObject) getResult(callMethod("ExecNotificationQuery", params))));

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void execNotificationQueryAsync(ISWbem objWbemSink, String strQuery, String strQueryLanguage, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strQuery),
                new JIString(strQueryLanguage),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };

            callMethod("ExecNotificationQueryAsync", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemObject execMethod(String strObjectPath, String strMethodName, ISWbem objWbemInParameters, int iFlags, ISWbem objWbemNamedValueSet) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIString(strMethodName),
                putOptionalISWbem(objWbemInParameters),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),};

            return (new SWbemObject(getClientInfo(), (IJIComObject) getResult(callMethod("ExecMethod", params))));

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void execMethodAsync(ISWbem objWbemSink, String strObjectPath, String strMethodName, ISWbem objWbemInParameters, int iFlags, ISWbem objWbemNamedValueSet, ISWbem objWbemAsyncContext) throws AutomationException {
        try {
            Object[] params = new Object[]{
                new JIVariant(objWbemSink.getDispatch()),
                new JIString(strMethodName),
                putOptionalISWbem(objWbemInParameters),
                new Integer(iFlags),
                putOptionalISWbem(objWbemNamedValueSet),
                putOptionalISWbem(objWbemAsyncContext)
            };
            callMethod("ExecMethodAsync", params);

        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemSecurity getSecurity_() throws AutomationException {
        try {
            return (new SWbemSecurity(getClientInfo(), (IJIComObject) getResult(get("Security_"))));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }
}
