package com.cavendish.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cavendish.model.EmployeeAddresses;
import com.cavendish.model.EmployeeNames;
import com.cavendish.model.EmployeePhone;

@Service
public class AsyncService {

	private static Logger log = LoggerFactory.getLogger(AsyncService.class);

	@Autowired
	private RestTemplate restTemplate;

	@Async("asyncExecutor")
	public CompletableFuture<EmployeeNames> getEmployeeName() throws InterruptedException {
		log.info("getEmployeeName starts");

		EmployeeNames employeeNameData = restTemplate.getForObject("http://localhost:8080/boot/name",
				EmployeeNames.class);

		log.info("employeeNameData, {}", employeeNameData);
		Thread.sleep(1000L); // Intentional delay
		log.info("employeeNameData completed");
		return CompletableFuture.completedFuture(employeeNameData);
	}

	@Async("asyncExecutor")
	public CompletableFuture<EmployeeAddresses> getEmployeeAddress() throws InterruptedException {
		log.info("getEmployeeAddress starts");

		EmployeeAddresses employeeAddressData = restTemplate.getForObject("http://localhost:8080/boot/address",
				EmployeeAddresses.class);

		log.info("employeeAddressData, {}", employeeAddressData);
		Thread.sleep(1000L); // Intentional delay
		log.info("employeeAddressData completed");
		return CompletableFuture.completedFuture(employeeAddressData);
	}

	@Async("asyncExecutor")
	public CompletableFuture<EmployeePhone> getEmployeePhone() throws InterruptedException {
		log.info("getEmployeePhone starts");

		EmployeePhone employeePhoneData = restTemplate.getForObject("http://localhost:8080/boot/phone",
				EmployeePhone.class);

		log.info("employeePhoneData, {}", employeePhoneData);
		Thread.sleep(1000L); // Intentional delay
		log.info("employeePhoneData completed");
		return CompletableFuture.completedFuture(employeePhoneData);
	}
}