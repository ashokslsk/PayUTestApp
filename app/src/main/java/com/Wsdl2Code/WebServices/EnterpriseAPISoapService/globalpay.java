package com.Wsdl2Code.WebServices.EnterpriseAPISoapService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 7/4/2014 4:34:19 PM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

public class globalpay implements KvmSerializable {

    public String amountInCents;
    public String basketAmountInCents;
    public String basketCurrency;
    public String basketDescription;
    public String customerContactNumber;
    public String customerEmail;
    public String customerFirstName;
    public String customerId;
    public String customerLastName;
    public String customerTrxRef;
    public String mcaCustomerCareGetProductsResultCode;
    public String mcaCustomerCareGetProductsResultMsg;
    public String mcaLoggerUpdateResultCode;
    public String mcaLoggerUpdateResultMsg;
    public String mcaRtppPaymentResultCode;
    public String mcaRtppPaymentResultMsg;
    public String paymentChannel;
    public String payuMerchantId;
    public String transactionDate;
    public String transactionReference;
    public String transactionStatus;
    public String transactionStatusDescription;
    public String transactionType;
    public String defaultPM;
    public String pmId;

    public globalpay() {
    }

    public globalpay(SoapObject soapObject) {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("amountInCents")) {
            Object obj = soapObject.getProperty("amountInCents");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amountInCents = j.toString();
            } else if (obj != null && obj instanceof String) {
                amountInCents = (String) obj;
            }
        }
        if (soapObject.hasProperty("basketAmountInCents")) {
            Object obj = soapObject.getProperty("basketAmountInCents");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                basketAmountInCents = j.toString();
            } else if (obj != null && obj instanceof String) {
                basketAmountInCents = (String) obj;
            }
        }
        if (soapObject.hasProperty("basketCurrency")) {
            Object obj = soapObject.getProperty("basketCurrency");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                basketCurrency = j.toString();
            } else if (obj != null && obj instanceof String) {
                basketCurrency = (String) obj;
            }
        }
        if (soapObject.hasProperty("basketDescription")) {
            Object obj = soapObject.getProperty("basketDescription");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                basketDescription = j.toString();
            } else if (obj != null && obj instanceof String) {
                basketDescription = (String) obj;
            }
        }
        if (soapObject.hasProperty("customerContactNumber")) {
            Object obj = soapObject.getProperty("customerContactNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                customerContactNumber = j.toString();
            } else if (obj != null && obj instanceof String) {
                customerContactNumber = (String) obj;
            }
        }
        if (soapObject.hasProperty("customerEmail")) {
            Object obj = soapObject.getProperty("customerEmail");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                customerEmail = j.toString();
            } else if (obj != null && obj instanceof String) {
                customerEmail = (String) obj;
            }
        }
        if (soapObject.hasProperty("customerFirstName")) {
            Object obj = soapObject.getProperty("customerFirstName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                customerFirstName = j.toString();
            } else if (obj != null && obj instanceof String) {
                customerFirstName = (String) obj;
            }
        }
        if (soapObject.hasProperty("customerId")) {
            Object obj = soapObject.getProperty("customerId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                customerId = j.toString();
            } else if (obj != null && obj instanceof String) {
                customerId = (String) obj;
            }
        }
        if (soapObject.hasProperty("customerLastName")) {
            Object obj = soapObject.getProperty("customerLastName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                customerLastName = j.toString();
            } else if (obj != null && obj instanceof String) {
                customerLastName = (String) obj;
            }
        }
        if (soapObject.hasProperty("customerTrxRef")) {
            Object obj = soapObject.getProperty("customerTrxRef");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                customerTrxRef = j.toString();
            } else if (obj != null && obj instanceof String) {
                customerTrxRef = (String) obj;
            }
        }
        if (soapObject.hasProperty("mcaCustomerCareGetProductsResultCode")) {
            Object obj = soapObject.getProperty("mcaCustomerCareGetProductsResultCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mcaCustomerCareGetProductsResultCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                mcaCustomerCareGetProductsResultCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("mcaCustomerCareGetProductsResultMsg")) {
            Object obj = soapObject.getProperty("mcaCustomerCareGetProductsResultMsg");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mcaCustomerCareGetProductsResultMsg = j.toString();
            } else if (obj != null && obj instanceof String) {
                mcaCustomerCareGetProductsResultMsg = (String) obj;
            }
        }
        if (soapObject.hasProperty("mcaLoggerUpdateResultCode")) {
            Object obj = soapObject.getProperty("mcaLoggerUpdateResultCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mcaLoggerUpdateResultCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                mcaLoggerUpdateResultCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("mcaLoggerUpdateResultMsg")) {
            Object obj = soapObject.getProperty("mcaLoggerUpdateResultMsg");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mcaLoggerUpdateResultMsg = j.toString();
            } else if (obj != null && obj instanceof String) {
                mcaLoggerUpdateResultMsg = (String) obj;
            }
        }
        if (soapObject.hasProperty("mcaRtppPaymentResultCode")) {
            Object obj = soapObject.getProperty("mcaRtppPaymentResultCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mcaRtppPaymentResultCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                mcaRtppPaymentResultCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("mcaRtppPaymentResultMsg")) {
            Object obj = soapObject.getProperty("mcaRtppPaymentResultMsg");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mcaRtppPaymentResultMsg = j.toString();
            } else if (obj != null && obj instanceof String) {
                mcaRtppPaymentResultMsg = (String) obj;
            }
        }
        if (soapObject.hasProperty("paymentChannel")) {
            Object obj = soapObject.getProperty("paymentChannel");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                paymentChannel = j.toString();
            } else if (obj != null && obj instanceof String) {
                paymentChannel = (String) obj;
            }
        }
        if (soapObject.hasProperty("payuMerchantId")) {
            Object obj = soapObject.getProperty("payuMerchantId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                payuMerchantId = j.toString();
            } else if (obj != null && obj instanceof String) {
                payuMerchantId = (String) obj;
            }
        }
        if (soapObject.hasProperty("transactionDate")) {
            Object obj = soapObject.getProperty("transactionDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                transactionDate = j.toString();
            } else if (obj != null && obj instanceof String) {
                transactionDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("transactionReference")) {
            Object obj = soapObject.getProperty("transactionReference");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                transactionReference = j.toString();
            } else if (obj != null && obj instanceof String) {
                transactionReference = (String) obj;
            }
        }
        if (soapObject.hasProperty("transactionStatus")) {
            Object obj = soapObject.getProperty("transactionStatus");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                transactionStatus = j.toString();
            } else if (obj != null && obj instanceof String) {
                transactionStatus = (String) obj;
            }
        }
        if (soapObject.hasProperty("transactionStatusDescription")) {
            Object obj = soapObject.getProperty("transactionStatusDescription");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                transactionStatusDescription = j.toString();
            } else if (obj != null && obj instanceof String) {
                transactionStatusDescription = (String) obj;
            }
        }
        if (soapObject.hasProperty("transactionType")) {
            Object obj = soapObject.getProperty("transactionType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                transactionType = j.toString();
            } else if (obj != null && obj instanceof String) {
                transactionType = (String) obj;
            }
        }
        if (soapObject.hasProperty("defaultPM")) {
            Object obj = soapObject.getProperty("defaultPM");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                defaultPM = j.toString();
            } else if (obj != null && obj instanceof String) {
                defaultPM = (String) obj;
            }
        }
        if (soapObject.hasProperty("pmId")) {
            Object obj = soapObject.getProperty("pmId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                pmId = j.toString();
            } else if (obj != null && obj instanceof String) {
                pmId = (String) obj;
            }
        }
    }

    @Override
    public Object getProperty(int arg0) {
        switch (arg0) {
            case 0:
                return amountInCents;
            case 1:
                return basketAmountInCents;
            case 2:
                return basketCurrency;
            case 3:
                return basketDescription;
            case 4:
                return customerContactNumber;
            case 5:
                return customerEmail;
            case 6:
                return customerFirstName;
            case 7:
                return customerId;
            case 8:
                return customerLastName;
            case 9:
                return customerTrxRef;
            case 10:
                return mcaCustomerCareGetProductsResultCode;
            case 11:
                return mcaCustomerCareGetProductsResultMsg;
            case 12:
                return mcaLoggerUpdateResultCode;
            case 13:
                return mcaLoggerUpdateResultMsg;
            case 14:
                return mcaRtppPaymentResultCode;
            case 15:
                return mcaRtppPaymentResultMsg;
            case 16:
                return paymentChannel;
            case 17:
                return payuMerchantId;
            case 18:
                return transactionDate;
            case 19:
                return transactionReference;
            case 20:
                return transactionStatus;
            case 21:
                return transactionStatusDescription;
            case 22:
                return transactionType;
            case 23:
                return defaultPM;
            case 24:
                return pmId;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 25;
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "amountInCents";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "basketAmountInCents";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "basketCurrency";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "basketDescription";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "customerContactNumber";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "customerEmail";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "customerFirstName";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "customerId";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "customerLastName";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "customerTrxRef";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "mcaCustomerCareGetProductsResultCode";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "mcaCustomerCareGetProductsResultMsg";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "mcaLoggerUpdateResultCode";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "mcaLoggerUpdateResultMsg";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "mcaRtppPaymentResultCode";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "mcaRtppPaymentResultMsg";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "paymentChannel";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "payuMerchantId";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "transactionDate";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "transactionReference";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "transactionStatus";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "transactionStatusDescription";
                break;
            case 22:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "transactionType";
                break;
            case 23:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "defaultPM";
                break;
            case 24:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "pmId";
                break;
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}