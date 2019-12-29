package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.dao.Pills;
import com.aws.codestar.projecttemplates.jpa.PillsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private PillsRepository pillsRepository;

    private static final String MESSAGE_FORMAT = "Hello %s, ty draniu!";

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> helloWorldGet() {
        Iterable<Pills> allPills = pillsRepository.findAll();
        return ResponseEntity.ok(allPills);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity helloWorldPost(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(createResponse(name));
    }

    private String createResponse(String name) {
        return new JSONObject().put("Output", String.format(MESSAGE_FORMAT, name)).toString();
    }
}
