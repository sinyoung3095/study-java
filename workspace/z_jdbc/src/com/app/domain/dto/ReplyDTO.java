package com.app.domain.dto;

import java.util.Objects;

public class ReplyDTO {
//	
//
		private Long id;
		private String memberName;
		private String replyContent;
		private String createdDate;
		private String updatedDate;
		private Long postId;

	
		public ReplyDTO() {;}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getMemberName() {
			return memberName;
		}


		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}


		public String getReplyContent() {
			return replyContent;
		}


		public void setReplyContent(String replyContent) {
			this.replyContent = replyContent;
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


		public Long getPostId() {
			return postId;
		}


		public void setPostId(Long postId) {
			this.postId = postId;
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
			ReplyDTO other = (ReplyDTO) obj;
			return Objects.equals(id, other.id);
		}


		@Override
		public String toString() {
			return "ReplyDTO [id=" + id + ", memberName=" + memberName + ", replyContent=" + replyContent
					+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", postId=" + postId + "]";
		}
		

}
