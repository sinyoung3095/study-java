package com.app.domain.dto;

import java.util.Objects;

public class PostDTO {
	
		private long id;
		private String postTitle;
		private String postContent;
		private int postReadCount;
		private String memberName;
		private long memberId;
		private String createdDate;
		private String updatedDate;
		
		public PostDTO() {;}

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

		public String getMemberName() {
			return memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
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
			return "PostDTO [id=" + id + ", postTitle=" + postTitle + ", postContent=" + postContent
					+ ", postReadCount=" + postReadCount + ", memberName=" + memberName + ", memberId=" + memberId
					+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
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
			PostDTO other = (PostDTO) obj;
			return id == other.id;
		}

		
		
		
		
		
	}



