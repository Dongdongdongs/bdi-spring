package com.bdi.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bdi.sp.vo.Japan;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SqlSessionFacoryTest {
	
	private static final Logger logger = LoggerFactory.getLogger(SqlSessionFacoryTest.class);
	@Autowired
	private SqlSessionFactory ssf;
	
	@Autowired
	private SqlSession ss;
	
	@Test
	public void test() {
		assertNotNull(ssf.openSession());
	}
	
	// trace > debug > info > warn > error > fatal 로그의 레벨
	@Test
	public void ssTest() {
		/*logger.trace("난 안찍혀");
		logger.info("난찍히지");
		logger.debug("난 당연히 찍히지");*/
		Japan j = new Japan();
		j.setJpnum(1);
		List<Japan> jList = ss.selectList("com.bdi.sp.JapanMapper.selectJapanList",j);
		assertEquals(jList.size(), 10);
		
		/*assertNotNull(ss);*/
	}

}
