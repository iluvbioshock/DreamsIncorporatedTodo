package android.dreamsincorporated.todo;

import android.app.Activity;

import java.text.SimpleDateFormat;

import java.text.ParseException;

import java.util.Calendar;
import java.util.Date;

public class DateLabelFormatter extends Date {

    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

    UtilDateModel model = new UtilDateModel();
    model.setDate(1990, 8, 24);
    JDatePanelImpl datePanel = new JDatePanelImpl(model);
    JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
    Calendar selectedValue = (Calendar) datePicker.getModel().getValue();
    Date selectedDate = selectedValue.getTime();
    frame.add(datePicker);
    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
        }

            @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
            }
       return "";
        }

}