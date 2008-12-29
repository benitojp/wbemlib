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

public interface WbemCimtypeEnum {

    static final int wbemCimtypeSint8 = 16;
    static final int wbemCimtypeUint8 = 17;
    static final int wbemCimtypeSint16 = 2;
    static final int wbemCimtypeUint16 = 18;
    static final int wbemCimtypeSint32 = 3;
    static final int wbemCimtypeUint32 = 19;
    static final int wbemCimtypeSint64 = 20;
    static final int wbemCimtypeUint64 = 21;
    static final int wbemCimtypeReal32 = 4;
    static final int wbemCimtypeReal64 = 5;
    static final int wbemCimtypeBoolean = 11;
    static final int wbemCimtypeString = 8;
    static final int wbemCimtypeDatetime = 101;
    static final int wbemCimtypeReference = 102;
    static final int wbemCimtypeChar16 = 103;
    static final int wbemCimtypeObject = 13;
}
