package co.micol.dbtest.bbs.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import co.micol.dbtest.bbs.service.BulletinService;
import co.micol.dbtest.bbs.vo.BulletinVO;
import co.micol.dbtest.common.DAO;

public class BulletinServiceImpl extends DAO implements BulletinService {
	PreparedStatement psmt;
	ResultSet rs;

	@Override
	public List<BulletinVO> bulletinSelectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BulletinVO bulletinSelect(BulletinVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBulletin(BulletinVO vo) {
		String sql = "insert into bbs(bbs_id, bbs_title, bbs_content, bbs_writer, bbs_create_date) values(bbs_id_seq.nextval, ?,?,?,sysdate)";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBbsTitle());
			psmt.setString(2, vo.getBbsContent());
			psmt.setString(3, vo.getBbsWriter());
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return r;
	}

	@Override
	public int updateBulletin(BulletinVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBulletin(BulletinVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void close() {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		if (psmt != null)
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
