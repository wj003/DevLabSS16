package de.hdm.wim.events;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import de.hdm.wim.events.documentrepresentation.SearchRequest;
import de.hdm.wim.events.model.Company;
import de.hdm.wim.events.model.Document;
import de.hdm.wim.events.model.DocumentForSpeechTokenizer;
import de.hdm.wim.events.model.Employee;
import de.hdm.wim.events.model.KeywordInformation;
import de.hdm.wim.events.model.Product;
import de.hdm.wim.events.model.Project;
import de.hdm.wim.events.model.Token;

public class TestDataProvider {

	public static Token createDummyTokenWithRelatedEmployeeM001() {
		List<String> projects = new ArrayList<String>();

		List<String> companies = new ArrayList<String>();

		List<String> products = new ArrayList<String>();

		List<String> employees = new ArrayList<String>();
		employees.add("M001");

		KeywordInformation keywordInformation = new KeywordInformation(projects, companies, products, employees);

		Token token = null;
		try {
			token = new Token("id", "2016 6 20 22 9 10", "amg", "jens", "lindner", "asdf", "fdasHangouts", keywordInformation);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return token;
	}

	public static Token createDummyTokenWithRelatedProductPR001() {
		List<String> projects = new ArrayList<String>();

		List<String> companies = new ArrayList<String>();

		List<String> products = new ArrayList<String>();
		products.add("PR001");

		List<String> employees = new ArrayList<String>();

		KeywordInformation keywordInformation = new KeywordInformation(projects, companies, products, employees);

		Token token = null;
		try {
			token = new Token("id", "2016 6 20 22 9 10", "amg", "jens", "lindner", "asdf", "fdasHangouts", keywordInformation);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return token;
	}

	public static Token createDummyTokenWithRelatedCompanyU001() {
		List<String> projects = new ArrayList<String>();

		List<String> companies = new ArrayList<String>();
		companies.add("U001");

		List<String> products = new ArrayList<String>();

		List<String> employees = new ArrayList<String>();

		KeywordInformation keywordInformation = new KeywordInformation(projects, companies, products, employees);

		Token token = null;
		try {
			token = new Token("id", "2016 6 20 22 9 10", "amg", "jens", "lindner", "asdf", "fdasHangouts", keywordInformation);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return token;
	}

	public static Token createDummyTokenWithRelatedProjectP004() {
		List<String> projects = new ArrayList<String>();
		projects.add("P004");

		List<String> companies = new ArrayList<String>();

		List<String> products = new ArrayList<String>();

		List<String> employees = new ArrayList<String>();

		KeywordInformation keywordInformation = new KeywordInformation(projects, companies, products, employees);

		Token token = null;
		try {
			token = new Token("id", "2016 6 20 22 9 10", "amg", "jens", "lindner", "asdf", "fdasHangouts", keywordInformation);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return token;
	}

	public static Token createDummyTokenWithRelatedProjectsP001andP002() {
		List<String> projects = new ArrayList<String>();
		projects.add("P001");
		projects.add("P002");

		List<String> companies = new ArrayList<String>();

		List<String> products = new ArrayList<String>();

		List<String> employees = new ArrayList<String>();

		KeywordInformation keywordInformation = new KeywordInformation(projects, companies, products, employees);

		Token token = null;
		try {
			token = new Token("id", "2016 6 20 22 9 10", "amg", "jens", "lindner", "asdf", "fdasHangouts", keywordInformation);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return token;
	}

	public static Token createDummyTokenWithExactly1RelatedProjectP001() {
		List<String> projects = new ArrayList<String>();
		projects.add("P001");

		List<String> companies = new ArrayList<String>();

		List<String> products = new ArrayList<String>();

		List<String> employees = new ArrayList<String>();

		KeywordInformation keywordInformation = new KeywordInformation(projects, companies, products, employees);

		Token token = null;
		try {
			token = new Token("id", "2016 6 20 22 9 10", "amg", "jens", "lindner", "asdf", "fdasHangouts", keywordInformation);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return token;
	}

	public static Token createDummyToken() {
		List<String> projects = new ArrayList<String>();
		projects.add("P002");
		projects.add("P003");

		List<String> companies = new ArrayList<String>();
		companies.add("C001");
		companies.add("C007");

		List<String> products = new ArrayList<String>();

		List<String> employees = new ArrayList<String>();

		KeywordInformation keywordInformation = new KeywordInformation(projects, companies, products, employees);

		Token token = null;
		try {
			token = new Token("id", "2016 6 20 22 9 10", "amg", "jens", "lindner", "asdf", "fdasHangouts", keywordInformation);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return token;
	}

	/**
	 * Helper method to create a dummy Company
	 * 
	 * @return a dummy Company with fix values
	 */
	public static Company createDummyCompany() {
		List<String> employees = new ArrayList<String>();
		employees.add("M0101");
		employees.add("M0102");

		List<String> projects = new ArrayList<String>();
		projects.add("P0001");
		projects.add("P0003");

		List<String> products = new ArrayList<String>();
		projects.add("PR0001");
		projects.add("PR0003");

		Company company = new Company("U0001", "HighNet GmbH", "Finanzen", "Stuttgart", employees, projects, products, 600);
		return company;
	}

	public static Document createDummyDocument() {
		List<String> keywords = new ArrayList<String>();
		keywords.add("Ideensammlung");
		keywords.add("Aufgabenverteilung");
		keywords.add("Vorgehensmodell");
		Document document = null;
		try {
			document = new Document("Besprechungsprotokoll", "D0002", "Besprechungsprotokoll_HighNet_15-01-2016", "2008-02-01T09:00:22", "2009-03-01T09:00:22", "P001", "M0001",
					"Textdokument", keywords, "1.2", "Feriggestellt", "https://drive.google.com/open?id=1vJNvuPnCwg37yKZRsRuWvDn_LIwF5N4nHm_Xm1SIn8g",
					"158XmEV097o9QTHiK1j7UyN5fBNvbzYVICXZgHRv3UuA");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return document;
	}

	public static DocumentForSpeechTokenizer createDummyDocumentForSpeechTokenizer() {
		DocumentForSpeechTokenizer documentForSpeechTokenizer = new DocumentForSpeechTokenizer("asdf", "fdassHangouts", createDummyDocument());
		return documentForSpeechTokenizer;
	}

	/**
	 * Helper method to create a dummy Employee
	 * 
	 * @return a dummy Employee with fix values
	 */
	public static Employee createDummyEmployee() {
		List<String> projects = new ArrayList<String>();
		projects.add("P0001");
		projects.add("P0100");

		Employee employee = new Employee("M0001", "Maier", "Lisa", "Projektleiter", "U0002", projects);
		return employee;
	}

	public static Product createDummyProduct() {
		List<String> relatedProjects = new ArrayList<String>();
		relatedProjects.add("P001");
		List<String> relatedCompanies = new ArrayList<String>();
		relatedCompanies.add("C001");

		Product product = new Product("PR001", "Mercedes Benz", "Automobile", relatedProjects, relatedCompanies);
		return product;
	}

	/**
	 * Helper method to create a dummy Project
	 * 
	 * @return a dummy Project with fix values
	 */
	public static Project createDummyProject() {
		List<String> involvedCompanies = new ArrayList<String>();
		involvedCompanies.add("U0003");
		List<String> projectMembers = new ArrayList<String>();
		projectMembers.add("M0001");
		projectMembers.add("M0002");
		Project project = new Project("P0100", "HighNet", "M0001", projectMembers, involvedCompanies, "Gruen");
		return project;
	}
	
	public static SearchRequest createDummySearchRequest() {
		List<String> employees = new ArrayList<String>();
//		employees.add("M001");
//		employees.add("M002");
		List<String> companies = new ArrayList<String>();
//		companies.add("C002");
		List<String> projects = new ArrayList<String>();
		projects.add("P001");
//		projects.add("P002");
		List<String> products = new ArrayList<String>();
//		products.add("PR001");

		SearchRequest searchRequest = new SearchRequest(employees, companies, projects, products);
		return searchRequest;
	}

}
