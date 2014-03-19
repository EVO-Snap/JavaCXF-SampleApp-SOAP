
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:24:52.393-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "TMSTransactionFailedFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults")
public class ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSTransactionFailedFault tmsTransactionFailedFault;

    public ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSTransactionFailedFault tmsTransactionFailedFault) {
        super(message);
        this.tmsTransactionFailedFault = tmsTransactionFailedFault;
    }

    public ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSTransactionFailedFault tmsTransactionFailedFault, Throwable cause) {
        super(message, cause);
        this.tmsTransactionFailedFault = tmsTransactionFailedFault;
    }

    public com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSTransactionFailedFault getFaultInfo() {
        return this.tmsTransactionFailedFault;
    }
}