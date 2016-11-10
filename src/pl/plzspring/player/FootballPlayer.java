/**
 * 
 */
package pl.plzspring.player;

import pl.plzspring.statistic.Statistic;
import pl.plzspring.statistic.StatisticDTO;

/**
 * @author Administrator
 *
 */
public class FootballPlayer implements Player {

	private Statistic stat;

	public FootballPlayer(Statistic stat) {
		this.stat = stat;
	}

	@Override
	public StatisticDTO getStatisticForPlayer() {
		return stat.getStatistic();
	}

}
