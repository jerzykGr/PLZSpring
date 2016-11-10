/**
 * 
 */
package pl.plzspring.statistic.enums;

/**
 * @author Administrator
 *
 */
public enum StatisticType {

	MATCH_STAT("MTCH"),

	TEAM_STAT("TAM");

	private final String code;

	private StatisticType(String code) {
		this.code = code;
	}
	
	public static StatisticType getByCode(String code){
		for(StatisticType e : values()){
			if(e.code.equals(code)) return e;
		}
		return null;
	}
	
	public String getCode(){
		return this.code;
	}
}
