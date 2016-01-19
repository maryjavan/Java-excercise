

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class toremove
 */
@WebServlet("/toremove")
public class toremove extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public toremove() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String act = request.getParameter("whattodo").toString();
		if (act.equals("Go Back")) response.sendRedirect("intro.jsp");
		else{
		
		String rem=request.getParameter("film_name").toString();
		String url = "jdbc:mysql://localhost:3306/database";
		try{

			Connection con = DriverManager.getConnection(url, "root", "1234");
			Statement st = con.createStatement();		

			int rn = st.executeUpdate("delete from movies where name='"+rem+"'" );
			System.out.println("row deleted"+ rn);		
			response.sendRedirect("remove.jsp");
		}catch (Exception e){
			e.getStackTrace();
		}
		
	}
	}
}
