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

public interface WbemPrivilegeEnum {
    static final int wbemPrivilegeCreateToken = 1;
    static final int wbemPrivilegePrimaryToken = 2;
    static final int wbemPrivilegeLockMemory = 3;
    static final int wbemPrivilegeIncreaseQuota = 4;
    static final int wbemPrivilegeMachineAccount = 5;
    static final int wbemPrivilegeTcb = 6;
    static final int wbemPrivilegeSecurity = 7;
    static final int wbemPrivilegeTakeOwnership = 8;
    static final int wbemPrivilegeLoadDriver = 9;
    static final int wbemPrivilegeSystemProfile = 10;
    static final int wbemPrivilegeSystemtime = 11;
    static final int wbemPrivilegeProfileSingleProcess = 12;
    static final int wbemPrivilegeIncreaseBasePriority = 13;
    static final int wbemPrivilegeCreatePagefile = 14;
    static final int wbemPrivilegeCreatePermanent = 15;
    static final int wbemPrivilegeBackup = 16;
    static final int wbemPrivilegeRestore = 17;
    static final int wbemPrivilegeShutdown = 18;
    static final int wbemPrivilegeDebug = 19;
    static final int wbemPrivilegeAudit = 20;
    static final int wbemPrivilegeSystemEnvironment = 21;
    static final int wbemPrivilegeChangeNotify = 22;
    static final int wbemPrivilegeRemoteShutdown = 23;
    static final int wbemPrivilegeUndock = 24;
    static final int wbemPrivilegeSyncAgent = 25;
    static final int wbemPrivilegeEnableDelegation = 26;
    static final int wbemPrivilegeManageVolume = 27;
}
