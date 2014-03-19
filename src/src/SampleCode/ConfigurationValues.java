package SampleCode;

import com.evosnap.schemas.cws.v2_0.serviceinformation.BankcardService;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ElectronicCheckingService;

/*
 * The ConfigurationValues class represent the values you'll need to send transactions. All values are 
 * obtained through service information with the exception of "_UseTMS". Once the application has all of 
 * the values below, it should skip service information and go directly to transaction processing.  
 */
public class ConfigurationValues {
	public String _SessionToken; //Expires every 30min. Recommended that the application refreshes every 25min
	public Long _SessionTokenDateTime; //Used to determine when to refresh the "_SessionToken". 
	public String _ApplicationProfileId; //Associated with the software certification. 
	public String _BCPServiceId; //Each service provider has a ServiceId. In the case of multiple merchants the application will have to manage which service to use.
	public String _ECKServiceId; //Each service provider has a ServiceId. In the case of multiple merchants the application will have to manage which service to use.
	public String ServiceToProcessAs; //Valid Values are 'BankcardService', 'ElectronicCheckingService'
	public BankcardService _bcs;
	public ElectronicCheckingService _ecks;
	public String _BCPMerchantProfileId; //Associated with the serviceId. So one serviceId will have one to many MerchantProfileId.
	public String _ECKMerchantProfileId; //Associated with the serviceId. So one serviceId will have one to many MerchantProfileId.
	public String _WorkFlowId; //Associated with the serviceId. So one serviceId will have one to many MerchantProfileId.
	public boolean _UseTMS;
	public boolean _UseWorkFlowId;
}
