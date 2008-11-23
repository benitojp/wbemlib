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

public interface WbemFlagEnum {
    static final int wbemFlagReturnImmediately = 16;
    static final int wbemFlagReturnWhenComplete = 0;
    static final int wbemFlagBidirectional = 0;
    static final int wbemFlagForwardOnly = 32;
    static final int wbemFlagNoErrorObject = 64;
    static final int wbemFlagReturnErrorObject = 0;
    static final int wbemFlagSendStatus = 128;
    static final int wbemFlagDontSendStatus = 0;
    static final int wbemFlagEnsureLocatable = 256;
    static final int wbemFlagDirectRead = 512;
    static final int wbemFlagSendOnlySelected = 0;
    static final int wbemFlagUseAmendedQualifiers = 131072;
    static final int wbemFlagGetDefault = 0;
    static final int wbemFlagSpawnInstance = 1;
    static final int wbemFlagUseCurrentTime = 1;
}
