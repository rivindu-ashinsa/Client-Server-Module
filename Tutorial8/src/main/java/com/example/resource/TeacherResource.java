/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.resource;

import com.example.dao.GenericDAO;
import com.example.dao.MockDatabase;
import com.example.model.Teacher;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author User
 */
@Path("/teachers")
public class TeacherResource {

    private GenericDAO<Teacher> teacherDAO = new GenericDAO(MockDatabase.TEACHERS);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Teacher> getAllTeachers() {
        return teacherDAO.getAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Teacher getTeacherById(@PathParam("id") int id) {

        return teacherDAO.getById(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addTeacher(Teacher teacher){
        teacherDAO.add(teacher);
    }

}
