package jalal.com.hackpsu;

import java.util.ArrayList;

/**
 * Created by Jalal on 3/28/2015.
 */
public class Group {
    private String groupName;
    private ArrayList<User> userList;
    private long startTime, endTime;
    private String studySubject;
    private ArrayList<String> studyMaterials;

    private Group(GroupBuilder builder) {
        this.groupName      = builder.groupName;
        this.userList       = builder.userList;
        this.startTime      = builder.startTime;
        this.endTime        = builder.endTime;
        this.studySubject   = builder.studySubjectName;
        this.studyMaterials = builder.studyMaterials;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public ArrayList<User> getUserList() {
        return this.userList;
    }

    public ArrayList<String> getStudyMaterials() {
        return this.studyMaterials;
    }

    public String getStudySubjectName() {
        return this.studySubject;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public static class GroupBuilder {
        private String groupName;
        private ArrayList<User> userList;
        private long startTime, endTime;
        private String studySubjectName;
        private ArrayList<String> studyMaterials;

        public GroupBuilder(String groupName, String subjectName, long startTime, long endTime) {
            this.groupName = groupName;
            this.startTime = startTime;
            this.endTime = endTime;
            this.studySubjectName = subjectName;
        }

        public GroupBuilder materials(ArrayList<String> studyMaterials) {
            this.studyMaterials = studyMaterials;
            return this;
        }

        public GroupBuilder users(ArrayList<User> userList) {
            this.userList = userList;
            return this;
        }

        public Group build() {
            return new Group(this);
        }
    }
}
