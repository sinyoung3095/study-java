package com.app.domain;

import java.util.Objects;

import com.app.domain.status.PostStatus;

public class PostVO {
	private long id;
	private String postTitle;
	private String postContent;
	private int postReadCount;
	private PostStatus postStatus;
	private long memberId;
	private String createdDate;
	private String updatedDate;
	
	public PostVO() {;}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public int getPostReadCount() {
		return postReadCount;
	}

	public void setPostReadCount(int postReadCount) {
		this.postReadCount = postReadCount;
	}

	public PostStatus getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(PostStatus postStatus) {
		this.postStatus = postStatus;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "PostVO [id=" + id + ", postTitle=" + postTitle + ", postContent=" + postContent + ", postReadCount="
				+ postReadCount + ", postStatus=" + postStatus + ", memberId=" + memberId + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostVO other = (PostVO) obj;
		return id == other.id;
	}
	
	
	
}
