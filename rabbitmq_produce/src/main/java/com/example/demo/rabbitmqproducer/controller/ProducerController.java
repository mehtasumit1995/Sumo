package com.example.demo.rabbitmqproducer.controller;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rabbitmqproducer.beans.Employee;
import com.example.demo.rabbitmqproducer.producer.MessageProducer;

@RestController
@RequestMapping("/rabbitmq/")
public class ProducerController {

	@Autowired
	private MessageProducer messageProducer;

	@GetMapping(value = "/producer1")
	public String m2() {
		try {
			FileInputStream file = new FileInputStream(new File("TEST.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);

			
			XSSFSheet sheet = workbook.getSheetAt(0);

			ArrayList<Employee> employeeList = new ArrayList<>();
			
			for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
				Employee e = new Employee();
				Row ro = sheet.getRow(i);
				for (int j = ro.getFirstCellNum(); j <= ro.getLastCellNum(); j++) {
					Cell ce = ro.getCell(j);
					if (j == 0) {
						
						e.setName(ce.getStringCellValue());
					}
					if (j == 1) {
						e.setEmail(ce.getStringCellValue());
					}
					if (j == 2) {
						e.setDob(ce.getStringCellValue());
					}
					if (j == 3) {
						e.setSalary((int) ce.getNumericCellValue());
					}
					if (j == 4) {
						e.setDepartment(ce.getStringCellValue());
					}
				}
				employeeList.add(e);
			}
			for (Employee emp : employeeList) {
				messageProducer.sendMessage(emp);
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "File Added";
	}

	

}
