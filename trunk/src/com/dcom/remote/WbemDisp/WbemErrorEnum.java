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

public interface WbemErrorEnum {

    static final int wbemNoErr = 0;
    static final int wbemErrFailed = -2147217407;
    static final int wbemErrNotFound = -2147217406;
    static final int wbemErrAccessDenied = -2147217405;
    static final int wbemErrProviderFailure = -2147217404;
    static final int wbemErrTypeMismatch = -2147217403;
    static final int wbemErrOutOfMemory = -2147217402;
    static final int wbemErrInvalidContext = -2147217401;
    static final int wbemErrInvalidParameter = -2147217400;
    static final int wbemErrNotAvailable = -2147217399;
    static final int wbemErrCriticalError = -2147217398;
    static final int wbemErrInvalidStream = -2147217397;
    static final int wbemErrNotSupported = -2147217396;
    static final int wbemErrInvalidSuperclass = -2147217395;
    static final int wbemErrInvalidNamespace = -2147217394;
    static final int wbemErrInvalidObject = -2147217393;
    static final int wbemErrInvalidClass = -2147217392;
    static final int wbemErrProviderNotFound = -2147217391;
    static final int wbemErrInvalidProviderRegistration = -2147217390;
    static final int wbemErrProviderLoadFailure = -2147217389;
    static final int wbemErrInitializationFailure = -2147217388;
    static final int wbemErrTransportFailure = -2147217387;
    static final int wbemErrInvalidOperation = -2147217386;
    static final int wbemErrInvalidQuery = -2147217385;
    static final int wbemErrInvalidQueryType = -2147217384;
    static final int wbemErrAlreadyExists = -2147217383;
    static final int wbemErrOverrideNotAllowed = -2147217382;
    static final int wbemErrPropagatedQualifier = -2147217381;
    static final int wbemErrPropagatedProperty = -2147217380;
    static final int wbemErrUnexpected = -2147217379;
    static final int wbemErrIllegalOperation = -2147217378;
    static final int wbemErrCannotBeKey = -2147217377;
    static final int wbemErrIncompleteClass = -2147217376;
    static final int wbemErrInvalidSyntax = -2147217375;
    static final int wbemErrNondecoratedObject = -2147217374;
    static final int wbemErrReadOnly = -2147217373;
    static final int wbemErrProviderNotCapable = -2147217372;
    static final int wbemErrClassHasChildren = -2147217371;
    static final int wbemErrClassHasInstances = -2147217370;
    static final int wbemErrQueryNotImplemented = -2147217369;
    static final int wbemErrIllegalNull = -2147217368;
    static final int wbemErrInvalidQualifierType = -2147217367;
    static final int wbemErrInvalidPropertyType = -2147217366;
    static final int wbemErrValueOutOfRange = -2147217365;
    static final int wbemErrCannotBeSingleton = -2147217364;
    static final int wbemErrInvalidCimType = -2147217363;
    static final int wbemErrInvalidMethod = -2147217362;
    static final int wbemErrInvalidMethodParameters = -2147217361;
    static final int wbemErrSystemProperty = -2147217360;
    static final int wbemErrInvalidProperty = -2147217359;
    static final int wbemErrCallCancelled = -2147217358;
    static final int wbemErrShuttingDown = -2147217357;
    static final int wbemErrPropagatedMethod = -2147217356;
    static final int wbemErrUnsupportedParameter = -2147217355;
    static final int wbemErrMissingParameter = -2147217354;
    static final int wbemErrInvalidParameterId = -2147217353;
    static final int wbemErrNonConsecutiveParameterIds = -2147217352;
    static final int wbemErrParameterIdOnRetval = -2147217351;
    static final int wbemErrInvalidObjectPath = -2147217350;
    static final int wbemErrOutOfDiskSpace = -2147217349;
    static final int wbemErrBufferTooSmall = -2147217348;
    static final int wbemErrUnsupportedPutExtension = -2147217347;
    static final int wbemErrUnknownObjectType = -2147217346;
    static final int wbemErrUnknownPacketType = -2147217345;
    static final int wbemErrMarshalVersionMismatch = -2147217344;
    static final int wbemErrMarshalInvalidSignature = -2147217343;
    static final int wbemErrInvalidQualifier = -2147217342;
    static final int wbemErrInvalidDuplicateParameter = -2147217341;
    static final int wbemErrTooMuchData = -2147217340;
    static final int wbemErrServerTooBusy = -2147217339;
    static final int wbemErrInvalidFlavor = -2147217338;
    static final int wbemErrCircularReference = -2147217337;
    static final int wbemErrUnsupportedClassUpdate = -2147217336;
    static final int wbemErrCannotChangeKeyInheritance = -2147217335;
    static final int wbemErrCannotChangeIndexInheritance = -2147217328;
    static final int wbemErrTooManyProperties = -2147217327;
    static final int wbemErrUpdateTypeMismatch = -2147217326;
    static final int wbemErrUpdateOverrideNotAllowed = -2147217325;
    static final int wbemErrUpdatePropagatedMethod = -2147217324;
    static final int wbemErrMethodNotImplemented = -2147217323;
    static final int wbemErrMethodDisabled = -2147217322;
    static final int wbemErrRefresherBusy = -2147217321;
    static final int wbemErrUnparsableQuery = -2147217320;
    static final int wbemErrNotEventClass = -2147217319;
    static final int wbemErrMissingGroupWithin = -2147217318;
    static final int wbemErrMissingAggregationList = -2147217317;
    static final int wbemErrPropertyNotAnObject = -2147217316;
    static final int wbemErrAggregatingByObject = -2147217315;
    static final int wbemErrUninterpretableProviderQuery = -2147217313;
    static final int wbemErrBackupRestoreWinmgmtRunning = -2147217312;
    static final int wbemErrQueueOverflow = -2147217311;
    static final int wbemErrPrivilegeNotHeld = -2147217310;
    static final int wbemErrInvalidOperator = -2147217309;
    static final int wbemErrLocalCredentials = -2147217308;
    static final int wbemErrCannotBeAbstract = -2147217307;
    static final int wbemErrAmendedObject = -2147217306;
    static final int wbemErrClientTooSlow = -2147217305;
    static final int wbemErrNullSecurityDescriptor = -2147217304;
    static final int wbemErrTimeout = -2147217303;
    static final int wbemErrInvalidAssociation = -2147217302;
    static final int wbemErrAmbiguousOperation = -2147217301;
    static final int wbemErrQuotaViolation = -2147217300;
    static final int wbemErrTransactionConflict = -2147217299;
    static final int wbemErrForcedRollback = -2147217298;
    static final int wbemErrUnsupportedLocale = -2147217297;
    static final int wbemErrHandleOutOfDate = -2147217296;
    static final int wbemErrConnectionFailed = -2147217295;
    static final int wbemErrInvalidHandleRequest = -2147217294;
    static final int wbemErrPropertyNameTooWide = -2147217293;
    static final int wbemErrClassNameTooWide = -2147217292;
    static final int wbemErrMethodNameTooWide = -2147217291;
    static final int wbemErrQualifierNameTooWide = -2147217290;
    static final int wbemErrRerunCommand = -2147217289;
    static final int wbemErrDatabaseVerMismatch = -2147217288;
    static final int wbemErrVetoPut = -2147217287;
    static final int wbemErrVetoDelete = -2147217286;
    static final int wbemErrInvalidLocale = -2147217280;
    static final int wbemErrProviderSuspended = -2147217279;
    static final int wbemErrSynchronizationRequired = -2147217278;
    static final int wbemErrNoSchema = -2147217277;
    static final int wbemErrProviderAlreadyRegistered = -2147217276;
    static final int wbemErrProviderNotRegistered = -2147217275;
    static final int wbemErrFatalTransportError = -2147217274;
    static final int wbemErrEncryptedConnectionRequired = -2147217273;
    static final int wbemErrRegistrationTooBroad = -2147213311;
    static final int wbemErrRegistrationTooPrecise = -2147213310;
    static final int wbemErrTimedout = -2147209215;
    static final int wbemErrResetToDefault = -2147209214;
}
