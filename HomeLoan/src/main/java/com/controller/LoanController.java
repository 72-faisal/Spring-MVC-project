package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.dao.LoanDao;
import com.model.Loan;
import com.model.User;

@Controller
public class LoanController {

	@Autowired
	private LoanDao Dao;

//	private String extractfilename(Part file) {
//		String cd = file.getHeader("content-disposition");
//		System.out.println(cd);
//		String[] items = cd.split(";");
//		for (String string : items) {
//			if (string.trim().startsWith("filename")) {
//				return string.substring(string.indexOf("=") + 2, string.length() - 1);
//			}
//		}
//		return "";
//	}
//	 private static final  String uploadPath = "C:/Users/vhora/OneDrive/Documents/Home_Loan_MVC/HomeLoan/src/main/webapp/WEB-INF/resources/assets/user_docs/"; 

	@GetMapping("/LoanApplyOnline")
	public String loanApplyOnline(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			return "LoanApplyOnline";
		} else {
			return "redirect:/UserLogin";
		}
	}

	@PostMapping("/LoanApply")
	public String loanApply(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			return "OnlineForm";
		} else {
			return "UserLogin";
		}
	}

	@GetMapping("OnlineForm")
	public String onlineForm(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			return "OnlineForm";
		} else {
			return "UserLogin";
		}
	}

	@PostMapping("/UploadData")
	public String UploadData(@RequestParam("lname") String name, @RequestParam("lemail") String email,
			@RequestParam("laddress") String address, @RequestParam("lcontact") String contact,
			@RequestPart("poidentity") MultipartFile identityProof,
			@RequestPart("poresidence") MultipartFile residenceProof,
			@RequestPart("poincome") MultipartFile incomeProof, @RequestPart("emp_proof") MultipartFile employmentProof,
			@RequestPart("property_documents") MultipartFile propertyDocuments,
			@RequestPart("bank_statment") MultipartFile bankStatement,
			@RequestPart("dp_proof") MultipartFile downPaymentProof,
			@RequestPart("guarantor_document") MultipartFile guarantorDocument,
			@RequestPart("property_valuation_proof") MultipartFile propertyValuationProof,
			@RequestPart("property_insurance") MultipartFile propertyInsurance, Model model)
			throws IOException, ServletException {
		Loan loan = new Loan();
		loan.setLname(name);
		loan.setLemail(email);
		loan.setLaddress(address);
		loan.setLcontact(contact);

		processFile(identityProof, "Identity Proof", loan);
		processFile(residenceProof, "Residence Proof", loan);
		processFile(incomeProof, "Income Proof", loan);
		processFile(employmentProof, "Employment Proof", loan);
		processFile(propertyDocuments, "Property Documents", loan);
		processFile(bankStatement, "Bank Statement", loan);
		processFile(downPaymentProof, "Down Payment Proof", loan);
		processFile(guarantorDocument, "Guarantor Document", loan);
		processFile(propertyValuationProof, "Property Valuation Proof", loan);
		processFile(propertyInsurance, "Property Insurance", loan);

		// Save the Loan object to the database after processing all the files
		Dao.getDocuments(loan);

		// Perform additional processing or redirect as needed

		// Example: Redirect to a success page
		return "successfully-data-sent";
	}

	private void processFile(MultipartFile file, String documentName, Loan loan) throws IOException, ServletException {
		String savePath = "C:/Users/vhora/OneDrive/Documents/Home_Loan_MVC/HomeLoan/src/main/webapp/WEB-INF/resources/assets/user_docs/";

		File fileSaveDir = new File(savePath);
		if (!fileSaveDir.exists()) {
			fileSaveDir.mkdirs();
		}

		String fileName = generateUniqueFileName(file.getOriginalFilename());
		file.transferTo(new File(savePath + File.separator + fileName));

//		loan.setPoidentityPath("identity proof "+ fileName);
//		loan.setPoresidencePath("Residence Proof "+ fileName);
//		loan.setPoincomePath("Income Proof " + fileName);
//		loan.setEmpProofPath("Employment Proof" + fileName);
//		loan.setPropertyDocumentsPath("Property Documents" + fileName);
//		loan.setBankStatmentPath("Bank Statement" + fileName);
//		loan.setDpProofPath("Down Payment Proof" + fileName);
//		loan.setGuarantorDocumentPath("Guarantor Document " + fileName);
//		loan.setPropertyValuationProofPath("Property Valuation Proof " + fileName);
//		loan.setPropertyInsurancePath("Property Insurance " + fileName);

		// Set file path in the Loan entity
	    switch (documentName) {
	        case "Identity Proof":
	            loan.setPoidentityPath(fileName);
	            break;
	        case "Residence Proof":
	            loan.setPoresidencePath(fileName);
	            break;
	        case "Income Proof":
	            loan.setPoincomePath(fileName);
	            break;
	        case "Employment Proof":
	            loan.setEmpProofPath(fileName);
	            break;
	        case "Property Documents":
	            loan.setPropertyDocumentsPath(fileName);
	            break;
	        case "Bank Statement":
	            loan.setBankStatmentPath(fileName);
	            break;
	        case "Down Payment Proof":
	            loan.setDpProofPath(fileName);
	            break;
	        case "Guarantor Document":
	            loan.setGuarantorDocumentPath(fileName);
	            break;
	        case "Property Valuation Proof":
	            loan.setPropertyValuationProofPath(fileName);
	            break;
	        case "Property Insurance":
	            loan.setPropertyInsurancePath(fileName);
	            break;
	        
	    }

		System.out.println("Uploaded " + documentName + " file: " + fileName);
	}

	private String generateUniqueFileName(String originalFilename) {
		 String[] parts = originalFilename.split("\\.");
		    String extension = parts[parts.length - 1];
		    
		    // Generate a unique filename using timestamp
		    String uniqueFileName = System.currentTimeMillis() + "_" + UUID.randomUUID().toString() + "." + extension;

		    return uniqueFileName;
	}

	@GetMapping("/LoanApprovedProject")
	public String LoanApprovedProject(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			return "LoanApprovedProject";
		} else {
			// Handle the case where the user is not in the session (e.g., redirect to
			// login)
			return "redirect:/UserLogin";
		}
	}

	@PostMapping("/LoanApproved")
	public String LoanApproved(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			return "ApprovedProjectList";
		} else {
			return "UserLogin";
		}
	}

	@GetMapping("/project1")
	public String project1() {
		return "project1";
	}
	@GetMapping("/project2")
	public String project2() {
		return "project2";
	}
	@GetMapping("/project3")
	public String project3() {
		return "project3";
	}
	@GetMapping("/project4")
	public String project4() {
		return "project4";
	}
	@GetMapping("/project5")
	public String project5() {
		return "project5";
	}
	@GetMapping("/project6")
	public String project6() {
		return "project6";
	}

	@GetMapping("/LoanCalculator")
	public String LoanCalculator(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			return "LoanCalculator";
		} else {
			// Handle the case where the user is not in the session (e.g., redirect to
			// login)
			return "redirect:/UserLogin";
		}
	}

	@GetMapping("/homeLoanEMI")
	public String homeLoanEMI() {
		return "homeLoanEMI";
	}
	@PostMapping("/HomeEMI")
	public String HomeEMI(@RequestParam double loanAmount, @RequestParam double interestRate,
			@RequestParam int loanTerm, Model model) {

		double monthlyPayment = calculateMonthlyPayment(loanAmount, interestRate, loanTerm);
		String formattedLoanAmount = String.format("%,.2f", loanAmount);

		model.addAttribute("monthlyPayment", monthlyPayment);
		model.addAttribute("formattedLoanAmount", formattedLoanAmount);

		return "result_loan";
	}

	private double calculateMonthlyPayment(double loanAmount, double interestRate, int loanTerm) {
		double monthlyRate = interestRate / 100 / 12;
		int numberOfPayments = loanTerm * 12;

		return (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -numberOfPayments));
	}
	@GetMapping("/homeLoan")
	public String homeLoan() {
		return "homeLoan";
	}
	@PostMapping("/Homeloan")
	public String Homeloan(@RequestParam double loanAmount, @RequestParam double interestRate,
			@RequestParam int loanTerm, Model model) {

		double monthlyPayment = calculateMonthlyPayment(loanAmount, interestRate, loanTerm);
		String formattedLoanAmount = String.format("%,.2f", loanAmount);

		model.addAttribute("monthlyPayment", monthlyPayment);
		model.addAttribute("formattedLoanAmount", formattedLoanAmount);

		return "result_loan";
	}

//	private double calculateMonthlyPayment(double loanAmount, double interestRate, int loanTerm) {
//		double monthlyRate = interestRate / 100 / 12;
//		int numberOfPayments = loanTerm * 12;
//
//		return (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -numberOfPayments));
//	}
	

	@GetMapping("/Maxgain")
	public String Maxgain() {
		return "Maxgain";
	}
	@PostMapping("/maxgain")
	public String maxgain(@RequestParam double loanAmount, @RequestParam double interestRate,
			@RequestParam int loanTerm, Model model) {

		double monthlyPayment = calculateMonthlyPayment(loanAmount, interestRate, loanTerm);
		String formattedLoanAmount = String.format("%,.2f", loanAmount);

		model.addAttribute("monthlyPayment", monthlyPayment);
		model.addAttribute("formattedLoanAmount", formattedLoanAmount);

		return "result_loan";
	}
	@GetMapping("/flexiPay")
	public String flexiPay() {
		return "flexiPay";
	}
	@PostMapping("/flexipay")
	public String flexipay(@RequestParam double loanAmount, @RequestParam double interestRate,
			@RequestParam int loanTerm, Model model) {

		double monthlyPayment = calculateMonthlyPayment(loanAmount, interestRate, loanTerm);
		String formattedLoanAmount = String.format("%,.2f", loanAmount);

		model.addAttribute("monthlyPayment", monthlyPayment);
		model.addAttribute("formattedLoanAmount", formattedLoanAmount);

		return "result_loan";
	}
	
	
	
}

//---------------------------------------------------------------------------------------------------------------

/* Rough Work */

//@PostMapping("/UploadData")
//public String UploadData(@RequestParam("lname") String name, @RequestParam("lemail") String email,
//		@RequestParam("laddress") String address, @RequestParam("lcontact") String contact,
//
//		@RequestPart("poidentity") MultipartFile identityProof,
//		@RequestPart("poresidence") MultipartFile residenceProof,
//		@RequestPart("poincome") MultipartFile incomeProof, @RequestPart("emp_proof") MultipartFile employmentProof,
//		@RequestPart("property_documents") MultipartFile propertyDocuments,
//		@RequestPart("bank_statment") MultipartFile bankStatement,
//		@RequestPart("dp_proof") MultipartFile downPaymentProof,
//		@RequestPart("guarantor_document") MultipartFile guarantorDocument,
//		@RequestPart("property_valuation_proof") MultipartFile propertyValuationProof,
//		@RequestPart("property_insurance") MultipartFile propertyInsurance,
//
//		Model model) throws IOException, ServletException {
//	processFile(identityProof, "Identity Proof");
//	processFile(residenceProof, "Residence Proof");
//	processFile(incomeProof, "Income Proof");
//	processFile(employmentProof, "Employment Proof");
//	processFile(propertyDocuments, "Property Documents");
//	processFile(bankStatement, "Bank Statement");
//	processFile(downPaymentProof, "Down Payment Proof");
//	processFile(guarantorDocument, "Guarantor Document");
//	processFile(propertyValuationProof, "Property Valuation Proof");
//	processFile(propertyInsurance, "Property Insurance");
//	
//	// Perform additional processing or redirect as needed
//
//	// Example: Redirect to a success page
//	return "LoanApplyOnline";
//}
//
//private void processFile(MultipartFile file, String documentName) throws IOException, ServletException {
//    String savePath = "C:/Users/vhora/OneDrive/Documents/Home_Loan_MVC/HomeLoan/src/main/webapp/WEB-INF/resources/assets/user_docs/";
//
//    File fileSaveDir = new File(savePath);
//    if (!fileSaveDir.exists()) {
//        fileSaveDir.mkdirs(); // Use mkdirs() to create parent directories if necessary
//    }
//
//    // Use either the image part logic OR the MultipartFile logic based on your requirements
////     Part file1 = request.getPart("image");
////     String fileName = extractfilename(file1);
////     file1.write(savePath + File.separator + fileName);
//
//    String fileName = file.getOriginalFilename();
//    file.transferTo(new File(savePath + File.separator + fileName));
//    Loan loan = new Loan();
//    loan.setPoidentityPath(fileName);
//    loan.setPoresidencePath(fileName);
//    loan.setPoincomePath(fileName);
//    loan.setEmpProofPath(fileName); 
//    loan.setPropertyDocumentsPath(fileName);
//    loan.setBankStatmentPath(fileName);
//    loan.setDpProofPath(fileName);
//    loan.setGuarantorDocumentPath(fileName);
//    loan.setPropertyValuationProofPath(fileName);
//    loan.setPropertyInsurancePath(fileName);
//
//    Dao.saveFileInfo(loan);
//
//    // Log or perform additional processing if necessary
//    System.out.println("Uploaded " + documentName + " file: " + fileName);
//}

//@PostMapping("/UploadData")
//public ModelAndView uploadData(@ModelAttribute Loan loan, @RequestParam("file") MultipartFile file,
//        HttpServletRequest request, HttpSession session) {
//    User user = (User) session.getAttribute("user");
//
//    if (!file.isEmpty()) {
//        try {
//            String savePath = "C:/Users/vhora/OneDrive/Documents/Home_Loan_MVC/HomeLoan/src/main/webapp/WEB-INF/resources/assets/user_docs/";
//            File fileSaveDir = new File(savePath);
//            
//            if (!fileSaveDir.exists()) {
//                fileSaveDir.mkdir();
//            }
//
//            String fileName = file.getOriginalFilename();
//            String filePath = savePath + File.separator + fileName;
//            file.transferTo(new File(filePath));
//
//           
//            loan.setPoidentity(file);
//            loan.setPoresidence(file);
//            loan.setPoincome(file);	
//            loan.setEmp_proof(file);
//            loan.setProperty_documents(file);
//            loan.setBank_statment(file);
//            loan.setDp_proof(file);
//            loan.setGuarantor_document(file);
//            loan.setProperty_valuation_proof(file);
//            loan.setProperty_insurance(file);
//            
//            loan.setPoidentityPath(fileName);
//            loan.setPoresidencePath(fileName);
//            loan.setPoincomePath(fileName);
//            loan.setEmpProofPath(fileName); 
//            loan.setPropertyDocumentsPath(fileName);
//            loan.setBankStatmentPath(fileName);
//            loan.setDpProofPath(fileName);
//            loan.setGuarantorDocumentPath(fileName);
//            loan.setPropertyValuationProofPath(fileName);
//            loan.setPropertyInsurancePath(fileName);
//
//            
//
//            Dao.getDocuments(loan);
//
//            ModelAndView modelAndView = new ModelAndView("redirect:/LoanApplyOnline");
//            modelAndView.addObject("message", "Data Registered successfully");
//            return modelAndView;
//        } catch (Exception e) {
//            // Handle exception (log or show an error message)
//            ModelAndView modelAndView = new ModelAndView("redirect:/LoanApplyOnline");
//            modelAndView.addObject("error", "Error uploading file: " + e.getMessage());
//            return modelAndView;
//        }
//    } else {
//        // File is empty, handle accordingly
//        ModelAndView modelAndView = new ModelAndView("redirect:/LoanApplyOnline");
//        modelAndView.addObject("error", "File is empty");
//        return modelAndView;
//    }
//}

//@PostMapping("/UploadData")
//public RedirectView UploadData(@ModelAttribute Loan cust, HttpServletRequest request, HttpSession session)
//		throws IOException, ServletException {
//	User user = (User) session.getAttribute("user");
//	String savePath = "C:/Users/vhora/OneDrive/Documents/Home_Loan_MVC/HomeLoan/src/main/webapp/WEB-INF/resources/assets/user_docs/";
//	File fileSaveDir = new File(savePath);
//	if (!fileSaveDir.exists()) {
//		fileSaveDir.mkdir();
//	}
//	Part file1 = request.getPart("image");
//	String fileName = extractfilename(file1);
//	file1.write(savePath + File.separator + fileName);
//	String filePath = savePath + File.separator + fileName;
//
//	String savePath2 = "C:/Users/vhora/OneDrive/Documents/Home_Loan_MVC/HomeLoan/src/main/webapp/WEB-INF/resources/assets/user_docs/";
//	File imgSaveDir = new File(savePath2);
//	if (!imgSaveDir.exists()) {
//		imgSaveDir.mkdir();
//	}
//
//		Dao.getDocuments(cust);
//		RedirectView rv = new RedirectView();
//		rv.setContentType("Data Registered successfully");
//		rv.setUrl(request.getContextPath() + "/LoanApplyOnline");
//		return rv;
//	
//
//}

//public ModelAndView UploadData(@ModelAttribute Loan cust,@RequestPart("poidentity") MultipartFile poidentity,
//        @RequestPart("poresidence") MultipartFile poresidence,
//        @RequestPart("poincome") MultipartFile poincome,
//        @RequestPart("emp_proof") MultipartFile empProof,
//        @RequestPart("property_documents") MultipartFile propertyDocuments,
//        @RequestPart("bank_statment") MultipartFile bankStatement,
//        @RequestPart("dp_proof") MultipartFile dpProof,
//        @RequestPart("guarantor_document") MultipartFile guarantorDocument,
//        @RequestPart("property_valuation_proof") MultipartFile propertyValuationProof,
//        @RequestPart("property_insurance") MultipartFile propertyInsurance,HttpServletRequest req){
//	 ModelAndView mv = new ModelAndView();
//	 try {
//	        // Specify the directory where you want to store the uploaded files
//	       // Change this to your desired path
//
//	        // Save each file to the specified directory
//	        saveFile(uploadPath, "poidentity", poidentity);
//	        saveFile(uploadPath, "poresidence", poresidence);
//	        saveFile(uploadPath, "poincome", poincome);
//	        saveFile(uploadPath, "emp_proof", empProof);
//	        saveFile(uploadPath, "property_documents", propertyDocuments);
//	        saveFile(uploadPath, "bank_statment", bankStatement);
//	        saveFile(uploadPath, "dp_proof", dpProof);
//	        saveFile(uploadPath, "guarantor_document", guarantorDocument);
//	        saveFile(uploadPath, "property_valuation_proof", propertyValuationProof);
//	        saveFile(uploadPath, "property_insurance", propertyInsurance);
//
//	        mv.addObject("message", "Files uploaded successfully!");
//	        System.out.println("data inserted!!");
//	        mv.setViewName("UserHome");
//	        Dao.getDocuments(cust);
//	        System.out.println("cust added" +cust);
//	        
//	    } catch (IOException e) {
//	        mv.addObject("message", "Error uploading files: " + e.getMessage());
//	        mv.setViewName("LoanApplyOnline");
//	    }
//
//	    return mv;
//	}
//
// private String saveFile(String uploadPath, String fileName, MultipartFile file) throws IOException {
//        if (file != null && !file.isEmpty()) {
//            // Create the upload directory if it doesn't exist
//            File directory = new File(uploadPath);
//            if (!directory.exists()) {
//                directory.mkdirs();
//            }
//
//            // Save the file to the specified directory with a custom filename
//            File destFile = new File(uploadPath + fileName + "_" + file.getOriginalFilename());
//            file.transferTo(destFile);
//
//            // Return the absolute path to the saved file
//            return destFile.getAbsolutePath();
//        } else {
//            // Handle the case where the file is empty or not provided
//            throw new IllegalArgumentException("File is empty or not provided.");
//        }
//    }

//private String extractfilename(Part file) {
//String cd = file.getHeader("content-disposition");
//System.out.println(cd);
//String[] items = cd.split(";");
//for (String string : items) {
//	if (string.trim().startsWith("filename")) {
//		return string.substring(string.indexOf("=") + 2, string.length() - 1);
//	}
//}
//return "";
//}
//
//@GetMapping("/LoanApplyOnline")
//public String LoanApplyOnline(HttpSession session) {
//User user = (User) session.getAttribute("user");
//if (user != null) {
//	return "LoanApplyOnline";
//} else {
//	// Handle the case where the user is not in the session (e.g., redirect to
//	// login)
//	return "redirect:/UserLogin";
//}
//
//}
//@PostMapping("/LoanApply")
//public String LoanApply(HttpSession session) {
//	User user= (User) session.getAttribute("user");
//	if(user!=null) {
//		return "UserFormForLoanOnline";
//	}else {
//		return "UserLogin";
//	}
//}
//
//@GetMapping("/UserForForLoanOnline")
//public String UserFormForLoanOnline(Model model) {
// model.addAttribute("cust", new Loan());
//return "UserFormForLoanOnline";
//
//}
//
//@GetMapping("/UserForForLoanOnline2")
//public String UserFormForLoanOnline2(Model model) {
// model.addAttribute("cust", new Loan());
//return "UserFormForLoanOnline2";
//
//}
//
//
//@GetMapping("/UserForForLoanOnline3")
//public String UserFormForLoanOnline3(Model model) {
// model.addAttribute("cust", new Loan());
//return "UserFormForLoanOnline3";
//
//}
//
//@PostMapping({"/UploadDocuments", "/UploadDocuments2", "/UploadDocuments3"})
//public String uploadDocuments(@ModelAttribute Loan cust, HttpServletRequest request, @RequestParam("currentStep") int currentStep, Model model) throws IOException, ServletException {
//updateLoanData(cust, currentStep, request);
//
//if (currentStep == 3) {
//    saveDocumentsAndData(cust, request);
//    model.addAttribute("loan", new Loan());
//    return "redirect:/LoanApplyOnline";
//}
//
//return "redirect:/UserForForLoanOnline" + (currentStep + 1);
//}
//
//private void saveDocumentsAndData(Loan cust, HttpServletRequest request) throws IOException, ServletException {
//String savePath = "C:\\Users\\vhora\\OneDrive\\Documents\\Home_Loan_MVC\\HomeLoan\\src\\main\\webapp\\WEB-INF\\resources\\assets\\verify";
//File fileSaveDir = new File(savePath);
//if (!fileSaveDir.exists()) {
//    fileSaveDir.mkdir();
//}
//
//Part file1 = request.getPart("image");
//String fileName = extractfilename(file1);
//file1.write(savePath + File.separator + fileName);
//String filePath = savePath + File.separator + fileName;
//
//String savePath2 ="C:\\Users\\vhora\\OneDrive\\Documents\\Home_Loan_MVC\\HomeLoan\\src\\main\\webapp\\WEB-INF\\resources\\assets\\verify";
//File imgSaveDir = new File(savePath2);
//if (!imgSaveDir.exists()) {
//	imgSaveDir.mkdir();
//}
//// Save the data to the database
//Dao.getDocuments(cust);
//}
//
//private void updateLoanData(Loan cust, int currentStep, HttpServletRequest request) {
//// Update the loan object based on the current step
//switch (currentStep) {
//    case 1:
//        cust.setLname(request.getParameter("lname"));
//        cust.setLemail(request.getParameter("lemail"));
//        cust.setLaddress(request.getParameter("laddress"));
//        cust.setLcontact(request.getParameter("lcontact"));
//        break;
//    case 2:
//        cust.setPoidentity(request.getParameter("poidentity"));
//        cust.setPoresidence(request.getParameter("poresidence"));
//        cust.setPoincome(request.getParameter("poincome"));
//        break;
//    case 3:
//        cust.setEmp_proof(request.getParameter("emp_proof"));
//        cust.setProperty_documents(request.getParameter("property_documents"));
//        cust.setBank_statment(request.getParameter("bank_statment"));
//        cust.setDp_proof(request.getParameter("dp_proof"));
//        cust.setGuarantor_document(request.getParameter("guarantor_document"));
//        cust.setProperty_valuation_proof(request.getParameter("property_valuation_proof"));
//        cust.setProperty_insurance(request.getParameter("property_insurance"));
//        break;
//}
//
//@GetMapping("/UserFormForLoanOnline")
//public String userFormForLoanOnline(Model model) {
//	model.addAttribute("cust", new Loan());
//	return "UserFormForLoanOnline";
//}
//@PostMapping("/UploadDocuments")
//public RedirectView uploadDocuments(@ModelAttribute Loan cust, HttpServletRequest req) throws IOException, ServletException {
////	String savePath = "C:\\Users\\vhora\\OneDrive\\Documents\\Home_Loan_MVC\\HomeLoan\\src\\main\\webapp\\WEB-INF\\resources\\assets\\user_docs";
////	File fileSaveDir = new File(savePath);
////	if (!fileSaveDir.exists()) {
////		fileSaveDir.mkdir();
////	}
////	Part file1 = req.getPart("image");
////	String fileName = extractfilename(file1);
////	file1.write(savePath + File.separator + fileName);
////	String filePath = savePath + File.separator + fileName;
////
////	String savePath2 = "C:\\Users\\vhora\\OneDrive\\Documents\\Home_Loan_MVC\\HomeLoan\\src\\main\\webapp\\WEB-INF\\resources\\assets\\user_docs";
////	File imgSaveDir = new File(savePath2);
////	if (!imgSaveDir.exists()) {
////		imgSaveDir.mkdir();
////	}
//	Dao.getDocuments(cust);
//	RedirectView rv = new RedirectView();
//	rv.setUrl(req.getContextPath() + "/UserFormForLoanOnline2");
//	return rv;
//
//}
//
//@GetMapping("/UserFormForLoanOnline2")
//public String userFormForLoanOnline2(Model model) {
//	model.addAttribute("cust", new Loan());
//	return "UserFormForLoanOnline2";
//}
//@PostMapping("/UploadDocuments2")
//public RedirectView uploadDocuments2(@ModelAttribute Loan cust,@RequestParam("file") MultipartFile file, HttpServletRequest req) throws IOException, ServletException {
//	String savePath = "C:\\Users\\vhora\\OneDrive\\Documents\\Home_Loan_MVC\\HomeLoan\\src\\main\\webapp\\WEB-INF\\resources\\assets\\user_docs";
//	File fileSaveDir = new File(savePath);
//	if (!fileSaveDir.exists()) {
//		fileSaveDir.mkdir();
//	}
//	Part file1 = req.getPart("image");
//	String fileName = extractfilename(file1);
//	file1.write(savePath + File.separator + fileName);
//	String filePath = savePath + File.separator + fileName;
//
//	String savePath2 = "C:\\Users\\vhora\\OneDrive\\Documents\\Home_Loan_MVC\\HomeLoan\\src\\main\\webapp\\WEB-INF\\resources\\assets\\user_docs";
//	File imgSaveDir = new File(savePath2);
//	if (!imgSaveDir.exists()) {
//		imgSaveDir.mkdir();
//	}
//	Dao.getDocuments(cust);
//	RedirectView rv = new RedirectView();
//	rv.setUrl(req.getContextPath() + "/UserFormForLoanOnline3");
//	return rv;
//
//}
//@GetMapping("/UserFormForLoanOnline3")
//public String userFormForLoanOnline3(Model model) {
//	model.addAttribute("cust", new Loan());
//	return "UserFormForLoanOnline3";
//}
//@PostMapping("/UploadDocuments3")
//public RedirectView uploadDocuments3(@ModelAttribute Loan cust,@RequestParam("file") MultipartFile file, HttpServletRequest req) throws IOException, ServletException {
//	String savePath = "C:\\Users\\vhora\\OneDrive\\Documents\\Home_Loan_MVC\\HomeLoan\\src\\main\\webapp\\WEB-INF\\resources\\assets\\user_docs";
//	File fileSaveDir = new File(savePath);
//	if (!fileSaveDir.exists()) {
//		fileSaveDir.mkdir();
//	}
//	Part file1 = req.getPart("image");
//	String fileName = extractfilename(file1);
//	file1.write(savePath + File.separator + fileName);
//	String filePath = savePath + File.separator + fileName;
//
//	String savePath2 = "C:\\Users\\vhora\\OneDrive\\Documents\\Home_Loan_MVC\\HomeLoan\\src\\main\\webapp\\WEB-INF\\resources\\assets\\user_docs";
//	File imgSaveDir = new File(savePath2);
//	if (!imgSaveDir.exists()) {
//		imgSaveDir.mkdir();
//	}
//	Dao.getDocuments(cust);
//	RedirectView rv = new RedirectView();
//	rv.setUrl(req.getContextPath() + "/LoanApplyOnline");
//	return rv;
//
//}

//@RequestMapping(path = "/UploadDocuments",method = RequestMethod.POST)
//public String uploadDocuments(@ModelAttribute Loan cust, @RequestParam("file") MultipartFile file,
//		HttpServletRequest request, @RequestParam("currentStep") int currentStep, Model model)
//		throws IOException, ServletException {
//	updateLoanData(cust, currentStep, request);
//	System.out.println(cust + ":"+currentStep +":"+ request);
//	if (currentStep == 3) {
//		saveDocumentsAndData(cust, request, file);
//		model.addAttribute("loan", cust);
//		return "redirect:/LoanApplyOnline";
//	}
//
//	return "redirect:/UserFormForLoanOnline" + (currentStep + 1);
//}

//private void saveDocumentsAndData(Loan cust,HttpServletRequest request, MultipartFile file) throws IOException, ServletException {
//	
//
//	// Save the data to the database
//	Dao.getDocuments(cust);
//}
//
//private void updateLoanData(Loan cust, int currentStep, HttpServletRequest request) {
//	switch (currentStep) {
//	case 1:
//		cust.setLname(request.getParameter("lname"));
//		cust.setLemail(request.getParameter("lemail"));
//		cust.setLaddress(request.getParameter("laddress"));
//		cust.setLcontact(request.getParameter("lcontact"));
//		break;
//	case 2:
//		cust.setPoidentity(request.getParameter("poidentity"));
//		cust.setPoresidence(request.getParameter("poresidence"));
//		cust.setPoincome(request.getParameter("poincome"));
//		break;
//	case 3:
//		cust.setEmp_proof(request.getParameter("emp_proof"));
//		cust.setProperty_documents(request.getParameter("property_documents"));
//		cust.setBank_statment(request.getParameter("bank_statment"));
//		cust.setDp_proof(request.getParameter("dp_proof"));
//		cust.setGuarantor_document(request.getParameter("guarantor_document"));
//		cust.setProperty_valuation_proof(request.getParameter("property_valuation_proof"));
//		cust.setProperty_insurance(request.getParameter("property_insurance"));
//		break;
//	}
//}