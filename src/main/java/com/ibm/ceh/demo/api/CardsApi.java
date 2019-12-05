package com.ibm.ceh.demo.api;

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
import com.ibm.ceh.demo.api.CardsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import com.ibm.ceh.demo.services.GetCustomerCardDetailsI;
import com.ibm.ceh.demo.model.GetCustomerCardDetailsRequest;
import com.ibm.ceh.demo.services.CreateCardTransactionI;
import com.ibm.ceh.demo.model.CreateCardTransactionRequest;
import com.ibm.ceh.demo.services.GetCardAccountEnquiryI;
import com.ibm.ceh.demo.model.GetCardAccountEnquiryRequest;
import com.ibm.ceh.demo.services.UpdateDirectDebitsI;
import com.ibm.ceh.demo.model.UpdateDirectDebitsRequest;

@Path("/cards")
@RequestScoped

@Api(description = "the cards API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-12-05T20:00:08.078Z")

public class CardsApi  {

	@Inject
	UpdateDirectDebitsI updateDirectDebitsI;


	@Inject
	GetCardAccountEnquiryI getCardAccountEnquiryI;


	@Inject
	CreateCardTransactionI createCardTransactionI;


	@Inject
	GetCustomerCardDetailsI getCustomerCardDetailsI;


  @Context SecurityContext securityContext;

  


    @POST
    
    
    
    @ApiOperation(value = "API to create credit or debit transaction for customer", notes = "Provides functionality to debit or credit a credit card account as per customer request.", response = CreateCardTransactionOutput.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = CreateCardTransactionOutput.class),
        @ApiResponse(code = 400, message = "Bad Request", response = CreateCardTransactionFault.class),
        @ApiResponse(code = 404, message = "Not found", response = CreateCardTransactionFault.class),
        @ApiResponse(code = 405, message = "Method Not Found", response = CreateCardTransactionFault.class),
        @ApiResponse(code = 429, message = "Too Many Request", response = CreateCardTransactionFault.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = CreateCardTransactionFault.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = CreateCardTransactionFault.class) })
    public Response createCardTransaction(@ApiParam(value = "" ,required=true) CreateCardTransactionInput body, @ApiParam(value = "" ,required=true)@HeaderParam("branchId") String branchId, @ApiParam(value = "" ,required=true)@HeaderParam("financialInstitution") String financialInstitution, @ApiParam(value = "" ,required=true)@HeaderParam("journeyId") String journeyId, @ApiParam(value = "" ,required=true)@HeaderParam("lang") String lang, @ApiParam(value = "" ,required=true)@HeaderParam("originUserId") String originUserId, @ApiParam(value = "" ,required=true)@HeaderParam("providerLogin") String providerLogin, @ApiParam(value = "" ,required=true)@HeaderParam("providerPassword") String providerPassword, @ApiParam(value = "" ,required=true)@HeaderParam("timeStamp") String timeStamp, @ApiParam(value = "" )@HeaderParam("correlationId") String correlationId, @ApiParam(value = "" )@HeaderParam("key") String key, @ApiParam(value = "" )@HeaderParam("originChannelId") String originChannelId, @ApiParam(value = "" )@HeaderParam("originDeptId") String originDeptId, @ApiParam(value = "" )@HeaderParam("originEmployeeId") String originEmployeeId, @ApiParam(value = "" )@HeaderParam("originSourceId") String originSourceId, @ApiParam(value = "" )@HeaderParam("originTerminalId") String originTerminalId, @ApiParam(value = "" )@HeaderParam("value") String value) {

        
        return createCardTransactionI.invoke(new CreateCardTransactionRequest(body, branchId, correlationId, financialInstitution, journeyId, key, lang, originChannelId, originDeptId, originEmployeeId, originSourceId, originTerminalId, originUserId, providerLogin, providerPassword, timeStamp, value));
}

    @GET
    @Path("/cardsAccounts")
    
    
    @ApiOperation(value = "API to retrieve get card account enquiry", notes = "Provides functionality to update customer instructions regarding automatic payment for his credit card account. The account that will be debited and the percentage of the payment.", response = GetCardAccountEnquiryOutput.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = GetCardAccountEnquiryOutput.class),
        @ApiResponse(code = 400, message = "Bad Request", response = GetCardAccountEnquiryFault.class),
        @ApiResponse(code = 404, message = "Not found", response = GetCardAccountEnquiryFault.class),
        @ApiResponse(code = 405, message = "Method Not Found", response = GetCardAccountEnquiryFault.class),
        @ApiResponse(code = 429, message = "Too Many Request", response = GetCardAccountEnquiryFault.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = GetCardAccountEnquiryFault.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = GetCardAccountEnquiryFault.class) })
    public Response getCardAccountEnquiry( @NotNull @ApiParam(value = "",required=true)  @QueryParam("accountId") String accountId, @ApiParam(value = "" ,required=true)@HeaderParam("branchId") String branchId, @ApiParam(value = "" ,required=true)@HeaderParam("financialInstitution") String financialInstitution, @ApiParam(value = "" ,required=true)@HeaderParam("journeyId") String journeyId, @ApiParam(value = "" ,required=true)@HeaderParam("lang") String lang, @ApiParam(value = "" ,required=true)@HeaderParam("originUserId") String originUserId, @ApiParam(value = "" ,required=true)@HeaderParam("providerLogin") String providerLogin, @ApiParam(value = "" ,required=true)@HeaderParam("providerPassword") String providerPassword, @ApiParam(value = "" ,required=true)@HeaderParam("timeStamp") String timeStamp,  @ApiParam(value = "Customer Identifier")  @QueryParam("cif") String cif, @ApiParam(value = "" )@HeaderParam("correlationId") String correlationId, @ApiParam(value = "" )@HeaderParam("key") String key, @ApiParam(value = "" )@HeaderParam("originChannelId") String originChannelId, @ApiParam(value = "" )@HeaderParam("originDeptId") String originDeptId, @ApiParam(value = "" )@HeaderParam("originEmployeeId") String originEmployeeId, @ApiParam(value = "" )@HeaderParam("originSourceId") String originSourceId, @ApiParam(value = "" )@HeaderParam("originTerminalId") String originTerminalId, @ApiParam(value = "" )@HeaderParam("value") String value,  @ApiParam(value = "")  @QueryParam("cutOffDate") String cutOffDate,  @ApiParam(value = "")  @QueryParam("cardNumber") String cardNumber) {

        
        return getCardAccountEnquiryI.invoke(new GetCardAccountEnquiryRequest(accountId, cif, branchId, correlationId, financialInstitution, journeyId, key, lang, originChannelId, originDeptId, originEmployeeId, originSourceId, originTerminalId, originUserId, providerLogin, providerPassword, timeStamp, value, cutOffDate, cardNumber));
}

    @GET
    
    
    
    @ApiOperation(value = "API to retrieve customer card details", notes = "Retrieve card/credit card accounts' details that belong to a customer.", response = GetCustomerCardDetailsOutput.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = GetCustomerCardDetailsOutput.class),
        @ApiResponse(code = 400, message = "Bad Request", response = GetCustomerCardDetailsFault.class),
        @ApiResponse(code = 404, message = "Not found", response = GetCustomerCardDetailsFault.class),
        @ApiResponse(code = 405, message = "Method Not Found", response = GetCustomerCardDetailsFault.class),
        @ApiResponse(code = 429, message = "Too Many Request", response = GetCustomerCardDetailsFault.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = GetCustomerCardDetailsFault.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = GetCustomerCardDetailsFault.class) })
    public Response getCustomerCardDetails(@ApiParam(value = "" ,required=true)@HeaderParam("branchId") String branchId, @ApiParam(value = "" ,required=true)@HeaderParam("financialInstitution") String financialInstitution, @ApiParam(value = "" ,required=true)@HeaderParam("journeyId") String journeyId, @ApiParam(value = "" ,required=true)@HeaderParam("lang") String lang, @ApiParam(value = "" ,required=true)@HeaderParam("originUserId") String originUserId, @ApiParam(value = "" ,required=true)@HeaderParam("providerLogin") String providerLogin, @ApiParam(value = "" ,required=true)@HeaderParam("providerPassword") String providerPassword, @ApiParam(value = "" ,required=true)@HeaderParam("timeStamp") String timeStamp,  @ApiParam(value = "")  @QueryParam("cif") String cif,  @ApiParam(value = "")  @QueryParam("legalId") String legalId, @ApiParam(value = "" )@HeaderParam("correlationId") String correlationId, @ApiParam(value = "" )@HeaderParam("key") String key, @ApiParam(value = "" )@HeaderParam("originChannelId") String originChannelId, @ApiParam(value = "" )@HeaderParam("originDeptId") String originDeptId, @ApiParam(value = "" )@HeaderParam("originEmployeeId") String originEmployeeId, @ApiParam(value = "" )@HeaderParam("originSourceId") String originSourceId, @ApiParam(value = "" )@HeaderParam("originTerminalId") String originTerminalId, @ApiParam(value = "" )@HeaderParam("value") String value,  @ApiParam(value = "")  @QueryParam("accountNumber") String accountNumber,  @ApiParam(value = "")  @QueryParam("cardNumber") String cardNumber,  @ApiParam(value = "Customer Identifier")  @QueryParam("cardStatus") String cardStatus) {

        
        return getCustomerCardDetailsI.invoke(new GetCustomerCardDetailsRequest(cif, legalId, branchId, correlationId, financialInstitution, journeyId, key, lang, originChannelId, originDeptId, originEmployeeId, originSourceId, originTerminalId, originUserId, providerLogin, providerPassword, timeStamp, value, accountNumber, cardNumber, cardStatus));
}

    @PUT
    @Path("/directDebits")
    
    
    @ApiOperation(value = "API to update direct debits", notes = "Provides functionality to update various information regarding credit card account example: balance, interest, statement balance etc.", response = UpdateDirectDebitsOutput.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = UpdateDirectDebitsOutput.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UpdateDirectDebitsFault.class),
        @ApiResponse(code = 404, message = "Not found", response = UpdateDirectDebitsFault.class),
        @ApiResponse(code = 405, message = "Method Not Found", response = UpdateDirectDebitsFault.class),
        @ApiResponse(code = 429, message = "Too Many Request", response = UpdateDirectDebitsFault.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UpdateDirectDebitsFault.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = UpdateDirectDebitsFault.class) })
    public Response updateDirectDebits(@ApiParam(value = "" ,required=true)@HeaderParam("branchId") String branchId, @ApiParam(value = "" ,required=true)@HeaderParam("financialInstitution") String financialInstitution, @ApiParam(value = "" ,required=true)@HeaderParam("journeyId") String journeyId, @ApiParam(value = "" ,required=true)@HeaderParam("lang") String lang, @ApiParam(value = "" ,required=true)@HeaderParam("originUserId") String originUserId, @ApiParam(value = "" ,required=true)@HeaderParam("providerLogin") String providerLogin, @ApiParam(value = "" ,required=true)@HeaderParam("providerPassword") String providerPassword, @ApiParam(value = "" ,required=true)@HeaderParam("timeStamp") String timeStamp, @ApiParam(value = "" ,required=true) UpdateDirectDebitsInput body, @ApiParam(value = "" )@HeaderParam("correlationId") String correlationId, @ApiParam(value = "" )@HeaderParam("key") String key, @ApiParam(value = "" )@HeaderParam("originChannelId") String originChannelId, @ApiParam(value = "" )@HeaderParam("originDeptId") String originDeptId, @ApiParam(value = "" )@HeaderParam("originEmployeeId") String originEmployeeId, @ApiParam(value = "" )@HeaderParam("originSourceId") String originSourceId, @ApiParam(value = "" )@HeaderParam("originTerminalId") String originTerminalId, @ApiParam(value = "" )@HeaderParam("value") String value) {

        
        return updateDirectDebitsI.invoke(new UpdateDirectDebitsRequest(branchId, correlationId, financialInstitution, journeyId, key, lang, originChannelId, originDeptId, originEmployeeId, originSourceId, originTerminalId, originUserId, providerLogin, providerPassword, timeStamp, value, body));
}
}
