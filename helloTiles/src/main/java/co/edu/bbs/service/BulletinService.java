package co.edu.bbs.service;

import java.util.List;

import co.edu.bbs.vo.BulletinVO;

public interface BulletinService {
	List<BulletinVO> bulletinSelectList();
	BulletinVO bulletinSelect(BulletinVO vo);
	int insertBulletin(BulletinVO vo);
	int updateBulletin(BulletinVO vo);
	int deleteBulletin(BulletinVO vo);
}
