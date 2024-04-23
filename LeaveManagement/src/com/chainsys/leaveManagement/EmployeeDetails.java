package com.chainsys.leaveManagement;

import java.time.LocalDate;

public class EmployeeDetails {
    public class Employee {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + "]";
        }

//		public Leave getLeave() {
//			// TODO Auto-generated method stub
//			return null;
//		}
    }

    public enum LeaveStatus {
        APPROVED,
        REJECTED
    }

    public class Leave {
        private int id;
        private Employee employee;
        private LocalDate startDate;
        private LocalDate endDate;
        private LeaveStatus status;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public LocalDate getStartDate() {
            return startDate;
        }

        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        public LocalDate getEndDate() {
            return endDate;
        }

        public void setEndDate(LocalDate endDate) {
            this.endDate = endDate;
        }

        public LeaveStatus getStatus() {
            return status;
        }

        public void setStatus(LeaveStatus status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Leave [id=" + id + ", employee=" + employee + ", startDate=" + startDate + ", endDate=" + endDate
                    + ", status=" + status + "]";
        }
    }
}
