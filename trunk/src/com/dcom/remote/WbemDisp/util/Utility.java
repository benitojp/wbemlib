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
package com.dcom.remote.wbemdisp.util;

import com.dcom.client.ClientInfo;
import com.dcom.exception.AutomationException;
import com.dcom.exception.DCOMException;
import com.dcom.remote.wbemdisp.*;
import com.dcom.utils.Log;
import org.jinterop.dcom.common.JIException;
import org.jinterop.dcom.core.IJIComObject;
import org.jinterop.dcom.core.JIArray;
import org.jinterop.dcom.core.JIVariant;
import org.jinterop.dcom.impls.automation.IJIEnumVariant;

import java.util.ArrayList;
import java.util.Collection;

public class Utility {

    public static ISWbemObject getFirstSWbemObject(ClientInfo clientInfo, ISWbemObjectSet iSWbemObjectSet) throws AutomationException {
        try {
            ISWbemObject iSWbemObject = null;
            IJIEnumVariant enumVARIANT = iSWbemObjectSet.get_NewEnum();
            Integer n = iSWbemObjectSet.getCount();
            for (int i = 0; i < n; i++) {

                Object[] values = enumVARIANT.next(1);
                JIArray array = (JIArray) values[0];
                Object[] arrayObj = (Object[]) array.getArrayInstance();
                for (int j = 0; j < arrayObj.length; j++) {

                    IJIComObject objCom = (((JIVariant) arrayObj[j]).getObjectAsComObject());
                    iSWbemObject = new SWbemObject(clientInfo, objCom);
                    break;
                }
                if (iSWbemObject != null) {
                    break;
                }
            }
            return iSWbemObject;

        } catch (JIException e) {
            
            throw new AutomationException(e);

        } catch (DCOMException e) {
            
            throw new AutomationException(e);
        }
    }

    public static Collection<ISWbemObject> getSWbemObjects(ClientInfo clientInfo, ISWbemObjectSet iSWbemObjectSet) throws AutomationException {
        try {
            ArrayList<ISWbemObject> iSWbemObjectList = new ArrayList<ISWbemObject>();
            IJIEnumVariant enumVARIANT = iSWbemObjectSet.get_NewEnum();
            Integer n = iSWbemObjectSet.getCount();
            for (int i = 0; i < n; i++) {

                Object[] values = enumVARIANT.next(1);
                JIArray array = (JIArray) values[0];
                Object[] arrayObj = (Object[]) array.getArrayInstance();
                for (int j = 0; j < arrayObj.length; j++) {

                    IJIComObject objCom = (((JIVariant) arrayObj[j]).getObjectAsComObject());
                    ISWbemObject iSWbemObject = new SWbemObject(clientInfo, objCom);
                    iSWbemObjectList.add(iSWbemObject);
                }
            }
            return iSWbemObjectList;

        } catch (JIException e) {
            
            throw new AutomationException(e);

        } catch (DCOMException e) {
            
            throw new AutomationException(e);
        }
    }

    public static Collection<ISWbemProperty> getSWbemProperties(ClientInfo clientInfo, ISWbemPropertySet iSWbemPropertySet) throws AutomationException {
        try {
            ArrayList<ISWbemProperty> iSWbemProperty = new ArrayList<ISWbemProperty>();
            IJIEnumVariant enumVARIANT = iSWbemPropertySet.get_NewEnum();
            Integer n = iSWbemPropertySet.getCount();
            for (int i = 0; i < n; i++) {

                Object[] values = enumVARIANT.next(1);
                JIArray array = (JIArray) values[0];
                Object[] arrayObj = (Object[]) array.getArrayInstance();
                for (int j = 0; j < arrayObj.length; j++) {

                    IJIComObject objCom = (((JIVariant) arrayObj[j]).getObjectAsComObject());
                    ISWbemProperty iSWbemObject = new SWbemProperty(clientInfo, objCom);
                    iSWbemProperty.add(iSWbemObject);
                }
            }
            return iSWbemProperty;

        } catch (JIException e) {
            
            throw new AutomationException(e);

        } catch (DCOMException e) {
            
            throw new AutomationException(e);
        }
    }
}
