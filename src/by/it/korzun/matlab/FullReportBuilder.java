package by.it.korzun.matlab;

import java.util.Date;

class FullReportBuilder extends ReportBuilder{
    public void buildName() {
        report.setReportName("MatLab - полный отчёт");
    }

    public void buildStartTime() {
        Date date = new Date(ConsoleRunner.startTime);
        String time = String.format("%-2d:%-2d:%-2d",date.getHours(),date.getMinutes(),date.getSeconds());
        report.setTimeStart(time);
    }

    public void buildStopTime() {
        Date date = new Date();
        String time = String.format("%-2d:%-2d:%-2d",date.getHours(),date.getMinutes(),date.getSeconds());
        report.setTimeStop(time);
    }

    public void buildOperations() {
        report.setOperations(ConsoleRunner.getAllAndFullOperations());
    }
}
