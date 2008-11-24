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

public interface ISWbemSink extends ISWbem {
    /**
     * cancel. Cancel an asynchronous operation
     *
     * @throws AutomationException If the remote server throws an exception.
     */
    public void cancel() throws AutomationException;

//    String IID = "75718c9f-f029-11d1-a1ac-00c04fb6c223";
//    String DISPID_1_NAME = "cancel";
}
