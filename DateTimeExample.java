import java.time.*;
import java.util.Set;
public class DateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ld1=LocalDateTime.now();
		System.out.println(ld1);
		LocalDateTime ld2=LocalDateTime.now().minusDays(7);
		System.out.println(ld2);
		ZonedDateTime z3=ZonedDateTime.now();
		System.out.println(z3);
		ZoneId zoneid=ZoneId.of("Africa/Nairobi");
		System.out.println(zoneid);
		ZonedDateTime zdt=ZonedDateTime.now(zoneid);
		System.out.println(zdt);
		Set<String> allZoneIds=ZoneId.getAvailableZoneIds();
		System.out.println(allZoneIds);
	}

}
