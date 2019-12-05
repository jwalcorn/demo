package com.ibm.ceh.demo.api.impl;

import com.ibm.ceh.demo.api.*;
import com.ibm.ceh.demo.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import com.ibm.ceh.demo.model.CreateCardTransactionFault;
import com.ibm.ceh.demo.model.CreateCardTransactionInput;
import com.ibm.ceh.demo.model.CreateCardTransactionOutput;
import com.ibm.ceh.demo.model.GetCardAccountEnquiryFault;
import com.ibm.ceh.demo.model.GetCardAccountEnquiryOutput;
import com.ibm.ceh.demo.model.GetCustomerCardDetailsFault;
import com.ibm.ceh.demo.model.GetCustomerCardDetailsOutput;
import com.ibm.ceh.demo.model.UpdateDirectDebitsFault;
import com.ibm.ceh.demo.model.UpdateDirectDebitsInput;
import com.ibm.ceh.demo.model.UpdateDirectDebitsOutput;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-12-05T20:00:08.078Z")
public class CardsApiServiceImpl implements CardsApiService {
      @Override
      public Response createCardTransaction(CreateCardTransactionInput body, String branchId, String financialInstitution, String journeyId, String lang, String originUserId, String providerLogin, String providerPassword, String timeStamp, String correlationId, String key, String originChannelId, String originDeptId, String originEmployeeId, String originSourceId, String originTerminalId, String value, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getCardAccountEnquiry(String accountId, String branchId, String financialInstitution, String journeyId, String lang, String originUserId, String providerLogin, String providerPassword, String timeStamp, String cif, String correlationId, String key, String originChannelId, String originDeptId, String originEmployeeId, String originSourceId, String originTerminalId, String value, String cutOffDate, String cardNumber, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getCustomerCardDetails(String branchId, String financialInstitution, String journeyId, String lang, String originUserId, String providerLogin, String providerPassword, String timeStamp, String cif, String legalId, String correlationId, String key, String originChannelId, String originDeptId, String originEmployeeId, String originSourceId, String originTerminalId, String value, String accountNumber, String cardNumber, String cardStatus, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response updateDirectDebits(String branchId, String financialInstitution, String journeyId, String lang, String originUserId, String providerLogin, String providerPassword, String timeStamp, UpdateDirectDebitsInput body, String correlationId, String key, String originChannelId, String originDeptId, String originEmployeeId, String originSourceId, String originTerminalId, String value, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
