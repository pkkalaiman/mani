package com.xworkz.railwayticket;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 9, urlPatterns = "/Password")
public class Passenger extends HttpServlet {

	public Passenger() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running Init Passanger........");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in doPost Method In Passanger Servlet.........");

		String name = req.getParameter("Name");
		String address = req.getParameter("Address");
		String city = req.getParameter("City");
		String mobileNo = req.getParameter("MobileNo");
		String eMail = req.getParameter("eMail");
		String password = req.getParameter("Password");
		String confirmPassword = req.getParameter("ConfirmPassword");

		// Long convertedmobilNo = Long.parseLong(mobileNo);

		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
		System.out.println(mobileNo);
		System.out.println(eMail);
		System.out.println(password);
		System.out.println(confirmPassword);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<h1>");
		if (name.length() > 3 && address.length() > 6 && mobileNo.length() > 10 && address.length() > 7
				&& eMail.length() > 10 && password.length() > 10 && confirmPassword.length() > 10) {
			writer.print("<spam style='color :blue'>");
			writer.print("Singned Up Sucessfully");
			writer.print("</spam>");

		} else {
			writer.print("<spam style='color :red'>");
			writer.print("Please Enter Valid Info");
			writer.print("</spam>");
		}

		writer.print("</h1>");
		writer.print("<a href=\"index.html\">Home Page</a>");
		writer.print("<br>");
		writer.print("<a href=\"passenger.html\">sign in again</a>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");
	}

}
