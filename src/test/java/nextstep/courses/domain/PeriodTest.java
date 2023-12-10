package nextstep.courses.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class PeriodTest {

    @Test
    void 수강_기간_생성() {
        // given
        Calendar startCal = Calendar.getInstance();
        startCal.set(2023, Calendar.NOVEMBER, 10);

        Calendar endCal = Calendar.getInstance();
        endCal.set(2023, Calendar.DECEMBER, 10);

        Date startDate = new Date(startCal.getTimeInMillis());
        Date endDate = new Date(endCal.getTimeInMillis());

        // when
        Period period = new Period(startDate, endDate);

        // then
        assertThat(period.getStartDate()).isEqualTo(startDate);
        assertThat(period.getEndDate()).isEqualTo(endDate);
    }

    @Test
    void 시작일은_종료일보다_이후로_설정_할_수_없다() {
        // given
        Calendar startCal = Calendar.getInstance();
        startCal.set(2023, Calendar.DECEMBER, 10);

        Calendar endCal = Calendar.getInstance();
        endCal.set(2023, Calendar.NOVEMBER, 10);

        Date startDate = new Date(startCal.getTimeInMillis());
        Date endDate = new Date(endCal.getTimeInMillis());

        // when, then
        assertThatThrownBy(() -> new Period(startDate, endDate)).isInstanceOf(
            IllegalArgumentException.class)
            .hasMessageContaining("종료일은 시작일보다 먼저일 수 없습니다.");
    }

}
