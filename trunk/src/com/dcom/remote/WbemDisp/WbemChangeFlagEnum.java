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

public interface WbemChangeFlagEnum {
    static final int wbemChangeFlagCreateOrUpdate = 0;
    static final int wbemChangeFlagUpdateOnly = 1;
    static final int wbemChangeFlagCreateOnly = 2;
    static final int wbemChangeFlagUpdateCompatible = 0;
    static final int wbemChangeFlagUpdateSafeMode = 32;
    static final int wbemChangeFlagUpdateForceMode = 64;
    static final int wbemChangeFlagStrongValidation = 128;
    static final int wbemChangeFlagAdvisory = 65536;
}
