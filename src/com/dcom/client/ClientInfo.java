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

import org.jinterop.dcom.common.IJIAuthInfo;

/**
 * @author mio
 */
public class ClientInfo implements IJIAuthInfo {

    private final String domain;
    private final String userName;
    private final String password;
    private final String server;

    /**
     * ClientInfo()
     * @param domain
     * @param userName
     * @param password
     * @param server
     */
    public ClientInfo(String domain, String userName, String password, String server) {
        this.domain = domain;
        this.userName = userName;
        this.password = password;
        this.server = server;
    }

    /**
     * @return Domain.
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return Password.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return Server.
     */
    public String getServer() {
        return this.server;
    }

    /**
     * @see org.jinterop.dcom.common.IJIAuthInfo#getUserName()
     */
    @Override
    public String getUserName() {
        return this.userName;
    }
}
