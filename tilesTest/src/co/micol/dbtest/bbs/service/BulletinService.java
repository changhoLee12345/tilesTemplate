package co.micol.dbtest.bbs.service;

import java.util.List;

import co.micol.dbtest.bbs.vo.BulletinVO;
import co.micol.dbtest.notice.vo.NoticeVO;

public interface BulletinService {
	List<BulletinVO> bulletinSelectList();
	BulletinVO bulletinSelect(NoticeVO vo);
	int insertBulletin(NoticeVO vo);
	int updateBulletin(NoticeVO vo);
	int deleteBulletin(NoticeVO vo);
}
