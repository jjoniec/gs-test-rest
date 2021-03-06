package com.aws.codestar.projecttemplates.controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link ProductController}. Modify the tests in order to support your use case as you build your project.
 */
@DisplayName("Tests for ProductController")
public class ProductControllerTest {
    private final ProductController controller = new ProductController();

    /**
     * Initializing variables before we run the tests.
     * Use @BeforeAll for initializing static variables at the start of the test class execution.
     * Use @BeforeEach for initializing variables before each test is run.
     */
    @BeforeAll
    static void setup() {
        // Use as needed.
    }

    /**
     * De-initializing variables after we run the tests.
     * Use @AfterAll for de-initializing static variables at the end of the test class execution.
     * Use @AfterEach for de-initializing variables at the end of each test.
     */
    @AfterAll
    static void tearDown() {
        // Use as needed.
    }

    /**
     * Basic test to verify the result obtained when calling {@link ProductController#helloWorldGet} successfully.
     */
    @Test
    @DisplayName("Basic test for GET request")
    void testGetRequest() {
        //ResponseEntity<List<Product>> response = controller.helloWorldGet();

        // Verify the response obtained matches the values we expect.
        // JSONObject jsonObjectFromResponse = new JSONObject(response.toString());
        // TODO: Fix the testcase
        // assertEquals(EXPECTED_RESPONSE_VALUE, jsonObjectFromResponse.get("Output"));
        // assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
