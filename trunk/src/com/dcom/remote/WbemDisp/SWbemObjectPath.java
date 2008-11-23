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

import com.dcom.client.ClientInfo;
import com.dcom.exception.AutomationException;
import com.dcom.exception.DCOMException;
import com.dcom.utils.Log;
import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIVariant;

public class SWbemObjectPath extends WbemDisp implements ISWbemObjectPath {

    public SWbemObjectPath(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "5791bc27-ce9c-11d1-97bf-0000f81e849c");
    }

    @Override
    public String getPath() throws AutomationException {
        try {
            return (String) getResult(get("Path"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setPath(String strPath) throws AutomationException {
        try {
            put("Path", new JIVariant(strPath));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public String getRelPath() throws AutomationException {
        try {
            return (String) getResult(get("RelPath"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setRelPath(String strRelPath) throws AutomationException {
        try {
            put("RelPath", new JIVariant(strRelPath));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public String getServer() throws AutomationException {
        try {
            return (String) getResult(get("Server"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setServer(String strServer) throws AutomationException {
        try {
            put("Server", new JIVariant(strServer));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public String getNamespace() throws AutomationException {
        try {
            return (String) getResult(get("Namespace"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setNamespace(String strNamespace) throws AutomationException {
        try {
            put("Namespace", new JIVariant(strNamespace));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public String getParentNamespace() throws AutomationException {
        try {
            return (String) getResult(get("ParentNamespace"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public String getDisplayName() throws AutomationException {
        try {
            return (String) getResult(get("DisplayName"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setDisplayName(String strDisplayName) throws AutomationException {
        try {
            put("DisplayName", new JIVariant(strDisplayName));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public String zz_getClass() throws AutomationException {
        try {
            return (String) getResult(get("Class"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setClass(String strClass) throws AutomationException {
        try {
            put("Class", new JIVariant(strClass));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public boolean isClass() throws AutomationException {
        try {
            return (Boolean) getResult(get("IsClass"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setAsClass() throws AutomationException {
        try {
            callMethod("SetAsClass");
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public boolean isSingleton() throws AutomationException {
        try {
            return (Boolean) getResult(get("Singleton"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setAsSingleton() throws AutomationException {
        try {
            callMethod("SetAsSingleton");
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public ISWbemNamedValueSet getKeys() throws AutomationException {
        try {
            return (new SWbemNamedValueSet(getClientInfo(), (IJIComObject) getResult(get("Keys"))));
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

    @Override
    public String getLocale() throws AutomationException {
        try {
            return (String) getResult(get("Locale"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setLocale(String strLocale) throws AutomationException {
        try {
            put("Locale", new JIVariant(strLocale));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public String getAuthority() throws AutomationException {
        try {
            return (String) getResult(get("Authority"));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }

    @Override
    public void setAuthority(String strAuthority) throws AutomationException {
        try {
            put("Authority", new JIVariant(strAuthority));
        } catch (DCOMException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new AutomationException(e);
        }
    }


}
