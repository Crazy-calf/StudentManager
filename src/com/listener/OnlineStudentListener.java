package com.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.cr.ssm.entity.Student;

/**
 * Application Lifecycle Listener implementation class OnlineStudentListener
 *
 */
@WebListener("/onlineStudentList")
public class OnlineStudentListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public OnlineStudentListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce) {
        // TODO Auto-generated method stub
    	List<Student> onlineStudentList = new ArrayList<Student>();
    	//放到ServletContext
    	ServletContext servletContext = sce.getServletContext();
    	servletContext.setAttribute("onlineStudentList", onlineStudentList);
    	
    }
	
}
