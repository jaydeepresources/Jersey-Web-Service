package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Post;
import com.model.Status;

public class PostsDAOImpl implements PostsDAO {

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
	public List<Post> getPosts() {
		ArrayList<Post> list = new ArrayList<>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from posts");
			while (rs.next()) {
				list.add(new Post(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int addPost(Post post) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into posts values(?,?,?)");
			pst.setInt(1, post.getId());
			pst.setString(2, post.getTitle());
			pst.setString(3, post.getBody());
			res = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int updatePost(Post post) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("update posts set title = ?, body = ? where id = ?");
			pst.setString(1, post.getTitle());
			pst.setString(2, post.getBody());
			pst.setInt(3, post.getId());
			res = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int deletePost(Post post) {

		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from posts where id = ?");
			pst.setInt(1, post.getId());
			res = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
}
