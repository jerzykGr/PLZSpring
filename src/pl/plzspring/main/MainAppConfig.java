/**
 * 
 */
package pl.plzspring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.plzspring.player.FootballPlayer;
import pl.plzspring.player.Player;
import pl.plzspring.statistic.MatchStatistic;
import pl.plzspring.statistic.Statistic;
import pl.plzspring.statistic.StatisticFilterVO;
import pl.plzspring.statistic.enums.StatisticType;

/**
 * @author Administrator
 *
 */
@Configuration
public class MainAppConfig {
	@Bean
	public Player player(){
		return new FootballPlayer(statistic());
	}
	
	@Bean
	public Statistic statistic(){
		final StatisticFilterVO filter = new StatisticFilterVO();
		filter.setStatisticType(StatisticType.MATCH_STAT);
		return new MatchStatistic(filter);
	}
}
