/**
 * 
 */
package pl.plzspring.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.plzspring.statistic.Statistic;
import pl.plzspring.statistic.StatisticDTO;

/**
 * @author Administrator
 *
 */
@Component
public class FootballPlayer implements Player {

	private Statistic stat;
	
	@Autowired
	public FootballPlayer(Statistic stat) {
		this.stat = stat;
	}

	@Override
	public StatisticDTO getStatisticForPlayer() {
		return stat.getStatistic();
	}

	@Override
	public void addPlayer() {
		System.out.print("Add new football player");
		
	}
	
	@Override
	public void addPlayerStatistic(){
		stat.addStatistic();
	}
}
