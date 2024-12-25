package org.hibernate.cfg;

import org.hibernate.SessionFactory;

import hibernatestudent.Student;

public @interface Configuration {

	void configure();

	void addAnnotatedClass(Class<Student> class1);

	SessionFactory buildSessionFactory();

	void addAnnotatedClass(Class<Student> class1);

	void configure();

}
