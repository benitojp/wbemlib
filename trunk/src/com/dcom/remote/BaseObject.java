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
package com.dcom.remote;

import com.dcom.client.ClientInfo;
import com.dcom.client.ConnectionMgr;
import com.dcom.exception.AutomationException;
import com.dcom.exception.DCOMException;
import com.dcom.remote.wbemdisp.ISWbem;
import com.dcom.utils.Log;
import org.jinterop.dcom.common.JIException;
import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIVariant;
import org.jinterop.dcom.core.JICallBuilder;
import org.jinterop.dcom.impls.automation.IJIDispatch;

public abstract class BaseObject extends ConnectionMgr {

    protected IJIDispatch dispatch = null;
    protected String IID;
    final protected IJIComObject comObj;

    public BaseObject(ClientInfo clientInfo, String progId, String iid) {
        super(clientInfo, progId);
        this.comObj = null;
        this.IID = iid;
    }

    public BaseObject(ClientInfo clientInfo, String progId, IJIComObject comObj, String iid) {
        super(clientInfo, progId, comObj);
        this.comObj = comObj;
        this.IID = iid;
    }

    /**
     * getIID()
     * @return
     */
    public String getIID() {
        return this.IID;
    }

    /**
     * getDispatch()
     *
     * @return IJIDispatch
     * @throws DCOMException
     */
    //abstract public IJIDispatch getDispatch() throws DCOMException;
    public IJIDispatch getDispatch() throws AutomationException {
        try {
            if (dispatch == null) {
                dispatch = getServiceConnection().queryInterface(getIID());
            }
            return dispatch;
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    protected JIVariant[] callMethod(String idName, Object[] params) throws DCOMException {
        try {
            int idOfName = getDispatch().getIDsOfNames(idName);
            JIVariant outVal[] = getDispatch().callMethodA(idOfName, params);
            return outVal;
        } catch (JIException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new DCOMException(e);
        }
    }

    protected Object[] callMethod(JICallBuilder obj) throws DCOMException {
        try {
            return getDispatch().call(obj);
        } catch (JIException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new DCOMException(e);
        }
    }

    protected JIVariant callMethod(String idName) throws DCOMException {
        try {
            int idOfName = getDispatch().getIDsOfNames(idName);
            JIVariant outVal = getDispatch().callMethodA(idOfName);
            return outVal;
        } catch (JIException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new DCOMException(e);
        }
    }

    /**
     * getResult()
     *
     * @param outVal
     * @return
     * @throws DCOMException
     */
    protected Object getResult(JIVariant outVal[]) throws DCOMException {
        Object o = null;
        try {
            int type = outVal[0].getType();
            if (outVal[0].getType() == JIVariant.VT_BSTR) {
                o = outVal[0].getObjectAsString().getString();
            } else if (outVal[0].getType() == JIVariant.VT_BOOL) {
                o = outVal[0].getObjectAsBoolean();
            } else if (outVal[0].getType() == JIVariant.VT_UNKNOWN) {
                o = outVal[0].getObjectAsComObject();
            } else if (outVal[0].getType() == JIVariant.VT_INT) {
                o = outVal[0].getObjectAsInt();
            } else if (outVal[0].getType() == JIVariant.VT_DATE) {
                o = outVal[0].getObjectAsDate();
            } else if (outVal[0].getType() == JIVariant.VT_VARIANT) {
                o = outVal[0].getObjectAsVariant();
            } else if (outVal[0].getType() == JIVariant.VT_R8) {
                o = outVal[0].getObjectAsDouble();
            } else if (outVal[0].getType() == JIVariant.VT_I4) {
                o = outVal[0].getObjectAsInt();
            }
        } catch (JIException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new DCOMException(e);
        }
        return o;
    }

    /**
     * getResult()
     *
     * @param outVal
     * @return
     * @throws DCOMException
     */
    protected Object getResult(JIVariant outVal) throws DCOMException {
        Object o = null;
        try {
            int type = outVal.getType();
            if (outVal.getType() == JIVariant.VT_BSTR) {
                o = outVal.getObjectAsString().getString();
            } else if (outVal.getType() == JIVariant.VT_BOOL) {
                o = outVal.getObjectAsBoolean();
            } else if (outVal.getType() == JIVariant.VT_UNKNOWN) {
                o = outVal.getObjectAsComObject();
            } else if (outVal.getType() == JIVariant.VT_INT) {
                o = outVal.getObjectAsInt();
            } else if (outVal.getType() == JIVariant.VT_DATE) {
                o = outVal.getObjectAsDate();
            } else if (outVal.getType() == JIVariant.VT_VARIANT) {
                o = outVal.getObjectAsVariant();
            } else if (outVal.getType() == JIVariant.VT_R8) {
                o = outVal.getObjectAsDouble();
            } else if (outVal.getType() == JIVariant.VT_I4) {
                o = outVal.getObjectAsInt();
            }
        } catch (JIException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new DCOMException(e);
        }
        return o;
    }

    /**
     * get attribut
     *
     * @param s
     * @return JIVariant
     * @throws AutomationException
     */
    public JIVariant get(String s) throws AutomationException {
        try {
            return getDispatch().get(s);
        } catch (JIException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    /**
     * put attribut
     *
     * @param s
     * @return JIVariant
     * @throws AutomationException
     */
    public void put(String k, JIVariant s) throws AutomationException {
        try {
            getDispatch().put(k, s);
        } catch (JIException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    protected Object putOptionalISWbem(ISWbem param) throws AutomationException{
        return (param == null) ? JIVariant.OPTIONAL_PARAM() : new JIVariant(param.getDispatch());
    }

    protected Object putOptionalIInteger(Integer param) throws AutomationException{
        return (param == null) ? JIVariant.OPTIONAL_PARAM() : new Integer(param);
    }
}
