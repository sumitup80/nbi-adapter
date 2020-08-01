package com.btireland.talos.spqr.nbiadapter.rest;

import com.btireland.talos.spqr.nbiadapter.domain.NBIResponse;
import com.btireland.talos.spqr.nbiadapter.domain.SPQRRequest;
import com.btireland.talos.spqr.nbiadapter.service.SPQRService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@Tag(name= "NBI SPQR Controller", description = "Controller for NBI SPQR orders")
@RequestMapping("/api/v1/availability")
public class SPQRController {

    @Autowired
    SPQRService spqrService;

    @Operation(summary = "Get NBI products using eirCode", description = "Get NBI products using eirCode",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation",content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "400", description = "Bad request"),
                    @ApiResponse(responseCode = "404", description = "Not found", content = @Content())
            })

    @PostMapping(value = "/", consumes = {"application/json" }, produces = {"application/json" })
    public ResponseEntity<com.btireland.talos.spqr.nbiadapter.domain.Notification> getNBIAvailableProductsByERCode(@RequestBody(content = @Content (mediaType = "application/json")) SPQRRequest spqrRequest){
    com.btireland.talos.spqr.nbiadapter.domain.Notification notification = spqrService.getNBIAvailableProducts(spqrRequest);
    return new ResponseEntity<com.btireland.talos.spqr.nbiadapter.domain.Notification>(notification, HttpStatus.OK);
    }


    @Operation(summary = "Get NBI products using eirCode in raw response", description = "Get NBI products using eirCode",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation"),
                    @ApiResponse(responseCode = "400", description = "Bad request"),
                    @ApiResponse(responseCode = "404", description = "Not found", content = @Content())
            })
    @GetMapping(value = "/{eirCode}", consumes = {"application/json" }, produces = {"application/json" })
    public ResponseEntity<NBIResponse> getNBIAvailableProductsByERCode(@PathVariable("eirCode") String eirCode) {
        NBIResponse nbiResponse = spqrService.getNBIAvailableProductsByERCode(eirCode);
        return new ResponseEntity<NBIResponse>(nbiResponse, HttpStatus.OK);
    }


}
