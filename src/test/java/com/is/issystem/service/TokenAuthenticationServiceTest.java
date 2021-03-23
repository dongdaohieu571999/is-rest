package com.is.issystem.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TokenAuthenticationServiceTest {

    private TokenAuthenticationService tokenAuthenticationServiceUnderTest;

    @BeforeEach
    void setUp() {
        tokenAuthenticationServiceUnderTest = new TokenAuthenticationService();
    }

    @Test
    void testGetRoleUser() {
        // Setup

        // Run the test
        final String result = tokenAuthenticationServiceUnderTest.getRoleUser();

        // Verify the results
        assertEquals("result", result);
    }

    @Test
    void testAddAuthentication() throws Exception {
        // Setup
        final HttpServletResponse res = new MockHttpServletResponse();

        // Run the test
        TokenAuthenticationService.addAuthentication(res, "username");

        // Verify the results
    }

    @Test
    void testAddAuthentication_ThrowsIOException() {
        // Setup
        final HttpServletResponse res = new MockHttpServletResponse();

        // Run the test
        assertThrows(IOException.class, () -> TokenAuthenticationService.addAuthentication(res, "username"));
    }

    @Test
    void testGetAuthentication() {
        // Setup
        final HttpServletRequest request = new MockHttpServletRequest();
        final Authentication expectedResult = null;

        // Run the test
        final Authentication result = TokenAuthenticationService.getAuthentication(request);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
