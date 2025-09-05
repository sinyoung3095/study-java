package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.config.DBConnecter;
import com.app.domain.ReplyVO;
import com.app.domain.dto.ReplyDTO;

public class ReplyDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	public void insert(ReplyVO replyVO) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("insert into tbl_reply ");
		stringBuilder.append("(reply_content, post_id, member_id) ");
		stringBuilder.append("values(?, ?, ?)");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getPostId());
			preparedStatement.setLong(3, replyVO.getMemberId());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("insert(ReplyVO) 오류");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	};

	public void update(ReplyVO replyVO) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("update tbl_reply ");
		stringBuilder.append("set reply_content=?, updated_date=current_timestamp(), post_id=?, member_id=? ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getPostId());
			preparedStatement.setLong(3, replyVO.getMemberId());
			preparedStatement.setLong(4, replyVO.getId());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("update(ReplyVO) 오류");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

	public void deleteSoft(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("update tbl_reply ");
		stringBuilder.append("set member_status = disable ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("deleteHard(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

	public void deleteHard(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("delete from tbl_reply ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("deleteHard(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

	public ReplyDTO selectOne(Long id) {
		ReplyDTO replyDTO = null;
		String query = null;

//	      SELECT id, reply_content, reply_status, created_date, updated_date, post_id, member_id
//	      FROM tbl_reply;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("r.id,m.member_name, r.reply_content, r.created_date, r.updated_date, r.post_id ");
		stringBuilder.append("from tbl_member m join tbl_reply r on m.id = r.member_id ");
		stringBuilder.append("where r.id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				replyDTO = new ReplyDTO();
				replyDTO.setId(resultSet.getLong("id"));
				replyDTO.setMemberName(resultSet.getNString("member_name"));
				replyDTO.setReplyContent(resultSet.getString("reply_content"));
				replyDTO.setCreatedDate(resultSet.getString("created_date"));
				replyDTO.setUpdatedDate(resultSet.getString("updated_date"));
				replyDTO.setPostId(resultSet.getLong("post_id"));}
				

		} catch (SQLException e) {
			System.out.println("selectOne(Long) SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}

				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return replyDTO;
	}

	public ReplyVO selectAll() {
		ReplyVO replyVO = null;
		String query = null;

//	      SELECT id, reply_content, reply_status, created_date, updated_date, post_id, member_id
//	      FROM tbl_reply;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("id, reply_content, created_date, updated_date, post_id, member_id ");
		stringBuilder.append("from tbl_reply ");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				replyVO = new ReplyVO();
				replyVO.setId(resultSet.getLong("id"));
				replyVO.setReplyContent(resultSet.getString("reply_content"));
				replyVO.setCreatedDate(resultSet.getString("created_date"));
				replyVO.setUpdatedDate(resultSet.getString("updated_date"));
				replyVO.setPostId(resultSet.getLong("post_id"));
				replyVO.setMemberId(resultSet.getLong("member_id"));
			}

		} catch (SQLException e) {
			System.out.println("selectAll() SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}

				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return replyVO;
	}
}
