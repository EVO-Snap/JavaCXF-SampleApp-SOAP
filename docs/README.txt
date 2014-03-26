/* Copyright (c) 2013 EVO Payments International - All Rights Reserved.
 *
 * This software and documentation is subject to and made
 * available only pursuant to the terms of an executed license
 * agreement, and may be used only in accordance with the terms
 * of said agreement. This software may not, in whole or in part,
 * be copied, photocopied, reproduced, translated, or reduced to
 * any electronic medium or machine-readable form without
 * prior consent, in writing, from EVO Payments International
 *
 * Use, duplication or disclosure by the U.S. Government is subject
 * to restrictions set forth in an executed license agreement
 * and in subparagraph (c)(1) of the Commercial Computer
 * Software-Restricted Rights Clause at FAR 52.227-19; subparagraph
 * (c)(1)(ii) of the Rights in Technical Data and Computer Software
 * clause at DFARS 252.227-7013, subparagraph (d) of the Commercial
 * Computer Software--Licensing clause at NASA FAR supplement
 * 16-52.227-86; or their equivalent.
 *
 * Information in this software is subject to change without notice
 * and does not represent a commitment on the part of EVO Payments International.
 * 
 * Sample Code is for reference Only and is intended to be used for educational purposes. It's the responsibility of 
 * the software company to properly integrate into thier solution code that best meets thier production needs. 
*/

____________________________________________________________________________________________________________________

NOTE: You will need to obtain an IdentityToken from your Solutions Consultant in order to successfully certify to Evo Snap*.

This project was created with Java CXF.

Step 1:  In the SampleApp.java file enter the IdentityToken given to you. Also edit the fields depending on your
	 industry type. The defaults in the SampleApp.java are set to Ecommerce, see the below for what the defaults should be depending on industry.

Step 2:  Run the main.java script.  This script will do all of the necessary steps to set your application up and run several test transactions.
	This includes creating sample applicationData, and a MerchantProfile. The transaction types that are created and sent are all based off of the
	ServiceInformation Operations object which details what Operations are supported.  The responses for these transactions are outputted to the window.

Industry: Ecommerce
	TxnData_IndustryType = 'Ecommerce'
	TxnData_CustomerPresent = 'Ecommerce'
	ApplicationAttended = false;
	ApplicationLocation = 'OffPremises'
	PINCapability = 'PINNotSupported'
	ReadCapability = 'KeyOnly'
	EntryMode = 'Keyed'

Industry: MOTO
	TxnData_IndustryType = 'MOTO'
	TxnData_CustomerPresent = 'MOTO'
	ApplicationAttended = false;
	ApplicationLocation = 'OffPremises'
	PINCapability = 'PINNotSupported'
	ReadCapability = 'KeyOnly'
	EntryMode = 'Keyed'

Industry: Retail
	TxnData_IndustryType = 'Retail'
	TxnData_CustomerPresent = 'Present'
	ApplicationAttended = true;
	ApplicationLocation = 'OnPremises'
	PINCapability = 'PINNotSupported'
	ReadCapability = 'HasMSR'
	EntryMode = 'TrackDataFromMSR'

Industry: Restaurant
	TxnData_IndustryType = 'Restaurant'
	TxnData_CustomerPresent = 'Present'
	ApplicationAttended = true;
	ApplicationLocation = 'OffPremises'
	PINCapability = 'PINNotSupported'
	ReadCapability = 'HasMSR'
	EntryMode = 'TrackDataFromMSR'