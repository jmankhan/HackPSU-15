package dataobjects;

import java.util.ArrayList;

/**
 * Created by Jalal on 3/28/2015.
 */
public class Group {
    private String groupName;
    private ArrayList<User> userList;
    private String studySubject;
    private ArrayList<String> studyMaterials;

    private Schedule schedule;

    private Group(GroupBuilder builder) {
        this.groupName      = builder.groupName;
        this.userList       = builder.userList;
        this.studySubject   = builder.studySubjectName;
        this.studyMaterials = builder.studyMaterials;
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
        private String studySubjectName;
        private ArrayList<String> studyMaterials;

        private Schedule schedule;

        public GroupBuilder(String groupName, String subjectName, Schedule schedule) {
            this.groupName          = groupName;
            this.studySubjectName   = subjectName;
            this.schedule           = schedule;
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
