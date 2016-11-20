/**
 * 
 */
package pl.plzspring.statistic;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import pl.plzspring.statistic.enums.StatisticType;

/**
 * @author Administrator
 *
 */

@Component
public class StatisticFilterVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private StatisticType statisticType;

	/**
	 * @return the statisticType
	 */
	public StatisticType getStatisticType() {
		return statisticType;
	}

	/**
	 * @param statisticType
	 *            the statisticType to set
	 */
	public void setStatisticType(StatisticType statisticType) {
		this.statisticType = statisticType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((statisticType == null) ? 0 : statisticType.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatisticFilterVO other = (StatisticFilterVO) obj;
		if (statisticType != other.statisticType)
			return false;
		return true;
	}

}
