
package com.sun.mdm.index.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.5
 * 2016-06-27T20:34:27.437-07:00
 * Generated source version: 3.0.5
 */

@WebFault(name = "UserException", targetNamespace = "http://webservice.index.mdm.sun.com/")
public class UserException_Exception extends Exception {
    
    private com.sun.mdm.index.webservice.UserException userException;

    public UserException_Exception() {
        super();
    }
    
    public UserException_Exception(String message) {
        super(message);
    }
    
    public UserException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException_Exception(String message, com.sun.mdm.index.webservice.UserException userException) {
        super(message);
        this.userException = userException;
    }

    public UserException_Exception(String message, com.sun.mdm.index.webservice.UserException userException, Throwable cause) {
        super(message, cause);
        this.userException = userException;
    }

    public com.sun.mdm.index.webservice.UserException getFaultInfo() {
        return this.userException;
    }
}