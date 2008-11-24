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
package com.dcom;

import com.dcom.client.ClientInfo;
import com.dcom.exception.AutomationException;
import com.dcom.remote.wbemdisp.*;
import com.dcom.remote.wbemdisp.util.Utility;

import com.dcom.utils.Log;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogManager;
import org.jinterop.dcom.common.JISystem;

public class Test {

    String domain = "TWOSHEA";
    String userName = "root";
    String password = "root2008";
    String server = "172.16.210.70";

    public static ISWbemObject getTargetComputer(ClientInfo clientInfo, ISWbemServices iSWbemServices, String vmElementName) throws AutomationException, AutomationException {
        ISWbemObject iSWbemObject = null;

        String query = String.format("select * from Msvm_ComputerSystem Where ElementName = \'%s\'", vmElementName);
        ISWbemObjectSet iSWbemObjectSet = iSWbemServices.execQuery(query, null, 0, null);
        iSWbemObject = Utility.getFirstSWbemObject(clientInfo, iSWbemObjectSet);

        return iSWbemObject;

    }

    Test() {
    }

    void test1() {
        SWbemLocator sWbemLocator = null;

        ClientInfo clientInfo = new ClientInfo(domain, userName, password, server);
        try {

            //Log.setJInteropOff();
            //Log.setJInteropOn(Level.ALL);
            
            sWbemLocator = new SWbemLocator(clientInfo);
            sWbemLocator.clientConnect();
            //root\\virtualization
            ISWbemServices iSWbemServices = sWbemLocator.connectServer(null, "\\root\\cimv2", null, null, null, null, 0, null);
            ISWbemObjectSet iSWbemObjectSet = iSWbemServices.execQuery("select * from win32_process", null, 0, null);

            Collection<ISWbemObject> ISWbemObjectList = Utility.getSWbemObjects(clientInfo, iSWbemObjectSet);
            for (ISWbemObject iSWbemObject : ISWbemObjectList) {

                ISWbemPropertySet iSWbemPropertySet = iSWbemObject.getProperties_();
                ISWbemProperty iSWbemProperty = iSWbemPropertySet.item("CommandLine", 0);
//                Collection<ISWbemProperty> ISWbemPropertyList = Utility.getSWbemProperties(clientInfo, iSWbemPropertySet);
//                for (ISWbemProperty iSWbemProperty : ISWbemPropertyList) {
                String name = iSWbemProperty.getName();
                Object value = iSWbemProperty.getValue();
                System.out.println(name + " : " + value);
//                    //System.out.println();
//
//                }
                System.out.println();
            }

//            IJIEnumVariant enumVARIANT = iSWbemObjectSet.get_NewEnum();
//            Integer n = iSWbemObjectSet.getCount();
//            for (int i = 0; i < n; i++) {
//
//                Object[] values = enumVARIANT.next(1);
//                JIArray array = (JIArray) values[0];
//                Object[] arrayObj = (Object[]) array.getArrayInstance();
//                for (int j = 0; j < arrayObj.length; j++) {
//
//                    JIVariant var = (JIVariant)arrayObj[j];
//
//                    IJIComObject objCom = (IJIComObject)(((JIVariant)arrayObj[j]).getObjectAsComObject());
//                    ISWbemObject iSWbemObject = new SWbemObject(sWbemLocator.getClientInfo(), objCom);
//
//
//
////                    ISWbemObjectPath iSWbemObjectPath = iSWbemObject.getPath_();
////                    String str = iSWbemObjectPath.getPath();
////                    str = iSWbemObjectPath.getAuthority();
////                    str = iSWbemObjectPath.getDisplayName();
////                    str = iSWbemObjectPath.getServer();
////                    str = iSWbemObjectPath.getRelPath();
//
//                    System.out.println();
//                }
//            }
        //iSWbemObjectSet.item("???", 0);

        //ISWbemObject iSWbemObject = sWbemLocator.getServiceObject(iSWbemObjectSet);
        //ISWbemSecurity iSWbemSecurity = sWbemLocator.getSecurity_();

//            IFolder iFolder = test.getFolder("c:\\aaa");
//            IFileCollection iFileCollection = iFolder.getFiles();
//
//            IJIEnumVariant enumVARIANT = iFileCollection.get_NewEnum();
//            Integer n = iFileCollection.getCount();
//            for(int i = 0; i<n; i++){
//
//                Object[] values = enumVARIANT.next(1);
//		        JIArray array = (JIArray)values[0];
//                Object[] arrayObj = (Object[])array.getArrayInstance();
//                for (int j = 0; j < arrayObj.length; j++)
//		        {
//                    IFile iFile = iFileCollection.getItem(arrayObj[j]);
//                    String serialNum = iFile.getPath();
//                    System.out.println(serialNum);
//                }
//            }


//            IDriveCollection iDriveCollection = test.getDrives();
//            IJIEnumVariant enumVARIANT = iDriveCollection.get_NewEnum();
//            Integer n = iDriveCollection.getCount();
//            for(int i = 0; i<n; i++){
//
//                Object[] values = enumVARIANT.next(1);
//		        JIArray array = (JIArray)values[0];
//                Object[] arrayObj = (Object[])array.getArrayInstance();
//                for (int j = 0; j < arrayObj.length; j++){
//                    IDrive iDrive = iDriveCollection.getItem(arrayObj[j]);
//                    if(iDrive.isReady()){
//                        String serialNum = iDrive.getFileSystem();
//                        System.out.println(serialNum);
//                    } else {
//                       System.out.println("Drive not ready");
//                    }
//                }
//            }
//
//            IFolder iFolder = test.getSpecialFolder(FileSystemObject.SpecialFolders.SystemFolder);
//            String tt = iFolder.getPath();
//            //Integer ss = (Integer)iFolder.getSize();


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

            // sWbemLocator
            if (sWbemLocator != null) {
                try {
                    sWbemLocator.clientDisconnect();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    void test2() {
        SWbemLocator sWbemLocator = null;

        ClientInfo clientInfo = new ClientInfo(domain, userName, password, server);
        try {


            sWbemLocator = new SWbemLocator(clientInfo);
            sWbemLocator.clientConnect();
            //root\\virtualization
            ISWbemServices iSWbemServices = sWbemLocator.connectServer(null, "root\\virtualization", null, null, null, null, 0, null);
            ISWbemObject iSWbemObject = getTargetComputer(clientInfo, iSWbemServices, "VM");

            ISWbemMethod method = iSWbemObject.getMethods_().item("RequestStateChange", 0);

            ISWbemObject oIPs = method.getInParameters();
            ISWbemObject oInParams = oIPs.spawnInstance_(0);

            final int Enabled = 2;
            final int Disabled = 3;
            oInParams.getProperties_().item("RequestedState", 0).setValue(Enabled);

            ISWbemObject oOutParams = iSWbemObject.execMethod_("RequestStateChange", oInParams, 0, null);
            Object value = oOutParams.getProperties_().item("ReturnValue", 0).getValue();
//            ISWbemPropertySet iSWbemPropertySet = oOutParams.getProperties_();
//            Collection<ISWbemProperty> ISWbemPropertyList = Utility.getSWbemProperties(clientInfo, iSWbemPropertySet);
//            for (ISWbemProperty iSWbemProperty : ISWbemPropertyList) {
//                String name = iSWbemProperty.getName();
//                Object value = iSWbemProperty.getValue();
//                System.out.println(name + " : " + value);
//            }
            System.out.println(value);


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

            // sWbemLocator
            if (sWbemLocator != null) {
                try {
                    sWbemLocator.clientDisconnect();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Test test = new Test();
        test.test1();
        //test.test2();
    }
}
