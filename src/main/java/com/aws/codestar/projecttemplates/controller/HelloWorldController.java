package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.dao.Pills;
import com.aws.codestar.projecttemplates.jpa.PillsRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    private PillsRepository pillsRepository;

    private static final String MESSAGE_FORMAT = "Hello %s, ty draniu!";

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity helloWorldGet() {
        List<Pills> allPills = pillsRepository.findAll();
        return ResponseEntity.ok(allPills.toString());
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity helloWorldPost(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(createResponse(name));
    }

    private String createResponse(String name) {
        return new JSONObject().put("Output", String.format(MESSAGE_FORMAT, name)).toString();
    }
}
