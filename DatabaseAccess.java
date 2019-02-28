package com.business.world.dao;


import com.business.world.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;

public class DatabaseAccess implements IDatabaseAccess{

   /* public EmployeeEntity getEmployee(String id) throws Exception{
        EmployeeEntity em = new EmployeeEntity();
        em.setId(id);
        System.out.println("Employees created is : " + id);
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        Query q = session.createQuery("from Employee where id" + id);
        System.out.println("Attempting to get record from DB");
        List<EmployeeEntity> result = q.getResultList();
        System.out.println("Result found DB" + result);
        if(result.size() > 0) {
            return result.get(0);
        } else {
            throw new Exception("No record found");
        }
    }*/


    @Override
    public void createEmployee(EmployeeEntity emp) {
     SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();

    }
   public List<EmployeeEntity> getEmployees() {
       SessionFactory factory = HibernateUtil.getSessionFactory();
       Session session = factory.openSession();
       session.beginTransaction();

       Query query = session.createQuery("from Employee");
       List<EmployeeEntity> emps = query.getResultList();

       session.getTransaction().commit();
       session.close();
       return emps;
   }

   public void updateEmployee(EmployeeEntity emp){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(emp);
        session.getTransaction().commit();
        session.close();
    }

        public void deleteEmployee(String employeeId) throws Exception {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

            Query query = session.createQuery("delete from Employee where employeeId=" + employeeId);
            int deleted = query.executeUpdate();
            System.out.println("Deleted: " + deleted + " Employee");

        System.out.println("Deleted Successfully");
        session.getTransaction().commit();
        session.close();
        }

}
