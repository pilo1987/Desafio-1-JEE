package cl.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.parimpar.ParImpar;

@WebServlet("/CalcularParImpar")
public class CalcularParImpar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalcularParImpar() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String numParameter = request.getParameter("numero");
	    int numero = Integer.parseInt(numParameter);
	    
		ParImpar parImpar = new ParImpar();
		String resultado = parImpar.calcParImpar(numero);
       
            response.getWriter().append("El numero es: " + resultado);
        }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
