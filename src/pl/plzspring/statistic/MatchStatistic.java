/**
 * 
 */
package pl.plzspring.statistic;

/**
 * @author Administrator
 *
 */
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

}
