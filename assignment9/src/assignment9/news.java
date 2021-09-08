package assignment9;

public class news {
	private final int newsId;
	private final String postedByUser;
	private final String commentByUser;
	private final String comment;
	public news(int newsId, String postedByUser, String commentByUser, String comment) {
		
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public String getComment() {
		return comment;
	}
	@Override
	public String toString() {
		return "news [newsId=" + this.newsId + ", postedByUser=" + this.postedByUser + ", commentByUser=" + this.commentByUser
				+ ", comment=" + this.comment + "]";
	}
	
	
	
}
