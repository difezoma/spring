package com.difezoma.backend.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.difezoma.backend.entity.Course;
import com.difezoma.backend.entity.QCourse;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;

@Repository("queryDSLRepository")
public class QueryDSLRepository {
	
	private QCourse course = QCourse.course;
	
	@PersistenceContext
	private EntityManager em;
	
	public Course find() {
		
		JPAQuery<Course> query = new JPAQuery<Course>(em);
		
		BooleanBuilder predicate = new BooleanBuilder(course.price.between(1000, 50000));
		
		return query.select(course).from(course).where(predicate).fetchOne();
		
		
	}

}
