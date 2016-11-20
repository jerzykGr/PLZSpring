/**
 * 
 */
package pl.plzspring.statistic;

/**
 * @author Administrator
 *
 */
public class TeamStatistic implements Statistic {
	private StatisticDTO statisticDTO;
	private StatisticFilterVO filter;

	public TeamStatistic(StatisticFilterVO filter) {
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
		// TODO Auto-generated method stub
		
	}

}
