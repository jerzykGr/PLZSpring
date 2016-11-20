/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.plzspring.common.configure.DIConfigure;
import pl.plzspring.player.Player;
import pl.plzspring.statistic.Statistic;

/**
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DIConfigure.class)
public class PlayerTst {
	
	@Rule
	public final SystemOutRule log = new SystemOutRule();
	
	@Autowired
	private Player player;

	@Autowired
	private Statistic statistic;
	
	@Test
	public void playerShouldNotBeNull(){
		assertNotNull(statistic);
	}
	
	@Test
	public void add(){
		log.enableLog();
		player.addPlayerStatistic();
		assertEquals("Dodanie statystyk meczowych", log.getLog());
	}
	
	
	
}
