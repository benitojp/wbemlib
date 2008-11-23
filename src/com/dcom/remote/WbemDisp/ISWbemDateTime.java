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

import com.dcom.exception.AutomationException;

public interface ISWbemDateTime extends ISWbem {
    /**
     * getValue. The DMTF datetime
     *
     * @return The strValue
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getValue() throws AutomationException;

    /**
     * setValue. The DMTF datetime
     *
     * @param strValue The strValue (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setValue(
            String strValue) throws AutomationException;

    /**
     * getYear. The Year component of the value (must be in the range 0-9999)
     *
     * @return The iYear
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getYear() throws AutomationException;

    /**
     * setYear. The Year component of the value (must be in the range 0-9999)
     *
     * @param iYear The iYear (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setYear(
            int iYear) throws AutomationException;

    /**
     * isYearSpecified. Whether the Year component is specified
     *
     * @return The bYearSpecified
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isYearSpecified() throws AutomationException;

    /**
     * setYearSpecified. Whether the Year component is specified
     *
     * @param bYearSpecified The bYearSpecified (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setYearSpecified(
            boolean bYearSpecified) throws AutomationException;

    /**
     * getMonth. The Month component of the value (must be in the range 1-12)
     *
     * @return The iMonth
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getMonth() throws AutomationException;

    /**
     * setMonth. The Month component of the value (must be in the range 1-12)
     *
     * @param iMonth The iMonth (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setMonth(
            int iMonth) throws AutomationException;

    /**
     * isMonthSpecified. Whether the Month component is specified
     *
     * @return The bMonthSpecified
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isMonthSpecified() throws AutomationException;

    /**
     * setMonthSpecified. Whether the Month component is specified
     *
     * @param bMonthSpecified The bMonthSpecified (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setMonthSpecified(
            boolean bMonthSpecified) throws AutomationException;

    /**
     * getDay. The Day component of the value (must be in the range 1-31, or 0-999999 for interval values)
     *
     * @return The iDay
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getDay() throws AutomationException;

    /**
     * setDay. The Day component of the value (must be in the range 1-31, or 0-999999 for interval values)
     *
     * @param iDay The iDay (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setDay(
            int iDay) throws AutomationException;

    /**
     * isDaySpecified. Whether the Day component is specified
     *
     * @return The bDaySpecified
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isDaySpecified() throws AutomationException;

    /**
     * setDaySpecified. Whether the Day component is specified
     *
     * @param bDaySpecified The bDaySpecified (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setDaySpecified(
            boolean bDaySpecified) throws AutomationException;

    /**
     * getHours. The Hours component of the value (must be in the range 0-23)
     *
     * @return The iHours
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getHours() throws AutomationException;

    /**
     * setHours. The Hours component of the value (must be in the range 0-23)
     *
     * @param iHours The iHours (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setHours(
            int iHours) throws AutomationException;

    /**
     * isHoursSpecified. Whether the Hours component is specified
     *
     * @return The bHoursSpecified
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isHoursSpecified() throws AutomationException;

    /**
     * setHoursSpecified. Whether the Hours component is specified
     *
     * @param bHoursSpecified The bHoursSpecified (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setHoursSpecified(
            boolean bHoursSpecified) throws AutomationException;

    /**
     * getMinutes. The Minutes component of the value (must be in the range 0-59)
     *
     * @return The iMinutes
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getMinutes() throws AutomationException;

    /**
     * setMinutes. The Minutes component of the value (must be in the range 0-59)
     *
     * @param iMinutes The iMinutes (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setMinutes(
            int iMinutes) throws AutomationException;

    /**
     * isMinutesSpecified. Whether the Minutes component is specified
     *
     * @return The bMinutesSpecified
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isMinutesSpecified() throws AutomationException;

    /**
     * setMinutesSpecified. Whether the Minutes component is specified
     *
     * @param bMinutesSpecified The bMinutesSpecified (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setMinutesSpecified(
            boolean bMinutesSpecified) throws AutomationException;

    /**
     * getSeconds. The Seconds component of the value (must be in the range 0-59)
     *
     * @return The iSeconds
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getSeconds() throws AutomationException;

    /**
     * setSeconds. The Seconds component of the value (must be in the range 0-59)
     *
     * @param iSeconds The iSeconds (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setSeconds(
            int iSeconds) throws AutomationException;

    /**
     * isSecondsSpecified. Whether the Seconds component is specified
     *
     * @return The bSecondsSpecified
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isSecondsSpecified() throws AutomationException;

    /**
     * setSecondsSpecified. Whether the Seconds component is specified
     *
     * @param bSecondsSpecified The bSecondsSpecified (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setSecondsSpecified(
            boolean bSecondsSpecified) throws AutomationException;

    /**
     * getMicroseconds. The Microseconds component of the value (must be in the range 0-999999)
     *
     * @return The iMicroseconds
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getMicroseconds() throws AutomationException;

    /**
     * setMicroseconds. The Microseconds component of the value (must be in the range 0-999999)
     *
     * @param iMicroseconds The iMicroseconds (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setMicroseconds(
            int iMicroseconds) throws AutomationException;

    /**
     * isMicrosecondsSpecified. Whether the Microseconds component is specified
     *
     * @return The bMicrosecondsSpecified
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isMicrosecondsSpecified() throws AutomationException;

    /**
     * setMicrosecondsSpecified. Whether the Microseconds component is specified
     *
     * @param bMicrosecondsSpecified The bMicrosecondsSpecified (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setMicrosecondsSpecified(
            boolean bMicrosecondsSpecified) throws AutomationException;

    /**
     * getUTC. The UTC component of the value (must be in the range -720 to 720)
     *
     * @return The iUTC
     * @throws AutomationException If the remote server throws an exception.
     */
    public int getUTC() throws AutomationException;

    /**
     * setUTC. The UTC component of the value (must be in the range -720 to 720)
     *
     * @param iUTC The iUTC (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setUTC(
            int iUTC) throws AutomationException;

    /**
     * isUTCSpecified. Whether the UTC component is specified
     *
     * @return The bUTCSpecified
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isUTCSpecified() throws AutomationException;

    /**
     * setUTCSpecified. Whether the UTC component is specified
     *
     * @param bUTCSpecified The bUTCSpecified (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setUTCSpecified(
            boolean bUTCSpecified) throws AutomationException;

    /**
     * isInterval. Indicates whether this value describes an absolute date and time or is an interval
     *
     * @return The bIsInterval
     * @throws AutomationException If the remote server throws an exception.
     */
    public boolean isInterval() throws AutomationException;

    /**
     * setIsInterval. Indicates whether this value describes an absolute date and time or is an interval
     *
     * @param bIsInterval The bIsInterval (in)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setIsInterval(
            boolean bIsInterval) throws AutomationException;

    /**
     * getVarDate. Retrieve value in Variant compatible (VT_DATE) format
     *
     * @param bIsLocal The bIsLocal (in, optional, pass true if not required)
     * @return The dVarDate
     * @throws AutomationException If the remote server throws an exception.
     */
    public java.util.Date getVarDate(
            boolean bIsLocal) throws AutomationException;

    /**
     * setVarDate. Set the value using Variant compatible (VT_DATE) format
     *
     * @param dVarDate The dVarDate (in)
     * @param bIsLocal The bIsLocal (in, optional, pass true if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setVarDate(
            java.util.Date dVarDate,
            boolean bIsLocal) throws AutomationException;

    /**
     * getFileTime. Retrieve value in FILETIME compatible string representation
     *
     * @param bIsLocal The bIsLocal (in, optional, pass true if not required)
     * @return The strFileTime
     * @throws AutomationException If the remote server throws an exception.
     */
    public String getFileTime(
            boolean bIsLocal) throws AutomationException;

    /**
     * setFileTime. Set the value using FILETIME compatible string representation
     *
     * @param strFileTime The strFileTime (in)
     * @param bIsLocal    The bIsLocal (in, optional, pass true if not required)
     * @throws AutomationException If the remote server throws an exception.
     */
    public void setFileTime(
            String strFileTime,
            boolean bIsLocal) throws AutomationException;


//    String IID = "5e97458a-cf77-11d3-b38f-00105a1f473a";
//    String DISPID_0_GET_NAME = "getValue";
//    String DISPID_0_PUT_NAME = "setValue";
//    String DISPID_1_GET_NAME = "getYear";
//    String DISPID_1_PUT_NAME = "setYear";
//    String DISPID_2_GET_NAME = "isYearSpecified";
//    String DISPID_2_PUT_NAME = "setYearSpecified";
//    String DISPID_3_GET_NAME = "getMonth";
//    String DISPID_3_PUT_NAME = "setMonth";
//    String DISPID_4_GET_NAME = "isMonthSpecified";
//    String DISPID_4_PUT_NAME = "setMonthSpecified";
//    String DISPID_5_GET_NAME = "getDay";
//    String DISPID_5_PUT_NAME = "setDay";
//    String DISPID_6_GET_NAME = "isDaySpecified";
//    String DISPID_6_PUT_NAME = "setDaySpecified";
//    String DISPID_7_GET_NAME = "getHours";
//    String DISPID_7_PUT_NAME = "setHours";
//    String DISPID_8_GET_NAME = "isHoursSpecified";
//    String DISPID_8_PUT_NAME = "setHoursSpecified";
//    String DISPID_9_GET_NAME = "getMinutes";
//    String DISPID_9_PUT_NAME = "setMinutes";
//    String DISPID_10_GET_NAME = "isMinutesSpecified";
//    String DISPID_10_PUT_NAME = "setMinutesSpecified";
//    String DISPID_11_GET_NAME = "getSeconds";
//    String DISPID_11_PUT_NAME = "setSeconds";
//    String DISPID_12_GET_NAME = "isSecondsSpecified";
//    String DISPID_12_PUT_NAME = "setSecondsSpecified";
//    String DISPID_13_GET_NAME = "getMicroseconds";
//    String DISPID_13_PUT_NAME = "setMicroseconds";
//    String DISPID_14_GET_NAME = "isMicrosecondsSpecified";
//    String DISPID_14_PUT_NAME = "setMicrosecondsSpecified";
//    String DISPID_15_GET_NAME = "getUTC";
//    String DISPID_15_PUT_NAME = "setUTC";
//    String DISPID_16_GET_NAME = "isUTCSpecified";
//    String DISPID_16_PUT_NAME = "setUTCSpecified";
//    String DISPID_17_GET_NAME = "isInterval";
//    String DISPID_17_PUT_NAME = "setIsInterval";
//    String DISPID_18_NAME = "getVarDate";
//    String DISPID_19_NAME = "setVarDate";
//    String DISPID_20_NAME = "getFileTime";
//    String DISPID_21_NAME = "setFileTime";
}
