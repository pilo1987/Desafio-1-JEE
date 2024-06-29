package cl.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.factorial.Factorial;

@WebServlet("/CalcularFactorial")
public class CalcularFactorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalcularFactorial() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String numParameter = request.getParameter("numero");
	    int numero = Integer.parseInt(numParameter);
		
	        Factorial calcFactorial = new Factorial();
	        long factorial = calcFactorial.calcFactorial(numero);
	        
	            response.getWriter().println("El factorial de " + numero + " es: " + factorial);
	    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
