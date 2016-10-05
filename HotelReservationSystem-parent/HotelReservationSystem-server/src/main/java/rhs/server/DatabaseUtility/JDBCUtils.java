package rhs.server.DatabaseUtility;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class JDBCUtils {
	private static Properties prop ;
	private static DataSource dataSource ;
	static {
		try {
			prop = new Properties();
			prop.load(JDBCUtils.class.getClassLoader().getResourceAsStream("dbcpconfig.properties"));
			dataSource = BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("��ʼ��ʧ��");
		}
	}
	public static DataSource getDataSource(){
		return dataSource;
	}
}
