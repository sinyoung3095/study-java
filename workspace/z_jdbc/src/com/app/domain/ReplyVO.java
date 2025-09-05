package com.app.domain;

import java.util.Objects;

import com.app.domain.status.ReplyStatus;

public class ReplyVO {
	private Long id;
	private String replyContent;
	private ReplyStatus replyStatus;
	private String createdDate;
	private String updatedDate;
	private long postId;
	private long memberId;
	
	public ReplyVO() {;}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public ReplyStatus getReplyStatus() {
		return replyStatus;
	}

	public void setReplyStatus(ReplyStatus replyStatus) {
		this.replyStatus = replyStatus;
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

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
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
		ReplyVO other = (ReplyVO) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "ReplyVO [id=" + id + ", replyContent=" + replyContent + ", replyStatus=" + replyStatus
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", postId=" + postId + ", memberId="
				+ memberId + "]";
	}
	
	
}
