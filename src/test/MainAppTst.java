/**
 * 
 */
package test;

import static org.mockito.Mockito.*;

import org.junit.Test;

import pl.plzspring.main.HelloSpring;
import pl.plzspring.player.FootballPlayer;
import pl.plzspring.player.Player;
import pl.plzspring.statistic.Statistic;

/**
 * @author Administrator
 *
 */
public class MainAppTst {

	@Test
	public void test() {
		Statistic statMock = mock(Statistic.class);
		
		FootballPlayer fbPlayer = new FootballPlayer(statMock);
		fbPlayer.getStatisticForPlayer();
		
		verify(statMock, times(1)).getStatistic();
		
	}

}
