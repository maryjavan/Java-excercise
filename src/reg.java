

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class reg
 */
@WebServlet("/reg")
public class reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reg() {
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
		
	//	PrintWriter out = response.getWriter();
	//	response.setContentType("text/html");
		String filmName,directorName;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String act = request.getParameter("whattodo").toString();
		if (act.equals("Go Back")) response.sendRedirect("intro.jsp");
		else{
		
		filmName= request.getParameter("film_name").toString();
		directorName = request.getParameter("dir_name").toString();
	//	year= request.getParameter("year").toString();
		String url = "jdbc:mysql://localhost:3306/database";
		try{
			Connection con = DriverManager.getConnection(url,"root","1234");
			Statement st = con.createStatement();
		//	ResultSet myres;
		//	myres=st.executeQuery("select count(*) from movies");
		//	int count=0;
		//	while (myres.next()){
		//		count = myres.getInt(1);
		//	}

		//	int i=count;
		//	i++;
			
			String req= "insert into movies (name,director) values ( '"+filmName+"','" +directorName + "' )";
			st.executeUpdate(req);
			

		response.sendRedirect("index.jsp");
			
		
		}catch( Exception e){
			e.printStackTrace();
			
			
		}
	}
	}

}
