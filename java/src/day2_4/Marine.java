package day2_4;

// 체력 : 40/40 -> 40/28 -> 40/0

public class Marine {
	// 전체체력은 모든 마린들이 공유 
	public static Long 전체체력 = 40L;
	
	// 현재체력은 마린마다 다르다 -> 정보은닉
	private Long 현재체력;
	
	public Marine( ) {
		현재체력 = 40L;
	}
}
