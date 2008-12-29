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

import com.dcom.client.ClientInfo;
import com.dcom.exception.DCOMException;
import org.jinterop.dcom.core.IJIComObject;

/**
 *
 * @author Igor
 */
public class SWbemLastError extends SWbemObject implements ISWbemLastError {

    public SWbemLastError(ClientInfo clientInfo, IJIComObject comObj) throws DCOMException {
        super(clientInfo, comObj, "d962db84-d4bb-11d1-8b09-00600806d9b6");
    }

}
