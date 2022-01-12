import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<User> users;

    public SocialNetwork () {
        users = new ArrayList<User>();
    }

    public void addUser(User user) { 
        users.add(user);   
       System.out.println(user);
    }

    public User getUserById(String id) {

        for (User u : users) {
            if (id == u.getId())
                return u;
        }

        return null;
    }
    public void addPost(String id, Post post) {
        User userId = getUserById(id);
        userId.addPost(post);
        System.out.println(id + post);
    }

    public void addComment(String user1, String user2, String postId, Comment comment) {
        	getUserById(user1);
        	getUserById(user2);
        	getPostById(postId);
        	
    }

	private Post getPostById(String postId) {
		return null;
	}}