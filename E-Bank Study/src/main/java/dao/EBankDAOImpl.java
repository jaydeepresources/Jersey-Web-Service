package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Customer;
import com.model.Transaction;

public class EBankDAOImpl implements EBankDAO {

	private static Connection con;

	static {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "blackthorne");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int register(Customer customer) {
		// Add a new customer to the DB
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into customers values(?,?,?,?,?)");
			pst.setInt(1, customer.getCid());
			pst.setString(2, customer.getCname());
			pst.setString(3, customer.getCpan());
			pst.setString(4, customer.getCpin());
			pst.setString(5, customer.getCphone());

			res = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int login(Customer customer) {
		// Compare details across DB

		try {
			PreparedStatement pst = con.prepareStatement("select * from customers where cname=? and cpin = ?");
			pst.setString(1, customer.getCname());
			pst.setString(2, customer.getCpin());

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				return 1;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int addMoney(Transaction transaction) {
		// Add money to wallet
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into transactions values (?,?,?,?,?,?,?)");
			pst.setInt(1, transaction.getTid());
			pst.setFloat(2, transaction.getTamount());
			pst.setFloat(3, transaction.getTbalance() + transaction.getTamount());
			pst.setString(4, transaction.getTdate());
			pst.setString(5, transaction.getType());
			pst.setInt(6, transaction.getCfid());
			pst.setInt(7, transaction.getCtid());
			
			res = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
