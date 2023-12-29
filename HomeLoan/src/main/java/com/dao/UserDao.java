package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	private final SessionFactory sessionFactory;

	public UserDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void addUser(User user) {
		this.hibernateTemplate.save(user);
	}

	@Transactional
	public User loginUser(String email, String password) {
		List<User> user = hibernateTemplate.executeWithNativeSession(session -> {
			String queryString = "SELECT * FROM user WHERE email = :email AND password = :password";
			return session.createNativeQuery(queryString, User.class).setParameter("email", email)
					.setParameter("password", password).getResultList();
		});
		return user.isEmpty() ? null : user.get(0);
	}

	@Transactional
	public User getUser(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(User.class, id);
	}

	@Transactional
	public void UpdateProfile(User user) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "UPDATE User SET name = :name, contact = :contact, address = :address, email = :email WHERE id = :id";

		Query query = session.createQuery(hql);
		query.setParameter("name", user.getName());
		query.setParameter("contact", user.getContact());
		query.setParameter("address", user.getAddress());
		query.setParameter("email", user.getEmail());
		query.setParameter("id", user.getId());

		int rowsUpdated = query.executeUpdate();

		session.clear();
	}

	@Transactional
	public boolean checkOldPassword(String oldPassword, int id) {
		boolean flag = false;
		Session session = sessionFactory.getCurrentSession();
		String hql = "select password from User where id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		List<String> result = query.list();

		if (!result.isEmpty()) {
			String password = result.get(0);
			flag = oldPassword.equals(password);
		}
		return flag;
	}

	@Transactional
	public void updatePassword(String np, int id) {
		try {
			User user = hibernateTemplate.get(User.class, id);
			if (user != null) {
				if (np == null || np.isEmpty()) {
					System.out.println("New password cannot be empty. Password not updated for user with ID: " + id);
					return;
				}
				user.setPassword(np);
				hibernateTemplate.update(user);
				System.out.println("Password updated successfully for user with ID: " + id);
			} else {
				System.out.println("User not found for ID: " + id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Transactional
	public List<User> getAllUser(){
		return this.hibernateTemplate.loadAll(User.class);
	}
	/*
	 * @Transactional public void updatePasswordByEmail(String email, String np) {
	 * try { Query query =
	 * hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(
	 * "UPDATE User SET password = :np WHERE email = :email");
	 * query.setParameter("np", np); query.setParameter("email", email);
	 * 
	 * int result = query.executeUpdate(); System.out.println(email); if (result ==
	 * 0) { // Handle the case when the user with the given email is not found
	 * System.out.println("User not found for email: " + email); } else {
	 * System.out.println("Password updated successfully"); } } catch
	 * (DataAccessException e) { // Handle Data Access exceptions
	 * e.printStackTrace(); } catch (Exception e) { // Handle other unexpected
	 * exceptions e.printStackTrace(); } }
	 */

}
