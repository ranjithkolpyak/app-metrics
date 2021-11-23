package com.tmobile.appmetrics.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class MetricsController {

    @GetMapping(path = "/apps")
    @Operation(method = "GET", summary = "Get a list of applications")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of Applications",
            content = @Content(mediaType = MediaType.TEXT_PLAIN_VALUE))
    })
    public String getApps() {
        return "apps";
    }

    @GetMapping(path = "/organizations")
    public String getOrganizations() {
        return "organizations";
    }

    @GetMapping(path = "/foundations")
    public String getFoundations() {
        return "foundations";
    }

    @GetMapping(path = "/spaces")
    public String getSpaces(@RequestParam() String orgId) {
        return String.format("Spaces of %s", orgId);
    }
}
