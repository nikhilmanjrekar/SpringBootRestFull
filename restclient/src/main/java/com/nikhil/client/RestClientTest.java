package com.nikhil.client;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import com.nikhil.restclient.BaseResponse;
import com.nikhil.restclient.PaymentRequest;

public class RestClientTest {
	
	private static final Logger log = LoggerFactory.getLogger(RestClientTest.class);

    public static void main(String args[]) {
    	/*MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        Map map = new HashMap<String, String>();
        map.put("Content-Type", "application/json");

        headers.setAll(map);

        Map req_payload = new HashMap();
        req_payload.put("userId", 100);

        HttpEntity<?> request = new HttpEntity<>(req_payload, headers);*/
    	
    	PaymentRequest paymentRequest = new PaymentRequest();
    	paymentRequest.setUserId(100);
    	paymentRequest.setItemId("study");
    	paymentRequest.setDiscount(10.5);
    	
    	Map<String, String> params = new HashMap<String, String>();
        params.put("key", "SHARED_KEY");
    	
        RestTemplate restTemplate = new RestTemplate();
        BaseResponse baseResponse = restTemplate.postForObject("http://localhost:8080/payment/pay?key={key}", paymentRequest, BaseResponse.class, params);
        log.info(baseResponse.toString());
    }
}
