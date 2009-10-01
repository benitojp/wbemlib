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
import org.jinterop.dcom.core.IJIComObject;

public class ConnectionMgr {

    private ServiceConnection _connection;
    String _progId;
    ClientInfo _clientInfo;

    public ConnectionMgr(ClientInfo clientInfo, String progId) {

        // mio NOTE : force to set encoding
        System.setProperty("jcifs.encoding", "Cp1252");
        System.setProperty("file.encoding", "Cp1252");
        
        _clientInfo = clientInfo;
        _progId = progId;
        _connection = new ServiceConnection();
    }

    public ConnectionMgr(ClientInfo clientInfo, String progId, IJIComObject comObj) {

        // mio NOTE : force to set encoding
        //System.setProperty("jcifs.encoding", "Cp1252");
        //System.setProperty("file.encoding", "Cp1252");       

        _clientInfo = clientInfo;
        _progId = progId;
        _connection = new ServiceConnection(comObj);

    }

    /**
     * Connect to the service
     */
    public void clientConnect() throws DCOMException {

        if (!isConnected()) {
            getServiceConnection().connect(getClientInfo().getDomain(), getClientInfo().getUserName(), getClientInfo().getPassword(), getClientInfo().getServer(), _progId);
        }
    }

    /**
     * Disconnect from the service
     */
    public void clientDisconnect() throws DCOMException {
        if (isConnected()) {
            getServiceConnection().disconnect();
        }
    }

    /**
     * Return true if connected to remote DCOM
     * @return
     */
    public Boolean isConnected() {
        return _connection.isConnected();
    }

    /**
     *
     * @return ServiceConnection
     */
    public ServiceConnection getServiceConnection() {
        return _connection;
    }

    /**
     *
     * @return ClientInfo
     */
    public ClientInfo getClientInfo() {
        return _clientInfo;
    }
}
