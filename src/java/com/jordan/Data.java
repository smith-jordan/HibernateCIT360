/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

@ManagedBean
@SessionScoped

public class Data {
    
    private members m;
    private HibernateUtil helper;
    private Session session;
    
    
    public void addMember(){
    m = new members("Kabel");
    session = helper.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(m);
    session.getTransaction().commit();
    session.close();
    
    
    }
    
    
    
}
