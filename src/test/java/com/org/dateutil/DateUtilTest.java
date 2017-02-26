package com.org.dateutil;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DateUtilTest {

    @Test
    public void shouldGetLastDayOfPreviousMonth() throws Exception {
        LocalDate lastDateOfPreviousMonth = DateUtil.getLastDateOfPreviousMonth();
        assertThat(lastDateOfPreviousMonth, is(LocalDate.of(2017, 1, 31)));
    }

    @Test
    public void shouldGetFormattedLastDayOfPreviousMonth() throws Exception {
        String formattedLastDateOfPreviousMonth = DateUtil.getFormattedLastDateOfPreviousMonth("dd/MM/yyyy");

        assertThat(formattedLastDateOfPreviousMonth, is("31/01/2017"));
    }

    @Test
    public void shouldGetShortFormattedLastDayOfPreviousMonth() throws Exception {
        String formattedLastDateOfPreviousMonth = DateUtil.getFormattedLastDateOfPreviousMonth("dd/MM/yy");

        assertThat(formattedLastDateOfPreviousMonth, is("31/01/17"));
    }

    @Test
    public void shouldGetLastBusinessDayOfPreviousMonth() throws Exception {
        String formattedLastDateOfPreviousMonth = DateUtil.getFormattedLastDateOfPreviousMonth("dd/MM/yy");

        assertThat(formattedLastDateOfPreviousMonth, is("31/01/17"));
    }
}
