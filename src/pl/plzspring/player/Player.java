/**
 * 
 */
package pl.plzspring.player;

import pl.plzspring.statistic.StatisticDTO;

/**
 * @author Administrator
 *
 */
public interface Player {
	
	public void addPlayer();
	
	public void addPlayerStatistic();
	
	public StatisticDTO getStatisticForPlayer();
}
