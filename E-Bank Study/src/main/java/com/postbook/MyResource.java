package com.postbook;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.model.Customer;
import com.model.Transaction;

import dao.EBankDAOImpl;

@Path("ebank")
public class MyResource {

//	PostsDAOImpl impl = new PostsDAOImpl();
//	
//	@Path("posts/all")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Post> getPosts() {
//		return impl.getPosts();
//	}
//	
//	@Path("posts/add")
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public int addPost(Post post) {
//		return impl.addPost(post);
//	}
//	
//	@Path("posts/edit")
//	@PUT
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public int editPost(Post post) {
//		return impl.updatePost(post);
//	}
//	
//	@Path("posts/delete/{id}")
//	@DELETE
//	@Produces(MediaType.APPLICATION_JSON)
//	public int deletePost(@PathParam("id") int id) {
//		return impl.deletePost(new Post(id,"",""));
//	}
	
	EBankDAOImpl ebank = new EBankDAOImpl();
	
	@Path("customer/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int addCustomer(Customer customer) {
		return ebank.register(customer);
	}
	
	@Path("customer/login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int loginCustomer(Customer customer) {
		return ebank.login(customer);
	}
	
	@Path("transaction/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int addMoney(Transaction transaction) {
		return ebank.addMoney(transaction);
	}
}




