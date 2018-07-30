package com.WP.postautomation;

import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;

public class TestLinkUtils {
    // Replace Testlink API Interface access key here
    public final static String ACCESS_KEY = "5b4eb848c3eee7f77484e20b1275229d";
    //public final static String ACCESS_KEY ="89d357eb43061d016d96741ea53a95b87166926115e852a685def61e757001da";
    // Replace your TestLink Server URL here
    public final static String TESTLINK_SERVER_URL = "http://qatm.igedenurhadi.net/lib/api/xmlrpc/v1/xmlrpc.php";
    // Replace Project Name here
    public final static String TESTLINK_PROJECT_NAME = "SeleniumIntegration";
    // Replace your Test Plan here
    public final static String TESTLINK_TESTPLAN_NAME = "TestPlanSelenium";
    // Replace your Build Name here
    public final static String BUILD_RELEASE_NAME = "SeleniumTest01";
        
    public static void reportResult(String testCaseID, String executionNotes, String result) throws TestLinkAPIException {
        TestLinkAPIClient apiClient = new TestLinkAPIClient(ACCESS_KEY,TESTLINK_SERVER_URL);
        apiClient.reportTestCaseResult(TESTLINK_PROJECT_NAME, TESTLINK_TESTPLAN_NAME,testCaseID, BUILD_RELEASE_NAME, executionNotes, result);
   }
}
