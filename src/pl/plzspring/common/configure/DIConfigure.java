/**
 * 
 */
package pl.plzspring.common.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.plzspring.player.PlayerConfigure;
import pl.plzspring.statistic.StatisticConfigure;

/**
 * @author Administrator
 * 
 * configuration file for Player Context classes
 *
 */
@Configuration
@ComponentScan(basePackageClasses={PlayerConfigure.class, StatisticConfigure.class})
public class DIConfigure {

}
