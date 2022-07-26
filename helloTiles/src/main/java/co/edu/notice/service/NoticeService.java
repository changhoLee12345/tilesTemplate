package co.edu.notice.service;

import java.util.List;

import co.edu.notice.vo.NoticeVO;

public interface NoticeService {
	List<NoticeVO> noticeSelectList();

	NoticeVO noticeSelect(NoticeVO vo);

	int insertNotice(NoticeVO vo);

	int updateNotice(NoticeVO vo);

	int deleteNotice(NoticeVO vo);
}
