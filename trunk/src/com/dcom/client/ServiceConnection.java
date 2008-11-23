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
package com.dcom.client;

import com.dcom.exception.DCOMException;
import com.dcom.utils.Log;
import org.jinterop.dcom.common.JIException;
import org.jinterop.dcom.common.JISystem;
import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIComServer;
import org.jinterop.dcom.core.JIProgId;
import org.jinterop.dcom.core.JISession;
import org.jinterop.dcom.impls.JIObjectFactory;
import org.jinterop.dcom.impls.automation.IJIDispatch;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.LogManager;

/**
 * @author mio
 */
public class ServiceConnection {

    final private static int ConnectionState_Connected = 0;
    final private static int ConnectionState_Disconnected = 1;
    protected int _state = ConnectionState_Disconnected;
    private static Boolean bJILogInitialized = false;
    protected IJIComObject _comObject;
    protected JIComServer _comServer;
    protected IJIDispatch _dispatch;
    protected JIProgId _progId;
    protected JISession _session;

    public ServiceConnection() {

        try {

            _state = ConnectionState_Disconnected;
            JISystem.setAutoRegisteration(true);

            if (!bJILogInitialized) {

                // mio NOTE : set log msg off
                JISystem.setInBuiltLogHandler(true);
                LogManager.getLogManager().getLogger("org.jinterop").setLevel(Level.OFF);
                bJILogInitialized = true;
            }
        } catch (SecurityException e) {
            Log.getInstance().getLogger().throwing("ServiceConnection", "ServiceConnection()", e);
        } catch (IOException e) {
            Log.getInstance().getLogger().throwing("ServiceConnection", "ServiceConnection()", e);
        }

    }

    public ServiceConnection(IJIComObject comObj) {

        _state = ConnectionState_Connected;
        _comObject = comObj;

    }

    /**
     * Connect to DCOM
     * @param domain
     * @param username
     * @param password
     * @param server
     * @param progId
     * @throws DCOMException
     */
    public void connect(String domain, String username, String password, String server, String progId) throws DCOMException {
        if (_session != null) {
            disconnect();
        }
        try {

            _session = JISession.createSession(domain, username, password);

            JIProgId proId = JIProgId.valueOf(progId);
            proId.setAutoRegistration(true);
            _comServer = new JIComServer(proId, server, _session);

            if (_comObject == null) {
                _comObject = _comServer.createInstance();
            }

            _dispatch = (IJIDispatch) JIObjectFactory.narrowObject(_comObject.queryInterface(IJIDispatch.IID));

            _state = ConnectionState_Connected;

        } catch (UnknownHostException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new DCOMException(e);
        } catch (JIException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new DCOMException(e);
        }
    }

    /**
     * Check if Connection is established or not.
     * @return true if connected, false otherwise
     */
    public boolean isConnected() {
        return _state == ConnectionState_Connected;
    }

    /**
     * Disconnects from remote DCOM
     * @throws com.dcom.exception.DCOMException
     */
    public void disconnect() throws DCOMException {
        if (_session != null) {
            try {
                JISession.destroySession(_session);
                _session = null;

                _state = ConnectionState_Disconnected;
            } catch (JIException e) {
                Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
                throw new DCOMException(e);
            }
        }
    }

    public IJIDispatch queryInterface(String id) throws DCOMException {
        try {
            IJIComObject comObject = (IJIComObject) getObject().queryInterface(id);
            IJIDispatch dispatch = (IJIDispatch) JIObjectFactory.narrowObject(comObject.queryInterface(IJIDispatch.IID));
            return dispatch;

        } catch (JIException e) {
            Log.getInstance().getLogger().throwing(Log.getClassName(), Log.getMethodName(), e);
            throw new DCOMException(e);
        }
    }

    public JISession getSession() {
        return _session;
    }

    protected JIProgId getProgId() {
        return _progId;
    }

    protected JIComServer getcomServer() {
        return _comServer;
    }

    protected IJIComObject getObject() {
        return _comObject;
    }

    protected IJIDispatch getDispatch() {
        return _dispatch;
    }
}

