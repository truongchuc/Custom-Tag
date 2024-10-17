/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package chuc.dev;

import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.StringWriter;

public class HelloTag extends SimpleTagSupport {
    private String name;

    // Phương thức thiết lập giá trị cho thuộc tính 'name'
    public void setName(String name) {
        this.name = name;
    }
    StringWriter sw = new StringWriter();

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.println("Hello Custom Tag!");

        getJspBody().invoke(sw);
        getJspContext().getOut().println(sw.toString());
        
        String message = (name != null) ? "Hello, " + name + "!" : "Hello, World!";
        out.println(message);
    }
}
