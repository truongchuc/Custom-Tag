/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// StudentTag.java
package chuc.dev.tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class StudentTag extends SimpleTagSupport {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().println("<div>");
        getJspContext().getOut().println("<h3>Tên: " + name + "</h3>");
        getJspContext().getOut().println("<p>Tuổi: " + age + "</p>");
        getJspContext().getOut().println("</div>");
    }
}

