import java.util.ArrayList;
import java.util.List;

public class Comment{
	private String id;
    private String content;
    private List<Comment> comments;


	public Comment(String id, String content){
		this.setId(id);
	    this.setContent(content);
	    setComments(new ArrayList<>());
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}