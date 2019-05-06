package com.kd.SampleDAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kd.model.Login;

@Repository
public class LoginDAO {
	@Autowired
	SessionFactory sf;
	@Transactional
	public int lchk(Login l) {
		Session s = sf.getCurrentSession();
		Query  q = s.createQuery("select s.uname from Login s where s.uname='"+l.getUname()+"' and s.pwd='"+l.getPwd()+"'");
		List<String> name = q.list();
		if(name.isEmpty()) {
			return 0;
		}
		else {
			return 1;
		}
	}
	@Transactional
	public void reg(Login l) {
		Session s = sf.getCurrentSession();
		s.save(l);
	}
}
