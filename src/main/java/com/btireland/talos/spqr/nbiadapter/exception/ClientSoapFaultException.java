package com.btireland.talos.spqr.nbiadapter.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CLIENT, faultStringOrReason = "Client request invalid")
public class ClientSoapFaultException extends SoapFaultException {

    public ClientSoapFaultException(String code, String message) {
        super(code, message);
    }

    public ClientSoapFaultException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
