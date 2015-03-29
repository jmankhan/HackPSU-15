package dataobjects;

/**
 * Created by Jalal on 3/28/2015.
 */
public class Schedule {
    private long startTime, endTime;
    private String eventName;

    private Schedule(ScheduleBuilder builder) {
        this.startTime      = builder.startTime;
        this.endTime        = builder.endTime;
        this.eventName      = builder.eventName;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getEventName() {
        return this.eventName;
    }

    public static class ScheduleBuilder {
        private long startTime, endTime;
        private String eventName;

        public ScheduleBuilder(String eventName, long startTime, long endTime) {
            this.startTime      = startTime;
            this.endTime        = endTime;
            this.eventName      = eventName;
        }

        public Schedule build() {
            return new Schedule(this);
        }
    }
}
