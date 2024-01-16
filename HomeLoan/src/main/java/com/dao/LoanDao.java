package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.model.Loan;

@Repository
public class LoanDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	private final SessionFactory sessionFactory;

	public LoanDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void getDocuments(Loan loan) {
		this.hibernateTemplate.save(loan);
	}
	
//	@Transactional
//	public void saveFileInfo(Loan loan) {
//		Transaction transaction = null;
//		try (Session session = sessionFactory.openSession()) {
//			transaction = session.beginTransaction();
//			session.save(loan);
//			transaction.commit();
//		} catch (Exception e) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
//			e.printStackTrace(); // Handle exceptions appropriately
//		}
//
//	}

//	public void getDocuments(Loan cust, String uploadpath) {
//		cust.setPoidentityPath(saveFile(uploadpath, "poidentity", cust.getPoidentity()));
//		cust.setPoresidencePath(saveFile(uploadpath, "poresidence", cust.getPoresidence()));
//		cust.setPoincomePath(saveFile(uploadpath, "poincome", cust.getPoincome()));
//		cust.setEmpProofPath(saveFile(uploadpath, "emp_proof", cust.getEmp_proof()));
//		cust.setPropertyDocumentsPath(saveFile(uploadpath, "property_documents", cust.getProperty_documents()));
//		cust.setBankStatmentPath(saveFile(uploadpath, "bank_statment", cust.getBank_statment()));
//		cust.setDpProofPath(saveFile(uploadpath, "dp_proof", cust.getDp_proof()));
//		cust.setGuarantorDocumentPath(saveFile(uploadpath, "guarantor_document", cust.getGuarantor_document()));
//		cust.setPropertyValuationProofPath(
//				saveFile(uploadpath, "property_valuation_proof", cust.getProperty_valuation_proof()));
//		cust.setPropertyInsurancePath(saveFile(uploadpath, "property_insurance", cust.getProperty_insurance()));
//
//		this.hibernateTemplate.save(cust);
//
//	}
//
//	private String saveFile(String uploadpath, String string, MultipartFile poidentity) {
//		if (poidentity != null && !poidentity.isEmpty()) {
//			try {
//				// Create the upload directory if it doesn't exist
//				File directory = new File(uploadpath);
//				if (!directory.exists()) {
//					directory.mkdirs();
//				}
//
//				// Save the file to the specified directory with a custom filename
//				File destFile = new File(uploadpath + poidentity + "_" + poidentity.getOriginalFilename());
//				poidentity.transferTo(destFile);
//
//				// Return the absolute path to the saved file
//				return destFile.getAbsolutePath();
//			} catch (IOException e) {
//				// Handle the IOException appropriately, e.g., log or throw a custom exception
//				throw new RuntimeException("Error saving file: " + e.getMessage(), e);
//			}
//		} else {
//			// Handle the case where the file is empty or not provided
//			throw new IllegalArgumentException("File is empty or not provided.");
//		}
//	}
}
