package DBInfor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class LoadDBInformation
 *
 */
@WebListener
public class LoadDBInformation implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public LoadDBInformation() {
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		// load database information from web.xml
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String password = context.getInitParameter("password");
		DBInfor dbInfor = new DBInfor(driver, url, username, password);
		Connection con = this.getConnection(dbInfor);
		context.setAttribute("con", con);
	}

	private Connection getConnection(DBInfor dbInfor) {
		Connection con = null;
		if (dbInfor != null) {
			try {
				Class.forName(dbInfor.getDriver());
				con = DriverManager.getConnection(dbInfor.getUrl(), dbInfor.getUsername(), dbInfor.getPassword());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}

}
