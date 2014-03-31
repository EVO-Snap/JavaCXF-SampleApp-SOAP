package SampleCode;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPBinding;

import com.evosnap.schemas.cws.v2_0.serviceinformation.ArrayOfBankcardService;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ArrayOfElectronicCheckingService;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ArrayOfWorkflow;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ArrayOfWorkflowService;
import com.evosnap.schemas.cws.v2_0.serviceinformation.BankcardService;
import com.evosnap.schemas.cws.v2_0.serviceinformation.CWSServiceInformation;
import com.evosnap.schemas.cws.v2_0.serviceinformation.AddressInfo;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ApplicationData;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ApplicationLocation;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ArrayOfMerchantProfile;
import com.evosnap.schemas.cws.v2_0.serviceinformation.BankcardMerchantData;
import com.evosnap.schemas.cws.v2_0.serviceinformation.BankcardTransactionDataDefaults;
import com.evosnap.schemas.cws.v2_0.serviceinformation.CreditAuthorizeSupportType;
import com.evosnap.schemas.cws.v2_0.serviceinformation.CustomerPresent;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ElectronicCheckingMerchantData;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ElectronicCheckingService;
import com.evosnap.schemas.cws.v2_0.serviceinformation.EncryptionType;
import com.evosnap.schemas.cws.v2_0.serviceinformation.GetServiceInformation;
import com.evosnap.schemas.cws.v2_0.serviceinformation.GetServiceInformationResponse;
import com.evosnap.schemas.cws.v2_0.serviceinformation.HardwareType;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ICWSServiceInformation;
import com.evosnap.schemas.cws.v2_0.serviceinformation.IsMerchantProfileInitialized;
import com.evosnap.schemas.cws.v2_0.serviceinformation.IsMerchantProfileInitializedResponse;
import com.evosnap.schemas.cws.v2_0.serviceinformation.MerchantProfile;
import com.evosnap.schemas.cws.v2_0.serviceinformation.MerchantProfileMerchantData;
import com.evosnap.schemas.cws.v2_0.serviceinformation.MerchantProfileTransactionData;
import com.evosnap.schemas.cws.v2_0.serviceinformation.Operations;
import com.evosnap.schemas.cws.v2_0.serviceinformation.PINCapability;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ReadCapability;
import com.evosnap.schemas.cws.v2_0.serviceinformation.RequestAdvice;
import com.evosnap.schemas.cws.v2_0.serviceinformation.SaveApplicationData;
import com.evosnap.schemas.cws.v2_0.serviceinformation.SaveApplicationDataResponse;
import com.evosnap.schemas.cws.v2_0.serviceinformation.SaveMerchantProfiles;
import com.evosnap.schemas.cws.v2_0.serviceinformation.ServiceInformation;
import com.evosnap.schemas.cws.v2_0.serviceinformation.SignOnWithToken;
import com.evosnap.schemas.cws.v2_0.serviceinformation.SignOnWithTokenResponse;
import com.evosnap.schemas.cws.v2_0.serviceinformation.StoredValueService;
import com.evosnap.schemas.cws.v2_0.serviceinformation.TenderType;
import com.evosnap.schemas.cws.v2_0.serviceinformation.TypeISOCountryCodeA3;
import com.evosnap.schemas.cws.v2_0.serviceinformation.TypeISOCurrencyCodeA3;
import com.evosnap.schemas.cws.v2_0.serviceinformation.TypeISOLanguageCodeA3;
import com.evosnap.schemas.cws.v2_0.serviceinformation.TypeStateProvince;
import com.evosnap.schemas.cws.v2_0.serviceinformation.Workflow;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.*;
import com.evosnap.schemas.cws.v2_0.transactions.Addendum;
import com.evosnap.schemas.cws.v2_0.transactions.ArrayOfCapture;
import com.evosnap.schemas.cws.v2_0.transactions.ArrayOfResponse;
import com.evosnap.schemas.cws.v2_0.transactions.CustomerInfo;
import com.evosnap.schemas.cws.v2_0.transactions.NameInfo;
import com.evosnap.schemas.cws.v2_0.transactions.Response;
import com.evosnap.schemas.cws.v2_0.transactions.Return;
import com.evosnap.schemas.cws.v2_0.transactions.Status;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionCustomerData;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionData;
import com.evosnap.schemas.cws.v2_0.transactions.Unmanaged;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.AVSData;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardCapture;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardCaptureResponse;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardReturn;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardTenderData;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardTransaction;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardTransactionData;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardTransactionResponse;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardUndo;
import com.evosnap.schemas.cws.v2_0.transactions.CVDataProvided;
import com.evosnap.schemas.cws.v2_0.transactionprocessing.CwsTransactionProcessing;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.CardData;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.CardSecurityData;
import com.evosnap.schemas.cws.v2_0.transactions.EntryMode;
import com.evosnap.schemas.cws.v2_0.transactionprocessing.ICwsTransactionProcessing;
import com.evosnap.schemas.cws.v2_0.transactions.IndustryType;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.TypeCardType;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionResponsePro;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.CheckCountryCode;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.CheckData;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingCaptureResponse;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingTenderData;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingTransaction;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingTransactionData;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingTransactionResponse;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.OwnerType;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.SECCode;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.ServiceType;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.TransactionType;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.UseType;
import com.evosnap.schemas.cws.v2_0.transactions.faults.CWSBaseFault;
import com.evosnap.schemas.cws.v2_0.transactions.faults.CWSValidationErrorFault;
import com.evosnap.schemas.cws.v2_0.transactions.faults.CWSValidationResultFault;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.ArrayOfBatchDetailData;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.ArrayOfFamilyDetail;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.ArrayOfSummaryDetail;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.ArrayOfTransactionDetail;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.BatchDetailData;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.CWSTransaction;
import com.evosnap.schemas.cws.v2_0.dataservices.DateRange;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.FamilyDetail;
import com.evosnap.schemas.cws.v2_0.dataservices.PagingParameters;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.ITMSOperations;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryBatchParameters;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryBatchResponse;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryTransactionFamiliesResponse;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryTransactionsDetailResponse;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryTransactionsParameters;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryTransactionsSummaryResponse;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.SummaryDetail;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.TransactionDetail;
import com.evosnap.schemas.cws.v2_0.*;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSBaseFault;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSOperationNotSupportedFault;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSTransactionFailedFault;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSUnavailableFault;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSUnknownServiceKeyFault;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryBatch;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryTransactionsSummary;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryTransactionFamilies;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.QueryTransactionsDetail;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.BatchDetailData;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

//import com.sun.xml.bind.v2.model.core.PropertyInfo;

public class SampleApp {
	
	private static final QName SIS_SERVICE_NAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "CWSServiceInformation");
	private static final QName SIS_PORT_NAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "ServiceInfoProcessing_ICWSServiceInformation");
	private static final QName BCP_SERVICE_NAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions", "ICWSBankcard");
	private static final QName BCP_PORT_NAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions", "TransactionProcessing_ICWSBankcard");
	private static final QName TMS_SERVICE_NAME = new QName("http://schemas.evosnap.com/TMS/v2.0", "ITMSOperations");
	private static final QName TMS_PORT_NAME = new QName("http://schemas.evosnap.com/TMS/v2.0", "BasicHttpBinding_ITMSOperations");

	
	//These urls should be located in a configuration file or similar so that they can be changed without recompiling or redistributing the application.
	private static String _primaryServiceEndpoint = "https://api.cipcert.goevo.com/2.0.19/SvcInfo";
	private static String _secondaryServiceEndpoint = "https://api.cipcert.goevo.com/2.0.19/SvcInfo";
	private static String _primaryTxnEndpoint = "https://api.cipcert.goevo.com/2.0.19/Txn";
	private static String _secondaryTxnEndpoint = "https://api.cipcert.goevo.com/2.0.19/Txn";
	private static String _primaryTMSEndpoint = "https://api.cipcert.goevo.com/2.0.19/DataServices/TMS";
	private static String _secondaryTMSEndpoint = "https://api.cipcert.goevo.com/2.0.19/DataServices/TMS";
	// *** Please reference developers guide about protecting the Identity Token *** 
	//http://www.evosnap.com/support/knowledgebase/preparing-the-application-to-transact-2/#signonwithtoken-soap
	public String _IdentityToken = "PHNhbWw6QXNzZXJ0aW9uIE1ham9yVmVyc2lvbj0iMSIgTWlub3JWZXJzaW9uPSIxIiBBc3NlcnRpb25JRD0iX2ZiNWIzMDAwLTljODktNGFjYy1hNWU1LTg1MmNhN2I4ZGUwNyIgSXNzdWVyPSJJcGNBdXRoZW50aWNhdGlvbiIgSXNzdWVJbnN0YW50PSIyMDEzLTEyLTIzVDIzOjA0OjEzLjEzOVoiIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjEuMDphc3NlcnRpb24iPjxzYW1sOkNvbmRpdGlvbnMgTm90QmVmb3JlPSIyMDEzLTEyLTIzVDIzOjA0OjEzLjEzOVoiIE5vdE9uT3JBZnRlcj0iMjAxNi0xMi0yM1QyMzowNDoxMy4xMzlaIj48L3NhbWw6Q29uZGl0aW9ucz48c2FtbDpBZHZpY2U+PC9zYW1sOkFkdmljZT48c2FtbDpBdHRyaWJ1dGVTdGF0ZW1lbnQ+PHNhbWw6U3ViamVjdD48c2FtbDpOYW1lSWRlbnRpZmllcj42MjlBQjlGMUFCRjAwMDAxPC9zYW1sOk5hbWVJZGVudGlmaWVyPjwvc2FtbDpTdWJqZWN0PjxzYW1sOkF0dHJpYnV0ZSBBdHRyaWJ1dGVOYW1lPSJTQUsiIEF0dHJpYnV0ZU5hbWVzcGFjZT0iaHR0cDovL3NjaGVtYXMuaXBjb21tZXJjZS5jb20vSWRlbnRpdHkiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlPjYyOUFCOUYxQUJGMDAwMDE8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgQXR0cmlidXRlTmFtZT0iU2VyaWFsIiBBdHRyaWJ1dGVOYW1lc3BhY2U9Imh0dHA6Ly9zY2hlbWFzLmlwY29tbWVyY2UuY29tL0lkZW50aXR5Ij48c2FtbDpBdHRyaWJ1dGVWYWx1ZT40NDQzMjcwZS1kYjFlLTRmMTMtOWFlYy1kNGVkZGIwYTc2NjI8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgQXR0cmlidXRlTmFtZT0ibmFtZSIgQXR0cmlidXRlTmFtZXNwYWNlPSJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcyI+PHNhbWw6QXR0cmlidXRlVmFsdWU+NjI5QUI5RjFBQkYwMDAwMTwvc2FtbDpBdHRyaWJ1dGVWYWx1ZT48L3NhbWw6QXR0cmlidXRlPjwvc2FtbDpBdHRyaWJ1dGVTdGF0ZW1lbnQ+PFNpZ25hdHVyZSB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyI+PFNpZ25lZEluZm8+PENhbm9uaWNhbGl6YXRpb25NZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzEwL3htbC1leGMtYzE0biMiPjwvQ2Fub25pY2FsaXphdGlvbk1ldGhvZD48U2lnbmF0dXJlTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnI3JzYS1zaGExIj48L1NpZ25hdHVyZU1ldGhvZD48UmVmZXJlbmNlIFVSST0iI19mYjViMzAwMC05Yzg5LTRhY2MtYTVlNS04NTJjYTdiOGRlMDciPjxUcmFuc2Zvcm1zPjxUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjZW52ZWxvcGVkLXNpZ25hdHVyZSI+PC9UcmFuc2Zvcm0+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyI+PC9UcmFuc2Zvcm0+PC9UcmFuc2Zvcm1zPjxEaWdlc3RNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjc2hhMSI+PC9EaWdlc3RNZXRob2Q+PERpZ2VzdFZhbHVlPlBBdUp0SHNna3ZUaU5zaVQvWXlmRk94ZWdnUT08L0RpZ2VzdFZhbHVlPjwvUmVmZXJlbmNlPjwvU2lnbmVkSW5mbz48U2lnbmF0dXJlVmFsdWU+ZEdhK0JIUVoxNXNBeGZmMEp6OTdRWk5FbmRhaUlpOWsvREYxYnhCNVppU2RKRUpuVktGL1JjZ0Z3cDYwT2JLeDRPc0M2YVhpdDhIWXNhbW9ab2JZcldxdit5UlhxQ2lDTlk3ZTNENWcwL0pwSlNyOW15L2hhYjBGVWR2WXRnM0lYa0xwN2NvN0twdHMwdTFGNDNqWk9sc3p3d01WTkNxQmhCb1Q0dlNVUEgyNmpIb08xTHpqWHNqT240MTRYL1Bqb1ZDOStXRXRHeFJZb05NUFgyUlJKMWc5R3ZUUmZIcmNpcUFyK0RTYkxOTU1mZjQvMFVzM2RlZDlQNkt4WTMvbmMwWXprOTcxOHg2TFh0RFhiMGNPQjJOSkt6dFN1WWRSbEg0UTJ0VkgrekdjRVBhVmtmYy9OVmZJT2JGb3lOMENpTUpGZDNVa0h0dENsN0RVd2ROY3ZBPT08L1NpZ25hdHVyZVZhbHVlPjxLZXlJbmZvPjxvOlNlY3VyaXR5VG9rZW5SZWZlcmVuY2UgeG1sbnM6bz0iaHR0cDovL2RvY3Mub2FzaXMtb3Blbi5vcmcvd3NzLzIwMDQvMDEvb2FzaXMtMjAwNDAxLXdzcy13c3NlY3VyaXR5LXNlY2V4dC0xLjAueHNkIj48bzpLZXlJZGVudGlmaWVyIFZhbHVlVHlwZT0iaHR0cDovL2RvY3Mub2FzaXMtb3Blbi5vcmcvd3NzL29hc2lzLXdzcy1zb2FwLW1lc3NhZ2Utc2VjdXJpdHktMS4xI1RodW1icHJpbnRTSEExIj5iQkcwU0cvd2RCNWJ4eVpyYjEvbTVLakhLMU09PC9vOktleUlkZW50aWZpZXI+PC9vOlNlY3VyaXR5VG9rZW5SZWZlcmVuY2U+PC9LZXlJbmZvPjwvU2lnbmF0dXJlPjwvc2FtbDpBc3NlcnRpb24+";
	// The PTLSSocketId changes from Sandbox to Production however is tied to your certified application.
	public String _PTLSSocketId = "MIIFCzCCA/OgAwIBAgICAoAwDQYJKoZIhvcNAQEFBQAwgbExNDAyBgNVBAMTK0lQIFBheW1lbnRzIEZyYW1ld29yayBDZXJ0aWZpY2F0ZSBBdXRob3JpdHkxCzAJBgNVBAYTAlVTMREwDwYDVQQIEwhDb2xvcmFkbzEPMA0GA1UEBxMGRGVudmVyMRowGAYDVQQKExFJUCBDb21tZXJjZSwgSW5jLjEsMCoGCSqGSIb3DQEJARYdYWRtaW5AaXBwYXltZW50c2ZyYW1ld29yay5jb20wHhcNMTMwODIzMTg1NjA5WhcNMjMwODIxMTg1NjA5WjCBjDELMAkGA1UEBhMCVVMxETAPBgNVBAgTCENvbG9yYWRvMQ8wDQYDVQQHEwZEZW52ZXIxGjAYBgNVBAoTEUlQIENvbW1lcmNlLCBJbmMuMT0wOwYDVQQDEzRxYmtXM25TZ0FJQUFBUDhBSCtDY0FBQUVBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE9MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx68dD32BLjiDC9RdkIFY2P8N/bzvV75qWWemh0hO3zswggMY6BtKM7xVAoeVbEUP/HxOSlBasKE4tY/Y9hfDoqaszojt5BfqGYqAnUZ/7yjlfROdDu5q1p7AJ8DsEg9o5rpp0/88tj1+XK43JpE0PHtRecCdpsiKGclAdvaGRiXVMR0U6/nNjoNdptSo3Kd8DXSU4xWfiwrVWYUMu9otetiwutJNB3jUfsW5incr1OZ7vkFa58Eltb57UygQ5i31FSrVuBfS4UMQKVBP1V7wsVQlcC+QBNjlsGiATzdqtJBgcaI+BkPEJkF7kpDae3fNbQ77AhVFsoGV30bZCSoSNwIDAQABo4IBTjCCAUowCQYDVR0TBAIwADAdBgNVHQ4EFgQU2t+wf1VVGvks5M1zZlNa92YYUAEwgeYGA1UdIwSB3jCB24AU3+ASnJQimuunAZqQDgNcnO2HuHShgbekgbQwgbExNDAyBgNVBAMTK0lQIFBheW1lbnRzIEZyYW1ld29yayBDZXJ0aWZpY2F0ZSBBdXRob3JpdHkxCzAJBgNVBAYTAlVTMREwDwYDVQQIEwhDb2xvcmFkbzEPMA0GA1UEBxMGRGVudmVyMRowGAYDVQQKExFJUCBDb21tZXJjZSwgSW5jLjEsMCoGCSqGSIb3DQEJARYdYWRtaW5AaXBwYXltZW50c2ZyYW1ld29yay5jb22CCQD/yDY5hYVsVzA1BgNVHR8ELjAsMCqgKKAmhiRodHRwOi8vY3JsLmlwY29tbWVyY2UuY29tL2NhLWNybC5jcmwwDQYJKoZIhvcNAQEFBQADggEBAIGOvmbUPdUs3FMbQ95rpT7hShEkAbRnQjp8yY1ql48obQM0mTjQ4CfAXPELZ1xe8KyC4jaurW9KMuCkApwC8b8cgdKWg1ujtKkrNGhhDQRLcclNB6q5JTXrP0gQgrr43yHxh4vaAA8GTvkg7j2hrTUkksmc7JNIto0XsHlfvrUv8XCQIeQsFyy/nLHpQIkXwvAS6fcml6KMRTgQJm2yLZCfYVs6n18VDd9LCYWO9Y6majWoqgyHZ5Gy2qT7V+YxgDMUrZa7Fd66xHTWskO8wc7kuW5ZKaB29ewbAXIY31AHi4dAuGS6znPxnRg1kE01aDQ1FFCcajKtovg3di8PICU=";
	
	//Some services use a username and password
	private static String _userName = "";
	private static String _password = "";
	
	// END Configuration Values
	

	//Made global only for demonstration purposes with cross transaction processing
	public BankcardTransactionResponsePro BCTR = new BankcardTransactionResponsePro();
	public ElectronicCheckingTransactionResponse ECTR = new ElectronicCheckingTransactionResponse();
	public BankcardTransactionResponsePro _ReturnById_TC_Example = new BankcardTransactionResponsePro();//Terminal Capture example requires a settled Authorize for ReturnById
	
	
	//Used for a check Authorize() transaction.
	public ElectronicCheckingTransactionResponse _queryAccountTxn;//Used for a check Authorize() transaction.
	
	//public java.util.List<String> _transactionIDs = new ArrayList<String>();//The following is used for Capture Selective Example
	public ArrayOfstring _transactionIDs = new ArrayOfstring();
	public String _AuthorizeTransactionId = "";

	public com.evosnap.schemas.cws.v2_0.serviceinformation.ICWSServiceInformation CWSSIC;
	public com.evosnap.schemas.cws.v2_0.transactionprocessing.ICwsTransactionProcessing CWSBC;
	public com.evosnap.schemas.cws.v2_0.dataservices.tms.ITMSOperations CWSTMS;

	public Operations SupportedTxnTypes = new Operations();

	public ArrayOfBankcardService BCP_Services;
	public ArrayOfElectronicCheckingService ECK_Services;
	public ArrayOfWorkflow WorkFlows;

	// / The following is used for Service Information Setup

	public boolean signOnWithToken(ConfigurationValues _CV) {
		try {
			setupEndpoints(_CV);
			checkTokenExpire(_CV);
		} catch (WebServiceException WSE) {
			return false;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
		return true;
	}

	public boolean SaveApplicationConfiguration(ConfigurationValues _CV) {
		
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			String SADR = "";
			ApplicationData AD = new ApplicationData();
			AD.setApplicationAttended(false);
			AD.setApplicationLocation(ApplicationLocation.OFF_PREMISES);
			AD.setApplicationName("MyTestApp");
			// AD.setDeveloperId("TPP123");// Only used for First Data
			//AD.setDeviceSerialNumber("");
			AD.setEncryptionType(EncryptionType.MAGNE_SAFE_V_4_V_5_COMPATIBLE);//<!-- [Magensa : Valid Values 'IPADV1Compatible', 'MagneSafeV4V5Compatible', 'NotSet'] -->
			AD.setHardwareType(HardwareType.PC);
			AD.setPINCapability(PINCapability.PIN_NOT_SUPPORTED);
			AD.setReadCapability(ReadCapability.NO_MSR);
			AD.setSerialNumber("208093707");
			AD.setPTLSSocketId(_PTLSSocketId.trim());
			AD.setSoftwareVersion("2.1.0");
			Calendar cal = Calendar.getInstance();
			cal.set(2011, 01, 25);
			AD.setSoftwareVersionDate(cal);

			// Now Let's save The ApplicationData
			SADR = CWSSIC.saveApplicationData(_CV._SessionToken, AD);
			_CV._ApplicationProfileId = SADR;

		} catch (Exception e) 
        {
			handle_SVC_CWSBase_Fault(e);
            return false;
        }
		System.out.println("Successfully Obtained an ApplicationProfileId " + _CV._ApplicationProfileId + "\r\n\r\n");
		return true;
	}

	public boolean RetrieveServiceInformation(ConfigurationValues _CV) {

		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			ServiceInformation GSIR = new ServiceInformation();
			String strServiceAvailable = "";
			// BancardServices
			GSIR = CWSSIC.getServiceInformation(_CV._SessionToken);
			BCP_Services = GSIR.getBankcardServices();
			// NOTE: At this point you can either iterate through the services
			// in BCP_Services or in the case of our example just use the first one.
			if(BCP_Services.getBankcardService() != null && BCP_Services.getBankcardService().size() > 0)
			{
				boolean BCPFirstService = true;
				System.out.println("*** Key Information about the Bankcard Service(s) ***\r\n");
				//Use the following to use the first service in the scenario for first time through sample.
				for (BankcardService b : BCP_Services.getBankcardService())
				{
					if(_CV._BCPServiceId.length() < 1 && BCPFirstService){
						_CV._bcs = b;//Use the first service returned
						BCPFirstService = false;
					}
					else if (_CV._BCPServiceId.equals(b.getServiceId())) {
						_CV._bcs = b;//Use the service specified in main.java
					}
											
					//List all of the information about this service
					strServiceAvailable = "ServiceId : " + b.getServiceId()//Unique identifier for available services. These values change from sandbox to production.
					+ "\r\nService Name : " + b.getServiceName()
					+ "\r\nAlternative Merchant Data : " + b.isAlternativeMerchantData()//Indicates whether the service supports the display of AlternativeMerchantData on accountholder statements. Subject to issuer discretion.
					+ "\r\nAutoSettle Supported : " + b.isAutoBatch()//Indicates whether AutoBatch is supported.
					+ "\r\nAVSData Fields Required: "
					+ "\r\n- CardHolderName: " + b.getAVSData().isCardholderName()
					+ "\r\n- Street: " + b.getAVSData().isStreet()
					+ "\r\n- City: " + b.getAVSData().isCity()
					+ "\r\n- State: " + b.getAVSData().isStateProvince()
					+ "\r\n- PostalCode: " + b.getAVSData().isPostalCode()
					+ "\r\n- Phone: " + b.getAVSData().isPhone()
					+ "\r\n- Country: " + b.getAVSData().isCountry()
					+ "\r\nCutoffTime : " + CalenderToString(b.getCutoffTime())//If the service supports AutoBatch, this is the cutoff time for new transactions to be included in the daily automated batch. 
					+ "\r\nEncryptionKey : " + b.getEncryptionKey()//Public key used for encrypting payment account data.
					+ "\r\nManagedBilling : " + b.isManagedBilling()//Indicates whether the service supports Service Provider managed billing.
					+ "\r\nMaximumBatchItems : " + b.getMaximumBatchItems()//Maximum number of items included in a single batch.
					+ "\r\nMaximumLineItems : " + b.getMaximumLineItems()//Maximum number of line items that may be provided when providing Level 3 line item data.
					+ "\r\nMultiplePartialCapture : " + b.isMultiplePartialCapture()//Indicates whether the service supports multiple partial captures of a single authorization.
					+ "\r\nOperations Supported:"//Specifies which operations are supported for the service.
					+ "\r\n- Adjust : " + b.getOperations().isAdjust()
					+ "\r\n- AuthAndCapture : " + b.getOperations().isAuthAndCapture()
					+ "\r\n- Authorize : " + b.getOperations().isAuthorize()
					+ "\r\n- Capture : " + b.getOperations().isCapture()
					+ "\r\n- CaptureAll : " + b.getOperations().isCaptureAll()
					+ "\r\n- CaptureSelective : " + b.getOperations().isCaptureSelective()
					+ "\r\n- CloseBatch : " + b.getOperations().getCloseBatch()
					+ "\r\n- QueryAccount : " + b.getOperations().isQueryAccount()
					+ "\r\n- ReturnById : " + b.getOperations().isReturnById()
					+ "\r\n- ReturnUnlinked : " + b.getOperations().isReturnUnlinked()
					+ "\r\n- Undo : " + b.getOperations().isUndo()
					+ "\r\n- Verify : " + b.getOperations().isVerify()
					+ "\r\nPurchaseCardLevel : " + b.getPurchaseCardLevel()//Specifies highest level of purchase card support. Level 3 support implies support for Level 2 as well.
					+ "\r\nTender Information:"
					+ "\r\n- Credit : " + b.getTenders().isCredit()
					+ "\r\n- CreditAuthorizeSupport : " + b.getTenders().getCreditAuthorizeSupport()//Determins if on a specific service the application can send a credit AuthorizeAndCapture
					+ "\r\n- PINDebit : " + b.getTenders().isPINDebit()
					+ "\r\n- PINDebitReturnSupportType : " + b.getTenders().getPINDebitReturnSupportType()//Gets or sets a value that determines the PINDebitReturnSupportType. This value will default to PinDebitReturnSupportType.Standalone.
					+ "\r\n- PINDebitUndoTenderDataRequired : " + b.getTenders().isPINDebitUndoTenderDataRequired()//Specifies whether a new card swipe is required when performing an Undo on a PINDebit card.
					+ "\r\n- PINlessDebit : " + b.getTenders().isPINlessDebit() + "\r\n"
					;
					System.out.println(strServiceAvailable);
				}
			}
			System.out.println("Please note that for BCP demonstration we'll use the first Service with ServiceId " + _CV._bcs.getServiceId());
			System.out.println("\r\n*** END Bankcard Service(s) ***\r\n");
	//ElectronicChecking Services
			ECK_Services = GSIR.getElectronicCheckingServices();
			// NOTE: At this point you can either iterate through the services
			// in SI or in the case of our example just use the first one.
			if(ECK_Services.getElectronicCheckingService() != null && ECK_Services.getElectronicCheckingService().size() > 0)
			{
				boolean ECKFirstService = true;
				System.out.println("*** Key Information about the Electronic Checking Service(s) ***\r\n");
				//Use the following to use the first service in the scenario for first time through sample.
				for (ElectronicCheckingService e : ECK_Services.getElectronicCheckingService())
				{
					if(_CV._ECKServiceId.length() < 1  && ECKFirstService){
						_CV._ecks = e;//Use the first service returned
						ECKFirstService = false;
					}
					else if (_CV._ECKServiceId.equals(e.getServiceId())) {
						_CV._ecks = e;//Use the service specified in main.java
					}
																
					//List all of the information about this service
					strServiceAvailable = "ServiceId : " + e.getServiceId()//Unique identifier for available services. These values change from sandbox to production.
                    + "\r\nService Name : " + e.getServiceName()
					//Operations Supported
                    + "\r\nOperations Supported:" //Specifies which operations are supported for the service.
                    + "\r\n - Adjust : " + e.getOperations().isAdjust()
                    + "\r\n - AuthAndCapture : " + e.getOperations().isAuthAndCapture()
                    + "\r\n - Authorize : " + e.getOperations().isAuthorize()
                    + "\r\n - Capture : " + e.getOperations().isCapture()
                    + "\r\n - CaptureAll : " + e.getOperations().isCaptureAll()
                    + "\r\n - CaptureSelective : " + e.getOperations().isCaptureSelective()
                    + "\r\n - CloseBatch : " + e.getOperations().getCloseBatch()
                    + "\r\n - QueryAccount : " + e.getOperations().isQueryAccount()
                    + "\r\n - ReturnById : " + e.getOperations().isReturnById()
                    + "\r\n - ReturnUnlinked : " + e.getOperations().isReturnUnlinked()
                    + "\r\n - Undo : " + e.getOperations().isUndo()
                    + "\r\n - Verify : " + e.getOperations().isVerify()
                    + "\r\nTender Information:" //Contains specific information about the supported payment tenders.
                    + "\r\n - BatchAssignmentSupport : " + e.getTenders().getBatchAssignmentSupport() //Indicates level of BatchAssignment supported by the service. Required.
                    + "\r\n - Credit : " + e.getTenders().isCredit() //Indicates support for the Credit Card tender. Required.
                    + "\r\n - CreditAuthorizeSupport : " + e.getTenders().getCreditAuthorizeSupport() //Indicates the level of credit authorization support on a service. Required. Maps to the CreditAuthorizeSupportType enumeration.
                    + "\r\n - PINDebit : " + e.getTenders().isPINDebit() //Indicates support for the PIN Debit tender. Required.
                    + "\r\n - PINDebitReturnSupportType : " + e.getTenders().getPINDebitReturnSupportType() //Indicates if Return is supported by the service for PIN Debit transactions. Required. Maps to the PinDebitReturnSupportType enumeration. Defaults to 'Standalone'.
                    + "\r\n - PinDebitUndoSupport : " + e.getTenders().getPinDebitUndoSupport() //Indicates if Undo is supported by the service for PIN Debit transactions. Required. Maps to the PINDebitUndoSupportType enumeration.
                    + "\r\n - PINDebitUndoTenderDataRequired : " + e.getTenders().isPINDebitUndoTenderDataRequired() //Specifies whether a new card swipe is required when performing an Undo on a PIN Debit card. Required.
                    + "\r\n - PINlessDebit : " + e.getTenders().isPINlessDebit() //Indicates support for PINless Debit. Required.
                    + "\r\n - QueryRejectedSupport : " + e.getTenders().getQueryRejectedSupport() + "\r\n" //Indicates if date ranges are supported for QueryRejected on a service. Required. Maps to the QueryRejectedSupportType enumeration.
                    ;
					System.out.println(strServiceAvailable);
				}
				System.out.println("Please note that for ECK demonstration we'll use the first Service with ServiceId " + _CV._ecks.getServiceId());
				System.out.println("\r\n*** END Electronic Checking Service(s) ***\r\n");
			}
			
	//Report available workflowId(s)
			WorkFlows = GSIR.getWorkflows();
			if(WorkFlows.getWorkflow() != null && WorkFlows.getWorkflow().size() > 0)
			{
				System.out.println("*** Key Information about the Available Workflow(s) ***\r\n");
				//Use the following to use the first service in the scenario for first time through sample.
				for (Workflow w : WorkFlows.getWorkflow())
				{
					//List all of the information about this service
					strServiceAvailable = "WorflowId : " + w.getWorkflowId()//Unique identifier for available services. These values change from sandbox to production.
                    + "\r\nWorkflow Name : " + w.getName()
                    + "\r\nAssociated ServiceId : " + w.getServiceId() + "\r\n"
                    ;
					System.out.println(strServiceAvailable);
				}
				System.out.println("\r\n*** END Available WorkflowId(s) ***\r\n");
			}

			if (_CV._bcs.getServiceId().length() < 1 && _CV._ecks.getServiceId().length() < 1)
				return false;
		} catch (Exception e) 
        {
			handle_SVC_CWSBase_Fault(e);
            return false;
        }
		
		return true;
	}

	public boolean SaveMerchantProfile(ConfigurationValues _CV) {

		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			MerchantProfileMerchantData MPMD = new MerchantProfileMerchantData();
			MerchantProfile MP = new MerchantProfile();
			ArrayOfMerchantProfile AOMP = new ArrayOfMerchantProfile();

			// Set Merchant Data
			AddressInfo AI = new AddressInfo();
			AI.setStreet1("1234 HappyWay");
			AI.setCity("Pleasanton");
			AI.setStateProvince(TypeStateProvince.CA);
			AI.setPostalCode("94566");
			AI.setCountryCode(TypeISOCountryCodeA3.USA);
			MPMD.setAddress(AI);
			MPMD.setCustomerServicePhone("513 3334444");
			MPMD.setMerchantId("123456789012");
			MPMD.setName("MerchantName");
			MPMD.setLanguage(TypeISOLanguageCodeA3.ENG);
			MPMD.setPhone("513 8884444");
			MPMD.setTaxId("");
			MerchantProfileTransactionData MPTD = new MerchantProfileTransactionData();
			BankcardTransactionDataDefaults BTDD = new BankcardTransactionDataDefaults();
			BTDD.setCurrencyCode(TypeISOCurrencyCodeA3.USD);
			BTDD.setCustomerPresent(CustomerPresent.ECOMMERCE);
			BTDD.setRequestAdvice(RequestAdvice.CAPABLE);
			BTDD.setRequestACI(com.evosnap.schemas.cws.v2_0.serviceinformation.RequestACI.IS_CPS_MERIT_CAPABLE); // If AVS is supported set to "IS_CPS_MERIT_CAPABLE"
			BTDD.setEntryMode(com.evosnap.schemas.cws.v2_0.serviceinformation.EntryMode.KEYED);
			MPTD.setBankcardTransactionDataDefaults(BTDD);
			BankcardMerchantData BCMD = new BankcardMerchantData();
			BCMD.setABANumber("987654321");
			BCMD.setAcquirerBIN("654321");
			BCMD.setAgentBank("123456");
			BCMD.setAgentChain("645231");
			//BCMD.setAggregator(false);
			BCMD.setClientNumber("1234");
			//BCMD.setIndustryType(com.evosnap.schemas.cws.v2_0.serviceinformation.IndustryType.ECOMMERCE);
			BCMD.setLocation("123");
			//BCMD.setMerchantType("");
			//BCMD.setPrintCustomerServicePhone(false);
			//BCMD.setQualificationCodes("");
			BCMD.setReimbursementAttribute("A");
			BCMD.setSecondaryTerminalId("12345678");
			BCMD.setSettlementAgent("12AB");
			BCMD.setSharingGroup("123ABC");
			BCMD.setSIC("5999");
			BCMD.setStoreId("1234");
			BCMD.setTerminalId("0011");
			BCMD.setTimeZoneDifferential("005");
			
			MPMD.setBankcardMerchantData(BCMD);
			MP.setProfileId("Merch_" + _CV._bcs.getServiceId());
			MP.setMerchantData(MPMD);
			MP.setTransactionData(MPTD);
			AOMP.getMerchantProfile().add(MP);
			
			if(_CV._bcs != null){
				if(_CV._BCPMerchantProfileId.length() < 1){//Save a merchant profile for BCP as one was not specified
					CWSSIC.saveMerchantProfiles(_CV._SessionToken, _CV._bcs.getServiceId(), TenderType.CREDIT, AOMP);
					System.out.println("Successfully Saved a Bankcard MerchantProfileId");
				}
				//Now let's get a list of all MerchantProfileId's saved for Bankcard 
				ArrayOfMerchantProfile MFBCP = CWSSIC.getMerchantProfiles(_CV._SessionToken, _CV._bcs.getServiceId(), TenderType.CREDIT);
				if(MFBCP != null){
					boolean BCPFirstMerchant = true;
					String MerchantProfiles = "";
					for (MerchantProfile m : MFBCP.getMerchantProfile())
					{
						if(_CV._BCPMerchantProfileId.length() < 1  && BCPFirstMerchant){
							_CV._BCPMerchantProfileId = m.getProfileId();//Use the first MerchantProfileId returned
							BCPFirstMerchant = false;
						}
						MerchantProfiles = MerchantProfiles + m.getProfileId() + "\r\n";
					}
					System.out.println("Available Bankcard Merchant Profiles\r\n" + MerchantProfiles);
					// Can be used however skipped here CWSSIC.isMerchantProfileInitialized(_CV._SessionToken, _CV._bcs.getServiceId(), MP.getProfileId(), TenderType.CREDIT);
				}			
			}
			if(_CV._ecks != null){
				if(_CV._ECKMerchantProfileId.length() < 1){//Save a merchant profile for ECK as one was not specified
					//Set Checking specific values
					ElectronicCheckingMerchantData ECMD = new ElectronicCheckingMerchantData();
					ECMD.setOrginatorId("123456");
					ECMD.setProductId("321");
					ECMD.setSiteId("23135");
					MPMD.setElectronicCheckingMerchantData(ECMD);
					MP.setMerchantData(MPMD);
					//Note that MerchantProfileIds cannot be the same even across serviceIds
					MP.setProfileId("Merch_" + _CV._ecks.getServiceId());
					MP.setTransactionData(MPTD);
					AOMP.getMerchantProfile().clear();
					AOMP.getMerchantProfile().add(MP);
					CWSSIC.saveMerchantProfiles(_CV._SessionToken, _CV._ecks.getServiceId(), TenderType.CREDIT, AOMP);
					System.out.println("Successfully Saved a ElectronicChecking MerchantProfileId");
				}
				//Now let's get a list of all MerchantProfileId's saved for Electronic Checking
				ArrayOfMerchantProfile MFECK = CWSSIC.getMerchantProfiles(_CV._SessionToken, _CV._ecks.getServiceId(), TenderType.CREDIT);
				if(MFECK != null){
					boolean ECKFirstMerchant = true;
					String MerchantProfiles = "";
					for (MerchantProfile m : MFECK.getMerchantProfile())
					{
						if(_CV._ECKMerchantProfileId.length() < 1  && ECKFirstMerchant){
							_CV._ECKMerchantProfileId = m.getProfileId();//Use the first MerchantProfileId returned
							ECKFirstMerchant = false;
						}
						MerchantProfiles = MerchantProfiles + m.getProfileId() + "\r\n";
					}
					System.out.println("Available Electronic Checking Merchant Profiles\r\n" + MerchantProfiles);
					// Can be used however skipped here CWSSIC.isMerchantProfileInitialized(_CV._SessionToken, _CV._bcs.getServiceId(), MP.getProfileId(), TenderType.CREDIT);
				}	
			}				
			return true;
		}catch (Exception e) 
        {
			handle_SVC_CWSBase_Fault(e);
            return false;
        }
	}

/// The following is used for Transaction Processing
	
	public boolean AuthorizeAndCapture(ConfigurationValues _CV, boolean ProcessAsPINDebit) {
		/*
		 * The AuthorizeAndCapture() operation is used to authorize transactions by performing a check on 
		 * cardholder's funds and reserves the authorization amount if sufficient funds are available, and 
		 * flags the transaction for capture (settlement) in a single invocation.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#authorizeandcapture-soap
		*/

		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.
			
			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().isAuthAndCapture()){
					System.out.println("AuthorizeAndCapture is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				if(_CV._bcs.getTenders().getCreditAuthorizeSupport() == CreditAuthorizeSupportType.AUTHORIZE_ONLY && ProcessAsPINDebit != true){
					System.out.println("AuthorizeAndCapture can only be used for a PINDebit transaction for this service\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				BankcardTransaction BCtransaction = setBankCardTxnData(_CV);
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	BCtransaction.setAddendum(SetUsernameAndPassword(_userName, _password));
		        
		        if(_CV._UseWorkFlowId){
					BCTR = (BankcardTransactionResponsePro) CWSBC.authorizeAndCapture(_CV._SessionToken, BCtransaction, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._WorkFlowId);
		        }
		        else{
					BCTR = (BankcardTransactionResponsePro) CWSBC.authorizeAndCapture(_CV._SessionToken, BCtransaction, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId());		        	
		        }
		        
				ProcessBankcardTransactionResponse(BCTR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}
			
			System.out.println("AuthorizeAndCapture Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean Authorize(ConfigurationValues _CV) {
		/* 
		 * The Authorize() operation is used to authorize transactions by performing a check on cardholder's funds and 
		 * reserves the authorization amount if sufficient funds are available. Unlike the AuthorizeAndCapture() operation, 
		 * authorized transactions must then be flagged for settlement by invoking the Capture() operation.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#authorize-soap
		 */
		
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().isAuthorize()){
					System.out.println("Authorize is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				BankcardTransaction BCtransaction = setBankCardTxnData(_CV);
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	BCtransaction.setAddendum(SetUsernameAndPassword(_userName, _password));
		        
		        if(_CV._UseWorkFlowId){
		        	BCTR = (BankcardTransactionResponsePro) CWSBC.authorize(_CV._SessionToken, BCtransaction, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._WorkFlowId);
		        }
		        else{
		        	BCTR = (BankcardTransactionResponsePro) CWSBC.authorize(_CV._SessionToken, BCtransaction, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId());		        	
		        }
				
				ProcessBankcardTransactionResponse(BCTR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				if (!_CV._ecks.getOperations().isAuthorize()){
					System.out.println("Authorize is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				if(!ECTR.isACHCapable()){
					System.out.println("Your previous QueryAccount() returned a response where the transaction is not ACHCapable");
					return false;
				}
				
                //If a modified account or routing number is returned, those numbers should be used for the check transaction.  
                //Good for verifying the info before running the charge – like when you initially set-up a recurring payment.
				ElectronicCheckingTransaction ECKtransaction = setElectronicCheckTxnData();
				if(ECKtransaction.getTenderData().getCheckData().getAccountNumber() != ECTR.getModifiedAccountNumber())
					ECKtransaction.getTenderData().getCheckData().setAccountNumber(ECTR.getModifiedAccountNumber());
				if(ECKtransaction.getTenderData().getCheckData().getRoutingNumber() != ECTR.getModifiedRoutingNumber())
					ECKtransaction.getTenderData().getCheckData().setRoutingNumber(ECTR.getModifiedRoutingNumber());
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._ECKServiceId))
		        	ECKtransaction.setAddendum(SetUsernameAndPassword(_userName, _password));
				
		        if(_CV._UseWorkFlowId){
		        	ECTR = (ElectronicCheckingTransactionResponse) CWSBC.authorize(_CV._SessionToken, ECKtransaction, _CV._ApplicationProfileId, _CV._ECKMerchantProfileId, _CV._WorkFlowId);
		        }
		        else{
		        	ECTR = (ElectronicCheckingTransactionResponse) CWSBC.authorize(_CV._SessionToken, ECKtransaction, _CV._ApplicationProfileId, _CV._ECKMerchantProfileId, _CV._ecks.getServiceId());		        	
		        }
		        
				ProcessElectronicCheckingTransactionResponse(ECTR, _CV);
				
				if(ECTR != null){
					//In this case the check is ACHCapable meaning that it can now be processed as a check
					System.out.println("The check is ACHCapable meaning that it can now be processed as a check");
				}
				else{
					return false;//Stop processing as an issue was encourntered.
				}
			}
			
			System.out.println("Authorize Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			//The following is used for TMS
			_AuthorizeTransactionId = BCTR.getTransactionId();
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean Adjust(ConfigurationValues _CV) {
		/* The Adjust() operation is used to make adjustments to a previously authorized amount (incremental 
		 * or reversal) prior to capture and settlement.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#adjust-soap
		*/ 
		
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().isAdjust()){
					System.out.println("Adjust is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				// First Let's perform an Authorize and Capture. Well use this later on for the Adjust
				if (_CV._bcs.getOperations().isAuthorize())
					if(!Authorize(_CV))return false;

				// Now Let's adjust the previously approved AuthorizeAndCapture
				String pTransaction = BCTR.getTransactionId();
				com.evosnap.schemas.cws.v2_0.transactions.Adjust aDifference = new com.evosnap.schemas.cws.v2_0.transactions.Adjust();
				//Add tip to original amount
				
				aDifference.setAmount(BCTR.getAmount().add((new BigDecimal("2.00")).setScale(2, RoundingMode.UNNECESSARY)));// Add two dollars to original amount
				aDifference.setTipAmount((new BigDecimal("2.00")).setScale(2, RoundingMode.UNNECESSARY));// Add two dollars to original amount
				aDifference.setTransactionId(pTransaction); // Simply use the TransactionId from the Authorize
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	aDifference.setAddendum(SetUsernameAndPassword(_userName, _password));
				
				BCTR = (BankcardTransactionResponsePro) CWSBC.adjust(_CV._SessionToken, aDifference, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				ProcessBankcardTransactionResponse(BCTR, _CV);

				/*
				 * Since the Adjust succeeded, remove the original TransactionID from the list of transaction to settle. 
				 * The new TransactionId Should be used when calling CaptureSelective. In your database you'll 
				 * likely perform and Update instead of an add and delete.
				*/
				if(_transactionIDs.getString().contains(pTransaction))
				{
					_transactionIDs.getString().remove(pTransaction);
				}
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}
						
			System.out.println("Adjust Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean Undo(ConfigurationValues _CV) {
		/* 
		 * The Undo() operation is used to release cardholder funds by performing a void (Credit Card) or reversal 
		 * (PIN Debit) on a previously authorized transaction that has not been captured (flagged) for settlement.
		 * 
		 * The fundamental difference between Undo() and ReturnUnlinked() is that Undo() is used to void or reverse 
		 * a previously authorized transaction, while ReturnUnlinked() can only be used to return funds for a transaction 
		 * that has been previously flagged for capture.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#undo-soap
		*/ 
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().isUndo()){
					System.out.println("Undo is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				//For an Undo let's first generate an Authorize to Undo
				if (_CV._bcs.getOperations().isAuthorize())
					if(!Authorize(_CV))return false;

				// Now Let's Undo the previously approved Authorize
				BankcardUndo uDifference = new BankcardUndo();

				String pTransaction = BCTR.getTransactionId();
				uDifference.setTransactionId(pTransaction); // Simply use the TransactionId from the Authorize
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	uDifference.setAddendum(SetUsernameAndPassword(_userName, _password));
				
				BCTR = (BankcardTransactionResponsePro) CWSBC.undo(_CV._SessionToken, uDifference, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				ProcessBankcardTransactionResponse(BCTR, _CV);

				/*
				 * Since the Undo succeeded, remove both the original transactionId as well as the transactionId
				 * returned from the Undo transaction.
				*/
				if(_transactionIDs.getString().contains(BCTR.getTransactionId()))//The last TransactionId from the Undo
					_transactionIDs.getString().remove(BCTR.getTransactionId());
				if(_transactionIDs.getString().contains(pTransaction))//The original TransactionId from the Authorize	
					_transactionIDs.getString().remove(pTransaction);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				if (!_CV._ecks.getOperations().isUndo()){
					System.out.println("Undo is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				//ADD
			}
						
			System.out.println("Undo Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean Capture(ConfigurationValues _CV) {
		/* 
		 * The Capture() operation is used to capture a single transaction for settlement after it has been successfully 
		 * authorized using the Authorize() operation.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#capture-soap
		*/ 
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.
			BankcardCaptureResponse BCCR = new BankcardCaptureResponse();
			
			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().isCapture()){
					System.out.println("Capture is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				//First process an Authorize which will be used for a capture
				if (_CV._bcs.getOperations().isAuthorize())
					if(!Authorize(_CV))return false;

				// Now Let's Capture the previously approved Authorize
				BankcardCapture cDifference = new BankcardCapture();

				cDifference.setTransactionId(BCTR.getTransactionId()); // Simply use the TransactionId from the Authorize
				// Conditional values. The following scenario would be used in a
				// Restaurant industry type where tip is added.
				
				BigDecimal NewAmt = BCTR.getAmount();
				NewAmt.add(new BigDecimal("6.00")).setScale(2, RoundingMode.UNNECESSARY);
				cDifference.setAmount(NewAmt);// Add tip amount
				cDifference.setTipAmount(new BigDecimal("6.00").setScale(2, RoundingMode.UNNECESSARY));
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	cDifference.setAddendum(SetUsernameAndPassword(_userName, _password));
				
				BCCR = (BankcardCaptureResponse) CWSBC.capture(_CV._SessionToken, cDifference, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				ProcessBankcardCaptureResponse(BCCR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}
			
			System.out.println("Capture Successfully Processed : " + BCCR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean CaptureAll(ConfigurationValues _CV) {
		/*
		 * The CaptureAll() operation is used to flag all transactions for settlement that have been successfully authorized 
		 * using the Authorize() operation. Merchants may wish to invoke this operation to ensure all transactions are included 
		 * in the batch that is sent for settlement processing by the cut-off times established by the Service Provider, or to 
		 * transmit smaller batches to the Service Provider for settlement
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#captureall-soap
		 */
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.
			if (!_CV._bcs.getOperations().isCaptureAll())
			{
				System.out.println("CaptureAll is not supported by this service provider. Moving to next transaction type\r\n");	
				return true;// Check to see if this transaction type is supported
			}

			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().isCaptureAll()){
					System.out.println("CaptureAll is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				//Lets first load some transaction. For simulation I'll try and load each transaction type if supported
				System.out.println("Starting CaptureAll examples");

				if (_CV._bcs.getOperations().isAuthAndCapture() && _CV._bcs.isAutoBatch())
					if(!AuthorizeAndCapture(_CV, false))return false;
				if (_CV._bcs.getOperations().isAuthorize())
				{	
					if(!Authorize(_CV))return false;
					_ReturnById_TC_Example = BCTR;//Save the transaction of the Authorize for post settlement ReturnById Example 
				}
				if (_CV._bcs.getOperations().isAdjust())
					if(!Adjust(_CV))return false;
				if (_CV._bcs.getOperations().isUndo())
					if(!Undo(_CV))return false;
				//Note ReturnById is shown below as this requires an Authorize from a previous settlement
				if (_CV._bcs.getOperations().isReturnUnlinked())
					if(!ReturnUnlinked(_CV))return false;
				
				ArrayOfResponse AOR = new ArrayOfResponse();
				AOR = (ArrayOfResponse) CWSBC.captureAll(_CV._SessionToken, null, null, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId(), false);
				java.util.List<Response> R = AOR.getResponse(); 
				
				for (Response BCCR : R)
				{
					ProcessBankcardCaptureResponse((BankcardCaptureResponse)BCCR, _CV);
				}
				
				//Now let's demonstrate sending a ReturnById from a previous settlement.
				if (_CV._bcs.getOperations().isReturnById())
					if(!ReturnById(_CV))return false; 
									
				AOR = (ArrayOfResponse) CWSBC.captureAll(_CV._SessionToken, null, null, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId(), false);
				R = AOR.getResponse(); 
				
				for (Response BCCR : R)
				{
					ProcessBankcardCaptureResponse((BankcardCaptureResponse)BCCR, _CV);
				}
				System.out.println("CaptureAll Example Set Successfully Processed" + "\r\n");
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				if (!_CV._ecks.getOperations().isCaptureAll()){
					System.out.println("CaptureAll is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				ArrayOfResponse AOR = new ArrayOfResponse();
				AOR = (ArrayOfResponse) CWSBC.captureAll(_CV._SessionToken, null, null, _CV._ApplicationProfileId, _CV._ECKMerchantProfileId, _CV._ecks.getServiceId(), false);
				java.util.List<Response> R = AOR.getResponse(); 
				R = AOR.getResponse(); 
				for (Response ECCR : R)
				{
					ProcessElectronicCheckingCaptureResponse((ElectronicCheckingCaptureResponse)ECCR, _CV);
				}
				System.out.println("CaptureAll for Electronic Checking Successfully Processed" + "\r\n");
			}
			
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean CaptureSelective(ConfigurationValues _CV) {
		/*
		 * The CaptureSelective() operation is used to flag one or more transactions (by transactionId) for settlement 
		 * that have been successfully authorized using the Authorize() operation. Merchants may wish to invoke this 
		 * operation to ensure only specific transactions are included in the batch that is sent for settlement processing 
		 * by the cut-off times established by the Service Provider, or to transmit smaller batches to the Service 
		 * Provider for settlement.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#captureselective-soap
		 */
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.
			
			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().isCaptureSelective()){
					System.out.println("CaptureSelective is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				//Lets first load some transaction. For simulation I'll try and load each transaction type if supported
				System.out.println("Starting CaptureSelective examples");
				
				_transactionIDs.getString().clear();
				
				if (_CV._bcs.getOperations().isAuthAndCapture() && _CV._bcs.isAutoBatch())
					if(!AuthorizeAndCapture(_CV, false))return false;
				if (_CV._bcs.getOperations().isAuthorize())
				{	
					if(!Authorize(_CV))return false;
					_ReturnById_TC_Example = BCTR;//Save the transaction of the Authorize for post settlement ReturnById Example 
				}
				if (_CV._bcs.getOperations().isAdjust())
					if(!Adjust(_CV))return false;
				if (_CV._bcs.getOperations().isUndo())
					if(!Undo(_CV))return false;
				//Note ReturnById is shown below as this requires an Authorize from a previous settlement
				if (_CV._bcs.getOperations().isReturnUnlinked())
					if(!ReturnUnlinked(_CV))return false;
				
				ArrayOfResponse AOR = new ArrayOfResponse();
				AOR = (ArrayOfResponse) CWSBC.captureSelective(_CV._SessionToken, _transactionIDs, null, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				
				java.util.List<Response> R = AOR.getResponse(); 
				
				for (Response BCCR : R)
				{
					ProcessBankcardCaptureResponse((BankcardCaptureResponse)BCCR, _CV);
				}
				
				//Now let's demonstrate sending a ReturnById from a previous settlement.
				_transactionIDs.getString().clear(); //Clear out previous List of transactions to settle
				if (_CV._bcs.getOperations().isReturnById())
					if(!ReturnById(_CV))return false; 

				AOR = (ArrayOfResponse) CWSBC.captureSelective(_CV._SessionToken, _transactionIDs, null, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				R = AOR.getResponse(); 
				
				for (Response BCCR : R)
				{
					ProcessBankcardCaptureResponse((BankcardCaptureResponse)BCCR, _CV);
				}
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}

			System.out.println("CaptureSelective Example Set Successfully Processed" + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}
	
	public boolean ReturnById(ConfigurationValues _CV) {
		/*
		 * The ReturnById() operation is used to perform a linked credit to a cardholder’s account from the merchant’s 
		 * account based on a previously authorized and settled transaction.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#returnbyid-soap
		*/ 
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.
			
			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().isReturnById()){
					System.out.println("ReturnById is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				//First let's process an AuthorizeAndCapture 
				if (_CV._bcs.getOperations().isAuthAndCapture() && _CV._bcs.isAutoBatch())
				{//In this case the example is demonstrating a host capture return that supports AuthorizeAndCapture
					if(!AuthorizeAndCapture(_CV, false))return false; 
				}
				else if (_ReturnById_TC_Example.getTransactionId() != null)
				{//In this case the example is demonstrating a terminal capture return
					BCTR = _ReturnById_TC_Example; //Replace previous transaction with settled value
					_ReturnById_TC_Example = new BankcardTransactionResponsePro();//reset so that this transaction is not used a second time
				}
				else
				{
					System.out.println("ReturnById unable to process as a previously settled Authorize was not available");
					return true; //AuthorizeAndCapture not supported however continue with other samples.
				}
				
				// Now Let's ReturnById the previously approved AuthorizeAndCapture
				BankcardReturn rDifference = new BankcardReturn();

				rDifference.setTransactionId(BCTR.getTransactionId()); // Simply use the TransactionId from the AuthorizeAndCapture
				/* Conditional values. The following scenario would be used in a partial return for an amount 2 dollars
				 * less
				*/
				rDifference.setAmount(BCTR.getAmount());

				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	rDifference.setAddendum(SetUsernameAndPassword(_userName, _password));
				
				BCTR = (BankcardTransactionResponsePro) CWSBC.returnById(_CV._SessionToken, rDifference, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				ProcessBankcardTransactionResponse(BCTR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}
			
			System.out.println("ReturnById Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean ReturnUnlinked(ConfigurationValues _CV) {

		/*The ReturnUnlinked() operation is used to perform an “unlinked”, or standalone, credit to a cardholder’s account 
		 * from the merchant’s account. This operation is useful when a return transaction is not associated with a previously 
		 * authorized and settled transaction.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#returnunlinked-soap
		*/ 
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().isReturnUnlinked()){
					System.out.println("ReturnUnlinked is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				// Let's Return an unlinked transaction
				BankcardTransaction BCR = setBankCardTxnData(_CV);

				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	BCR.setAddendum(SetUsernameAndPassword(_userName, _password));
		        
				BCTR = (BankcardTransactionResponsePro) CWSBC.returnUnlinked(_CV._SessionToken, BCR, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId());
				ProcessBankcardTransactionResponse(BCTR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}
			
			System.out.println("ReturnUnlinked Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}
	
	public boolean Verify(ConfigurationValues _CV) {
		/* 
		 * The Verify() operation is used to verify information about a payment account, such as address verification data (AVSData) 
		 * on a credit card account, without reserving any funds.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#verify-soap
		 */
		
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().isVerify()){
					System.out.println("Verify is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				BankcardTransaction BCtransaction = setBankCardTxnData(_CV);
				
				//Note *** : Alwasy make sure AVS is set
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	BCtransaction.setAddendum(SetUsernameAndPassword(_userName, _password));
		        
				BCTR = (BankcardTransactionResponsePro) CWSBC.verify(_CV._SessionToken, BCtransaction, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId());
				ProcessBankcardTransactionResponse(BCTR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//TODO add later
			}
			
			System.out.println("Verify Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}
	
	public boolean QueryAccount(ConfigurationValues _CV) {

		/*The QueryAccount() operation is used to perform a balance inquiry on a cardholder's account to determine the current account balance.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#queryaccount-soap
		*/ 
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs.equals "BankcardService" && _CV._bcs != null){
				//Presently no service providers support
				return true;
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				if (!_CV._ecks.getOperations().isQueryAccount()){
					System.out.println("QueryAccount is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				// Let's verfiy the check account is correct
				ElectronicCheckingTransaction ECR = setElectronicCheckTxnData();
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._ECKServiceId))
		        	ECR.setAddendum(SetUsernameAndPassword(_userName, _password));
				
				ECTR = (ElectronicCheckingTransactionResponse) CWSBC.queryAccount(_CV._SessionToken, ECR, _CV._ApplicationProfileId, _CV._ECKMerchantProfileId, _CV._ecks.getServiceId());
				ProcessElectronicCheckingTransactionResponse(ECTR, _CV);
			}
			
			System.out.println("QueryAccount Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}
	
	
/// The following is used for Transaction Management Service (TMS)
	public boolean QueryBatch(ConfigurationValues _CV) {
		
		try {
			checkTokenExpire(_CV);// Query Batch requires CaptureAll() or CaptureSelective()
			if (!_CV._bcs.getOperations().isCaptureAll() && !_CV._bcs.getOperations().isCaptureSelective())
			{
				System.out.println("QueryBatch is not supported as neither CaptureAll or CaptureSelective " +
						"is supported by this service provider. Moving to next transaction type\r\n");	
				return true;// Check to see if this transaction type is supported
			}				
			System.out.println("\r\nStarting QueryBatch Example");
			ArrayOfBatchDetailData AOBDD = new ArrayOfBatchDetailData();
			AOBDD = CWSTMS.queryBatch(_CV._SessionToken, QBP(), PP());
		
            if(AOBDD.getBatchDetailData() != null)
            {              
            	System.out.println(processQueryBatchResponse(AOBDD.getBatchDetailData()));
            }
			System.out.println("QueryBatch Successfully Processed");
			return true;
		} catch (Exception e) 
        {
			handleTMSBase_Fault(e);
            return false;
        }
	}

	public boolean QueryTransactionsSummary(ConfigurationValues _CV) {
					
		try {
			checkTokenExpire(_CV);
			
			System.out.println("\r\nStarting QueryTransactionsSummary Example");
			ArrayOfSummaryDetail AOSD = new ArrayOfSummaryDetail();
			AOSD = CWSTMS.queryTransactionsSummary(_CV._SessionToken, QTP(""), true, PP());
			
            if(AOSD.getSummaryDetail() != null)
            {              
            	System.out.println(processQueryTransactionSummaryResponse(AOSD.getSummaryDetail()));
            }
			System.out.println("QueryTransactionSummary Successfully Processed");
			return true;
		} catch (Exception e) 
        {
			handleTMSBase_Fault(e);
            return false;
        }
	}

	public boolean QueryTransactionFamilies(ConfigurationValues _CV) {
					
		try {
			checkTokenExpire(_CV);
		
			System.out.println("\r\nStarting QueryTransactionFamilies Example");
			ArrayOfFamilyDetail AOTD = new ArrayOfFamilyDetail();
			AOTD = CWSTMS.queryTransactionFamilies(_CV._SessionToken, QTP(_AuthorizeTransactionId), PP());
			
            if(AOTD.getFamilyDetail() != null)
            {              
            	System.out.println(processQueryTransactionFamiliesResponse(AOTD.getFamilyDetail()));
            }
			System.out.println("QueryTransactionSummary Successfully Processed");
			return true;
		} catch (Exception e) 
        {
			handleTMSBase_Fault(e);
            return false;
        }
	}

	public boolean QueryTransactionsDetail(ConfigurationValues _CV){
					
		try {
			checkTokenExpire(_CV);
		
			System.out.println("\r\nStarting QueryTransactionsDetail Example");
			ArrayOfTransactionDetail AOTD = new ArrayOfTransactionDetail();
			AOTD = CWSTMS.queryTransactionsDetail(_CV._SessionToken, QTP(_AuthorizeTransactionId), null, null, PP());
			
            if(AOTD.getTransactionDetail() != null)
            {              
            	System.out.println(processQueryTransactionsDetailResponse(AOTD.getTransactionDetail()));
            }
            System.out.println("QueryTransactionsDetail Successfully Processed");
			return true;
		} catch (Exception e) 
        {
			handleTMSBase_Fault(e);
            return false;
        }
	}
	
/// The following are helper methods

	public void checkTokenExpire(ConfigurationValues _CV) throws Exception {
		try {
			if (_CV._SessionTokenDateTime == null) {
				// First Time so get a new Session Token
				_CV._SessionToken = CWSSIC.signOnWithToken(_IdentityToken);
				GregorianCalendar gc1 = new GregorianCalendar();
				Date d1 = gc1.getTime();
				_CV._SessionTokenDateTime = d1.getTime();
			} else {
				// Let's check to see if the token has expired or is about to
				// expire.
				GregorianCalendar gc = new GregorianCalendar();
				Date d = gc.getTime();
				long l = d.getTime();
				long difference = l - _CV._SessionTokenDateTime;
				difference = difference / 60000;
				if (difference > 25) {
					// In this case the session token has either expired or will
					// expire in less than 5 min. So get a new one.
					_CV._SessionToken = CWSSIC.signOnWithToken(_IdentityToken);
					GregorianCalendar gc1 = new GregorianCalendar();
					Date d1 = gc1.getTime();
					_CV._SessionTokenDateTime = d1.getTime();
				}
			}
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
        }
	}

	private void setupEndpoints(ConfigurationValues _CV)throws Exception{
		try {
		//Let's first setup the Service Information end point
			try
			{//First try to setup the primary end point
		        // create the SIS service based on the service name - not the wsdl.
		        Service SISservice = Service.create(SIS_SERVICE_NAME);
		        // Add a port to the Service
		        SISservice.addPort(SIS_PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, _primaryServiceEndpoint);
		        // get back our proxy from the port we added.
		        CWSSIC = SISservice.getPort(SIS_PORT_NAME, ICWSServiceInformation.class);				
			}
			catch (Exception e1)
			{//Primary not available so try the Secondary end point
				try
				{
			        Service SISservice = Service.create(SIS_SERVICE_NAME);
			        SISservice.addPort(SIS_PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, _secondaryServiceEndpoint);
			        CWSSIC = SISservice.getPort(SIS_PORT_NAME, ICWSServiceInformation.class);
				}
				catch (Exception e2)
				{
					handleCWSBase_Fault(e2);
				}
			}
			
		//Let's now setup the Transaction Processing end point
			try
			{//First try to setup the primary end point
		        Service TPSservice = Service.create(BCP_SERVICE_NAME);
		        TPSservice.addPort(BCP_PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, _primaryTxnEndpoint);
		        CWSBC = TPSservice.getPort(BCP_PORT_NAME, ICwsTransactionProcessing.class);			
			}
			catch (Exception e1)
			{//Primary not available so try the Secondary end point
				try
				{
			        Service TPSservice = Service.create(BCP_SERVICE_NAME);
			        TPSservice.addPort(BCP_PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, _secondaryTxnEndpoint);
			        CWSBC = TPSservice.getPort(BCP_PORT_NAME, ICwsTransactionProcessing.class);
				}
				catch (Exception e2)
				{
					handleCWSBase_Fault(e2);
				}
			}
			
			if(_CV._UseTMS)
			{
			//And Finally if supported setup Transaction Management Services (TMS)
				try
				{//First try to setup the primary end point
			        Service TMSservice = Service.create(TMS_SERVICE_NAME);
			        TMSservice.addPort(TMS_PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, _primaryTMSEndpoint);
			        CWSTMS = TMSservice.getPort(TMS_PORT_NAME, ITMSOperations.class);			
				}
				catch (Exception e1)
				{//Primary not available so try the Secondary end point
					try
					{
				        Service TMSservice = Service.create(TMS_SERVICE_NAME);
				        TMSservice.addPort(TMS_PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, _primaryTMSEndpoint);
				        CWSTMS = TMSservice.getPort(TMS_PORT_NAME, ITMSOperations.class);
					}
					catch (Exception e2)
					{
						handleCWSBase_Fault(e2);
					}
				}
			}
		}
		catch (Exception ex) {throw ex;}
	}
	
	private void handle_SVC_CWSBase_Fault(Exception _e)
	{
        try {
            com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSBaseFault faultInfo = (com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSBaseFault) _e.getClass().getMethod("getFaultInfo", null).invoke(_e, null);
            System.out.println("FAULT: " + faultInfo.getErrorID() + ": " + faultInfo.getProblemType());
            if (faultInfo instanceof  com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSValidationResultFault)
            {
            	com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSValidationResultFault valFault = (com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSValidationResultFault) faultInfo;
    			Iterator<com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSValidationErrorFault> iter = valFault.getErrors().getCWSValidationErrorFault().iterator();
            	while (iter.hasNext())
            	{
            		com.evosnap.schemas.cws.v2_0.serviceinformation.faults.CWSValidationErrorFault err = iter.next();
            		System.out.println("  Validation Error: " + err.getRuleMessage());
            		System.out.println("   Location: " + err.getRuleLocationKey());             		
            	}
            }
        }
        catch (Exception e2) {
            // Not a IP Commerce fault.
        	System.out.println("Class: " + _e.getClass().getName());
        	System.out.println("Cause: " + _e.getCause());
        	System.out.println("Message: " + _e.getMessage()); 
        }
	}
	
	private void handleCWSBase_Fault(Exception _e)
	{
        try {
            CWSBaseFault faultInfo = (CWSBaseFault) _e.getClass().getMethod("getFaultInfo", null).invoke(_e, null);
            System.out.println("FAULT: " + faultInfo.getErrorID() + ": " + faultInfo.getProblemType());
            if (faultInfo instanceof  CWSValidationResultFault)
            {
            	CWSValidationResultFault valFault = (CWSValidationResultFault) faultInfo;
    			Iterator<CWSValidationErrorFault> iter = valFault.getErrors().getCWSValidationErrorFault().iterator();
            	while (iter.hasNext())
            	{
            		CWSValidationErrorFault err = iter.next();
            		System.out.println("  Validation Error: " + err.getRuleMessage());
            		System.out.println("   Location: " + err.getRuleLocationKey());             		
            	}
            }
        }
        catch (Exception e2) {
            // Not a IP Commerce fault.
        	System.out.println("Class: " + _e.getClass().getName());
        	System.out.println("Cause: " + _e.getCause());
        	System.out.println("Message: " + _e.getMessage()); 
        }
	}
	
	private void handleTMSBase_Fault(Exception _e)
	{
        try {
            TMSBaseFault faultInfo = (TMSBaseFault) _e.getClass().getMethod("getFaultInfo", null).invoke(_e, null);
            System.out.println("FAULT: " + faultInfo.getErrorID() + ": " + faultInfo.getProblemType());
            if (faultInfo instanceof TMSUnavailableFault)
            {
            	TMSUnavailableFault err = new TMSUnavailableFault();
            	System.out.println("Fault Thrown: " + err.getClass());
        		System.out.println("  ErrorID: " + err.getErrorID());
        		System.out.println("  Operation: " + err.getOperation());
        		System.out.println("  ProblemType: " + err.getProblemType());
            }
            if (faultInfo instanceof TMSUnknownServiceKeyFault)
            {
            	TMSUnknownServiceKeyFault err = new TMSUnknownServiceKeyFault();
            	System.out.println("Fault Thrown: " + err.getClass());
        		System.out.println("  ErrorID: " + err.getErrorID());
        		System.out.println("  Operation: " + err.getOperation());
        		System.out.println("  ProblemType: " + err.getProblemType());
            }
            if (faultInfo instanceof TMSOperationNotSupportedFault)
            {
            	TMSOperationNotSupportedFault err = new TMSOperationNotSupportedFault();
            	System.out.println("Fault Thrown: " + err.getClass());
        		System.out.println("  ErrorID: " + err.getErrorID());
        		System.out.println("  Operation: " + err.getOperation());
        		System.out.println("  ProblemType: " + err.getProblemType());
            }
            if (faultInfo instanceof TMSTransactionFailedFault)
            {
            	TMSTransactionFailedFault err = new TMSTransactionFailedFault();
            	System.out.println("Fault Thrown: " + err.getClass());
        		System.out.println("  ErrorID: " + err.getErrorID());
        		System.out.println("  Operation: " + err.getOperation());
        		System.out.println("  ProblemType: " + err.getProblemType());
            }
        }
        catch (Exception e2) {
            // Not a IP Commerce fault.
        	System.out.println("Class: " + _e.getClass().getName());
        	System.out.println("Cause: " + _e.getCause());
        	System.out.println("Message: " + _e.getMessage()); 
        }
	}
	
	
	private BankcardTransaction setBankCardTxnData(ConfigurationValues _CV) {
		BankcardTransaction BCtransaction = new BankcardTransaction();

		BankcardTransactionData BCTD = new BankcardTransactionData();
		BCTD.setAmount(new BigDecimal("15.00").setScale(2, RoundingMode.UNNECESSARY));
		BCTD.setCurrencyCode(com.evosnap.schemas.cws.v2_0.transactions.TypeISOCurrencyCodeA3.USD);
		
		BCTD.setEntryMode(EntryMode.KEYED);
		//BCTD.setIndustryType(IndustryType.ECOMMERCE); 10.5.2012 NO LONGER SUPPORTED
		BCTD.setLaneId("1");
		BCTD.setCustomerPresent(com.evosnap.schemas.cws.v2_0.transactions.bankcard.CustomerPresent.ECOMMERCE);
		BCTD.setSignatureCaptured(false);
		
		Calendar cTimeNow = Calendar.getInstance();
		cTimeNow.getTime();
		SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");// format : yyyy-MM-ddTHH:mm:ss
		BCTD.setTransactionDateTime(SDF.format(cTimeNow.getTime()));
	
	
		// Used for Retail
		BCTD.setEmployeeId("123");

		//BCTD.setGoodsType(GoodsType.PHYSICAL_GOODS);//Only used for some service providers
		
		BCTD.setOrderNumber("123ggd");

		BCtransaction.setTransactionData(BCTD);

		BankcardTenderData BCTen = new BankcardTenderData();
		CardData CD = new CardData();
		CD.setCardType(TypeCardType.MASTER_CARD);
		 CD.setExpire("1215"); // exactly 4 digits – MMYY where as a swipe will be YYMM
		 CD.setPAN("5454545454545454");
		// CD.setTrack1Data("B5454545454545454^EVOSNAP/TESTCARD^1512101013490000000001000880000");
		// CD.setTrack2Data("5454545454545454=15121010134988000010");
		BCTen.setCardData(CD);

		CardSecurityData CSD = new CardSecurityData();
		// AVSData
		AVSData AVS = new AVSData();
		AVS.setPostalCode("45040");
		CSD.setAVSData(AVS);
		// CVData
		CSD.setCVDataProvided(CVDataProvided.PROVIDED);
		CSD.setCVData("111");

		//Process a Magensa 'End to end encryption' transaction
        if (_CV._UseWorkFlowId)
        { //*** ToDo : the following are generic values which will only work against Sandbox.***
            //First set the CardData to null
        	BCTen.setCardData(null);

    		CSD.setCVDataProvided(CVDataProvided.NOT_SET);
    		CSD.setCVData(null);
    		CSD.setIdentificationInformation("9ED72A486AB36DC352957C2C00607E937D1D90CB8B09A8588629AABA8EAF0FD65296A4FBA490EECFCD8D5B350438C4BFA6A36FFA2ADAAA3E");
    		CSD.setKeySerialNumber("KEY123455");
    		BCTen.setSecurePaymentAccountData("87936F09AE06386BA4CD81ADFF7DF0FA5AC1B28EF9F7B7075E415545F9B9095C0AC5FA12B9905325");
    		BCTen.setEncryptionKeyId("9010010B0C2472000021");
    		BCTen.setSwipeStatus("00304061");

    		//BCtransaction.getTransactionData().setScoreThreshold(".5");//Not presently supported
            BCtransaction.getTransactionData().setEntryMode(EntryMode.TRACK_2_DATA_FROM_MSR);
            BCtransaction.getTransactionData().setReference("11");
        }
		
		BCTen.setCardSecurityData(CSD);
		BCtransaction.setTenderData(BCTen);
		
		return BCtransaction;
	}
	
    private ElectronicCheckingTransaction setElectronicCheckTxnData()
    {
        ElectronicCheckingTransaction ECKTransaction = new ElectronicCheckingTransaction();
        
        //Consumer Data
        TransactionCustomerData TCD = new TransactionCustomerData();
        TCD.setCustomerId("123");
        ECKTransaction.setCustomerData(TCD);

        //Transaction Data
        ElectronicCheckingTransactionData ECTxD = new ElectronicCheckingTransactionData();
        ECTxD.setAmount(new BigDecimal("14.00").setScale(2, RoundingMode.UNNECESSARY));
        //ECTxD.setCurrencyCode(com.evosnap.schemas.cws.v2_0.transactions.TypeISOCurrencyCodeA3.USD);
        Calendar cTimeNow = Calendar.getInstance();
        cTimeNow.getTime();
        ECTxD.setEffectiveDate(cTimeNow); //Specifies the effective date of the transaction. Required.
        ECTxD.setIsRecurring(false); //Indicates whether the transaction is recurring. Conditional, required if SECCode = 'WEB'.
        //Supported SEC Codes are PPD, CCD, TEL, WEB and BOC.  CCD and PPD transactions can be either credit or debit.  TEL, WEB and BOC are debit transactions only.
        ECTxD.setSECCode(SECCode.WEB); //The three letter code that indicates what NACHA regulations the transaction must adhere to. Required.
        ECTxD.setServiceType(ServiceType.ACH); //Indicates the Electronic Checking service type: ACH, RDC or ECK. Required.
        //ECTxD.setTransactionDateTime(cTimeNow);
        ECTxD.setTransactionType(TransactionType.DEBIT); //Indicates the transaction type. Required.
        ECKTransaction.setTransactionData(ECTxD);        
        
        //Billing Data
        CustomerInfo CI = new CustomerInfo();
        //Set either Individual or Business
      //Individual
        NameInfo NI = new NameInfo();
        NI.setFirst("");
        NI.setLast("");
        NI.setMiddle("");
        CI.setName(NI);
        com.evosnap.schemas.cws.v2_0.transactions.AddressInfo AI = new com.evosnap.schemas.cws.v2_0.transactions.AddressInfo();
        AI.setCity("Denver");
        AI.setCountryCode(com.evosnap.schemas.cws.v2_0.transactions.TypeISOCountryCodeA3.USA);
        AI.setPostalCode("80023");
        AI.setStateProvince("CO");
        AI.setStreet1("1234 Happyway");
        //AI.setStreet2("");
        CI.setAddress(AI);
                
      //Business
        CI.setBusinessName("ACME Supplies");
                
        TCD.setBillingData(CI);

        //Tender Data
        ElectronicCheckingTenderData ECTnD = new ElectronicCheckingTenderData();
        CheckData CD = new CheckData();
        CD.setAccountNumber("1234567890");//Account number on the check. Required.
        CD.setCheckCountryCode(CheckCountryCode.US);//Bank account country of origin for receiver deposit.
        CD.setCheckNumber("191");//The check number as printed on the check. Optional.
        CD.setOwnerType(OwnerType.PERSONAL);//Indicates the type of entity which owns the account.
        CD.setRoutingNumber("987654321"); //9-digit bank routing number of the receiver deposit account. Required.
        CD.setUseType(UseType.CHECKING);//Indicates the type of account.
        ECTnD.setCheckData(CD);
        ECKTransaction.setTenderData(ECTnD);
        
        return ECKTransaction;
    }
    
    public boolean CredentialRequired(String ServiceID)
    {
       
        //Affirmative ACH Now
        if (ServiceID == "35A7700001") return true; //Sandbox
        if (ServiceID == "DF29D1300C") return true; //Production    
		
        return false;
    }
    
    public Addendum SetUsernameAndPassword(String username, String password)
    {
		// Set Credentials
		// For service providers that use username and password
        
		Addendum addendum = new Addendum();
		Unmanaged unmanaged = new Unmanaged();
		ArrayOfstring creds = new ArrayOfstring();
		
        creds.getString().add("<UserId>"+username+"</UserId><Password>"+password+"</Password>");
        unmanaged.setAny(creds);
        
        addendum.setUnmanaged(unmanaged);
        return addendum;
    }
 
	private void ProcessBankcardTransactionResponse(BankcardTransactionResponsePro _BCResponse, ConfigurationValues _CV) {
		/*
		 * At this point, you'll need to store the response information into
		 * your database. Please refer to the functional requirement as to what
		 * values are required, conditionally required and optional. The values
		 * are broken out logically below and assigned to a string as reference
		 * only.
		 */
		if (_BCResponse.getStatus() == Status.SUCCESSFUL) {// The transaction was approved
			String strSuccessfulResponseValues = "";
			
			_transactionIDs.getString().add(_BCResponse.getTransactionId());
			
			strSuccessfulResponseValues = strSuccessfulResponseValues
					+ "Your transaction was APPROVED"
					// Note Highly recommended to save
					+ "\r\nTransactionId : " + _BCResponse.getTransactionId()
					+ "\r\nProfileId : " + _CV._BCPMerchantProfileId // Must be stored with the TransactionId in order to identify which merchant sent which transaction. Required to support multi-merchant.
					// Note Highly recommended to save if Tokenization will be used
					+ "\r\nPaymentAccountDataToken : " + _BCResponse.getPaymentAccountDataToken() // If tokenization purchased this field represents the actual token returned in the transaction for future use.
					// Note Optional but recommended to save
					+ "\r\nStatus Code : " + _BCResponse.getStatusCode() // Status code generated by the Service Provider. This code should be displayed to the user as verification of the transaction.
					+ "\r\nStatus Message : " + _BCResponse.getStatusMessage() // Explains the StatusCode which is generated by the Service Provider. This message should be displayed to the user as verification of the transaction.
					+ "\r\nApprovalCode : " + _BCResponse.getApprovalCode() // A value returned when a transaction is approved. This value should be printed on the receipt, and also recorded for every off-line transaction, such as a voice authorization. This same data element and value must be provided during settlement. Required.
					+ "\r\nAmount : " + _BCResponse.getAmount() // Specifies the authorization amount of the transaction. This is the actual amount authorized.
					;
			if(_BCResponse.getAVSResult() != null)
			{
				strSuccessfulResponseValues = strSuccessfulResponseValues
				//Note Optional but recommended if AVS is supported
				 + "\r\nAVSResult ActualResult : " + _BCResponse.getAVSResult().getActualResult() //Specifies the actual result of AVS from the Service Provider.
				 + "\r\nAVSResult AddressResult : " + _BCResponse.getAVSResult().getAddressResult() //Specifies the result of AVS as it pertains to Address matching
				 + "\r\nAVSResult PostalCodeResult : " + _BCResponse.getAVSResult().getPostalCodeResult()
				 + "\r\nAVSResult CardholderNameResult : " + _BCResponse.getAVSResult().getCardholderNameResult()
				 + "\r\nAVSResult CityResult : " + _BCResponse.getAVSResult().getCityResult()
				 + "\r\nAVSResult CountryResult : " + _BCResponse.getAVSResult().getCountryResult()
				 + "\r\nAVSResult PhoneResult : " + _BCResponse.getAVSResult().getPhoneResult()
				 + "\r\nAVSResult StateResult : " + _BCResponse.getAVSResult().getStateResult()
				 ;	
			}
			strSuccessfulResponseValues = strSuccessfulResponseValues
					//Specifies the result of AVS as it pertains to Postal Code matching
					//Note Optional but recommended if CV data is supported
					+ "\r\nCVResult : "
					+ _BCResponse.getCVResult() // Response code returned by the card issuer indicating the result of Card Verification (CVV2/CVC2/CID).
					// Note Optional
					+ "\r\nBatchId : " + _BCResponse.getBatchId() // A unique ID used to identify a specific batch settlement
					+ "\r\nCardLevel : " + _BCResponse.getCardLevel() 
					+ "\r\nCardType : " + _BCResponse.getCardType()
					+ "\r\nCashBackAmount() : " + _BCResponse.getCashBackAmount()
					+ "\r\nDowngradeCode : " + _BCResponse.getDowngradeCode() // Indicates down grade reason.
					+ "\r\nFeeAmount : " + _BCResponse.getFeeAmount() // Fee amount charged for the transaction.
					+ "\r\nFinalBalance : " + _BCResponse.getFinalBalance()
					+ "\r\nMaskedPAN : " + _BCResponse.getMaskedPAN()
					+ "\r\nOrderId : " + _BCResponse.getOrderId()//The order id generated by CWS. This value is often used by service providers for transaction correlation.
					+ "\r\nResubmit : " + _BCResponse.getResubmit() // Specifies whether resubmission is supported for PIN Debit transactions.
					+ "\r\nServiceTransactionDateTime : " + _BCResponse.getServiceTransactionDateTime().getDate() + " " + _BCResponse.getServiceTransactionDateTime().getTime()
					+ "\r\nServiceTransactionId : " + _BCResponse.getServiceTransactionId()
					//+ "\r\nSettlementDate : " + CalenderToString(_BCResponse.getSettlementDate()) // Settlement date. Conditional, if present in the authorization response, this same data element and value must be provided during settlement
					+ "\r\nAdviceResponse : " + _BCResponse.getAdviceResponse()//Specifies the reason for issuer decline of recurring payment transactions. Optional.
					+ "\r\nCommercialCardResponse : " + _BCResponse.getCommercialCardResponse()//Indicates the status of the card with respect to its ability to utilize purchase card data. When the card is a Business, Corporate, or Purchase card, providing purchase card data can result in improved interchange rates.
					+ "\r\nReturnedACI : " + _BCResponse.getReturnedACI()//Provides information concerning the status of a transaction's CPS qualification.
					;
			System.out.println(strSuccessfulResponseValues);
		}
		if (_BCResponse.getStatus() == Status.FAILURE) {// The transaction was declined
			String strDeclinedResponseValues = "";
			strDeclinedResponseValues = strDeclinedResponseValues
					+ "Your transaction was DECLINED"
					// NOTE : Please reference the developers guide for a more complete explination of the return fields
					// Note Highly recommended to save
					+ "\r\nTransactionId : " + _BCResponse.getTransactionId() // The unique id of the transaction. TransactionId is required for all subsequent transactions such as Return, Undo, etc.
					+ "\r\nProfileId : " + _CV._BCPMerchantProfileId // Must be stored with the TransactionId in order to identify which merchant sent which transaction. Required to support multi-merchant.
					// Note Optional but recommended to save
					+ "\r\nStatus Code : " + _BCResponse.getStatusCode() // Status code generated by the Service Provider. This code should be displayed to the user as verification of the transaction.
					+ "\r\nStatus Message : " + _BCResponse.getStatusMessage() // Explains the StatusCode which is generated by the Service Provider. This message should be displayed to the user as verification of the transaction.
					// Note Optional but recommended if CV data is supported
					+ "\r\nCVResult : " + _BCResponse.getCVResult() // Response code returned by the card issuer indicating the result of Card Verification (CVV2/CVC2/CID).
					// Note Optional
					+ "\r\nServiceTransactionId : " + _BCResponse.getServiceTransactionId()
					;
			System.out.println(strDeclinedResponseValues);
		}
		//Report the serviceID or WorkFlowId used.
		if(_CV._UseWorkFlowId){
			System.out.println("WorkFlowId : " + _CV._WorkFlowId);
		}
		else{
			System.out.println("ServiceId : " + _CV._bcs.getServiceId());
		}
	}

	private void ProcessBankcardCaptureResponse(BankcardCaptureResponse _BCResponse, ConfigurationValues _CV) {
		/*
		 * At this point, you'll need to store the response information into
		 * your database. Please refer to the functional requirement as to what
		 * values are required, conditionally required and optional. The values
		 * are broken out logically below and assigned to a string as reference
		 * only.
		 */
		if (_BCResponse.getStatus() == Status.SUCCESSFUL) {// The transaction
															// was approved
			String strSuccessfulResponseValues = "";
			strSuccessfulResponseValues = strSuccessfulResponseValues
					+ "Your transaction was APPROVED"
					// Note Highly recommended to save
					+ "\r\n  TransactionId : " + _BCResponse.getTransactionId() // The unique id of the transaction. TransactionId is required for all subsequent transactions such as Return, Undo, etc.
					+ "\r\n  ProfileId : " + _CV._BCPMerchantProfileId // Must be stored with the TransactionId in order to identify which merchant sent which transaction. Required to support multi-merchant.
					// Note Optional but recommended to save
					+ "\r\n  Status Code : " + _BCResponse.getStatusCode() // Status code generated by the Service Provider. This code should be displayed to the user as verification of the transaction.
					+ " : Status Message : " + _BCResponse.getStatusMessage(); // Explains the StatusCode which is generated by the Service Provider. This message should be displayed to the user as verification of the transaction.
			
		            //Note Optional data about the batch
		            if (_BCResponse.getBatchId() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\nBatch Id : " + _BCResponse.getBatchId();
		            if (_BCResponse.getTransactionSummaryData().getCashBackTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  Cash Back Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getCashBackTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getCashBackTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getNetTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  Net Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getNetTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getNetTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getPINDebitReturnTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  PINDebit Return Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getPINDebitReturnTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getPINDebitReturnTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getPINDebitSaleTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  PINDebit Sale Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getPINDebitSaleTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getPINDebitSaleTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getReturnTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  Return Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getReturnTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getReturnTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getSaleTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  Sale Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getSaleTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getSaleTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getVoidTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  Void Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getVoidTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getVoidTotals().getNetAmount();
			
			System.out.println(strSuccessfulResponseValues);
		}
		if (_BCResponse.getStatus() == Status.FAILURE) {// The transaction was declined
			String strDeclinedResponseValues = "";
			strDeclinedResponseValues = strDeclinedResponseValues
					+ "Your transaction was DECLINED"
					// NOTE : Please reference the developers guide for a more
					// complete explination of the return fields
					// Note Highly recommended to save
					+ "\r\n  TransactionId : " + _BCResponse.getTransactionId() // The unique id of the transaction. TransactionId is required for all subsequent transactions such as Return, Undo, etc.
					+ "\r\n  ProfileId : " + _CV._BCPMerchantProfileId // Must be stored with the TransactionId in order to identify which merchant sent which transaction. Required to support multi-merchant.
					// Note Optional but recommended to save
					+ "\r\n  Status Code : " + _BCResponse.getStatusCode() // Status code generated by the Service Provider. This code should be displayed to the user as verification of the transaction.
					+ " : Status Message : " + _BCResponse.getStatusMessage() // Explains the StatusCode which is generated by the Service Provider. This message should be displayed to the user as verification of the transaction.
					// Note Optional
					+ "\r\n  ServiceTransactionId : " + _BCResponse.getServiceTransactionId();
			System.out.println(strDeclinedResponseValues);
		}
		//Report the serviceID or WorkFlowId used.
		if(_CV._UseWorkFlowId){
			System.out.println("WorkFlowId : " + _CV._WorkFlowId);
		}
		else{
			System.out.println("ServiceId : " + _CV._bcs.getServiceId());
		}
	}

    private void ProcessElectronicCheckingTransactionResponse(ElectronicCheckingTransactionResponse _ECKResponse, ConfigurationValues _CV)
    {

        String strResponseMessage = "";
        
        if (_ECKResponse.getStatus() == Status.SUCCESSFUL)//The transaction was approved
        {//NOTE : Please reference the developers guide for a more complete explination of the return fields
            //Note Highly recommended to save
            if (_ECKResponse.getTransactionId() != null) strResponseMessage = strResponseMessage + "\r\nTransactionId : " + _ECKResponse.getTransactionId();
            strResponseMessage = strResponseMessage + "\r\nMerchant Profile Id : " + _CV._ECKMerchantProfileId;
            //Note Optional but recommended to save
            if (_ECKResponse.getStatusCode() != null) strResponseMessage = strResponseMessage + "\r\nStatus Code : " + _ECKResponse.getStatusCode();
            if (_ECKResponse.getStatusMessage() != null) strResponseMessage = strResponseMessage + "\r\nStatus Message : " + _ECKResponse.getStatusMessage();
            //Note Optional data about the batch
            if (_ECKResponse.isACHCapable() != null) strResponseMessage = strResponseMessage + "\r\nACHCapable : " + _ECKResponse.isACHCapable();//Indicates if the customer's account will accept ACH transactions. Returned only on QueryAccount() transactions.
            if (_ECKResponse.getAmount() != null) strResponseMessage = strResponseMessage + "\r\nAmount : " + _ECKResponse.getAmount();
            if (_ECKResponse.getApprovalCode() != null) strResponseMessage = strResponseMessage + "\r\nApprovalCode : " + _ECKResponse.getApprovalCode(); //A code provided when a transaction is approved.
            if (_ECKResponse.getModifiedAccountNumber() != null) strResponseMessage = strResponseMessage + "\r\nModifiedAccountNumber : " + _ECKResponse.getModifiedAccountNumber(); //Indicates the corrected account number that should be used for electronic check processing
            if (_ECKResponse.getModifiedRoutingNumber() != null) strResponseMessage = strResponseMessage + "\r\nModifiedRoutingNumber : " + _ECKResponse.getModifiedRoutingNumber(); //Indicates the corrected 9-digit bank routing number that should be used for electronic check processing.
            if (_ECKResponse.getReturnInformation() != null)
            {
                if (_ECKResponse.getReturnInformation().getReturnCode() != null) strResponseMessage = strResponseMessage + "\r\nReturnCode : " + _ECKResponse.getReturnInformation().getReturnCode();//Code that indicates why the transaction was returned.
                if (_ECKResponse.getReturnInformation().getReturnDate() != null) strResponseMessage = strResponseMessage + "\r\nReturnDate : " + _ECKResponse.getReturnInformation().getReturnDate(); //The date the transaction was returned by the bank. 
                if (_ECKResponse.getReturnInformation().getReturnReason() != null) strResponseMessage = strResponseMessage + "\r\nReturnReason : " + _ECKResponse.getReturnInformation().getReturnReason(); //Reason that indicates why the transaction was returned. 
            }
            if (_ECKResponse.getSubmitDate() != null) strResponseMessage = strResponseMessage + "\r\nSubmitDate : " + _ECKResponse.getSubmitDate(); //The date the transaction was submitted to the bank.

            strResponseMessage = "Your transaction was APPROVED" + strResponseMessage;
        }
        if (_ECKResponse.getStatus() == Status.FAILURE)//The transaction was declined
        {//NOTE : Please reference the developers guide for a more complete explination of the return fields
            //Note Highly recommended to save
            if (_ECKResponse.getTransactionId() != null) strResponseMessage = strResponseMessage + "\r\nTransactionId : " + _ECKResponse.getTransactionId();
            strResponseMessage = strResponseMessage + "\r\nMerchant Profile Id : " + _CV._ECKMerchantProfileId;
            //Note Optional but recommended to save
            if (_ECKResponse.getStatusCode() != null) strResponseMessage = strResponseMessage + "\r\nStatus Code : " + _ECKResponse.getStatusCode();
            if (_ECKResponse.getStatusMessage() != null) strResponseMessage = strResponseMessage + "\r\nStatus Message : " + _ECKResponse.getStatusMessage();
            //Note Optional
            if (_ECKResponse.isACHCapable() != null) strResponseMessage = strResponseMessage + "\r\nACHCapable : " + _ECKResponse.isACHCapable();//Indicates if the customer's account will accept ACH transactions. Returned only on QueryAccount() transactions.
            if (_ECKResponse.getAmount() != null) strResponseMessage = strResponseMessage + "\r\nAmount : " + _ECKResponse.getAmount();
            if (_ECKResponse.getApprovalCode() != null) strResponseMessage = strResponseMessage + "\r\nApprovalCode : " + _ECKResponse.getApprovalCode(); //A code provided when a transaction is approved.
            if (_ECKResponse.getModifiedAccountNumber() != null) strResponseMessage = strResponseMessage + "\r\nModifiedAccountNumber : " + _ECKResponse.getModifiedAccountNumber(); //Indicates the corrected account number that should be used for electronic check processing
            if (_ECKResponse.getModifiedRoutingNumber() != null) strResponseMessage = strResponseMessage + "\r\nModifiedRoutingNumber : " + _ECKResponse.getModifiedRoutingNumber(); //Indicates the corrected 9-digit bank routing number that should be used for electronic check processing.
            if (_ECKResponse.getReturnInformation() != null)
            {
                if (_ECKResponse.getReturnInformation().getReturnCode() != null) strResponseMessage = strResponseMessage + "\r\nReturnCode : " + _ECKResponse.getReturnInformation().getReturnCode();//Code that indicates why the transaction was returned.
                if (_ECKResponse.getReturnInformation().getReturnDate() != null) strResponseMessage = strResponseMessage + "\r\nReturnDate : " + _ECKResponse.getReturnInformation().getReturnDate(); //The date the transaction was returned by the bank. 
                if (_ECKResponse.getReturnInformation().getReturnReason() != null) strResponseMessage = strResponseMessage + "\r\nReturnReason : " + _ECKResponse.getReturnInformation().getReturnReason(); //Reason that indicates why the transaction was returned. 
            }
            if (_ECKResponse.getSubmitDate() != null) strResponseMessage = strResponseMessage + "\r\nSubmitDate : " + _ECKResponse.getSubmitDate(); //The date the transaction was submitted to the bank.

            strResponseMessage = "Your transaction was DECLINED" + strResponseMessage;
        }
        if (_ECKResponse.getStatus() == Status.NOT_SET)//The transaction was declined
        {
            strResponseMessage = "No Transactions found for settlement";
        }
        System.out.println(strResponseMessage);
		//Report the serviceID or WorkFlowId used.
		if(_CV._UseWorkFlowId){
			System.out.println("WorkFlowId : " + _CV._WorkFlowId);
		}
		else{
			System.out.println("ServiceId : " + _CV._ecks.getServiceId());
		}
    }

    private void ProcessElectronicCheckingCaptureResponse(ElectronicCheckingCaptureResponse _ECKResponse, ConfigurationValues _CV)
    {
         String strResponseMessage = "";

        if (_ECKResponse.getStatus() == Status.SUCCESSFUL)//The transaction was approved
        {//NOTE : Please reference the developers guide for a more complete explination of the return fields
            //Note Highly recommended to save
            if (_ECKResponse.getTransactionId() != null) strResponseMessage = strResponseMessage + "\r\nTransactionId : " + _ECKResponse.getTransactionId();
            strResponseMessage = strResponseMessage + "\r\nMerchant Profile Id : " + _CV._ECKMerchantProfileId;
            //Note Optional but recommended to save
            if (_ECKResponse.getStatusCode() != null) strResponseMessage = strResponseMessage + "\r\nStatus Code : " + _ECKResponse.getStatusCode();
            if (_ECKResponse.getStatusMessage() != null) strResponseMessage = strResponseMessage + "\r\nStatus Message : " + _ECKResponse.getStatusMessage();
            //Note Optional data about the batch
            if (_ECKResponse.getSummaryData() != null)
            {
                if (_ECKResponse.getSummaryData().getCreditTotals() != null) strResponseMessage = strResponseMessage + "\r\nCredit Totals \r\n  Count : " + _ECKResponse.getSummaryData().getCreditTotals().getCount() + "\r\n  Net Amount : " + _ECKResponse.getSummaryData().getCreditTotals().getNetAmount();
                if (_ECKResponse.getSummaryData().getDebitTotals() != null) strResponseMessage = strResponseMessage + "\r\nDebit Totals \r\n  Count : " + _ECKResponse.getSummaryData().getDebitTotals().getCount() + "\r\n  Net Amount : " + _ECKResponse.getSummaryData().getDebitTotals().getNetAmount();
                if (_ECKResponse.getSummaryData().getNetTotals() != null) strResponseMessage = strResponseMessage + "\r\nNet Totals \r\n  Count : " + _ECKResponse.getSummaryData().getNetTotals().getCount() + "\r\n  Net Amount : " + _ECKResponse.getSummaryData().getNetTotals().getNetAmount();
                if (_ECKResponse.getSummaryData().getVoidTotals() != null) strResponseMessage = strResponseMessage + "\r\nVoid Totals \r\n  Count : " + _ECKResponse.getSummaryData().getVoidTotals().getCount() + "\r\n  Net Amount : " + _ECKResponse.getSummaryData().getVoidTotals().getNetAmount();
            }
            strResponseMessage = "Your transaction was APPROVED" + strResponseMessage;
        }
        if (_ECKResponse.getStatus() == Status.FAILURE)//The transaction was declined
        {//NOTE : Please reference the developers guide for a more complete explination of the return fields
            //Note Highly recommended to save
            if (_ECKResponse.getTransactionId() != null) strResponseMessage = strResponseMessage + "\r\nTransactionId : " + _ECKResponse.getTransactionId();
            strResponseMessage = strResponseMessage + "\r\nMerchant Profile Id : " + _CV._ECKMerchantProfileId;
            //Note Optional but recommended to save
            if (_ECKResponse.getStatusCode() != null) strResponseMessage = strResponseMessage + "\r\nStatus Code : " + _ECKResponse.getStatusCode();
            if (_ECKResponse.getStatusMessage() != null) strResponseMessage = strResponseMessage + "\r\nStatus Message : " + _ECKResponse.getStatusMessage();
            //Note Optional

            strResponseMessage = "Your transaction was DECLINED" + strResponseMessage;
        }
        if (_ECKResponse.getStatus() == Status.NOT_SET)//The transaction was declined
        {
            strResponseMessage = "No Transactions found for settlement";
        }
        System.out.println(strResponseMessage);
        
		//Report the serviceID or WorkFlowId used.
		if(_CV._UseWorkFlowId){
			System.out.println("WorkFlowId : " + _CV._WorkFlowId);
		}
		else{
			System.out.println("ServiceId : " + _CV._ecks.getServiceId());
		}
    }

	
    private QueryBatchParameters QBP()
    {
    	
        QueryBatchParameters QBP = new QueryBatchParameters();
        //First set the date range
        DateRange dr = new DateRange();
        Calendar cStart = Calendar.getInstance();
        Calendar cEnd = Calendar.getInstance();
        cStart.getTime();
        cStart.add(Calendar.HOUR, -2);
        cEnd.getTime();
        dr.setStartDateTime(cStart);
        dr.setEndDateTime(cEnd);
        QBP.setBatchDateRange(dr);
  
        //It's possible to filter the search. Not included however for the sake of sample code
        //QBP.setBatchIds(value)
        //QBP.setMerchantProfileIds(value);
        //QBP.setServiceKeys(value;)
        //QBP.setTransactionIds(value);
        
        return QBP;
    }

    private QueryTransactionsParameters QTP(String _TransactionId)
    {
        QueryTransactionsParameters QTP = new QueryTransactionsParameters();
        //char[] splitter = { ',' };

        /* THE FOLLOWING ARE FILTERS THAT COULD BE APPLIED
        if (txtQTP_Amounts.Text.Length > 0)
        {
            List<decimal> Amt = new List<decimal>();
            string[] values = txtQTP_Amounts.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries);
            foreach (string s in values)
            {
                try
                {
                    decimal d = Convert.ToDecimal(s);
                    d = decimal.Parse(d.ToString("0.00"));//Amounts must be in format N.NN
                    Amt.Add(d);
                }
                catch { }
            }
            QTP.Amounts = Amt;
        }

        if (txtQTP_ApprovalCodes.Text.Length > 0)
            QTP.ApprovalCodes = new List<string>(txtQTP_ApprovalCodes.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries));
        if (txtQTP_BatchIds.Text.Length > 0)
            QTP.BatchIds = new List<string>(txtQTP_BatchIds.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries));

        //ToDo : add logic
        //QTP.CaptureDateRange = new DateRange();
        //QTP.CaptureDateRange.StartDateTime = dtpStartTimeTMS.Value.ToUniversalTime();
        //QTP.CaptureDateRange.EndDateTime = dtpEndTimeTMS.Value.ToUniversalTime();

        if (cboQTP_CaptureStates.Text.Length > 0)
        {
            List<schemas.evosnap.com.Ipc.General.WCF.Contracts.Common.External.TMS.CaptureState> TS = new List<schemas.evosnap.com.Ipc.General.WCF.Contracts.Common.External.TMS.CaptureState>();
            TS.Add((schemas.evosnap.com.Ipc.General.WCF.Contracts.Common.External.TMS.CaptureState)cboQTP_CaptureStates.SelectedItem);
            QTP.CaptureStates = TS;
        }

        if (cboQTP_CardTypes.Text.Length > 0)
        {
            List<schemas.evosnap.com.Ipc.General.WCF.Contracts.Common.External.TMS.TypeCardType> TS = new List<schemas.evosnap.com.Ipc.General.WCF.Contracts.Common.External.TMS.TypeCardType>();
            TS.Add((schemas.evosnap.com.Ipc.General.WCF.Contracts.Common.External.TMS.TypeCardType)cboQTP_CardTypes.SelectedItem);
            QTP.CardTypes = TS;
        }

        if (cboQTP_IsAcknowledged.Text.Length > 0)
            QTP.IsAcknowledged = (BooleanParameter)cboQTP_IsAcknowledged.SelectedItem;

        if (txtQTP_MerchantProfileIds.Text.Length > 0)
            QTP.MerchantProfileIds = new List<string>(txtQTP_MerchantProfileIds.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries));

        if (cboQTP_QueryType.Text.Length > 0)
            QTP.QueryType = (QueryType)cboQTP_QueryType.SelectedItem;

        if (txtQTP_ServiceIds.Text.Length > 0)
            QTP.ServiceIds = new List<string>(txtQTP_ServiceIds.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries));

        if (txtQTP_ServiceKeys.Text.Length > 0)
            QTP.ServiceKeys = new List<string>(txtQTP_ServiceKeys.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries));

        //ToDo : add logic
        if (txtQTP_TransactionClassTypePairs.Text.Length > 0)
        {
            List<TransactionClassTypePair> TCTP = new List<TransactionClassTypePair>();
            TCTP.Add(new TransactionClassTypePair());
            QTP.TransactionClassTypePairs = TCTP;
        }
*/
        ////Specify batch paramaters
        //First set the date range
        DateRange dr = new DateRange();
        Calendar cStart = Calendar.getInstance();
        Calendar cEnd = Calendar.getInstance();
        cStart.getTime();
        cStart.add(Calendar.HOUR, -2);
        cEnd.getTime();
        dr.setStartDateTime(cStart);
        dr.setEndDateTime(cEnd);
        QTP.setTransactionDateRange(dr);

        if (_TransactionId.length() > 0)
        {       
        	ArrayOfstring AOS = new ArrayOfstring();
        	AOS.getString().add(_TransactionId);
        	QTP.setTransactionIds(AOS);
        }
            

            /*
        if (cboQTP_TransactionStates.Text.Length > 0)
        {
            List<schemas.evosnap.com.Ipc.General.WCF.Contracts.Common.External.TMS.TransactionState> TS = new List<schemas.evosnap.com.Ipc.General.WCF.Contracts.Common.External.TMS.TransactionState>();
            TS.Add((schemas.evosnap.com.Ipc.General.WCF.Contracts.Common.External.TMS.TransactionState)cboQTP_TransactionStates.SelectedItem);
            QTP.TransactionStates = TS;
        }

*/
        return QTP;
    }

    private PagingParameters PP()
    {
        //Specify Paging Parameters
        PagingParameters PP = new PagingParameters();
        PP.setPage(0);//Note : this is a zero based value. So page 1 is 0
        PP.setPageSize(50);

        return PP;
    }
    
    private String CalenderToString(Calendar c)
    {
    	String returnVal = "";
    	returnVal = (c == null ? "[Not Available]" : c.getTime().toGMTString()+"(UTC)");
    	return returnVal;
    }
    
    ///Process TMS response

    private String processQueryBatchResponse(List<BatchDetailData> _BDD)
    {
    	String strSummary = "";
        if (_BDD.size() > 0)
        {        	
            int i = 1;

			for (BatchDetailData b : _BDD)
            {				
                //Batch Summary
                strSummary = strSummary + "Batch Summary # " + i + "\r\n";
                strSummary = strSummary + "BatchCaptureDate : " + CalenderToString(b.getBatchCaptureDate()) + "\r\n";
                strSummary = strSummary + "BatchId : " + b.getBatchId() + "\r\n";
                strSummary = strSummary + "Description : " + b.getDescription() + "\r\n";
                //Batch Summary Data
                strSummary = strSummary + "Batch Summary Data";
                if (b.getBatchSummaryData().getCashBackTotals() != null) strSummary = strSummary + "\r\nCash Back Totals \r\n  Count : " + b.getBatchSummaryData().getCashBackTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getCashBackTotals().getNetAmount();
                if (b.getBatchSummaryData().getNetTotals() != null) strSummary = strSummary + "\r\nNet Totals \r\n  Count : " + b.getBatchSummaryData().getNetTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getNetTotals().getNetAmount();
                if (b.getBatchSummaryData().getPINDebitReturnTotals() != null) strSummary = strSummary + "\r\nPINDebit Return Totals \r\n  Count : " + b.getBatchSummaryData().getPINDebitReturnTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getPINDebitReturnTotals().getNetAmount();
                if (b.getBatchSummaryData().getPINDebitSaleTotals() != null) strSummary = strSummary + "\r\nPINDebit Sale Totals \r\n  Count : " + b.getBatchSummaryData().getPINDebitSaleTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getPINDebitSaleTotals().getNetAmount();
                if (b.getBatchSummaryData().getReturnTotals() != null) strSummary = strSummary + "\r\nReturn Totals \r\n  Count : " + b.getBatchSummaryData().getReturnTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getReturnTotals().getNetAmount();
                if (b.getBatchSummaryData().getSaleTotals() != null) strSummary = strSummary + "\r\nSale Totals \r\n  Count : " + b.getBatchSummaryData().getSaleTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getSaleTotals().getNetAmount();
                if (b.getBatchSummaryData().getVoidTotals() != null) strSummary = strSummary + "\r\nVoid Totals \r\n  Count : " + b.getBatchSummaryData().getVoidTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getVoidTotals().getNetAmount();
                
                //TransactionId
                strSummary = strSummary + "\r\nList of TransactionIds\r\n";
                if(b.getTransactionIds() != null)
                {                   	
                	for (String txnid : b.getTransactionIds().getString())
                    {
                        strSummary = strSummary + txnid + "\r\n";
                    }
                }
                i++;
            }
        }

        return strSummary;
    }
    

    private String processQueryTransactionSummaryResponse(List<SummaryDetail> _SD)
    {
    	String strSummary = "";
        if (_SD.size() > 0)
        {
            int i = 1;
            for (SummaryDetail s : _SD)
            {
                //Family Information
                strSummary = strSummary + "Transaction # " + i + "\r\nFamily Information\r\n";
                strSummary = strSummary + "FamilyId : " + s.getFamilyInformation().getFamilyId().getValue() + "\r\n";
                strSummary = strSummary + "FamilySequenceCount : " + s.getFamilyInformation().getFamilySequenceCount() + "\r\n";
                strSummary = strSummary + "FamilySequenceNumber : " + s.getFamilyInformation().getFamilySequenceNumber() + "\r\n";
                strSummary = strSummary + "FamilyState : " + s.getFamilyInformation().getFamilyState() + "\r\n";
                //Transaction Information
                strSummary = strSummary + "Transaction Information\r\n";
                strSummary = strSummary + "Amount : " + s.getTransactionInformation().getAmount() + "\r\n";
                strSummary = strSummary + "ApprovalCode : " + s.getTransactionInformation().getApprovalCode() + "\r\n";
                if ( s.getTransactionInformation().getBankcardData().getAVSResult() != null)
                {
                	strSummary = strSummary + "AVS-ActualResult : " + s.getTransactionInformation().getBankcardData().getAVSResult().getActualResult() + "\r\n";
                    strSummary = strSummary + "AVS-AddressResult : " + s.getTransactionInformation().getBankcardData().getAVSResult().getAddressResult() + "\r\n";
                    strSummary = strSummary + "AVS-PostalCodeResult: " + s.getTransactionInformation().getBankcardData().getAVSResult().getPostalCodeResult() + "\r\n";
                }
                strSummary = strSummary + "BatchId : " + s.getTransactionInformation().getBatchId() + "\r\n";
                strSummary = strSummary + "CaptureDateTime : " + CalenderToString(s.getTransactionInformation().getCaptureDateTime()) + "\r\n";
                strSummary = strSummary + "CaptureState : " + s.getTransactionInformation().getCaptureState() + "\r\n";
                strSummary = strSummary + "CardType : " + s.getTransactionInformation().getBankcardData().getCardType() + "\r\n";
                strSummary = strSummary + "CustomerId : " + s.getTransactionInformation().getCustomerId() + "\r\n";
                strSummary = strSummary + "CVResult : " + s.getTransactionInformation().getBankcardData().getCVResult() + "\r\n";
                strSummary = strSummary + "IsAcknowledged : " + s.getTransactionInformation().getIsAcknowledged() + "\r\n";
                strSummary = strSummary + "MaskedPAN : " + s.getTransactionInformation().getMaskedPAN() + "\r\n";
                strSummary = strSummary + "MerchantProfileId : " + s.getTransactionInformation().getMerchantProfileId() + "\r\n";
                strSummary = strSummary + "OriginatorTransactionId : " + s.getTransactionInformation().getOriginatorTransactionId() + "\r\n";
                strSummary = strSummary + "ServiceId : " + s.getTransactionInformation().getServiceId() + "\r\n";
                strSummary = strSummary + "ServiceKey : " + s.getTransactionInformation().getServiceKey() + "\r\n";
                strSummary = strSummary + "ServiceTransactionId : " + s.getTransactionInformation().getServiceTransactionId() + "\r\n";
                strSummary = strSummary + "Status : " + s.getTransactionInformation().getStatus() + "\r\n";
                strSummary = strSummary + "TransactionClassTypePair : " + "\r\n  Class:" + s.getTransactionInformation().getTransactionClassTypePair().getTransactionClass() + "\r\n  Type:" + s.getTransactionInformation().getTransactionClassTypePair().getTransactionType()+ "\r\n";
                strSummary = strSummary + "TransactionId : " + s.getTransactionInformation().getTransactionId() + "\r\n";
                strSummary = strSummary + "TransactionState : " + s.getTransactionInformation().getTransactionState() + "\r\n";
                strSummary = strSummary + "TransactionStatusCode : " + s.getTransactionInformation().getTransactionStatusCode() + "\r\n";
                strSummary = strSummary + "TransactionTimestamp : " + CalenderToString(s.getTransactionInformation().getTransactionTimestamp()) + "\r\n";
                strSummary = strSummary + "\r\n";
                i++;
            }
        }
        return strSummary;
    }
    

    private String processQueryTransactionFamiliesResponse(List<FamilyDetail> _FD)
    {
        String strSummary = "";
        if (_FD.size() > 0)
        {
            int i = 1;
            for (FamilyDetail f : _FD)
            {
                //Family Summary
                strSummary = strSummary + "Family Summary # " + i + "\r\n";
                strSummary = strSummary + "FamilyId : " + f.getFamilyId().getValue().toString() + "\r\n";
                strSummary = strSummary + "FamilyState : " + f.getFamilyState() + "\r\n";
                strSummary = strSummary + "LastAuthorizedAmount : " + f.getLastAuthorizedAmount() + "\r\n";
                strSummary = strSummary + "MerchantProfileId : " + f.getMerchantProfileId() + "\r\n";
                strSummary = strSummary + "NetAmount : " + f.getNetAmount() + "\r\n";
                strSummary = strSummary + "ServiceKey : " + f.getServiceKey() + "\r\n";

                //TransactionId
                strSummary = strSummary + "List of TransactionIds\r\n";
                for (String txnid : f.getTransactionIds().getString())
                {
                    strSummary = strSummary + txnid + "\r\n";
                }
                i++;
            }
        }
        return strSummary;
    }
    

    private String processQueryTransactionsDetailResponse(List<TransactionDetail> _TD)
    {
        String strSummary = "";
        if (_TD.size() > 0)
        {
            int i = 1;
            for (TransactionDetail t : _TD)
            {
                //Batch Summary
                strSummary = strSummary + "Transaction # " + i + "\r\n";
                strSummary = strSummary + "CompleteTransaction CWS object : " + t.getCompleteTransaction().getCWSTransaction() + "\r\n";
                strSummary = strSummary + (t.getCompleteTransaction().getSerializedTransaction() == null ? "CompleteTransaction Serialized : NOT AVAILABLE\r\n" : "CompleteTransaction Serialized : " + t.getCompleteTransaction().getSerializedTransaction() + "\r\n");
                //Family Information
                strSummary = strSummary + "Family Information \r\n";
                strSummary = strSummary + "FamilyId : " + t.getFamilyInformation().getFamilyId().getValue().toString() + "\r\n";
                strSummary = strSummary + "FamilySequenceCount : " + t.getFamilyInformation().getFamilySequenceCount() + "\r\n";
                strSummary = strSummary + "FamilySequenceNumber : " + t.getFamilyInformation().getFamilySequenceNumber() + "\r\n";
                strSummary = strSummary + "FamilyState : " + t.getFamilyInformation().getFamilyState() + "\r\n";
                //Transaction Information
                strSummary = strSummary + "Transaction Information\r\n";
                strSummary = strSummary + "Amount : " + t.getTransactionInformation().getAmount() + "\r\n";
                strSummary = strSummary + "ApprovalCode : " + t.getTransactionInformation().getApprovalCode() + "\r\n";
                if ( t.getTransactionInformation().getBankcardData().getAVSResult() != null)
                {                	
                	strSummary = strSummary + "AVS ActualResult : " + t.getTransactionInformation().getBankcardData().getAVSResult().getActualResult() + "\r\n";
                	strSummary = strSummary + "AVS AddressResult : " + t.getTransactionInformation().getBankcardData().getAVSResult().getAddressResult() + "\r\n";
                	strSummary = strSummary + "AVS PostalCodeResult : " + t.getTransactionInformation().getBankcardData().getAVSResult().getPostalCodeResult() + "\r\n";
                }
                strSummary = strSummary + "BatchId : " + t.getTransactionInformation().getBatchId() + "\r\n";
                strSummary = strSummary + "CaptureDateTime : " + CalenderToString(t.getTransactionInformation().getCaptureDateTime()) + "\r\n";
                strSummary = strSummary + "CaptureState : " + t.getTransactionInformation().getCaptureState() + "\r\n";
                strSummary = strSummary + "CardType : " + t.getTransactionInformation().getBankcardData().getCardType() + "\r\n";
                strSummary = strSummary + "CustomerId : " + t.getTransactionInformation().getCustomerId() + "\r\n";
                strSummary = strSummary + "CVResult : " + t.getTransactionInformation().getBankcardData().getCVResult() + "\r\n";
                strSummary = strSummary + "IsAcknowledged : " + t.getTransactionInformation().getIsAcknowledged() + "\r\n";
                strSummary = strSummary + "MaskedPAN : " + t.getTransactionInformation().getMaskedPAN() + "\r\n";
                strSummary = strSummary + "MerchantProfileId : " + t.getTransactionInformation().getMerchantProfileId() + "\r\n";
                strSummary = strSummary + "OriginatorTransactionId : " + t.getTransactionInformation().getOriginatorTransactionId() + "\r\n";
                strSummary = strSummary + "ServiceId : " + t.getTransactionInformation().getServiceId() + "\r\n";
                strSummary = strSummary + "ServiceKey : " + t.getTransactionInformation().getServiceKey() + "\r\n";
                strSummary = strSummary + "ServiceTransactionId : " + t.getTransactionInformation().getServiceTransactionId() + "\r\n";
                strSummary = strSummary + "Status : " + t.getTransactionInformation().getStatus() + "\r\n";
                strSummary = strSummary + "TransactionClassTypePair : " + "\r\n  Class:" + t.getTransactionInformation().getTransactionClassTypePair().getTransactionClass() + "\r\n  Type:" + t.getTransactionInformation().getTransactionClassTypePair().getTransactionType()+ "\r\n";
                strSummary = strSummary + "TransactionId : " + t.getTransactionInformation().getTransactionId() + "\r\n";
                strSummary = strSummary + "TransactionState : " + t.getTransactionInformation().getTransactionState() + "\r\n";
                strSummary = strSummary + "TransactionStatusCode : " + t.getTransactionInformation().getTransactionStatusCode() + "\r\n";
                strSummary = strSummary + "TransactionTimestamp : " + CalenderToString(t.getTransactionInformation().getTransactionTimestamp()) + "\r\n";
                strSummary = strSummary + "\r\n";
                i++;
            }
        }
        return strSummary;
    }
    
    
    ///END Process TMS response
}
