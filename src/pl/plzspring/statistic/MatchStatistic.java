/**
 * 
 */
package pl.plzspring.statistic;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */

@Component
public class MatchStatistic implements Statistic {
	private StatisticDTO statisticDTO;
	private StatisticFilterVO filter;

	public MatchStatistic(StatisticFilterVO filter) {
		this.filter = filter;
	}

	@Override
	public StatisticDTO getStatistic() {
		statisticDTO = new StatisticDTO();
		statisticDTO.setType(filter.getStatisticType());
		return statisticDTO;
	}

	@Override
	public void addStatistic() {
		System.out.print("Dodanie statystyk meczowych");
		
	}

}
