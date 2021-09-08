package dao;

import java.util.List;

import com.model.Post;
import com.model.Status;

public interface PostsDAO {

	List<Post> getPosts();

	int addPost(Post post);

	int updatePost(Post post);

	int deletePost(Post post);

}
